{-# LANGUAGE TemplateHaskell, TypeFamilies #-}

import Control.Arrow
import Control.Applicative
import Data.Function
import Data.List
import GHC.Generics
import System.Exit

import Generics.BiGUL
import Generics.BiGUL.TH
import Generics.BiGUL.Lib
import Generics.BiGUL.Lib.List
import Generics.BiGUL.Interpreter


--------
-- Families

newtype FamilyRegister = FamilyRegister { families :: [Family] }
  deriving (Show, Read, Eq)

data Family = Family { familyName :: String
                     , father     :: Maybe FamilyMember
                     , mother     :: Maybe FamilyMember
                     , sons       :: [FamilyMember]
                     , daughters  :: [FamilyMember] }
  deriving (Show, Read, Eq)

newtype FamilyMember = FamilyMember { firstName :: String }
  deriving (Show, Read, Eq)

deriveBiGULGeneric ''FamilyRegister
deriveBiGULGeneric ''Family
deriveBiGULGeneric ''FamilyMember

sampleFamilyRegister :: FamilyRegister
sampleFamilyRegister = FamilyRegister
  { families =
      [ Family { familyName = "Simpson"
               , father     = Just (FamilyMember { firstName = "Homer" })
               , mother     = Nothing
               , sons       = []
               , daughters  = [ FamilyMember { firstName = "Lisa" }
                              , FamilyMember { firstName = "Maggie" } ] } ] }


--------
-- Persons

newtype PersonRegister = PersonRegister { persons :: [Person] }
  deriving (Show, Read, Eq)

data Person = Male   { fullName :: String
                     , birthday :: String }
            | Female { fullName :: String
                     , birthday :: String }
  deriving (Show, Read, Eq)

deriveBiGULGeneric ''PersonRegister
deriveBiGULGeneric ''Person

samplePersonRegister :: PersonRegister
samplePersonRegister = PersonRegister
  { persons = [ Male   { fullName = "Simpson, Homer"
                       , birthday = "9 Jan 2013" }
              , Female { fullName = "Simpson, Lisa"
                       , birthday = "Thu Jan 01 00:00:00 CET 1" }
              , Female { fullName = "Simpson, Maggie"
                       , birthday = "Thu Jan 01 00:00:00 CET 1" } ] }


--------
-- synchronisation

type Medium = [(String, [(String, Bool)])]  -- family name, first name, is male

fuseName :: BiGUL String (String, String)
fuseName = Case
  [ $(normalSV [p| ',':' ':_ |] [p| ([], _) |] [p| ',':_ |])
    ==> $(update [p| ',':' ':firstName |] [p| ([], firstName) |] [d| firstName = Replace |])
  , $(adaptiveSV [p| _ |] [p| ([], _) |])
    ==> \ss _ -> dropWhile (/= ',') ss
  , $(normalSV [| \(s:ss) -> s /= ',' |] [p| (_:_, _) |] [| \(s:ss) -> s /= ','|])
    ==> $(rearrS [| \(s:ss) -> (s, ss) |])$
          $(rearrV [| \(v:vs, vs') -> (v, (vs, vs')) |])$
            Replace `Prod` fuseName
  , $(adaptiveSV [p| ',':_ |] [p| (_:_, _) |])
    ==> \ss (vs, _) -> vs ++ ss
  ]


--------
-- synchronisation with persons

pMatch :: [Person] -> Medium -> Bool
pMatch [] [] = True
pMatch (Male fullName _ : ps) ((familyName, (firstName, True):ns):fs)
  | get fuseName fullName == Just (familyName, firstName) =
    pMatch ps ((if null ns then id else ((familyName, ns):)) fs)
pMatch (Female fullName _ : ps) ((familyName, (firstName, False):ns):fs)
  | get fuseName fullName == Just (familyName, firstName) =
    pMatch ps ((if null ns then id else ((familyName, ns):)) fs)
pMatch _ _ = False

getFullName :: Person -> String
getFullName (Male   fullName _) = fullName
getFullName (Female fullName _) = fullName

changeFullName :: (String -> String) -> Person -> Person
changeFullName f (Male   fullName birthday) = Male   (f fullName) birthday
changeFullName f (Female fullName birthday) = Female (f fullName) birthday

splitFullName :: String -> (String, String)
splitFullName = (id *** (tail . tail)) . span (/= ',')

getFamilyName :: Person -> String
getFamilyName = fst . splitFullName . getFullName

getFirstName :: Person -> String
getFirstName = snd . splitFullName . getFullName

lastMemberReached :: [Person] -> Bool
lastMemberReached [_] = True
lastMemberReached (p:q:ps) | getFamilyName p /= getFamilyName q = True
lastMemberReached _ = False

isMale :: Person -> Bool
isMale (Male   _ _) = True
isMale (Female _ _) = False

syncR :: BiGUL PersonRegister Medium
syncR = $(rearrS [| \(PersonRegister ps) -> ps |]) syncR'

syncR' :: BiGUL [Person] Medium
syncR' = Case
  [ $(normalSV [p| [] |] [p| [] |] [p| [] |])
    ==> $(update [p| _ |] [p| [] |] [d| |])
  , $(normal [| \(p:ps) ((familyName, [(firstName, gender)]) : _) ->
                  getFamilyName p == familyName && getFirstName p == firstName && isMale p == gender &&
                    lastMemberReached (p:ps) |]
             [| lastMemberReached |])
    ==> Case
          [ $(normalSV [p| _ |] [p| ((_, [(_, True)]):_) |] [| \(p:_) -> isMale p |])
            ==> $(rearrS [| \((Male fullName _):ps) -> (fullName, ps) |])$
                  $(rearrV [| \((familyName, [(firstName, True)]):vs) -> ((familyName, firstName), vs) |])$
                    fuseName `Prod` syncR'
          , $(normalSV [p| _ |] [p| ((_, [(_, False)]):_) |] [| \(p:_) -> not (isMale p) |])
            ==> $(rearrS [| \((Female fullName _):ps) -> (fullName, ps) |])$
                  $(rearrV [| \((familyName, [(firstName, False)]):vs) -> ((familyName, firstName), vs) |])$
                    fuseName `Prod` syncR'
          ]
  , $(normal [| \(p:ps) ((familyName, (firstName, gender):_) : _) ->
                  getFamilyName p == familyName && getFirstName p == firstName && isMale p == gender &&
                    not (lastMemberReached (p:ps)) |]
             [| not . lastMemberReached |])
    ==> Case
          [ $(normalSV [| \(p:_) -> isMale p |] [p| _ |] [| \(p:_) -> isMale p |])
            ==> $(rearrS [| \((Male fullName _):ps) -> (fullName, ps) |])$
                  $(rearrV [| \((familyName, (firstName, True):ns):vs) -> ((familyName,firstName), (familyName,ns):vs) |])$
                    fuseName `Prod` syncR'
          , $(normalSV [| \(p:_) -> not (isMale p) |] [p| _ |] [| \(p:_) -> not (isMale p) |])
            ==> $(rearrS [| \((Female fullName _):ps) -> (fullName, ps) |])$
                  $(rearrV [| \((familyName, (firstName, False):ns):vs) -> ((familyName,firstName), (familyName,ns):vs) |])$
                    fuseName `Prod` syncR'
          ]
  , $(adaptive [| \_ _ -> otherwise |])
    ==> adaptPersons
  ]
  where
    adaptPersons :: [Person] -> [(String, [(String, Bool)])] -> [Person]
    adaptPersons ps ms =
      let pss = map ((getFamilyName . head) &&& map (changeFullName (snd . splitFullName)))
                    (groupBy ((==) `on` getFamilyName) ps)
      in  concat [ map (changeFullName ((familyName ++ ", ") ++))
                       (adaptFamily (maybe [] id (lookup familyName pss)) ns) | (familyName, ns) <- ms ]
    adaptFamily :: [Person] -> [(String, Bool)] -> [Person]
    adaptFamily ps [] = []
    adaptFamily ps ((firstName, gender):ms) =
      case find (\p -> getFullName p == firstName && isMale p == gender) ps of
        Just p  -> p : adaptFamily (delete p ps) ms
        Nothing -> (if gender then Male else Female) firstName "Thu Jan 01 00:00:00 CET 1" : adaptFamily ps ms


--------
-- synchronisation with families

promoteParent :: BiGUL (Maybe FamilyMember, [String]) [String]
promoteParent = Case
  [ $(normal [| \(Nothing, ns) vs -> null (vs \\ ns) |] [p| (Nothing, _) |])
    ==> $(update [p| (_, ns) |] [p| ns |] [d| ns = Replace |])
  , $(normal [| \(Just (FamilyMember parentName), _) vs -> parentName `elem` vs |] [p| (Just _, _) |])
    ==> $(rearrS [| \(Just (FamilyMember n), ns) -> (n, ns) |])$
          promoteParent'
  , $(adaptive [| \_ _ -> otherwise |])
    ==> \(_, ns) vs -> case vs \\ ns of
                         []  -> (Nothing, vs)
                         n:_ -> (Just (FamilyMember n), delete n vs)
  ]

promoteParent' :: BiGUL (String, [String]) [String]
promoteParent' = Case
  [ $(normal [| \(s, _) (v:_) -> v == s |] [| \(s, ns) -> null ns || head ns >= s |])
    ==> $(update [p| (n, ns) |] [p| n:ns |] [d| n = Replace; ns = Replace |])
  , $(normal [| \(s, _:_) (v:_) -> v < s |] [| \(s, n:ns) -> n < s |])
    ==> $(rearrS [| \(s, n:ns) -> (n, (s, ns)) |])$
          $(rearrV [| \(v:vs) -> (v, vs) |])$
            Replace `Prod` promoteParent'
  , $(adaptive [| \(s, []) (v:_) -> v < s |])
    ==> \(s, _) _ -> (s, [undefined])
  ]

classifyByGender :: BiGUL ([String],[String]) [(String, Bool)]
classifyByGender = Case
  [ $(normal [| \(ms, fs) vs -> sort (map (flip (,) True) ms ++ map (flip (,) False) fs) == vs |] [p| _ |])
    ==> Skip (\(ms, fs) -> sort (map (flip (,) True) ms ++ map (flip (,) False) fs))
  , $(adaptive [| \_ _ -> otherwise |])
    ==> \_ vs -> (map fst (filter snd vs), map fst (filter (not . snd) vs))
  ]

syncL :: BiGUL FamilyRegister Medium
syncL = $(rearrS [| \(FamilyRegister fs) -> fs |])$
          align isNonEmptyFamily
                (\(Family { familyName = x }) (y, _) -> x == y)
                ($(rearrS [| \(Family familyName father mother sons daughters) ->
                               (familyName, (father, sons), (mother, daughters)) |])$
                   Replace `Prod`
                   ((((Replace `Prod` familyMemberWrapper) `Compose` promoteParent) `Prod`
                     ((Replace `Prod` familyMemberWrapper) `Compose` promoteParent)) `Compose` classifyByGender))
                (\(familyName, ((firstName, gender):_)) ->
                   let (father, mother) = (if gender then id else flip) (,) (Just (FamilyMember firstName)) Nothing
                   in  Family familyName father mother [] [])
                (const Nothing)
  where
    isNonEmptyFamily :: Family -> Bool
    isNonEmptyFamily (Family _ Nothing Nothing [] []) = False
    isNonEmptyFamily _                                = True
    familyMemberWrapper :: BiGUL [FamilyMember] [String]
    familyMemberWrapper =
      align (const True) (\_ _ -> True) ($(rearrS [| \(FamilyMember n) -> n |]) Replace) FamilyMember (const Nothing)

main :: IO ()
main = do
  (dir, familyRegister, personRegister) <- read <$> getContents
  case dir of
    "fwd" -> maybe exitFailure print (get syncL familyRegister >>= put syncR personRegister)
    "bwd" -> maybe exitFailure print (get syncR personRegister >>= put syncL familyRegister)
    _     -> exitFailure
