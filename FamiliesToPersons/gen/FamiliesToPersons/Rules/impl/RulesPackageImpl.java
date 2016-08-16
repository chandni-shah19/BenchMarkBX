/**
 */
package FamiliesToPersons.Rules.impl;

import FamiliesModel.FamiliesModelPackage;

import FamiliesToPersons.FamiliesToPersonsPackage;

import FamiliesToPersons.Rules.RulesFactory;
import FamiliesToPersons.Rules.RulesPackage;

import FamiliesToPersons.impl.FamiliesToPersonsPackageImpl;

import PersonsModel.PersonsModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMember2PersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motherToFemaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass families2PersonsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daughterToFemaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonOfExistingFamilyToMaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daughterOfExistingFamilyToFemaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existingFamily2PersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fatherOfExistingFamilyToMaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fatherToMaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motherOfExistingFamilyToFemaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonToMaleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FamiliesToPersons.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FamiliesModelPackage.eINSTANCE.eClass();
		PersonsModelPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FamiliesToPersonsPackageImpl theFamiliesToPersonsPackage = (FamiliesToPersonsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FamiliesToPersonsPackage.eNS_URI) instanceof FamiliesToPersonsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(FamiliesToPersonsPackage.eNS_URI)
						: FamiliesToPersonsPackage.eINSTANCE);

		// Load packages
		theFamiliesToPersonsPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theFamiliesToPersonsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMember2Person() {
		if (familyMember2PersonEClass == null) {
			familyMember2PersonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return familyMember2PersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotherToFemale() {
		if (motherToFemaleEClass == null) {
			motherToFemaleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return motherToFemaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getMotherToFemale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__Perform_FWD__IsApplicableMatch() {
		return getMotherToFemale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_FWD__Match() {
		return getMotherToFemale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getMotherToFemale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getMotherToFemale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_checkCsp_FWD__CSP() {
		return getMotherToFemale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getMotherToFemale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_checkCsp_FWD__CSP() {
		return getMotherToFemale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMotherToFemale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__CheckTypes_FWD__Match() {
		return getMotherToFemale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_BWD__Match_Female_Persons() {
		return getMotherToFemale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__Perform_BWD__IsApplicableMatch() {
		return getMotherToFemale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_BWD__Match() {
		return getMotherToFemale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons() {
		return getMotherToFemale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons() {
		return getMotherToFemale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_checkCsp_BWD__CSP() {
		return getMotherToFemale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Families() {
		return getMotherToFemale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_checkCsp_BWD__CSP() {
		return getMotherToFemale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMotherToFemale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__CheckTypes_BWD__Match() {
		return getMotherToFemale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getMotherToFemale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getMotherToFemale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__CheckAttributes_FWD__TripleMatch() {
		return getMotherToFemale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__CheckAttributes_BWD__TripleMatch() {
		return getMotherToFemale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_CC__Match_Match() {
		return getMotherToFemale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Female_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getMotherToFemale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__IsApplicable_checkCsp_CC__CSP() {
		return getMotherToFemale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__Perform_CC__IsApplicableMatchCC() {
		return getMotherToFemale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getMotherToFemale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__CheckDEC_BWD__Female_Persons() {
		return getMotherToFemale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getMotherToFemale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult() {
		return getMotherToFemale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherToFemale__GenerateModel_checkCsp_BWD__CSP() {
		return getMotherToFemale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilies2Persons() {
		if (families2PersonsEClass == null) {
			families2PersonsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return families2PersonsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_FWD__Match_Families() {
		return getFamilies2Persons().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__Perform_FWD__IsApplicableMatch() {
		return getFamilies2Persons().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_FWD__Match() {
		return getFamilies2Persons().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__RegisterObjectsToMatch_FWD__Match_Families() {
		return getFamilies2Persons().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_solveCsp_FWD__Match_Families() {
		return getFamilies2Persons().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_checkCsp_FWD__CSP() {
		return getFamilies2Persons().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_solveCsp_FWD__IsApplicableMatch_Families() {
		return getFamilies2Persons().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_checkCsp_FWD__CSP() {
		return getFamilies2Persons().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getFamilies2Persons().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__CheckTypes_FWD__Match() {
		return getFamilies2Persons().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_BWD__Match_Persons() {
		return getFamilies2Persons().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__Perform_BWD__IsApplicableMatch() {
		return getFamilies2Persons().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_BWD__Match() {
		return getFamilies2Persons().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__RegisterObjectsToMatch_BWD__Match_Persons() {
		return getFamilies2Persons().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_solveCsp_BWD__Match_Persons() {
		return getFamilies2Persons().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_checkCsp_BWD__CSP() {
		return getFamilies2Persons().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_solveCsp_BWD__IsApplicableMatch_Persons() {
		return getFamilies2Persons().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_checkCsp_BWD__CSP() {
		return getFamilies2Persons().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getFamilies2Persons().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__CheckTypes_BWD__Match() {
		return getFamilies2Persons().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_FWD_Families_0__Families() {
		return getFamilies2Persons().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsAppropriate_BWD_Persons_0__Persons() {
		return getFamilies2Persons().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__CheckAttributes_FWD__TripleMatch() {
		return getFamilies2Persons().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__CheckAttributes_BWD__TripleMatch() {
		return getFamilies2Persons().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_CC__Match_Match() {
		return getFamilies2Persons().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Persons_Families_Match_Match() {
		return getFamilies2Persons().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__IsApplicable_checkCsp_CC__CSP() {
		return getFamilies2Persons().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__Perform_CC__IsApplicableMatchCC() {
		return getFamilies2Persons().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__CheckDEC_FWD__Families() {
		return getFamilies2Persons().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__CheckDEC_BWD__Persons() {
		return getFamilies2Persons().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__GenerateModel__RuleEntryContainer() {
		return getFamilies2Persons().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getFamilies2Persons().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFamilies2Persons__GenerateModel_checkCsp_BWD__CSP() {
		return getFamilies2Persons().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaughterToFemale() {
		if (daughterToFemaleEClass == null) {
			daughterToFemaleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return daughterToFemaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getDaughterToFemale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__Perform_FWD__IsApplicableMatch() {
		return getDaughterToFemale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_FWD__Match() {
		return getDaughterToFemale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getDaughterToFemale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getDaughterToFemale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_checkCsp_FWD__CSP() {
		return getDaughterToFemale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getDaughterToFemale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_checkCsp_FWD__CSP() {
		return getDaughterToFemale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDaughterToFemale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__CheckTypes_FWD__Match() {
		return getDaughterToFemale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_BWD__Match_Female_Persons() {
		return getDaughterToFemale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__Perform_BWD__IsApplicableMatch() {
		return getDaughterToFemale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_BWD__Match() {
		return getDaughterToFemale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons() {
		return getDaughterToFemale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons() {
		return getDaughterToFemale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_checkCsp_BWD__CSP() {
		return getDaughterToFemale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Families() {
		return getDaughterToFemale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_checkCsp_BWD__CSP() {
		return getDaughterToFemale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDaughterToFemale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__CheckTypes_BWD__Match() {
		return getDaughterToFemale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getDaughterToFemale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getDaughterToFemale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__CheckAttributes_FWD__TripleMatch() {
		return getDaughterToFemale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__CheckAttributes_BWD__TripleMatch() {
		return getDaughterToFemale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_CC__Match_Match() {
		return getDaughterToFemale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Female_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getDaughterToFemale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__IsApplicable_checkCsp_CC__CSP() {
		return getDaughterToFemale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__Perform_CC__IsApplicableMatchCC() {
		return getDaughterToFemale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getDaughterToFemale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__CheckDEC_BWD__Female_Persons() {
		return getDaughterToFemale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getDaughterToFemale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult() {
		return getDaughterToFemale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterToFemale__GenerateModel_checkCsp_BWD__CSP() {
		return getDaughterToFemale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSonOfExistingFamilyToMale() {
		if (sonOfExistingFamilyToMaleEClass == null) {
			sonOfExistingFamilyToMaleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return sonOfExistingFamilyToMaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getSonOfExistingFamilyToMale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__Perform_FWD__IsApplicableMatch() {
		return getSonOfExistingFamilyToMale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_FWD__Match() {
		return getSonOfExistingFamilyToMale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getSonOfExistingFamilyToMale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getSonOfExistingFamilyToMale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_checkCsp_FWD__CSP() {
		return getSonOfExistingFamilyToMale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getSonOfExistingFamilyToMale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_checkCsp_FWD__CSP() {
		return getSonOfExistingFamilyToMale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSonOfExistingFamilyToMale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__CheckTypes_FWD__Match() {
		return getSonOfExistingFamilyToMale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_BWD__Match_Male_Persons() {
		return getSonOfExistingFamilyToMale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__Perform_BWD__IsApplicableMatch() {
		return getSonOfExistingFamilyToMale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_BWD__Match() {
		return getSonOfExistingFamilyToMale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons() {
		return getSonOfExistingFamilyToMale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons() {
		return getSonOfExistingFamilyToMale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_checkCsp_BWD__CSP() {
		return getSonOfExistingFamilyToMale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Family_Families() {
		return getSonOfExistingFamilyToMale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_checkCsp_BWD__CSP() {
		return getSonOfExistingFamilyToMale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSonOfExistingFamilyToMale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__CheckTypes_BWD__Match() {
		return getSonOfExistingFamilyToMale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getSonOfExistingFamilyToMale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getSonOfExistingFamilyToMale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__CheckAttributes_FWD__TripleMatch() {
		return getSonOfExistingFamilyToMale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__CheckAttributes_BWD__TripleMatch() {
		return getSonOfExistingFamilyToMale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_CC__Match_Match() {
		return getSonOfExistingFamilyToMale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Male_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getSonOfExistingFamilyToMale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__IsApplicable_checkCsp_CC__CSP() {
		return getSonOfExistingFamilyToMale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__Perform_CC__IsApplicableMatchCC() {
		return getSonOfExistingFamilyToMale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getSonOfExistingFamilyToMale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__CheckDEC_BWD__Male_Persons() {
		return getSonOfExistingFamilyToMale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getSonOfExistingFamilyToMale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult() {
		return getSonOfExistingFamilyToMale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonOfExistingFamilyToMale__GenerateModel_checkCsp_BWD__CSP() {
		return getSonOfExistingFamilyToMale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaughterOfExistingFamilyToFemale() {
		if (daughterOfExistingFamilyToFemaleEClass == null) {
			daughterOfExistingFamilyToFemaleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return daughterOfExistingFamilyToFemaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__Perform_FWD__IsApplicableMatch() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_FWD__Match() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_checkCsp_FWD__CSP() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_checkCsp_FWD__CSP() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__CheckTypes_FWD__Match() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_BWD__Match_Female_Persons() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__Perform_BWD__IsApplicableMatch() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_BWD__Match() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_checkCsp_BWD__CSP() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Family_Families() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_checkCsp_BWD__CSP() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__CheckTypes_BWD__Match() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__CheckAttributes_FWD__TripleMatch() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__CheckAttributes_BWD__TripleMatch() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_CC__Match_Match() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Female_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_checkCsp_CC__CSP() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__Perform_CC__IsApplicableMatchCC() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__CheckDEC_BWD__Female_Persons() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDaughterOfExistingFamilyToFemale__GenerateModel_checkCsp_BWD__CSP() {
		return getDaughterOfExistingFamilyToFemale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistingFamily2Person() {
		if (existingFamily2PersonEClass == null) {
			existingFamily2PersonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return existingFamily2PersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFatherOfExistingFamilyToMale() {
		if (fatherOfExistingFamilyToMaleEClass == null) {
			fatherOfExistingFamilyToMaleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return fatherOfExistingFamilyToMaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__Perform_FWD__IsApplicableMatch() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_FWD__Match() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_checkCsp_FWD__CSP() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_checkCsp_FWD__CSP() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__CheckTypes_FWD__Match() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_BWD__Match_Male_Persons() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__Perform_BWD__IsApplicableMatch() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_BWD__Match() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_checkCsp_BWD__CSP() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Family_Families() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_checkCsp_BWD__CSP() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__CheckTypes_BWD__Match() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__CheckAttributes_FWD__TripleMatch() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__CheckAttributes_BWD__TripleMatch() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_CC__Match_Match() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Male_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__IsApplicable_checkCsp_CC__CSP() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__Perform_CC__IsApplicableMatchCC() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__CheckDEC_BWD__Male_Persons() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherOfExistingFamilyToMale__GenerateModel_checkCsp_BWD__CSP() {
		return getFatherOfExistingFamilyToMale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFatherToMale() {
		if (fatherToMaleEClass == null) {
			fatherToMaleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(8);
		}
		return fatherToMaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getFatherToMale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__Perform_FWD__IsApplicableMatch() {
		return getFatherToMale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_FWD__Match() {
		return getFatherToMale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getFatherToMale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getFatherToMale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_checkCsp_FWD__CSP() {
		return getFatherToMale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getFatherToMale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_checkCsp_FWD__CSP() {
		return getFatherToMale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFatherToMale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__CheckTypes_FWD__Match() {
		return getFatherToMale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_BWD__Match_Male_Persons() {
		return getFatherToMale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__Perform_BWD__IsApplicableMatch() {
		return getFatherToMale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_BWD__Match() {
		return getFatherToMale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons() {
		return getFatherToMale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons() {
		return getFatherToMale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_checkCsp_BWD__CSP() {
		return getFatherToMale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Families() {
		return getFatherToMale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_checkCsp_BWD__CSP() {
		return getFatherToMale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFatherToMale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__CheckTypes_BWD__Match() {
		return getFatherToMale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getFatherToMale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getFatherToMale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__CheckAttributes_FWD__TripleMatch() {
		return getFatherToMale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__CheckAttributes_BWD__TripleMatch() {
		return getFatherToMale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_CC__Match_Match() {
		return getFatherToMale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Male_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getFatherToMale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__IsApplicable_checkCsp_CC__CSP() {
		return getFatherToMale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__Perform_CC__IsApplicableMatchCC() {
		return getFatherToMale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getFatherToMale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__CheckDEC_BWD__Male_Persons() {
		return getFatherToMale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getFatherToMale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult() {
		return getFatherToMale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFatherToMale__GenerateModel_checkCsp_BWD__CSP() {
		return getFatherToMale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotherOfExistingFamilyToFemale() {
		if (motherOfExistingFamilyToFemaleEClass == null) {
			motherOfExistingFamilyToFemaleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return motherOfExistingFamilyToFemaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__Perform_FWD__IsApplicableMatch() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_FWD__Match() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_checkCsp_FWD__CSP() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_checkCsp_FWD__CSP() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__CheckTypes_FWD__Match() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_BWD__Match_Female_Persons() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__Perform_BWD__IsApplicableMatch() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_BWD__Match() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_checkCsp_BWD__CSP() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Family_Families() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_checkCsp_BWD__CSP() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__CheckTypes_BWD__Match() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__CheckAttributes_FWD__TripleMatch() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__CheckAttributes_BWD__TripleMatch() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_CC__Match_Match() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Female_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__IsApplicable_checkCsp_CC__CSP() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__Perform_CC__IsApplicableMatchCC() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__CheckDEC_BWD__Female_Persons() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotherOfExistingFamilyToFemale__GenerateModel_checkCsp_BWD__CSP() {
		return getMotherOfExistingFamilyToFemale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSonToMale() {
		if (sonToMaleEClass == null) {
			sonToMaleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return sonToMaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families() {
		return getSonToMale().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__Perform_FWD__IsApplicableMatch() {
		return getSonToMale().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_FWD__Match() {
		return getSonToMale().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families() {
		return getSonToMale().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families() {
		return getSonToMale().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_checkCsp_FWD__CSP() {
		return getSonToMale().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families() {
		return getSonToMale().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_checkCsp_FWD__CSP() {
		return getSonToMale().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSonToMale().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__CheckTypes_FWD__Match() {
		return getSonToMale().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_BWD__Match_Male_Persons() {
		return getSonToMale().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__Perform_BWD__IsApplicableMatch() {
		return getSonToMale().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_BWD__Match() {
		return getSonToMale().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons() {
		return getSonToMale().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons() {
		return getSonToMale().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_checkCsp_BWD__CSP() {
		return getSonToMale().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Families() {
		return getSonToMale().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_checkCsp_BWD__CSP() {
		return getSonToMale().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSonToMale().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__CheckTypes_BWD__Match() {
		return getSonToMale().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getSonToMale().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return getSonToMale().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__CheckAttributes_FWD__TripleMatch() {
		return getSonToMale().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__CheckAttributes_BWD__TripleMatch() {
		return getSonToMale().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_CC__Match_Match() {
		return getSonToMale().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Male_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families_Match_Match() {
		return getSonToMale().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__IsApplicable_checkCsp_CC__CSP() {
		return getSonToMale().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__Perform_CC__IsApplicableMatchCC() {
		return getSonToMale().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__CheckDEC_FWD__Family_FamilyMember_Families() {
		return getSonToMale().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__CheckDEC_BWD__Male_Persons() {
		return getSonToMale().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr() {
		return getSonToMale().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult() {
		return getSonToMale().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSonToMale__GenerateModel_checkCsp_BWD__CSP() {
		return getSonToMale().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("FamiliesToPersons.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
