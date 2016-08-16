/**
 */
package FamiliesToPersons.Rules.impl;

import FamiliesModel.Families;
import FamiliesModel.FamiliesModelFactory;
import FamiliesModel.Family;
import FamiliesModel.FamilyMember;

import FamiliesToPersons.FamiliesToPersonsCorr;
import FamiliesToPersons.FamiliesToPersonsFactory;
import FamiliesToPersons.FamilyMemberToPerson;

import FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale;
import FamiliesToPersons.Rules.RulesPackage;

import PersonsModel.Female;
import PersonsModel.Persons;
import PersonsModel.PersonsModelFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableMatchCC;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daughter Of Existing Family To Female</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DaughterOfExistingFamilyToFemaleImpl extends AbstractRuleImpl implements DaughterOfExistingFamilyToFemale {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaughterOfExistingFamilyToFemaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getDaughterOfExistingFamilyToFemale();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Family f, FamilyMember fm, Families families) {
		// initial bindings
		Object[] result1_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_0_1_initialbindings_blackBBBBB(this, match, f, fm, families);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm
					+ ", " + "[families] = " + families + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, f, fm,
						families);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", "
					+ "[families] = " + families + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_0_4_collectelementstobetranslated_blackBBBB(match, f, fm,
							families);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", "
						+ "[families] = " + families + ".");
			}
			DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_0_4_collectelementstobetranslated_greenBBBFF(match, f,
							fm);
			// EMoflonEdge fm__f____family_daughter = (EMoflonEdge) result4_green[3];
			// EMoflonEdge f__fm____daughters = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_0_5_collectcontextelements_blackBBBB(match, f, fm,
							families);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", "
						+ "[families] = " + families + ".");
			}
			DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_0_5_collectcontextelements_greenBBBF(match, f, families);
			// EMoflonEdge families__f____family = (EMoflonEdge) result5_green[3];

			// register objects to match
			DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_0_6_registerobjectstomatch_expressionBBBBB(this, match, f,
							fm, families);
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_0_7_expressionF();
		} else {
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result1_bindingAndBlack[0];
		Persons persons = (Persons) result1_bindingAndBlack[1];
		Family f = (Family) result1_bindingAndBlack[2];
		FamilyMember fm = (FamilyMember) result1_bindingAndBlack[3];
		Families families = (Families) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_greenFBFBB(persons, fm, csp);
		Female p = (Female) result1_green[0];
		FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result1_green[2];

		// collect translated elements
		Object[] result2_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_2_collecttranslatedelements_blackBBB(p,
						familyMember2Persons, fm);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed." + " Variables: " + "[p] = " + p
							+ ", " + "[familyMember2Persons] = " + familyMember2Persons + ", " + "[fm] = " + fm + ".");
		}
		Object[] result2_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_2_collecttranslatedelements_greenFBBB(p,
						familyMember2Persons, fm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, p,
						families2persons, persons, familyMember2Persons, f, fm, families);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[p] = " + p + ", " + "[families2persons] = "
					+ families2persons + ", " + "[persons] = " + persons + ", " + "[familyMember2Persons] = "
					+ familyMember2Persons + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", " + "[families] = "
					+ families + ".");
		}
		DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, p,
						persons, familyMember2Persons, f, fm);
		// EMoflonEdge persons__p____person = (EMoflonEdge) result3_green[6];
		// EMoflonEdge familyMember2Persons__fm____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge familyMember2Persons__p____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge fm__f____family_daughter = (EMoflonEdge) result3_green[9];
		// EMoflonEdge f__fm____daughters = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, p,
						families2persons, persons, familyMember2Persons, f, fm, families);
		return DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Family f = (Family) result2_binding[0];
		FamilyMember fm = (FamilyMember) result2_binding[1];
		Families families = (Families) result2_binding[2];
		for (Object[] result2_black : DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_2_2_corematch_blackFFBBBB(f, fm, families, match)) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_black[0];
			Persons persons = (Persons) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_2_3_findcontext_blackBBBBB(families2persons, persons, f,
							fm, families)) {
				Object[] result3_green = DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_2_3_findcontext_greenBBBBBFFFFFF(families2persons,
								persons, f, fm, families);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge families__f____family = (EMoflonEdge) result3_green[6];
				// EMoflonEdge families2persons__persons____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge fm__f____family_daughter = (EMoflonEdge) result3_green[8];
				// EMoflonEdge f__fm____daughters = (EMoflonEdge) result3_green[9];
				// EMoflonEdge families2persons__families____source = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, families2persons, persons, f, fm, families);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[families2persons] = " + families2persons + ", " + "[persons] = " + persons + ", "
							+ "[f] = " + f + ", " + "[fm] = " + fm + ", " + "[families] = " + families + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Family f, FamilyMember fm, Families families) {
		match.registerObject("f", f);
		match.registerObject("fm", fm);
		match.registerObject("families", families);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Family f, FamilyMember fm, Families families) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FamiliesToPersonsCorr families2persons,
			Persons persons, Family f, FamilyMember fm, Families families) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(", ");
		literal0.setType("");

		// Create attribute variables
		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f.familyName", true, csp);
		var_f_familyName.setValue(f.getFamilyName());
		var_f_familyName.setType("String");
		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm.firstName", true, csp);
		var_fm_firstName.setValue(fm.getFirstName());
		var_fm_firstName.setType("String");

		// Create unbound variables
		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p.fullName", csp);
		var_p_fullName.setType("String");

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("");
		concat.solve(literal0, var_f_familyName, var_fm_firstName, var_p_fullName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("families2persons", families2persons);
		isApplicableMatch.registerObject("persons", persons);
		isApplicableMatch.registerObject("f", f);
		isApplicableMatch.registerObject("fm", fm);
		isApplicableMatch.registerObject("families", families);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject p, EObject families2persons, EObject persons,
			EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("families2persons", families2persons);
		ruleresult.registerObject("persons", persons);
		ruleresult.registerObject("familyMember2Persons", familyMember2Persons);
		ruleresult.registerObject("f", f);
		ruleresult.registerObject("fm", fm);
		ruleresult.registerObject("families", families);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("fm").eClass())
				.equals("FamiliesModel.FamilyMember.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Female p, Persons persons) {
		// initial bindings
		Object[] result1_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_10_1_initialbindings_blackBBBB(this, match, p, persons);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, p, persons);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_10_4_collectelementstobetranslated_blackBBB(match, p,
							persons);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
			}
			DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_10_4_collectelementstobetranslated_greenBBBF(match, p,
							persons);
			// EMoflonEdge persons__p____person = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_10_5_collectcontextelements_blackBBB(match, p, persons);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
			}
			DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_10_5_collectcontextelements_greenBB(match, persons);

			// register objects to match
			DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_10_6_registerobjectstomatch_expressionBBBB(this, match, p,
							persons);
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_10_7_expressionF();
		} else {
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Female p = (Female) result1_bindingAndBlack[0];
		FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result1_bindingAndBlack[1];
		Persons persons = (Persons) result1_bindingAndBlack[2];
		Family f = (Family) result1_bindingAndBlack[3];
		Families families = (Families) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_greenBFBFB(p, f, csp);
		FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result1_green[1];
		FamilyMember fm = (FamilyMember) result1_green[3];

		// collect translated elements
		Object[] result2_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_2_collecttranslatedelements_blackBBB(p,
						familyMember2Persons, fm);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed." + " Variables: " + "[p] = " + p
							+ ", " + "[familyMember2Persons] = " + familyMember2Persons + ", " + "[fm] = " + fm + ".");
		}
		Object[] result2_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_2_collecttranslatedelements_greenFBBB(p,
						familyMember2Persons, fm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, p,
						families2persons, persons, familyMember2Persons, f, fm, families);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[p] = " + p + ", " + "[families2persons] = "
					+ families2persons + ", " + "[persons] = " + persons + ", " + "[familyMember2Persons] = "
					+ familyMember2Persons + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", " + "[families] = "
					+ families + ".");
		}
		DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, p,
						persons, familyMember2Persons, f, fm);
		// EMoflonEdge persons__p____person = (EMoflonEdge) result3_green[6];
		// EMoflonEdge familyMember2Persons__fm____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge familyMember2Persons__p____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge fm__f____family_daughter = (EMoflonEdge) result3_green[9];
		// EMoflonEdge f__fm____daughters = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, p,
						families2persons, persons, familyMember2Persons, f, fm, families);
		return DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Female p = (Female) result2_binding[0];
		Persons persons = (Persons) result2_binding[1];
		for (Object[] result2_black : DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_12_2_corematch_blackBFBFB(p, persons, match)) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_black[1];
			Families families = (Families) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_12_3_findcontext_blackBBBFB(p, families2persons, persons,
							families)) {
				Family f = (Family) result3_black[3];
				Object[] result3_green = DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_12_3_findcontext_greenBBBBBFFFFF(p, families2persons,
								persons, f, families);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge families__f____family = (EMoflonEdge) result3_green[6];
				// EMoflonEdge persons__p____person = (EMoflonEdge) result3_green[7];
				// EMoflonEdge families2persons__persons____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge families2persons__families____source = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, p, families2persons, persons, f, families);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = "
							+ p + ", " + "[families2persons] = " + families2persons + ", " + "[persons] = " + persons
							+ ", " + "[f] = " + f + ", " + "[families] = " + families + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Female p, Persons persons) {
		match.registerObject("p", p);
		match.registerObject("persons", persons);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Female p, Persons persons) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(", ");
		literal0.setType("");

		// Create attribute variables
		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f.familyName", true, csp);
		var_f_familyName.setValue(f.getFamilyName());
		var_f_familyName.setType("String");
		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p.fullName", true, csp);
		var_p_fullName.setValue(p.getFullName());
		var_p_fullName.setType("String");

		// Create unbound variables
		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm.firstName", csp);
		var_fm_firstName.setType("String");

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("");
		concat.solve(literal0, var_f_familyName, var_fm_firstName, var_p_fullName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("families2persons", families2persons);
		isApplicableMatch.registerObject("persons", persons);
		isApplicableMatch.registerObject("f", f);
		isApplicableMatch.registerObject("families", families);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject p, EObject families2persons, EObject persons,
			EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("families2persons", families2persons);
		ruleresult.registerObject("persons", persons);
		ruleresult.registerObject("familyMember2Persons", familyMember2Persons);
		ruleresult.registerObject("f", f);
		ruleresult.registerObject("fm", fm);
		ruleresult.registerObject("families", families);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("p").eClass()).equals("PersonsModel.Female.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(EMoflonEdge _edge_family_daughter) {
		// prepare return value
		Object[] result1_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_blackFFFB(_edge_family_daughter)) {
			Family f = (Family) result2_black[0];
			FamilyMember fm = (FamilyMember) result2_black[1];
			Families families = (Families) result2_black[2];
			Object[] result2_green = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, f, fm, families)) {
				// Ensure that the correct types of elements are matched
				if (DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(EMoflonEdge _edge_person) {
		// prepare return value
		Object[] result1_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_21_2_testcorematchandDECs_blackFFB(_edge_person)) {
			Female p = (Female) result2_black[0];
			Persons persons = (Persons) result2_black[1];
			Object[] result2_green = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, p, persons)) {
				// Ensure that the correct types of elements are matched
				if (DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("DaughterOfExistingFamilyToFemale");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm", true, csp);
		var_fm_firstName.setValue(__helper.getValue("fm", "firstName"));
		var_fm_firstName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(", ");
		var_literal0.setType("");

		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f", true, csp);
		var_f_familyName.setValue(__helper.getValue("f", "familyName"));
		var_f_familyName.setType("String");

		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p", true, csp);
		var_p_fullName.setValue(__helper.getValue("p", "fullName"));
		var_p_fullName.setType("String");

		Concat concat0 = new Concat();
		csp.getConstraints().add(concat0);

		concat0.setRuleName("DaughterOfExistingFamilyToFemale");
		concat0.solve(var_literal0, var_f_familyName, var_fm_firstName, var_p_fullName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_p_fullName.setBound(false);
			concat0.solve(var_literal0, var_f_familyName, var_fm_firstName, var_p_fullName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("p", "fullName", var_p_fullName.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("DaughterOfExistingFamilyToFemale");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm", true, csp);
		var_fm_firstName.setValue(__helper.getValue("fm", "firstName"));
		var_fm_firstName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(", ");
		var_literal0.setType("");

		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f", true, csp);
		var_f_familyName.setValue(__helper.getValue("f", "familyName"));
		var_f_familyName.setType("String");

		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p", true, csp);
		var_p_fullName.setValue(__helper.getValue("p", "fullName"));
		var_p_fullName.setType("String");

		Concat concat0 = new Concat();
		csp.getConstraints().add(concat0);

		concat0.setRuleName("DaughterOfExistingFamilyToFemale");
		concat0.solve(var_literal0, var_f_familyName, var_fm_firstName, var_p_fullName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_fm_firstName.setBound(false);
			concat0.solve(var_literal0, var_f_familyName, var_fm_firstName, var_p_fullName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("fm", "firstName", var_fm_firstName.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation perform_CC = (EOperation) result1_bindingAndBlack[0];
		// EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_greenBF(perform_CC);
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[1];

		// ForEach match context
		Object[] result2_binding = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_24_2_matchcontext_bindingFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		Female p = (Female) result2_binding[0];
		Persons persons = (Persons) result2_binding[1];
		Family f = (Family) result2_binding[2];
		FamilyMember fm = (FamilyMember) result2_binding[3];
		Families families = (Families) result2_binding[4];
		for (Object[] result2_black : DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_24_2_matchcontext_blackBFBBBBBB(p, persons, f, fm, families,
						sourceMatch, targetMatch)) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_black[1];
			Object[] result2_green = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_24_2_matchcontext_greenBBBBBBBFB(p, families2persons,
							persons, f, fm, families, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this,
							isApplicableMatch, p, families2persons, persons, f, fm, families, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_24_4_addtoreturnedresult_blackBB(result,
								isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_24_4_addtoreturnedresult_greenBB(result,
								isApplicableMatch);

			} else {
			}

		}
		return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_24_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(", ");
		literal0.setType("");

		// Create attribute variables
		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f.familyName", true, csp);
		var_f_familyName.setValue(f.getFamilyName());
		var_f_familyName.setType("String");
		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm.firstName", true, csp);
		var_fm_firstName.setValue(fm.getFirstName());
		var_fm_firstName.setType("String");
		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p.fullName", true, csp);
		var_p_fullName.setValue(p.getFullName());
		var_p_fullName.setType("String");

		// Create unbound variables

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("");
		concat.solve(literal0, var_f_familyName, var_fm_firstName, var_p_fullName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("families2persons", families2persons);
		isApplicableMatch.registerObject("persons", persons);
		isApplicableMatch.registerObject("f", f);
		isApplicableMatch.registerObject("fm", fm);
		isApplicableMatch.registerObject("families", families);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_CC(IsApplicableMatchCC isApplicableMatch) {
		// prepare
		Object[] result1_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_27_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_bindingAndBlackFFFFFFB(
						isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Female p = (Female) result2_bindingAndBlack[0];
		// FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_bindingAndBlack[1];
		// Persons persons = (Persons) result2_bindingAndBlack[2];
		// Family f = (Family) result2_bindingAndBlack[3];
		FamilyMember fm = (FamilyMember) result2_bindingAndBlack[4];
		// Families families = (Families) result2_bindingAndBlack[5];
		Object[] result2_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_greenBBFF(p, fm);
		PerformRuleResult result = (PerformRuleResult) result2_green[2];
		// FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result2_green[3];

		return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_27_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Family f, FamilyMember fm, Families families) {// match tgg pattern
		Object[] result1_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_blackBBB(f, fm, families);
		if (result1_black != null) {
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_28_2_expressionF();
		} else {
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Female p, Persons persons) {// match tgg pattern
		Object[] result1_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_29_1_matchtggpattern_blackBB(p, persons);
		if (result1_black != null) {
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_29_2_expressionF();
		} else {
			return DaughterOfExistingFamilyToFemaleImpl.pattern_DaughterOfExistingFamilyToFemale_29_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			FamiliesToPersonsCorr families2personsParameter) {
		// create result
		Object[] result1_black = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_30_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_30_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList families2personsList = (RuleEntryList) result2_black[0];
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_black[1];
			Families families = (Families) result2_black[2];
			Family f = (Family) result2_black[3];
			Persons persons = (Persons) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_bindingAndBlackFBBBBBBB(this,
							isApplicableMatch, families2persons, persons, f, families, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[families2persons] = "
						+ families2persons + ", " + "[persons] = " + persons + ", " + "[f] = " + f + ", "
						+ "[families] = " + families + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (DaughterOfExistingFamilyToFemaleImpl
					.pattern_DaughterOfExistingFamilyToFemale_30_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = DaughterOfExistingFamilyToFemaleImpl
						.pattern_DaughterOfExistingFamilyToFemale_30_5_checknacs_blackBBBB(families2persons, persons, f,
								families);
				if (result5_black != null) {

					// perform
					Object[] result6_black = DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_30_6_perform_blackBBBBB(families2persons, persons,
									f, families, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[families2persons] = " + families2persons + ", " + "[persons] = " + persons + ", "
								+ "[f] = " + f + ", " + "[families] = " + families + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					DaughterOfExistingFamilyToFemaleImpl
							.pattern_DaughterOfExistingFamilyToFemale_30_6_perform_greenFBFBFBB(persons, f, ruleResult,
									csp);
					// Female p = (Female) result6_green[0];
					// FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result6_green[2];
					// FamilyMember fm = (FamilyMember) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return DaughterOfExistingFamilyToFemaleImpl
				.pattern_DaughterOfExistingFamilyToFemale_30_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FamiliesToPersonsCorr families2persons,
			Persons persons, Family f, Families families, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(", ");
		literal0.setType("");

		// Create attribute variables
		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f.familyName", true, csp);
		var_f_familyName.setValue(f.getFamilyName());
		var_f_familyName.setType("String");

		// Create unbound variables
		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm.firstName", csp);
		var_fm_firstName.setType("String");
		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p.fullName", csp);
		var_p_fullName.setType("String");

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("");
		concat.solve(literal0, var_f_familyName, var_fm_firstName, var_p_fullName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("families2persons", families2persons);
		isApplicableMatch.registerObject("persons", persons);
		isApplicableMatch.registerObject("f", f);
		isApplicableMatch.registerObject("families", families);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES:
			return isAppropriate_FWD((Match) arguments.get(0), (Family) arguments.get(1),
					(FamilyMember) arguments.get(2), (Families) arguments.get(3));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Family) arguments.get(1),
					(FamilyMember) arguments.get(2), (Families) arguments.get(3));
			return null;
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Family) arguments.get(1),
					(FamilyMember) arguments.get(2), (Families) arguments.get(3));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(FamiliesToPersonsCorr) arguments.get(1), (Persons) arguments.get(2), (Family) arguments.get(3),
					(FamilyMember) arguments.get(4), (Families) arguments.get(5));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_BWD__MATCH_FEMALE_PERSONS:
			return isAppropriate_BWD((Match) arguments.get(0), (Female) arguments.get(1), (Persons) arguments.get(2));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FEMALE_PERSONS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Female) arguments.get(1), (Persons) arguments.get(2));
			return null;
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FEMALE_PERSONS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Female) arguments.get(1),
					(Persons) arguments.get(2));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FEMALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Female) arguments.get(1),
					(FamiliesToPersonsCorr) arguments.get(2), (Persons) arguments.get(3), (Family) arguments.get(4),
					(Families) arguments.get(5));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FEMALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (Female) arguments.get(1),
					(FamiliesToPersonsCorr) arguments.get(2), (Persons) arguments.get(3), (Family) arguments.get(4),
					(FamilyMember) arguments.get(5), (Families) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES:
			return checkDEC_FWD((Family) arguments.get(0), (FamilyMember) arguments.get(1),
					(Families) arguments.get(2));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_DEC_BWD__FEMALE_PERSONS:
			return checkDEC_BWD((Female) arguments.get(0), (Persons) arguments.get(1));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR:
			return generateModel((RuleEntryContainer) arguments.get(0), (FamiliesToPersonsCorr) arguments.get(1));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(FamiliesToPersonsCorr) arguments.get(1), (Persons) arguments.get(2), (Family) arguments.get(3),
					(Families) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_1_initialbindings_blackBBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Family f, FamilyMember fm, Families families) {
		return new Object[] { _this, match, f, fm, families };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_bindingFBBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Family f, FamilyMember fm, Families families) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, f, fm, families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, f, fm, families };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_bindingAndBlackFBBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Family f, FamilyMember fm, Families families) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_binding = pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_bindingFBBBBB(
				_this, match, f, fm, families);
		if (result_pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_black = pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_DaughterOfExistingFamilyToFemale_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, f, fm, families };
			}
		}
		return null;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_0_3_CheckCSP_expressionFBB(
			DaughterOfExistingFamilyToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Family f, FamilyMember fm, Families families) {
		return new Object[] { match, f, fm, families };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, Family f, FamilyMember fm) {
		EMoflonEdge fm__f____family_daughter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____daughters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(fm);
		String fm__f____family_daughter_name_prime = "family_daughter";
		String f__fm____daughters_name_prime = "daughters";
		fm__f____family_daughter.setSrc(fm);
		fm__f____family_daughter.setTrg(f);
		match.getToBeTranslatedEdges().add(fm__f____family_daughter);
		f__fm____daughters.setSrc(f);
		f__fm____daughters.setTrg(fm);
		match.getToBeTranslatedEdges().add(f__fm____daughters);
		fm__f____family_daughter.setName(fm__f____family_daughter_name_prime);
		f__fm____daughters.setName(f__fm____daughters_name_prime);
		return new Object[] { match, f, fm, fm__f____family_daughter, f__fm____daughters };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_5_collectcontextelements_blackBBBB(
			Match match, Family f, FamilyMember fm, Families families) {
		return new Object[] { match, f, fm, families };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_0_5_collectcontextelements_greenBBBF(
			Match match, Family f, Families families) {
		EMoflonEdge families__f____family = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(f);
		match.getContextNodes().add(families);
		String families__f____family_name_prime = "family";
		families__f____family.setSrc(families);
		families__f____family.setTrg(f);
		match.getContextEdges().add(families__f____family);
		families__f____family.setName(families__f____family_name_prime);
		return new Object[] { match, f, families, families__f____family };
	}

	public static final void pattern_DaughterOfExistingFamilyToFemale_0_6_registerobjectstomatch_expressionBBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Family f, FamilyMember fm, Families families) {
		_this.registerObjectsToMatch_FWD(match, f, fm, families);

	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("families2persons");
		EObject _localVariable_1 = isApplicableMatch.getObject("persons");
		EObject _localVariable_2 = isApplicableMatch.getObject("f");
		EObject _localVariable_3 = isApplicableMatch.getObject("fm");
		EObject _localVariable_4 = isApplicableMatch.getObject("families");
		EObject tmpFamilies2persons = _localVariable_0;
		EObject tmpPersons = _localVariable_1;
		EObject tmpF = _localVariable_2;
		EObject tmpFm = _localVariable_3;
		EObject tmpFamilies = _localVariable_4;
		if (tmpFamilies2persons instanceof FamiliesToPersonsCorr) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) tmpFamilies2persons;
			if (tmpPersons instanceof Persons) {
				Persons persons = (Persons) tmpPersons;
				if (tmpF instanceof Family) {
					Family f = (Family) tmpF;
					if (tmpFm instanceof FamilyMember) {
						FamilyMember fm = (FamilyMember) tmpFm;
						if (tmpFamilies instanceof Families) {
							Families families = (Families) tmpFamilies;
							return new Object[] { families2persons, persons, f, fm, families, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_blackBBBBBFBB(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families,
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { families2persons, persons, f, fm, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_binding = pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_binding != null) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_binding[0];
			Persons persons = (Persons) result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_binding[1];
			Family f = (Family) result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_binding[2];
			FamilyMember fm = (FamilyMember) result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_binding[3];
			Families families = (Families) result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_binding[4];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_black = pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_blackBBBBBFBB(
					families2persons, persons, f, fm, families, _this, isApplicableMatch);
			if (result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_black[5];

				return new Object[] { families2persons, persons, f, fm, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_1_performtransformation_greenFBFBB(
			Persons persons, FamilyMember fm, CSP csp) {
		Female p = PersonsModelFactory.eINSTANCE.createFemale();
		FamilyMemberToPerson familyMember2Persons = FamiliesToPersonsFactory.eINSTANCE.createFamilyMemberToPerson();
		Object _localVariable_0 = csp.getValue("p", "fullName");
		persons.getPerson().add(p);
		familyMember2Persons.setSource(fm);
		familyMember2Persons.setTarget(p);
		String p_fullName_prime = (String) _localVariable_0;
		p.setFullName(p_fullName_prime);
		return new Object[] { p, persons, familyMember2Persons, fm, csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_2_collecttranslatedelements_blackBBB(
			Female p, FamilyMemberToPerson familyMember2Persons, FamilyMember fm) {
		return new Object[] { p, familyMember2Persons, fm };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_2_collecttranslatedelements_greenFBBB(
			Female p, FamilyMemberToPerson familyMember2Persons, FamilyMember fm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(familyMember2Persons);
		ruleresult.getTranslatedElements().add(fm);
		return new Object[] { ruleresult, p, familyMember2Persons, fm };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject p, EObject families2persons, EObject persons,
			EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		if (!p.equals(persons)) {
			if (!families2persons.equals(p)) {
				if (!families2persons.equals(persons)) {
					if (!families2persons.equals(familyMember2Persons)) {
						if (!families2persons.equals(fm)) {
							if (!familyMember2Persons.equals(p)) {
								if (!familyMember2Persons.equals(persons)) {
									if (!familyMember2Persons.equals(fm)) {
										if (!f.equals(p)) {
											if (!f.equals(families2persons)) {
												if (!f.equals(persons)) {
													if (!f.equals(familyMember2Persons)) {
														if (!f.equals(fm)) {
															if (!f.equals(families)) {
																if (!fm.equals(p)) {
																	if (!fm.equals(persons)) {
																		if (!families.equals(p)) {
																			if (!families.equals(families2persons)) {
																				if (!families.equals(persons)) {
																					if (!families.equals(
																							familyMember2Persons)) {
																						if (!families.equals(fm)) {
																							return new Object[] {
																									ruleresult, p,
																									families2persons,
																									persons,
																									familyMember2Persons,
																									f, fm, families };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject p, EObject persons, EObject familyMember2Persons, EObject f,
			EObject fm) {
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__fm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__p____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fm__f____family_daughter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____daughters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DaughterOfExistingFamilyToFemale";
		String persons__p____person_name_prime = "person";
		String familyMember2Persons__fm____source_name_prime = "source";
		String familyMember2Persons__p____target_name_prime = "target";
		String fm__f____family_daughter_name_prime = "family_daughter";
		String f__fm____daughters_name_prime = "daughters";
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		ruleresult.getCreatedEdges().add(persons__p____person);
		familyMember2Persons__fm____source.setSrc(familyMember2Persons);
		familyMember2Persons__fm____source.setTrg(fm);
		ruleresult.getCreatedEdges().add(familyMember2Persons__fm____source);
		familyMember2Persons__p____target.setSrc(familyMember2Persons);
		familyMember2Persons__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(familyMember2Persons__p____target);
		fm__f____family_daughter.setSrc(fm);
		fm__f____family_daughter.setTrg(f);
		ruleresult.getTranslatedEdges().add(fm__f____family_daughter);
		f__fm____daughters.setSrc(f);
		f__fm____daughters.setTrg(fm);
		ruleresult.getTranslatedEdges().add(f__fm____daughters);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		persons__p____person.setName(persons__p____person_name_prime);
		familyMember2Persons__fm____source.setName(familyMember2Persons__fm____source_name_prime);
		familyMember2Persons__p____target.setName(familyMember2Persons__p____target_name_prime);
		fm__f____family_daughter.setName(fm__f____family_daughter_name_prime);
		f__fm____daughters.setName(f__fm____daughters_name_prime);
		return new Object[] { ruleresult, p, persons, familyMember2Persons, f, fm, persons__p____person,
				familyMember2Persons__fm____source, familyMember2Persons__p____target, fm__f____family_daughter,
				f__fm____daughters };
	}

	public static final void pattern_DaughterOfExistingFamilyToFemale_1_5_registerobjects_expressionBBBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, PerformRuleResult ruleresult, EObject p, EObject families2persons,
			EObject persons, EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		_this.registerObjects_FWD(ruleresult, p, families2persons, persons, familyMember2Persons, f, fm, families);

	}

	public static final PerformRuleResult pattern_DaughterOfExistingFamilyToFemale_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_bindingFB(
			DaughterOfExistingFamilyToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_blackFBB(EClass eClass,
			DaughterOfExistingFamilyToFemale _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_bindingAndBlackFFB(
			DaughterOfExistingFamilyToFemale _this) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_binding = pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_black = pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "DaughterOfExistingFamilyToFemale";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("f");
		EObject _localVariable_1 = match.getObject("fm");
		EObject _localVariable_2 = match.getObject("families");
		EObject tmpF = _localVariable_0;
		EObject tmpFm = _localVariable_1;
		EObject tmpFamilies = _localVariable_2;
		if (tmpF instanceof Family) {
			Family f = (Family) tmpF;
			if (tmpFm instanceof FamilyMember) {
				FamilyMember fm = (FamilyMember) tmpFm;
				if (tmpFamilies instanceof Families) {
					Families families = (Families) tmpFamilies;
					return new Object[] { f, fm, families, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_2_2_corematch_blackFFBBBB(Family f,
			FamilyMember fm, Families families, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FamiliesToPersonsCorr families2persons : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(families, FamiliesToPersonsCorr.class, "source")) {
			Persons persons = families2persons.getTarget();
			if (persons != null) {
				_result.add(new Object[] { families2persons, persons, f, fm, families, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_2_3_findcontext_blackBBBBB(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (families.getFamily().contains(f)) {
			if (persons.equals(families2persons.getTarget())) {
				if (f.equals(fm.getFamily_daughter())) {
					if (families.equals(families2persons.getSource())) {
						_result.add(new Object[] { families2persons, persons, f, fm, families });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_3_findcontext_greenBBBBBFFFFFF(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge families__f____family = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__persons____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fm__f____family_daughter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____daughters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__families____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String families__f____family_name_prime = "family";
		String families2persons__persons____target_name_prime = "target";
		String fm__f____family_daughter_name_prime = "family_daughter";
		String f__fm____daughters_name_prime = "daughters";
		String families2persons__families____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(families2persons);
		isApplicableMatch.getAllContextElements().add(persons);
		isApplicableMatch.getAllContextElements().add(f);
		isApplicableMatch.getAllContextElements().add(fm);
		isApplicableMatch.getAllContextElements().add(families);
		families__f____family.setSrc(families);
		families__f____family.setTrg(f);
		isApplicableMatch.getAllContextElements().add(families__f____family);
		families2persons__persons____target.setSrc(families2persons);
		families2persons__persons____target.setTrg(persons);
		isApplicableMatch.getAllContextElements().add(families2persons__persons____target);
		fm__f____family_daughter.setSrc(fm);
		fm__f____family_daughter.setTrg(f);
		isApplicableMatch.getAllContextElements().add(fm__f____family_daughter);
		f__fm____daughters.setSrc(f);
		f__fm____daughters.setTrg(fm);
		isApplicableMatch.getAllContextElements().add(f__fm____daughters);
		families2persons__families____source.setSrc(families2persons);
		families2persons__families____source.setTrg(families);
		isApplicableMatch.getAllContextElements().add(families2persons__families____source);
		families__f____family.setName(families__f____family_name_prime);
		families2persons__persons____target.setName(families2persons__persons____target_name_prime);
		fm__f____family_daughter.setName(fm__f____family_daughter_name_prime);
		f__fm____daughters.setName(f__fm____daughters_name_prime);
		families2persons__families____source.setName(families2persons__families____source_name_prime);
		return new Object[] { families2persons, persons, f, fm, families, isApplicableMatch, families__f____family,
				families2persons__persons____target, fm__f____family_daughter, f__fm____daughters,
				families2persons__families____source };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_bindingFBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, families2persons, persons, f, fm,
				families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, f, fm, families };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_binding = pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, families2persons, persons, f, fm, families);
		if (result_pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_black = pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_DaughterOfExistingFamilyToFemale_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, f, fm, families };
			}
		}
		return null;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_2_5_checkCSP_expressionFBB(
			DaughterOfExistingFamilyToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DaughterOfExistingFamilyToFemale";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DaughterOfExistingFamilyToFemale_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_1_initialbindings_blackBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Female p, Persons persons) {
		return new Object[] { _this, match, p, persons };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_bindingFBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Female p, Persons persons) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, p, persons);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p, persons };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_bindingAndBlackFBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Female p, Persons persons) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_binding = pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_bindingFBBBB(
				_this, match, p, persons);
		if (result_pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_black = pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_DaughterOfExistingFamilyToFemale_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, p, persons };
			}
		}
		return null;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_10_3_CheckCSP_expressionFBB(
			DaughterOfExistingFamilyToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_4_collectelementstobetranslated_blackBBB(
			Match match, Female p, Persons persons) {
		return new Object[] { match, p, persons };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Female p, Persons persons) {
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(p);
		String persons__p____person_name_prime = "person";
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		match.getToBeTranslatedEdges().add(persons__p____person);
		persons__p____person.setName(persons__p____person_name_prime);
		return new Object[] { match, p, persons, persons__p____person };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_5_collectcontextelements_blackBBB(
			Match match, Female p, Persons persons) {
		return new Object[] { match, p, persons };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_10_5_collectcontextelements_greenBB(
			Match match, Persons persons) {
		match.getContextNodes().add(persons);
		return new Object[] { match, persons };
	}

	public static final void pattern_DaughterOfExistingFamilyToFemale_10_6_registerobjectstomatch_expressionBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Female p, Persons persons) {
		_this.registerObjectsToMatch_BWD(match, p, persons);

	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("families2persons");
		EObject _localVariable_2 = isApplicableMatch.getObject("persons");
		EObject _localVariable_3 = isApplicableMatch.getObject("f");
		EObject _localVariable_4 = isApplicableMatch.getObject("families");
		EObject tmpP = _localVariable_0;
		EObject tmpFamilies2persons = _localVariable_1;
		EObject tmpPersons = _localVariable_2;
		EObject tmpF = _localVariable_3;
		EObject tmpFamilies = _localVariable_4;
		if (tmpP instanceof Female) {
			Female p = (Female) tmpP;
			if (tmpFamilies2persons instanceof FamiliesToPersonsCorr) {
				FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) tmpFamilies2persons;
				if (tmpPersons instanceof Persons) {
					Persons persons = (Persons) tmpPersons;
					if (tmpF instanceof Family) {
						Family f = (Family) tmpF;
						if (tmpFamilies instanceof Families) {
							Families families = (Families) tmpFamilies;
							return new Object[] { p, families2persons, persons, f, families, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_blackBBBBBFBB(
			Female p, FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families,
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, families2persons, persons, f, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_binding = pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_binding != null) {
			Female p = (Female) result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_binding[0];
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_binding[1];
			Persons persons = (Persons) result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_binding[2];
			Family f = (Family) result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_binding[3];
			Families families = (Families) result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_binding[4];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_black = pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_blackBBBBBFBB(
					p, families2persons, persons, f, families, _this, isApplicableMatch);
			if (result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_black[5];

				return new Object[] { p, families2persons, persons, f, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_1_performtransformation_greenBFBFB(
			Female p, Family f, CSP csp) {
		FamilyMemberToPerson familyMember2Persons = FamiliesToPersonsFactory.eINSTANCE.createFamilyMemberToPerson();
		FamilyMember fm = FamiliesModelFactory.eINSTANCE.createFamilyMember();
		Object _localVariable_0 = csp.getValue("fm", "firstName");
		familyMember2Persons.setTarget(p);
		familyMember2Persons.setSource(fm);
		fm.setFamily_daughter(f);
		String fm_firstName_prime = (String) _localVariable_0;
		fm.setFirstName(fm_firstName_prime);
		return new Object[] { p, familyMember2Persons, f, fm, csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_2_collecttranslatedelements_blackBBB(
			Female p, FamilyMemberToPerson familyMember2Persons, FamilyMember fm) {
		return new Object[] { p, familyMember2Persons, fm };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_2_collecttranslatedelements_greenFBBB(
			Female p, FamilyMemberToPerson familyMember2Persons, FamilyMember fm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(familyMember2Persons);
		ruleresult.getCreatedElements().add(fm);
		return new Object[] { ruleresult, p, familyMember2Persons, fm };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject p, EObject families2persons, EObject persons,
			EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		if (!p.equals(persons)) {
			if (!families2persons.equals(p)) {
				if (!families2persons.equals(persons)) {
					if (!families2persons.equals(familyMember2Persons)) {
						if (!families2persons.equals(fm)) {
							if (!familyMember2Persons.equals(p)) {
								if (!familyMember2Persons.equals(persons)) {
									if (!familyMember2Persons.equals(fm)) {
										if (!f.equals(p)) {
											if (!f.equals(families2persons)) {
												if (!f.equals(persons)) {
													if (!f.equals(familyMember2Persons)) {
														if (!f.equals(fm)) {
															if (!f.equals(families)) {
																if (!fm.equals(p)) {
																	if (!fm.equals(persons)) {
																		if (!families.equals(p)) {
																			if (!families.equals(families2persons)) {
																				if (!families.equals(persons)) {
																					if (!families.equals(
																							familyMember2Persons)) {
																						if (!families.equals(fm)) {
																							return new Object[] {
																									ruleresult, p,
																									families2persons,
																									persons,
																									familyMember2Persons,
																									f, fm, families };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject p, EObject persons, EObject familyMember2Persons, EObject f,
			EObject fm) {
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__fm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__p____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fm__f____family_daughter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____daughters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DaughterOfExistingFamilyToFemale";
		String persons__p____person_name_prime = "person";
		String familyMember2Persons__fm____source_name_prime = "source";
		String familyMember2Persons__p____target_name_prime = "target";
		String fm__f____family_daughter_name_prime = "family_daughter";
		String f__fm____daughters_name_prime = "daughters";
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		ruleresult.getTranslatedEdges().add(persons__p____person);
		familyMember2Persons__fm____source.setSrc(familyMember2Persons);
		familyMember2Persons__fm____source.setTrg(fm);
		ruleresult.getCreatedEdges().add(familyMember2Persons__fm____source);
		familyMember2Persons__p____target.setSrc(familyMember2Persons);
		familyMember2Persons__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(familyMember2Persons__p____target);
		fm__f____family_daughter.setSrc(fm);
		fm__f____family_daughter.setTrg(f);
		ruleresult.getCreatedEdges().add(fm__f____family_daughter);
		f__fm____daughters.setSrc(f);
		f__fm____daughters.setTrg(fm);
		ruleresult.getCreatedEdges().add(f__fm____daughters);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		persons__p____person.setName(persons__p____person_name_prime);
		familyMember2Persons__fm____source.setName(familyMember2Persons__fm____source_name_prime);
		familyMember2Persons__p____target.setName(familyMember2Persons__p____target_name_prime);
		fm__f____family_daughter.setName(fm__f____family_daughter_name_prime);
		f__fm____daughters.setName(f__fm____daughters_name_prime);
		return new Object[] { ruleresult, p, persons, familyMember2Persons, f, fm, persons__p____person,
				familyMember2Persons__fm____source, familyMember2Persons__p____target, fm__f____family_daughter,
				f__fm____daughters };
	}

	public static final void pattern_DaughterOfExistingFamilyToFemale_11_5_registerobjects_expressionBBBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, PerformRuleResult ruleresult, EObject p, EObject families2persons,
			EObject persons, EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		_this.registerObjects_BWD(ruleresult, p, families2persons, persons, familyMember2Persons, f, fm, families);

	}

	public static final PerformRuleResult pattern_DaughterOfExistingFamilyToFemale_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_bindingFB(
			DaughterOfExistingFamilyToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_blackFBB(
			EClass eClass, DaughterOfExistingFamilyToFemale _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_bindingAndBlackFFB(
			DaughterOfExistingFamilyToFemale _this) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_binding = pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_black = pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "DaughterOfExistingFamilyToFemale";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("p");
		EObject _localVariable_1 = match.getObject("persons");
		EObject tmpP = _localVariable_0;
		EObject tmpPersons = _localVariable_1;
		if (tmpP instanceof Female) {
			Female p = (Female) tmpP;
			if (tmpPersons instanceof Persons) {
				Persons persons = (Persons) tmpPersons;
				return new Object[] { p, persons, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_12_2_corematch_blackBFBFB(Female p,
			Persons persons, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FamiliesToPersonsCorr families2persons : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(persons, FamiliesToPersonsCorr.class, "target")) {
			Families families = families2persons.getSource();
			if (families != null) {
				_result.add(new Object[] { p, families2persons, persons, families, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_12_3_findcontext_blackBBBFB(
			Female p, FamiliesToPersonsCorr families2persons, Persons persons, Families families) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (persons.getPerson().contains(p)) {
			if (persons.equals(families2persons.getTarget())) {
				if (families.equals(families2persons.getSource())) {
					for (Family f : families.getFamily()) {
						_result.add(new Object[] { p, families2persons, persons, f, families });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_3_findcontext_greenBBBBBFFFFF(Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge families__f____family = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__persons____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__families____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String families__f____family_name_prime = "family";
		String persons__p____person_name_prime = "person";
		String families2persons__persons____target_name_prime = "target";
		String families2persons__families____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(families2persons);
		isApplicableMatch.getAllContextElements().add(persons);
		isApplicableMatch.getAllContextElements().add(f);
		isApplicableMatch.getAllContextElements().add(families);
		families__f____family.setSrc(families);
		families__f____family.setTrg(f);
		isApplicableMatch.getAllContextElements().add(families__f____family);
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		isApplicableMatch.getAllContextElements().add(persons__p____person);
		families2persons__persons____target.setSrc(families2persons);
		families2persons__persons____target.setTrg(persons);
		isApplicableMatch.getAllContextElements().add(families2persons__persons____target);
		families2persons__families____source.setSrc(families2persons);
		families2persons__families____source.setTrg(families);
		isApplicableMatch.getAllContextElements().add(families2persons__families____source);
		families__f____family.setName(families__f____family_name_prime);
		persons__p____person.setName(persons__p____person_name_prime);
		families2persons__persons____target.setName(families2persons__persons____target_name_prime);
		families2persons__families____source.setName(families2persons__families____source_name_prime);
		return new Object[] { p, families2persons, persons, f, families, isApplicableMatch, families__f____family,
				persons__p____person, families2persons__persons____target, families2persons__families____source };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_bindingFBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch, Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, p, families2persons, persons, f,
				families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, families2persons, persons, f, families };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch, Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_binding = pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, p, families2persons, persons, f, families);
		if (result_pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_black = pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_DaughterOfExistingFamilyToFemale_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, families2persons, persons, f, families };
			}
		}
		return null;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_12_5_checkCSP_expressionFBB(
			DaughterOfExistingFamilyToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DaughterOfExistingFamilyToFemale";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DaughterOfExistingFamilyToFemale_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_bindingFB(
			DaughterOfExistingFamilyToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, DaughterOfExistingFamilyToFemale _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_bindingAndBlackFFBF(
			DaughterOfExistingFamilyToFemale _this) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_binding = pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_black = pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_0BB(
			FamilyMember fm, Family f) {
		Family __DEC_fm_family_father_737920 = fm.getFamily_father();
		if (__DEC_fm_family_father_737920 != null) {
			if (!f.equals(__DEC_fm_family_father_737920)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_1BB(
			FamilyMember fm, Family f) {
		Family __DEC_fm_family_mother_852591 = fm.getFamily_mother();
		if (__DEC_fm_family_mother_852591 != null) {
			if (!f.equals(__DEC_fm_family_mother_852591)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_2BB(
			FamilyMember fm, Family f) {
		Family __DEC_fm_family_son_747550 = fm.getFamily_son();
		if (__DEC_fm_family_son_747550 != null) {
			if (!f.equals(__DEC_fm_family_son_747550)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_3BB(
			FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_father())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_4BB(
			FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_mother())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_5BB(
			FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_son())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_family_daughter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFm = _edge_family_daughter.getSrc();
		if (tmpFm instanceof FamilyMember) {
			FamilyMember fm = (FamilyMember) tmpFm;
			EObject tmpF = _edge_family_daughter.getTrg();
			if (tmpF instanceof Family) {
				Family f = (Family) tmpF;
				if (f.equals(fm.getFamily_daughter())) {
					if (pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_0BB(fm,
							f) == null) {
						if (pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_1BB(fm,
								f) == null) {
							if (pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_2BB(fm,
									f) == null) {
								if (pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_3BB(fm,
										f) == null) {
									if (pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_4BB(
											fm, f) == null) {
										if (pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_black_nac_5BB(
												fm, f) == null) {
											for (Families families : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(f, Families.class, "family")) {
												_result.add(new Object[] { f, fm, families, _edge_family_daughter });
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Family f, FamilyMember fm, Families families) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, f, fm, families);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			DaughterOfExistingFamilyToFemale _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_DaughterOfExistingFamilyToFemale_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_bindingFB(
			DaughterOfExistingFamilyToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, DaughterOfExistingFamilyToFemale _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_bindingAndBlackFFBF(
			DaughterOfExistingFamilyToFemale _this) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_binding = pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_black = pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_person) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPersons = _edge_person.getSrc();
		if (tmpPersons instanceof Persons) {
			Persons persons = (Persons) tmpPersons;
			EObject tmpP = _edge_person.getTrg();
			if (tmpP instanceof Female) {
				Female p = (Female) tmpP;
				if (persons.getPerson().contains(p)) {
					_result.add(new Object[] { p, persons, _edge_person });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			DaughterOfExistingFamilyToFemale _this, Match match, Female p, Persons persons) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, p, persons);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			DaughterOfExistingFamilyToFemale _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_DaughterOfExistingFamilyToFemale_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_bindingFB(
			DaughterOfExistingFamilyToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_blackFBB(EClass __eClass,
			DaughterOfExistingFamilyToFemale _this) {
		for (EOperation perform_CC : __eClass.getEOperations()) {
			String perform_CC_name = perform_CC.getName();
			if (perform_CC_name.equals("perform_CC")) {
				return new Object[] { perform_CC, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_bindingAndBlackFFB(
			DaughterOfExistingFamilyToFemale _this) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_binding = pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_bindingFB(
				_this);
		if (result_pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_binding != null) {
			EClass __eClass = (EClass) result_pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_black = pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_blackFBB(
					__eClass, _this);
			if (result_pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_black != null) {
				EOperation perform_CC = (EOperation) result_pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_black[0];

				return new Object[] { perform_CC, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_1_prepare_greenBF(EOperation perform_CC) {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		result.setPerformOperation(perform_CC);
		return new Object[] { perform_CC, result };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_2_matchcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("p");
		EObject _localVariable_1 = targetMatch.getObject("persons");
		EObject _localVariable_2 = sourceMatch.getObject("f");
		EObject _localVariable_3 = sourceMatch.getObject("fm");
		EObject _localVariable_4 = sourceMatch.getObject("families");
		EObject tmpP = _localVariable_0;
		EObject tmpPersons = _localVariable_1;
		EObject tmpF = _localVariable_2;
		EObject tmpFm = _localVariable_3;
		EObject tmpFamilies = _localVariable_4;
		if (tmpP instanceof Female) {
			Female p = (Female) tmpP;
			if (tmpPersons instanceof Persons) {
				Persons persons = (Persons) tmpPersons;
				if (tmpF instanceof Family) {
					Family f = (Family) tmpF;
					if (tmpFm instanceof FamilyMember) {
						FamilyMember fm = (FamilyMember) tmpFm;
						if (tmpFamilies instanceof Families) {
							Families families = (Families) tmpFamilies;
							return new Object[] { p, persons, f, fm, families, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_24_2_matchcontext_blackBFBBBBBB(
			Female p, Persons persons, Family f, FamilyMember fm, Families families, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (families.getFamily().contains(f)) {
				if (persons.getPerson().contains(p)) {
					if (f.equals(fm.getFamily_daughter())) {
						for (FamiliesToPersonsCorr families2persons : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(persons, FamiliesToPersonsCorr.class, "target")) {
							if (families.equals(families2persons.getSource())) {
								_result.add(new Object[] { p, families2persons, persons, f, fm, families, sourceMatch,
										targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_2_matchcontext_greenBBBBBBBFB(Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families,
			Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "DaughterOfExistingFamilyToFemale";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(f);
		isApplicableMatch.getAllContextElements().add(fm);
		isApplicableMatch.getAllContextElements().add(families);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(persons);
		isApplicableMatch.getAllContextElements().add(families2persons);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { p, families2persons, persons, f, fm, families, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_bindingFBBBBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatchCC isApplicableMatch, Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, p, families2persons, persons, f, fm,
				families, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, families2persons, persons, f, fm, families,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatchCC isApplicableMatch, Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_binding = pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, p, families2persons, persons, f, fm, families, sourceMatch, targetMatch);
		if (result_pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_black = pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_DaughterOfExistingFamilyToFemale_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, families2persons, persons, f, fm, families,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_4_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_24_4_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DaughterOfExistingFamilyToFemale";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DaughterOfExistingFamilyToFemale_24_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_27_1_prepare_blackB(
			DaughterOfExistingFamilyToFemale _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_bindingFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("families2persons");
		EObject _localVariable_2 = isApplicableMatch.getObject("persons");
		EObject _localVariable_3 = isApplicableMatch.getObject("f");
		EObject _localVariable_4 = isApplicableMatch.getObject("fm");
		EObject _localVariable_5 = isApplicableMatch.getObject("families");
		EObject tmpP = _localVariable_0;
		EObject tmpFamilies2persons = _localVariable_1;
		EObject tmpPersons = _localVariable_2;
		EObject tmpF = _localVariable_3;
		EObject tmpFm = _localVariable_4;
		EObject tmpFamilies = _localVariable_5;
		if (tmpP instanceof Female) {
			Female p = (Female) tmpP;
			if (tmpFamilies2persons instanceof FamiliesToPersonsCorr) {
				FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) tmpFamilies2persons;
				if (tmpPersons instanceof Persons) {
					Persons persons = (Persons) tmpPersons;
					if (tmpF instanceof Family) {
						Family f = (Family) tmpF;
						if (tmpFm instanceof FamilyMember) {
							FamilyMember fm = (FamilyMember) tmpFm;
							if (tmpFamilies instanceof Families) {
								Families families = (Families) tmpFamilies;
								return new Object[] { p, families2persons, persons, f, fm, families,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_blackBBBBBBB(
			Female p, FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm,
			Families families, IsApplicableMatchCC isApplicableMatch) {
		if (families.getFamily().contains(f)) {
			if (persons.getPerson().contains(p)) {
				if (persons.equals(families2persons.getTarget())) {
					if (f.equals(fm.getFamily_daughter())) {
						if (families.equals(families2persons.getSource())) {
							return new Object[] { p, families2persons, persons, f, fm, families, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_bindingAndBlackFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding = pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding != null) {
			Female p = (Female) result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding[0];
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding[1];
			Persons persons = (Persons) result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding[2];
			Family f = (Family) result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding[3];
			FamilyMember fm = (FamilyMember) result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding[4];
			Families families = (Families) result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_binding[5];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_black = pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_blackBBBBBBB(
					p, families2persons, persons, f, fm, families, isApplicableMatch);
			if (result_pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_black != null) {

				return new Object[] { p, families2persons, persons, f, fm, families, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_27_2_createcorrespondencelinks_greenBBFF(
			Female p, FamilyMember fm) {
		PerformRuleResult result = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		FamilyMemberToPerson familyMember2Persons = FamiliesToPersonsFactory.eINSTANCE.createFamilyMemberToPerson();
		result.getCreatedElements().add(familyMember2Persons);
		familyMember2Persons.setSource(fm);
		familyMember2Persons.setTarget(p);
		return new Object[] { p, fm, result, familyMember2Persons };
	}

	public static final PerformRuleResult pattern_DaughterOfExistingFamilyToFemale_27_3_expressionFB(
			PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_0BB(
			FamilyMember fm, Family f) {
		Family __DEC_fm_family_father_155528 = fm.getFamily_father();
		if (__DEC_fm_family_father_155528 != null) {
			if (!f.equals(__DEC_fm_family_father_155528)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_1BB(
			FamilyMember fm, Family f) {
		Family __DEC_fm_family_mother_770256 = fm.getFamily_mother();
		if (__DEC_fm_family_mother_770256 != null) {
			if (!f.equals(__DEC_fm_family_mother_770256)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_2BB(
			FamilyMember fm, Family f) {
		Family __DEC_fm_family_son_249525 = fm.getFamily_son();
		if (__DEC_fm_family_son_249525 != null) {
			if (!f.equals(__DEC_fm_family_son_249525)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_3BB(
			FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_father())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_4BB(
			FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_mother())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_5BB(
			FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_son())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_blackBBB(Family f,
			FamilyMember fm, Families families) {
		if (families.getFamily().contains(f)) {
			if (f.equals(fm.getFamily_daughter())) {
				if (pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_0BB(fm, f) == null) {
					if (pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_1BB(fm, f) == null) {
						if (pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_2BB(fm,
								f) == null) {
							if (pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_3BB(fm,
									f) == null) {
								if (pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_4BB(fm,
										f) == null) {
									if (pattern_DaughterOfExistingFamilyToFemale_28_1_matchtggpattern_black_nac_5BB(fm,
											f) == null) {
										return new Object[] { f, fm, families };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_29_1_matchtggpattern_blackBB(Female p,
			Persons persons) {
		if (persons.getPerson().contains(p)) {
			return new Object[] { p, persons };
		}
		return null;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_29_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_29_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_1_createresult_blackB(
			DaughterOfExistingFamilyToFemale _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, FamiliesToPersonsCorr families2persons) {
		if (ruleResult.getCorrObjects().contains(families2persons)) {
			return new Object[] { ruleResult, families2persons };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Families families) {
		if (ruleResult.getSourceObjects().contains(families)) {
			return new Object[] { ruleResult, families };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Family f) {
		if (ruleResult.getSourceObjects().contains(f)) {
			return new Object[] { ruleResult, f };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Persons persons) {
		if (ruleResult.getTargetObjects().contains(persons)) {
			return new Object[] { ruleResult, persons };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList families2personsList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpFamilies2persons : families2personsList.getEntryObjects()) {
				if (tmpFamilies2persons instanceof FamiliesToPersonsCorr) {
					FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) tmpFamilies2persons;
					Families families = families2persons.getSource();
					if (families != null) {
						Persons persons = families2persons.getTarget();
						if (persons != null) {
							if (pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_0BB(ruleResult,
									families2persons) == null) {
								if (pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_1BB(
										ruleResult, families) == null) {
									if (pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_3BB(
											ruleResult, persons) == null) {
										for (Family f : families.getFamily()) {
											if (pattern_DaughterOfExistingFamilyToFemale_30_2_isapplicablecore_black_nac_2BB(
													ruleResult, f) == null) {
												_result.add(new Object[] { families2personsList, families2persons,
														families, f, persons, ruleEntryContainer, ruleResult });
											}
										}
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_bindingFBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, families2persons, persons, f,
				families, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, f, families, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_bindingAndBlackFBBBBBBB(
			DaughterOfExistingFamilyToFemale _this, IsApplicableMatch isApplicableMatch,
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_binding = pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, families2persons, persons, f, families, ruleResult);
		if (result_pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_binding[0];

			Object[] result_pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_black = pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_blackB(
					csp);
			if (result_pattern_DaughterOfExistingFamilyToFemale_30_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, f, families,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_DaughterOfExistingFamilyToFemale_30_4_checkCSP_expressionFBB(
			DaughterOfExistingFamilyToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_5_checknacs_blackBBBB(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families) {
		return new Object[] { families2persons, persons, f, families };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_6_perform_blackBBBBB(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, Families families,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { families2persons, persons, f, families, ruleResult };
	}

	public static final Object[] pattern_DaughterOfExistingFamilyToFemale_30_6_perform_greenFBFBFBB(Persons persons,
			Family f, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Female p = PersonsModelFactory.eINSTANCE.createFemale();
		FamilyMemberToPerson familyMember2Persons = FamiliesToPersonsFactory.eINSTANCE.createFamilyMemberToPerson();
		FamilyMember fm = FamiliesModelFactory.eINSTANCE.createFamilyMember();
		Object _localVariable_0 = csp.getValue("p", "fullName");
		Object _localVariable_1 = csp.getValue("fm", "firstName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		persons.getPerson().add(p);
		ruleResult.getTargetObjects().add(p);
		familyMember2Persons.setTarget(p);
		ruleResult.getCorrObjects().add(familyMember2Persons);
		familyMember2Persons.setSource(fm);
		fm.setFamily_daughter(f);
		ruleResult.getSourceObjects().add(fm);
		String p_fullName_prime = (String) _localVariable_0;
		String fm_firstName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		p.setFullName(p_fullName_prime);
		fm.setFirstName(fm_firstName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { p, persons, familyMember2Persons, f, fm, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_DaughterOfExistingFamilyToFemale_30_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DaughterOfExistingFamilyToFemaleImpl
