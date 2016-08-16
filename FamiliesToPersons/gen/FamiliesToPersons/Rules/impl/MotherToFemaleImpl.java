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

import FamiliesToPersons.Rules.MotherToFemale;
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
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
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
 * An implementation of the model object '<em><b>Mother To Female</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MotherToFemaleImpl extends AbstractRuleImpl implements MotherToFemale {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotherToFemaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMotherToFemale();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Family f, FamilyMember fm, Families families) {
		// initial bindings
		Object[] result1_black = MotherToFemaleImpl.pattern_MotherToFemale_0_1_initialbindings_blackBBBBB(this, match,
				f, fm, families);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm
					+ ", " + "[families] = " + families + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, f, fm, families);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", "
					+ "[families] = " + families + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MotherToFemaleImpl.pattern_MotherToFemale_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MotherToFemaleImpl
					.pattern_MotherToFemale_0_4_collectelementstobetranslated_blackBBBB(match, f, fm, families);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", "
						+ "[families] = " + families + ".");
			}
			MotherToFemaleImpl.pattern_MotherToFemale_0_4_collectelementstobetranslated_greenBBBBFFF(match, f, fm,
					families);
			// EMoflonEdge families__f____family = (EMoflonEdge) result4_green[4];
			// EMoflonEdge fm__f____family_mother = (EMoflonEdge) result4_green[5];
			// EMoflonEdge f__fm____mother = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = MotherToFemaleImpl
					.pattern_MotherToFemale_0_5_collectcontextelements_blackBBBB(match, f, fm, families);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", "
						+ "[families] = " + families + ".");
			}
			MotherToFemaleImpl.pattern_MotherToFemale_0_5_collectcontextelements_greenBB(match, families);

			// register objects to match
			MotherToFemaleImpl.pattern_MotherToFemale_0_6_registerobjectstomatch_expressionBBBBB(this, match, f, fm,
					families);
			return MotherToFemaleImpl.pattern_MotherToFemale_0_7_expressionF();
		} else {
			return MotherToFemaleImpl.pattern_MotherToFemale_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
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
		Object[] result1_green = MotherToFemaleImpl.pattern_MotherToFemale_1_1_performtransformation_greenFBFBB(persons,
				fm, csp);
		Female p = (Female) result1_green[0];
		FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result1_green[2];

		// collect translated elements
		Object[] result2_black = MotherToFemaleImpl.pattern_MotherToFemale_1_2_collecttranslatedelements_blackBBBB(p,
				familyMember2Persons, f, fm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[p] = " + p + ", " + "[familyMember2Persons] = " + familyMember2Persons + ", " + "[f] = " + f
					+ ", " + "[fm] = " + fm + ".");
		}
		Object[] result2_green = MotherToFemaleImpl.pattern_MotherToFemale_1_2_collecttranslatedelements_greenFBBBB(p,
				familyMember2Persons, f, fm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MotherToFemaleImpl.pattern_MotherToFemale_1_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, p, families2persons, persons, familyMember2Persons, f, fm, families);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[p] = " + p + ", " + "[families2persons] = "
					+ families2persons + ", " + "[persons] = " + persons + ", " + "[familyMember2Persons] = "
					+ familyMember2Persons + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", " + "[families] = "
					+ families + ".");
		}
		MotherToFemaleImpl.pattern_MotherToFemale_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult, p, persons,
				familyMember2Persons, f, fm, families);
		// EMoflonEdge families__f____family = (EMoflonEdge) result3_green[7];
		// EMoflonEdge persons__p____person = (EMoflonEdge) result3_green[8];
		// EMoflonEdge familyMember2Persons__fm____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge fm__f____family_mother = (EMoflonEdge) result3_green[10];
		// EMoflonEdge f__fm____mother = (EMoflonEdge) result3_green[11];
		// EMoflonEdge familyMember2Persons__p____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		MotherToFemaleImpl.pattern_MotherToFemale_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, p,
				families2persons, persons, familyMember2Persons, f, fm, families);
		return MotherToFemaleImpl.pattern_MotherToFemale_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MotherToFemaleImpl
				.pattern_MotherToFemale_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MotherToFemaleImpl.pattern_MotherToFemale_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Family f = (Family) result2_binding[0];
		FamilyMember fm = (FamilyMember) result2_binding[1];
		Families families = (Families) result2_binding[2];
		for (Object[] result2_black : MotherToFemaleImpl.pattern_MotherToFemale_2_2_corematch_blackFFBBBB(f, fm,
				families, match)) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_black[0];
			Persons persons = (Persons) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : MotherToFemaleImpl
					.pattern_MotherToFemale_2_3_findcontext_blackBBBBB(families2persons, persons, f, fm, families)) {
				Object[] result3_green = MotherToFemaleImpl.pattern_MotherToFemale_2_3_findcontext_greenBBBBBFFFFFF(
						families2persons, persons, f, fm, families);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge families__f____family = (EMoflonEdge) result3_green[6];
				// EMoflonEdge fm__f____family_mother = (EMoflonEdge) result3_green[7];
				// EMoflonEdge f__fm____mother = (EMoflonEdge) result3_green[8];
				// EMoflonEdge families2persons__persons____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge families2persons__families____source = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = MotherToFemaleImpl
						.pattern_MotherToFemale_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								families2persons, persons, f, fm, families);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[families2persons] = " + families2persons + ", " + "[persons] = " + persons + ", "
							+ "[f] = " + f + ", " + "[fm] = " + fm + ", " + "[families] = " + families + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MotherToFemaleImpl.pattern_MotherToFemale_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MotherToFemaleImpl
							.pattern_MotherToFemale_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MotherToFemaleImpl.pattern_MotherToFemale_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MotherToFemaleImpl.pattern_MotherToFemale_2_7_expressionFB(ruleresult);
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
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("f").eClass()).equals("FamiliesModel.Family.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("fm").eClass())
						.equals("FamiliesModel.FamilyMember.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Female p, Persons persons) {
		// initial bindings
		Object[] result1_black = MotherToFemaleImpl.pattern_MotherToFemale_10_1_initialbindings_blackBBBB(this, match,
				p, persons);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, p, persons);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MotherToFemaleImpl.pattern_MotherToFemale_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MotherToFemaleImpl
					.pattern_MotherToFemale_10_4_collectelementstobetranslated_blackBBB(match, p, persons);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
			}
			MotherToFemaleImpl.pattern_MotherToFemale_10_4_collectelementstobetranslated_greenBBBF(match, p, persons);
			// EMoflonEdge persons__p____person = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MotherToFemaleImpl
					.pattern_MotherToFemale_10_5_collectcontextelements_blackBBB(match, p, persons);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ".");
			}
			MotherToFemaleImpl.pattern_MotherToFemale_10_5_collectcontextelements_greenBB(match, persons);

			// register objects to match
			MotherToFemaleImpl.pattern_MotherToFemale_10_6_registerobjectstomatch_expressionBBBB(this, match, p,
					persons);
			return MotherToFemaleImpl.pattern_MotherToFemale_10_7_expressionF();
		} else {
			return MotherToFemaleImpl.pattern_MotherToFemale_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Female p = (Female) result1_bindingAndBlack[0];
		FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result1_bindingAndBlack[1];
		Persons persons = (Persons) result1_bindingAndBlack[2];
		Families families = (Families) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MotherToFemaleImpl.pattern_MotherToFemale_11_1_performtransformation_greenBFFFBB(p,
				families, csp);
		FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result1_green[1];
		Family f = (Family) result1_green[2];
		FamilyMember fm = (FamilyMember) result1_green[3];

		// collect translated elements
		Object[] result2_black = MotherToFemaleImpl.pattern_MotherToFemale_11_2_collecttranslatedelements_blackBBBB(p,
				familyMember2Persons, f, fm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[p] = " + p + ", " + "[familyMember2Persons] = " + familyMember2Persons + ", " + "[f] = " + f
					+ ", " + "[fm] = " + fm + ".");
		}
		Object[] result2_green = MotherToFemaleImpl.pattern_MotherToFemale_11_2_collecttranslatedelements_greenFBBBB(p,
				familyMember2Persons, f, fm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MotherToFemaleImpl.pattern_MotherToFemale_11_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, p, families2persons, persons, familyMember2Persons, f, fm, families);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[p] = " + p + ", " + "[families2persons] = "
					+ families2persons + ", " + "[persons] = " + persons + ", " + "[familyMember2Persons] = "
					+ familyMember2Persons + ", " + "[f] = " + f + ", " + "[fm] = " + fm + ", " + "[families] = "
					+ families + ".");
		}
		MotherToFemaleImpl.pattern_MotherToFemale_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult, p, persons,
				familyMember2Persons, f, fm, families);
		// EMoflonEdge families__f____family = (EMoflonEdge) result3_green[7];
		// EMoflonEdge persons__p____person = (EMoflonEdge) result3_green[8];
		// EMoflonEdge familyMember2Persons__fm____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge fm__f____family_mother = (EMoflonEdge) result3_green[10];
		// EMoflonEdge f__fm____mother = (EMoflonEdge) result3_green[11];
		// EMoflonEdge familyMember2Persons__p____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		MotherToFemaleImpl.pattern_MotherToFemale_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, p,
				families2persons, persons, familyMember2Persons, f, fm, families);
		return MotherToFemaleImpl.pattern_MotherToFemale_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MotherToFemaleImpl
				.pattern_MotherToFemale_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MotherToFemaleImpl.pattern_MotherToFemale_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Female p = (Female) result2_binding[0];
		Persons persons = (Persons) result2_binding[1];
		for (Object[] result2_black : MotherToFemaleImpl.pattern_MotherToFemale_12_2_corematch_blackBFBFB(p, persons,
				match)) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_black[1];
			Families families = (Families) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : MotherToFemaleImpl.pattern_MotherToFemale_12_3_findcontext_blackBBBB(p,
					families2persons, persons, families)) {
				Object[] result3_green = MotherToFemaleImpl.pattern_MotherToFemale_12_3_findcontext_greenBBBBFFFF(p,
						families2persons, persons, families);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge persons__p____person = (EMoflonEdge) result3_green[5];
				// EMoflonEdge families2persons__persons____target = (EMoflonEdge) result3_green[6];
				// EMoflonEdge families2persons__families____source = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = MotherToFemaleImpl
						.pattern_MotherToFemale_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, p,
								families2persons, persons, families);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = "
							+ p + ", " + "[families2persons] = " + families2persons + ", " + "[persons] = " + persons
							+ ", " + "[families] = " + families + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MotherToFemaleImpl.pattern_MotherToFemale_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MotherToFemaleImpl
							.pattern_MotherToFemale_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MotherToFemaleImpl.pattern_MotherToFemale_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MotherToFemaleImpl.pattern_MotherToFemale_12_7_expressionFB(ruleresult);
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
			FamiliesToPersonsCorr families2persons, Persons persons, Families families) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(", ");
		literal0.setType("");

		// Create attribute variables
		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p.fullName", true, csp);
		var_p_fullName.setValue(p.getFullName());
		var_p_fullName.setType("String");

		// Create unbound variables
		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f.familyName", csp);
		var_f_familyName.setType("String");
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_family) {
		// prepare return value
		Object[] result1_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MotherToFemaleImpl.pattern_MotherToFemale_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MotherToFemaleImpl
				.pattern_MotherToFemale_20_2_testcorematchandDECs_blackFFFB(_edge_family)) {
			Family f = (Family) result2_black[0];
			FamilyMember fm = (FamilyMember) result2_black[1];
			Families families = (Families) result2_black[2];
			Object[] result2_green = MotherToFemaleImpl
					.pattern_MotherToFemale_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MotherToFemaleImpl
					.pattern_MotherToFemale_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							f, fm, families)) {
				// Ensure that the correct types of elements are matched
				if (MotherToFemaleImpl
						.pattern_MotherToFemale_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MotherToFemaleImpl
							.pattern_MotherToFemale_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MotherToFemaleImpl.pattern_MotherToFemale_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MotherToFemaleImpl.pattern_MotherToFemale_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_38(EMoflonEdge _edge_person) {
		// prepare return value
		Object[] result1_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MotherToFemaleImpl.pattern_MotherToFemale_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MotherToFemaleImpl
				.pattern_MotherToFemale_21_2_testcorematchandDECs_blackFFB(_edge_person)) {
			Female p = (Female) result2_black[0];
			Persons persons = (Persons) result2_black[1];
			Object[] result2_green = MotherToFemaleImpl
					.pattern_MotherToFemale_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MotherToFemaleImpl
					.pattern_MotherToFemale_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							p, persons)) {
				// Ensure that the correct types of elements are matched
				if (MotherToFemaleImpl
						.pattern_MotherToFemale_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MotherToFemaleImpl
							.pattern_MotherToFemale_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MotherToFemaleImpl.pattern_MotherToFemale_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MotherToFemaleImpl.pattern_MotherToFemale_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MotherToFemale");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm", true, csp);
		var_fm_firstName.setValue(__helper.getValue("fm", "firstName"));
		var_fm_firstName.setType("String");

		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f", true, csp);
		var_f_familyName.setValue(__helper.getValue("f", "familyName"));
		var_f_familyName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(", ");
		var_literal0.setType("");

		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p", true, csp);
		var_p_fullName.setValue(__helper.getValue("p", "fullName"));
		var_p_fullName.setType("String");

		Concat concat0 = new Concat();
		csp.getConstraints().add(concat0);

		concat0.setRuleName("MotherToFemale");
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
		ruleResult.setRule("MotherToFemale");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_fm_firstName = CSPFactoryHelper.eINSTANCE.createVariable("fm", true, csp);
		var_fm_firstName.setValue(__helper.getValue("fm", "firstName"));
		var_fm_firstName.setType("String");

		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f", true, csp);
		var_f_familyName.setValue(__helper.getValue("f", "familyName"));
		var_f_familyName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(", ");
		var_literal0.setType("");

		Variable var_p_fullName = CSPFactoryHelper.eINSTANCE.createVariable("p", true, csp);
		var_p_fullName.setValue(__helper.getValue("p", "fullName"));
		var_p_fullName.setType("String");

		Concat concat0 = new Concat();
		csp.getConstraints().add(concat0);

		concat0.setRuleName("MotherToFemale");
		concat0.solve(var_literal0, var_f_familyName, var_fm_firstName, var_p_fullName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_fm_firstName.setBound(false);
			var_f_familyName.setBound(false);
			concat0.solve(var_literal0, var_f_familyName, var_fm_firstName, var_p_fullName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("fm", "firstName", var_fm_firstName.getValue());
				__helper.setValue("f", "familyName", var_f_familyName.getValue());
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
		Object[] result1_black = MotherToFemaleImpl.pattern_MotherToFemale_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MotherToFemaleImpl.pattern_MotherToFemale_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// match src trg context
		Object[] result2_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [match src trg context] failed." + " Variables: "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Female p = (Female) result2_bindingAndBlack[0];
		Persons persons = (Persons) result2_bindingAndBlack[1];
		Family f = (Family) result2_bindingAndBlack[2];
		FamilyMember fm = (FamilyMember) result2_bindingAndBlack[3];
		Families families = (Families) result2_bindingAndBlack[4];

		// solve csp
		Object[] result3_bindingAndBlack = MotherToFemaleImpl
				.pattern_MotherToFemale_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, p, persons, f, fm, families,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [solve csp] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[p] = " + p + ", " + "[persons] = " + persons + ", " + "[f] = " + f + ", "
					+ "[fm] = " + fm + ", " + "[families] = " + families + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// check CSP
		if (MotherToFemaleImpl.pattern_MotherToFemale_24_4_checkCSP_expressionFB(csp)) {
			// ForEach match corr context
			for (Object[] result5_black : MotherToFemaleImpl.pattern_MotherToFemale_24_5_matchcorrcontext_blackFBBBB(
					persons, families, sourceMatch, targetMatch)) {
				FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result5_black[0];
				Object[] result5_green = MotherToFemaleImpl.pattern_MotherToFemale_24_5_matchcorrcontext_greenBBBF(
						families2persons, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				// create correspondence
				Object[] result6_black = MotherToFemaleImpl
						.pattern_MotherToFemale_24_6_createcorrespondence_blackBBBBBB(p, persons, f, fm, families,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [create correspondence] failed." + " Variables: " + "[p] = " + p
									+ ", " + "[persons] = " + persons + ", " + "[f] = " + f + ", " + "[fm] = " + fm
									+ ", " + "[families] = " + families + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MotherToFemaleImpl.pattern_MotherToFemale_24_6_createcorrespondence_greenBFBB(p, fm, ccMatch);
				// FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result6_green[1];

				// add to returned result
				Object[] result7_black = MotherToFemaleImpl
						.pattern_MotherToFemale_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching in node [add to returned result] failed."
							+ " Variables: " + "[result] = " + result + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MotherToFemaleImpl.pattern_MotherToFemale_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MotherToFemaleImpl.pattern_MotherToFemale_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Female p, Persons persons, Family f, FamilyMember fm, Families families,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

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
	public boolean checkDEC_FWD(Family f, FamilyMember fm, Families families) {// match tgg pattern
		Object[] result1_black = MotherToFemaleImpl.pattern_MotherToFemale_27_1_matchtggpattern_blackBBB(f, fm,
				families);
		if (result1_black != null) {
			return MotherToFemaleImpl.pattern_MotherToFemale_27_2_expressionF();
		} else {
			return MotherToFemaleImpl.pattern_MotherToFemale_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Female p, Persons persons) {// match tgg pattern
		Object[] result1_black = MotherToFemaleImpl.pattern_MotherToFemale_28_1_matchtggpattern_blackBB(p, persons);
		if (result1_black != null) {
			return MotherToFemaleImpl.pattern_MotherToFemale_28_2_expressionF();
		} else {
			return MotherToFemaleImpl.pattern_MotherToFemale_28_3_expressionF();
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
		Object[] result1_black = MotherToFemaleImpl.pattern_MotherToFemale_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MotherToFemaleImpl.pattern_MotherToFemale_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : MotherToFemaleImpl
				.pattern_MotherToFemale_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList families2personsList = (RuleEntryList) result2_black[0];
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result2_black[1];
			Persons persons = (Persons) result2_black[2];
			Families families = (Families) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = MotherToFemaleImpl
					.pattern_MotherToFemale_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							families2persons, persons, families, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[families2persons] = "
						+ families2persons + ", " + "[persons] = " + persons + ", " + "[families] = " + families + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (MotherToFemaleImpl.pattern_MotherToFemale_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = MotherToFemaleImpl
						.pattern_MotherToFemale_29_5_checknacs_blackBBB(families2persons, persons, families);
				if (result5_black != null) {

					// perform
					Object[] result6_black = MotherToFemaleImpl.pattern_MotherToFemale_29_6_perform_blackBBBB(
							families2persons, persons, families, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[families2persons] = " + families2persons + ", " + "[persons] = " + persons + ", "
								+ "[families] = " + families + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MotherToFemaleImpl.pattern_MotherToFemale_29_6_perform_greenFBFFFBBB(persons, families, ruleResult,
							csp);
					// Female p = (Female) result6_green[0];
					// FamilyMemberToPerson familyMember2Persons = (FamilyMemberToPerson) result6_green[2];
					// Family f = (Family) result6_green[3];
					// FamilyMember fm = (FamilyMember) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return MotherToFemaleImpl.pattern_MotherToFemale_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FamiliesToPersonsCorr families2persons,
			Persons persons, Families families, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(", ");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_f_familyName = CSPFactoryHelper.eINSTANCE.createVariable("f.familyName", csp);
		var_f_familyName.setType("String");
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
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES:
			return isAppropriate_FWD((Match) arguments.get(0), (Family) arguments.get(1),
					(FamilyMember) arguments.get(2), (Families) arguments.get(3));
		case RulesPackage.MOTHER_TO_FEMALE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Family) arguments.get(1),
					(FamilyMember) arguments.get(2), (Families) arguments.get(3));
			return null;
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Family) arguments.get(1),
					(FamilyMember) arguments.get(2), (Families) arguments.get(3));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(FamiliesToPersonsCorr) arguments.get(1), (Persons) arguments.get(2), (Family) arguments.get(3),
					(FamilyMember) arguments.get(4), (Families) arguments.get(5));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.MOTHER_TO_FEMALE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_BWD__MATCH_FEMALE_PERSONS:
			return isAppropriate_BWD((Match) arguments.get(0), (Female) arguments.get(1), (Persons) arguments.get(2));
		case RulesPackage.MOTHER_TO_FEMALE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FEMALE_PERSONS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Female) arguments.get(1), (Persons) arguments.get(2));
			return null;
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FEMALE_PERSONS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Female) arguments.get(1),
					(Persons) arguments.get(2));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FEMALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Female) arguments.get(1),
					(FamiliesToPersonsCorr) arguments.get(2), (Persons) arguments.get(3), (Families) arguments.get(4));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.MOTHER_TO_FEMALE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_CC__FEMALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Female) arguments.get(0), (Persons) arguments.get(1),
					(Family) arguments.get(2), (FamilyMember) arguments.get(3), (Families) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.MOTHER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MOTHER_TO_FEMALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES:
			return checkDEC_FWD((Family) arguments.get(0), (FamilyMember) arguments.get(1),
					(Families) arguments.get(2));
		case RulesPackage.MOTHER_TO_FEMALE___CHECK_DEC_BWD__FEMALE_PERSONS:
			return checkDEC_BWD((Female) arguments.get(0), (Persons) arguments.get(1));
		case RulesPackage.MOTHER_TO_FEMALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR:
			return generateModel((RuleEntryContainer) arguments.get(0), (FamiliesToPersonsCorr) arguments.get(1));
		case RulesPackage.MOTHER_TO_FEMALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(FamiliesToPersonsCorr) arguments.get(1), (Persons) arguments.get(2), (Families) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.MOTHER_TO_FEMALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MotherToFemale_0_1_initialbindings_blackBBBBB(MotherToFemale _this,
			Match match, Family f, FamilyMember fm, Families families) {
		return new Object[] { _this, match, f, fm, families };
	}

	public static final Object[] pattern_MotherToFemale_0_2_SolveCSP_bindingFBBBBB(MotherToFemale _this, Match match,
			Family f, FamilyMember fm, Families families) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, f, fm, families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, f, fm, families };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MotherToFemale_0_2_SolveCSP_bindingAndBlackFBBBBB(MotherToFemale _this,
			Match match, Family f, FamilyMember fm, Families families) {
		Object[] result_pattern_MotherToFemale_0_2_SolveCSP_binding = pattern_MotherToFemale_0_2_SolveCSP_bindingFBBBBB(
				_this, match, f, fm, families);
		if (result_pattern_MotherToFemale_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MotherToFemale_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MotherToFemale_0_2_SolveCSP_black = pattern_MotherToFemale_0_2_SolveCSP_blackB(csp);
			if (result_pattern_MotherToFemale_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, f, fm, families };
			}
		}
		return null;
	}

	public static final boolean pattern_MotherToFemale_0_3_CheckCSP_expressionFBB(MotherToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Family f, FamilyMember fm, Families families) {
		return new Object[] { match, f, fm, families };
	}

	public static final Object[] pattern_MotherToFemale_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			Family f, FamilyMember fm, Families families) {
		EMoflonEdge families__f____family = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fm__f____family_mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(f);
		match.getToBeTranslatedNodes().add(fm);
		String families__f____family_name_prime = "family";
		String fm__f____family_mother_name_prime = "family_mother";
		String f__fm____mother_name_prime = "mother";
		families__f____family.setSrc(families);
		families__f____family.setTrg(f);
		match.getToBeTranslatedEdges().add(families__f____family);
		fm__f____family_mother.setSrc(fm);
		fm__f____family_mother.setTrg(f);
		match.getToBeTranslatedEdges().add(fm__f____family_mother);
		f__fm____mother.setSrc(f);
		f__fm____mother.setTrg(fm);
		match.getToBeTranslatedEdges().add(f__fm____mother);
		families__f____family.setName(families__f____family_name_prime);
		fm__f____family_mother.setName(fm__f____family_mother_name_prime);
		f__fm____mother.setName(f__fm____mother_name_prime);
		return new Object[] { match, f, fm, families, families__f____family, fm__f____family_mother, f__fm____mother };
	}

	public static final Object[] pattern_MotherToFemale_0_5_collectcontextelements_blackBBBB(Match match, Family f,
			FamilyMember fm, Families families) {
		return new Object[] { match, f, fm, families };
	}

	public static final Object[] pattern_MotherToFemale_0_5_collectcontextelements_greenBB(Match match,
			Families families) {
		match.getContextNodes().add(families);
		return new Object[] { match, families };
	}

	public static final void pattern_MotherToFemale_0_6_registerobjectstomatch_expressionBBBBB(MotherToFemale _this,
			Match match, Family f, FamilyMember fm, Families families) {
		_this.registerObjectsToMatch_FWD(match, f, fm, families);

	}

	public static final boolean pattern_MotherToFemale_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MotherToFemale_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_1_1_performtransformation_bindingFFFFFB(
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

	public static final Object[] pattern_MotherToFemale_1_1_performtransformation_blackBBBBBFBB(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families,
			MotherToFemale _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { families2persons, persons, f, fm, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			MotherToFemale _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MotherToFemale_1_1_performtransformation_binding = pattern_MotherToFemale_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_MotherToFemale_1_1_performtransformation_binding != null) {
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result_pattern_MotherToFemale_1_1_performtransformation_binding[0];
			Persons persons = (Persons) result_pattern_MotherToFemale_1_1_performtransformation_binding[1];
			Family f = (Family) result_pattern_MotherToFemale_1_1_performtransformation_binding[2];
			FamilyMember fm = (FamilyMember) result_pattern_MotherToFemale_1_1_performtransformation_binding[3];
			Families families = (Families) result_pattern_MotherToFemale_1_1_performtransformation_binding[4];

			Object[] result_pattern_MotherToFemale_1_1_performtransformation_black = pattern_MotherToFemale_1_1_performtransformation_blackBBBBBFBB(
					families2persons, persons, f, fm, families, _this, isApplicableMatch);
			if (result_pattern_MotherToFemale_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MotherToFemale_1_1_performtransformation_black[5];

				return new Object[] { families2persons, persons, f, fm, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_1_1_performtransformation_greenFBFBB(Persons persons,
			FamilyMember fm, CSP csp) {
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

	public static final Object[] pattern_MotherToFemale_1_2_collecttranslatedelements_blackBBBB(Female p,
			FamilyMemberToPerson familyMember2Persons, Family f, FamilyMember fm) {
		return new Object[] { p, familyMember2Persons, f, fm };
	}

	public static final Object[] pattern_MotherToFemale_1_2_collecttranslatedelements_greenFBBBB(Female p,
			FamilyMemberToPerson familyMember2Persons, Family f, FamilyMember fm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(familyMember2Persons);
		ruleresult.getTranslatedElements().add(f);
		ruleresult.getTranslatedElements().add(fm);
		return new Object[] { ruleresult, p, familyMember2Persons, f, fm };
	}

	public static final Object[] pattern_MotherToFemale_1_3_bookkeepingforedges_blackBBBBBBBB(
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

	public static final Object[] pattern_MotherToFemale_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject p, EObject persons, EObject familyMember2Persons, EObject f,
			EObject fm, EObject families) {
		EMoflonEdge families__f____family = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__fm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fm__f____family_mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__p____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MotherToFemale";
		String families__f____family_name_prime = "family";
		String persons__p____person_name_prime = "person";
		String familyMember2Persons__fm____source_name_prime = "source";
		String fm__f____family_mother_name_prime = "family_mother";
		String f__fm____mother_name_prime = "mother";
		String familyMember2Persons__p____target_name_prime = "target";
		families__f____family.setSrc(families);
		families__f____family.setTrg(f);
		ruleresult.getTranslatedEdges().add(families__f____family);
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		ruleresult.getCreatedEdges().add(persons__p____person);
		familyMember2Persons__fm____source.setSrc(familyMember2Persons);
		familyMember2Persons__fm____source.setTrg(fm);
		ruleresult.getCreatedEdges().add(familyMember2Persons__fm____source);
		fm__f____family_mother.setSrc(fm);
		fm__f____family_mother.setTrg(f);
		ruleresult.getTranslatedEdges().add(fm__f____family_mother);
		f__fm____mother.setSrc(f);
		f__fm____mother.setTrg(fm);
		ruleresult.getTranslatedEdges().add(f__fm____mother);
		familyMember2Persons__p____target.setSrc(familyMember2Persons);
		familyMember2Persons__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(familyMember2Persons__p____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		families__f____family.setName(families__f____family_name_prime);
		persons__p____person.setName(persons__p____person_name_prime);
		familyMember2Persons__fm____source.setName(familyMember2Persons__fm____source_name_prime);
		fm__f____family_mother.setName(fm__f____family_mother_name_prime);
		f__fm____mother.setName(f__fm____mother_name_prime);
		familyMember2Persons__p____target.setName(familyMember2Persons__p____target_name_prime);
		return new Object[] { ruleresult, p, persons, familyMember2Persons, f, fm, families, families__f____family,
				persons__p____person, familyMember2Persons__fm____source, fm__f____family_mother, f__fm____mother,
				familyMember2Persons__p____target };
	}

	public static final void pattern_MotherToFemale_1_5_registerobjects_expressionBBBBBBBBB(MotherToFemale _this,
			PerformRuleResult ruleresult, EObject p, EObject families2persons, EObject persons,
			EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		_this.registerObjects_FWD(ruleresult, p, families2persons, persons, familyMember2Persons, f, fm, families);

	}

	public static final PerformRuleResult pattern_MotherToFemale_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_2_1_preparereturnvalue_bindingFB(MotherToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MotherToFemale _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_2_1_preparereturnvalue_bindingAndBlackFFB(
			MotherToFemale _this) {
		Object[] result_pattern_MotherToFemale_2_1_preparereturnvalue_binding = pattern_MotherToFemale_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MotherToFemale_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MotherToFemale_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MotherToFemale_2_1_preparereturnvalue_black = pattern_MotherToFemale_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MotherToFemale_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MotherToFemale_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MotherToFemale";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MotherToFemale_2_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MotherToFemale_2_2_corematch_blackFFBBBB(Family f, FamilyMember fm,
			Families families, Match match) {
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

	public static final Iterable<Object[]> pattern_MotherToFemale_2_3_findcontext_blackBBBBB(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (families.getFamily().contains(f)) {
			if (f.equals(fm.getFamily_mother())) {
				if (persons.equals(families2persons.getTarget())) {
					if (families.equals(families2persons.getSource())) {
						_result.add(new Object[] { families2persons, persons, f, fm, families });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_2_3_findcontext_greenBBBBBFFFFFF(
			FamiliesToPersonsCorr families2persons, Persons persons, Family f, FamilyMember fm, Families families) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge families__f____family = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fm__f____family_mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__persons____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__families____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String families__f____family_name_prime = "family";
		String fm__f____family_mother_name_prime = "family_mother";
		String f__fm____mother_name_prime = "mother";
		String families2persons__persons____target_name_prime = "target";
		String families2persons__families____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(families2persons);
		isApplicableMatch.getAllContextElements().add(persons);
		isApplicableMatch.getAllContextElements().add(f);
		isApplicableMatch.getAllContextElements().add(fm);
		isApplicableMatch.getAllContextElements().add(families);
		families__f____family.setSrc(families);
		families__f____family.setTrg(f);
		isApplicableMatch.getAllContextElements().add(families__f____family);
		fm__f____family_mother.setSrc(fm);
		fm__f____family_mother.setTrg(f);
		isApplicableMatch.getAllContextElements().add(fm__f____family_mother);
		f__fm____mother.setSrc(f);
		f__fm____mother.setTrg(fm);
		isApplicableMatch.getAllContextElements().add(f__fm____mother);
		families2persons__persons____target.setSrc(families2persons);
		families2persons__persons____target.setTrg(persons);
		isApplicableMatch.getAllContextElements().add(families2persons__persons____target);
		families2persons__families____source.setSrc(families2persons);
		families2persons__families____source.setTrg(families);
		isApplicableMatch.getAllContextElements().add(families2persons__families____source);
		families__f____family.setName(families__f____family_name_prime);
		fm__f____family_mother.setName(fm__f____family_mother_name_prime);
		f__fm____mother.setName(f__fm____mother_name_prime);
		families2persons__persons____target.setName(families2persons__persons____target_name_prime);
		families2persons__families____source.setName(families2persons__families____source_name_prime);
		return new Object[] { families2persons, persons, f, fm, families, isApplicableMatch, families__f____family,
				fm__f____family_mother, f__fm____mother, families2persons__persons____target,
				families2persons__families____source };
	}

	public static final Object[] pattern_MotherToFemale_2_4_solveCSP_bindingFBBBBBBB(MotherToFemale _this,
			IsApplicableMatch isApplicableMatch, FamiliesToPersonsCorr families2persons, Persons persons, Family f,
			FamilyMember fm, Families families) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, families2persons, persons, f, fm,
				families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, f, fm, families };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MotherToFemale_2_4_solveCSP_bindingAndBlackFBBBBBBB(MotherToFemale _this,
			IsApplicableMatch isApplicableMatch, FamiliesToPersonsCorr families2persons, Persons persons, Family f,
			FamilyMember fm, Families families) {
		Object[] result_pattern_MotherToFemale_2_4_solveCSP_binding = pattern_MotherToFemale_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, families2persons, persons, f, fm, families);
		if (result_pattern_MotherToFemale_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MotherToFemale_2_4_solveCSP_binding[0];

			Object[] result_pattern_MotherToFemale_2_4_solveCSP_black = pattern_MotherToFemale_2_4_solveCSP_blackB(csp);
			if (result_pattern_MotherToFemale_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, f, fm, families };
			}
		}
		return null;
	}

	public static final boolean pattern_MotherToFemale_2_5_checkCSP_expressionFBB(MotherToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MotherToFemale_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MotherToFemale";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MotherToFemale_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_10_1_initialbindings_blackBBBB(MotherToFemale _this,
			Match match, Female p, Persons persons) {
		return new Object[] { _this, match, p, persons };
	}

	public static final Object[] pattern_MotherToFemale_10_2_SolveCSP_bindingFBBBB(MotherToFemale _this, Match match,
			Female p, Persons persons) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, p, persons);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p, persons };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MotherToFemale_10_2_SolveCSP_bindingAndBlackFBBBB(MotherToFemale _this,
			Match match, Female p, Persons persons) {
		Object[] result_pattern_MotherToFemale_10_2_SolveCSP_binding = pattern_MotherToFemale_10_2_SolveCSP_bindingFBBBB(
				_this, match, p, persons);
		if (result_pattern_MotherToFemale_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MotherToFemale_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MotherToFemale_10_2_SolveCSP_black = pattern_MotherToFemale_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MotherToFemale_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, p, persons };
			}
		}
		return null;
	}

	public static final boolean pattern_MotherToFemale_10_3_CheckCSP_expressionFBB(MotherToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_10_4_collectelementstobetranslated_blackBBB(Match match,
			Female p, Persons persons) {
		return new Object[] { match, p, persons };
	}

	public static final Object[] pattern_MotherToFemale_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Female p, Persons persons) {
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(p);
		String persons__p____person_name_prime = "person";
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		match.getToBeTranslatedEdges().add(persons__p____person);
		persons__p____person.setName(persons__p____person_name_prime);
		return new Object[] { match, p, persons, persons__p____person };
	}

	public static final Object[] pattern_MotherToFemale_10_5_collectcontextelements_blackBBB(Match match, Female p,
			Persons persons) {
		return new Object[] { match, p, persons };
	}

	public static final Object[] pattern_MotherToFemale_10_5_collectcontextelements_greenBB(Match match,
			Persons persons) {
		match.getContextNodes().add(persons);
		return new Object[] { match, persons };
	}

	public static final void pattern_MotherToFemale_10_6_registerobjectstomatch_expressionBBBB(MotherToFemale _this,
			Match match, Female p, Persons persons) {
		_this.registerObjectsToMatch_BWD(match, p, persons);

	}

	public static final boolean pattern_MotherToFemale_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MotherToFemale_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("families2persons");
		EObject _localVariable_2 = isApplicableMatch.getObject("persons");
		EObject _localVariable_3 = isApplicableMatch.getObject("families");
		EObject tmpP = _localVariable_0;
		EObject tmpFamilies2persons = _localVariable_1;
		EObject tmpPersons = _localVariable_2;
		EObject tmpFamilies = _localVariable_3;
		if (tmpP instanceof Female) {
			Female p = (Female) tmpP;
			if (tmpFamilies2persons instanceof FamiliesToPersonsCorr) {
				FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) tmpFamilies2persons;
				if (tmpPersons instanceof Persons) {
					Persons persons = (Persons) tmpPersons;
					if (tmpFamilies instanceof Families) {
						Families families = (Families) tmpFamilies;
						return new Object[] { p, families2persons, persons, families, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_11_1_performtransformation_blackBBBBFBB(Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Families families, MotherToFemale _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, families2persons, persons, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_11_1_performtransformation_bindingAndBlackFFFFFBB(
			MotherToFemale _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MotherToFemale_11_1_performtransformation_binding = pattern_MotherToFemale_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MotherToFemale_11_1_performtransformation_binding != null) {
			Female p = (Female) result_pattern_MotherToFemale_11_1_performtransformation_binding[0];
			FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result_pattern_MotherToFemale_11_1_performtransformation_binding[1];
			Persons persons = (Persons) result_pattern_MotherToFemale_11_1_performtransformation_binding[2];
			Families families = (Families) result_pattern_MotherToFemale_11_1_performtransformation_binding[3];

			Object[] result_pattern_MotherToFemale_11_1_performtransformation_black = pattern_MotherToFemale_11_1_performtransformation_blackBBBBFBB(
					p, families2persons, persons, families, _this, isApplicableMatch);
			if (result_pattern_MotherToFemale_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MotherToFemale_11_1_performtransformation_black[4];

				return new Object[] { p, families2persons, persons, families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_11_1_performtransformation_greenBFFFBB(Female p,
			Families families, CSP csp) {
		FamilyMemberToPerson familyMember2Persons = FamiliesToPersonsFactory.eINSTANCE.createFamilyMemberToPerson();
		Family f = FamiliesModelFactory.eINSTANCE.createFamily();
		FamilyMember fm = FamiliesModelFactory.eINSTANCE.createFamilyMember();
		Object _localVariable_0 = csp.getValue("f", "familyName");
		Object _localVariable_1 = csp.getValue("fm", "firstName");
		familyMember2Persons.setTarget(p);
		families.getFamily().add(f);
		familyMember2Persons.setSource(fm);
		fm.setFamily_mother(f);
		String f_familyName_prime = (String) _localVariable_0;
		String fm_firstName_prime = (String) _localVariable_1;
		f.setFamilyName(f_familyName_prime);
		fm.setFirstName(fm_firstName_prime);
		return new Object[] { p, familyMember2Persons, f, fm, families, csp };
	}

	public static final Object[] pattern_MotherToFemale_11_2_collecttranslatedelements_blackBBBB(Female p,
			FamilyMemberToPerson familyMember2Persons, Family f, FamilyMember fm) {
		return new Object[] { p, familyMember2Persons, f, fm };
	}

	public static final Object[] pattern_MotherToFemale_11_2_collecttranslatedelements_greenFBBBB(Female p,
			FamilyMemberToPerson familyMember2Persons, Family f, FamilyMember fm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(familyMember2Persons);
		ruleresult.getCreatedElements().add(f);
		ruleresult.getCreatedElements().add(fm);
		return new Object[] { ruleresult, p, familyMember2Persons, f, fm };
	}

	public static final Object[] pattern_MotherToFemale_11_3_bookkeepingforedges_blackBBBBBBBB(
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

	public static final Object[] pattern_MotherToFemale_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject p, EObject persons, EObject familyMember2Persons, EObject f,
			EObject fm, EObject families) {
		EMoflonEdge families__f____family = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__fm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fm__f____family_mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f__fm____mother = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge familyMember2Persons__p____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MotherToFemale";
		String families__f____family_name_prime = "family";
		String persons__p____person_name_prime = "person";
		String familyMember2Persons__fm____source_name_prime = "source";
		String fm__f____family_mother_name_prime = "family_mother";
		String f__fm____mother_name_prime = "mother";
		String familyMember2Persons__p____target_name_prime = "target";
		families__f____family.setSrc(families);
		families__f____family.setTrg(f);
		ruleresult.getCreatedEdges().add(families__f____family);
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		ruleresult.getTranslatedEdges().add(persons__p____person);
		familyMember2Persons__fm____source.setSrc(familyMember2Persons);
		familyMember2Persons__fm____source.setTrg(fm);
		ruleresult.getCreatedEdges().add(familyMember2Persons__fm____source);
		fm__f____family_mother.setSrc(fm);
		fm__f____family_mother.setTrg(f);
		ruleresult.getCreatedEdges().add(fm__f____family_mother);
		f__fm____mother.setSrc(f);
		f__fm____mother.setTrg(fm);
		ruleresult.getCreatedEdges().add(f__fm____mother);
		familyMember2Persons__p____target.setSrc(familyMember2Persons);
		familyMember2Persons__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(familyMember2Persons__p____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		families__f____family.setName(families__f____family_name_prime);
		persons__p____person.setName(persons__p____person_name_prime);
		familyMember2Persons__fm____source.setName(familyMember2Persons__fm____source_name_prime);
		fm__f____family_mother.setName(fm__f____family_mother_name_prime);
		f__fm____mother.setName(f__fm____mother_name_prime);
		familyMember2Persons__p____target.setName(familyMember2Persons__p____target_name_prime);
		return new Object[] { ruleresult, p, persons, familyMember2Persons, f, fm, families, families__f____family,
				persons__p____person, familyMember2Persons__fm____source, fm__f____family_mother, f__fm____mother,
				familyMember2Persons__p____target };
	}

	public static final void pattern_MotherToFemale_11_5_registerobjects_expressionBBBBBBBBB(MotherToFemale _this,
			PerformRuleResult ruleresult, EObject p, EObject families2persons, EObject persons,
			EObject familyMember2Persons, EObject f, EObject fm, EObject families) {
		_this.registerObjects_BWD(ruleresult, p, families2persons, persons, familyMember2Persons, f, fm, families);

	}

	public static final PerformRuleResult pattern_MotherToFemale_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_12_1_preparereturnvalue_bindingFB(MotherToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MotherToFemale _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_12_1_preparereturnvalue_bindingAndBlackFFB(
			MotherToFemale _this) {
		Object[] result_pattern_MotherToFemale_12_1_preparereturnvalue_binding = pattern_MotherToFemale_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MotherToFemale_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MotherToFemale_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MotherToFemale_12_1_preparereturnvalue_black = pattern_MotherToFemale_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MotherToFemale_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MotherToFemale_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MotherToFemale";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MotherToFemale_12_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MotherToFemale_12_2_corematch_blackBFBFB(Female p, Persons persons,
			Match match) {
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

	public static final Iterable<Object[]> pattern_MotherToFemale_12_3_findcontext_blackBBBB(Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Families families) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (persons.getPerson().contains(p)) {
			if (persons.equals(families2persons.getTarget())) {
				if (families.equals(families2persons.getSource())) {
					_result.add(new Object[] { p, families2persons, persons, families });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_12_3_findcontext_greenBBBBFFFF(Female p,
			FamiliesToPersonsCorr families2persons, Persons persons, Families families) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge persons__p____person = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__persons____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__families____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String persons__p____person_name_prime = "person";
		String families2persons__persons____target_name_prime = "target";
		String families2persons__families____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(families2persons);
		isApplicableMatch.getAllContextElements().add(persons);
		isApplicableMatch.getAllContextElements().add(families);
		persons__p____person.setSrc(persons);
		persons__p____person.setTrg(p);
		isApplicableMatch.getAllContextElements().add(persons__p____person);
		families2persons__persons____target.setSrc(families2persons);
		families2persons__persons____target.setTrg(persons);
		isApplicableMatch.getAllContextElements().add(families2persons__persons____target);
		families2persons__families____source.setSrc(families2persons);
		families2persons__families____source.setTrg(families);
		isApplicableMatch.getAllContextElements().add(families2persons__families____source);
		persons__p____person.setName(persons__p____person_name_prime);
		families2persons__persons____target.setName(families2persons__persons____target_name_prime);
		families2persons__families____source.setName(families2persons__families____source_name_prime);
		return new Object[] { p, families2persons, persons, families, isApplicableMatch, persons__p____person,
				families2persons__persons____target, families2persons__families____source };
	}

	public static final Object[] pattern_MotherToFemale_12_4_solveCSP_bindingFBBBBBB(MotherToFemale _this,
			IsApplicableMatch isApplicableMatch, Female p, FamiliesToPersonsCorr families2persons, Persons persons,
			Families families) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, p, families2persons, persons,
				families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, families2persons, persons, families };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MotherToFemale_12_4_solveCSP_bindingAndBlackFBBBBBB(MotherToFemale _this,
			IsApplicableMatch isApplicableMatch, Female p, FamiliesToPersonsCorr families2persons, Persons persons,
			Families families) {
		Object[] result_pattern_MotherToFemale_12_4_solveCSP_binding = pattern_MotherToFemale_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p, families2persons, persons, families);
		if (result_pattern_MotherToFemale_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MotherToFemale_12_4_solveCSP_binding[0];

			Object[] result_pattern_MotherToFemale_12_4_solveCSP_black = pattern_MotherToFemale_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MotherToFemale_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, families2persons, persons, families };
			}
		}
		return null;
	}

	public static final boolean pattern_MotherToFemale_12_5_checkCSP_expressionFBB(MotherToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MotherToFemale_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MotherToFemale";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MotherToFemale_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_20_1_preparereturnvalue_bindingFB(MotherToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MotherToFemale _this) {
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

	public static final Object[] pattern_MotherToFemale_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MotherToFemale _this) {
		Object[] result_pattern_MotherToFemale_20_1_preparereturnvalue_binding = pattern_MotherToFemale_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MotherToFemale_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MotherToFemale_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MotherToFemale_20_1_preparereturnvalue_black = pattern_MotherToFemale_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MotherToFemale_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MotherToFemale_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MotherToFemale_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_0BB(FamilyMember fm,
			Family f) {
		Family __DEC_fm_family_father_596876 = fm.getFamily_father();
		if (__DEC_fm_family_father_596876 != null) {
			if (!f.equals(__DEC_fm_family_father_596876)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_1BB(FamilyMember fm,
			Family f) {
		Family __DEC_fm_family_son_782148 = fm.getFamily_son();
		if (__DEC_fm_family_son_782148 != null) {
			if (!f.equals(__DEC_fm_family_son_782148)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_2BB(FamilyMember fm,
			Family f) {
		Family __DEC_fm_family_daughter_356961 = fm.getFamily_daughter();
		if (__DEC_fm_family_daughter_356961 != null) {
			if (!f.equals(__DEC_fm_family_daughter_356961)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_3BB(FamilyMember fm,
			Family f) {
		if (f.equals(fm.getFamily_father())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_4BB(FamilyMember fm,
			Family f) {
		if (f.equals(fm.getFamily_son())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_5BB(FamilyMember fm,
			Family f) {
		if (f.equals(fm.getFamily_daughter())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MotherToFemale_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_family) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFamilies = _edge_family.getSrc();
		if (tmpFamilies instanceof Families) {
			Families families = (Families) tmpFamilies;
			EObject tmpF = _edge_family.getTrg();
			if (tmpF instanceof Family) {
				Family f = (Family) tmpF;
				if (families.getFamily().contains(f)) {
					FamilyMember fm = f.getMother();
					if (fm != null) {
						if (pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_0BB(fm, f) == null) {
							if (pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_1BB(fm, f) == null) {
								if (pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_2BB(fm, f) == null) {
									if (pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_3BB(fm, f) == null) {
										if (pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_4BB(fm,
												f) == null) {
											if (pattern_MotherToFemale_20_2_testcorematchandDECs_black_nac_5BB(fm,
													f) == null) {
												_result.add(new Object[] { f, fm, families, _edge_family });
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

	public static final Object[] pattern_MotherToFemale_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MotherToFemale_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MotherToFemale _this, Match match, Family f, FamilyMember fm, Families families) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, f, fm, families);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MotherToFemale_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MotherToFemale _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MotherToFemale_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_21_1_preparereturnvalue_bindingFB(MotherToFemale _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MotherToFemale _this) {
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

	public static final Object[] pattern_MotherToFemale_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MotherToFemale _this) {
		Object[] result_pattern_MotherToFemale_21_1_preparereturnvalue_binding = pattern_MotherToFemale_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MotherToFemale_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MotherToFemale_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MotherToFemale_21_1_preparereturnvalue_black = pattern_MotherToFemale_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MotherToFemale_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MotherToFemale_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MotherToFemale_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MotherToFemale_21_2_testcorematchandDECs_blackFFB(
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

	public static final Object[] pattern_MotherToFemale_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MotherToFemale_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MotherToFemale _this, Match match, Female p, Persons persons) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, p, persons);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MotherToFemale_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MotherToFemale _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MotherToFemale_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_24_1_prepare_blackB(MotherToFemale _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MotherToFemale_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MotherToFemale_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
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

	public static final Object[] pattern_MotherToFemale_24_2_matchsrctrgcontext_blackBBBBBBB(Female p, Persons persons,
			Family f, FamilyMember fm, Families families, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { p, persons, f, fm, families, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MotherToFemale_24_2_matchsrctrgcontext_binding = pattern_MotherToFemale_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MotherToFemale_24_2_matchsrctrgcontext_binding != null) {
			Female p = (Female) result_pattern_MotherToFemale_24_2_matchsrctrgcontext_binding[0];
			Persons persons = (Persons) result_pattern_MotherToFemale_24_2_matchsrctrgcontext_binding[1];
			Family f = (Family) result_pattern_MotherToFemale_24_2_matchsrctrgcontext_binding[2];
			FamilyMember fm = (FamilyMember) result_pattern_MotherToFemale_24_2_matchsrctrgcontext_binding[3];
			Families families = (Families) result_pattern_MotherToFemale_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_MotherToFemale_24_2_matchsrctrgcontext_black = pattern_MotherToFemale_24_2_matchsrctrgcontext_blackBBBBBBB(
					p, persons, f, fm, families, sourceMatch, targetMatch);
			if (result_pattern_MotherToFemale_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { p, persons, f, fm, families, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_24_3_solvecsp_bindingFBBBBBBBB(MotherToFemale _this, Female p,
			Persons persons, Family f, FamilyMember fm, Families families, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(p, persons, f, fm, families, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, p, persons, f, fm, families, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MotherToFemale_24_3_solvecsp_bindingAndBlackFBBBBBBBB(MotherToFemale _this,
			Female p, Persons persons, Family f, FamilyMember fm, Families families, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MotherToFemale_24_3_solvecsp_binding = pattern_MotherToFemale_24_3_solvecsp_bindingFBBBBBBBB(
				_this, p, persons, f, fm, families, sourceMatch, targetMatch);
		if (result_pattern_MotherToFemale_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MotherToFemale_24_3_solvecsp_binding[0];

			Object[] result_pattern_MotherToFemale_24_3_solvecsp_black = pattern_MotherToFemale_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MotherToFemale_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, p, persons, f, fm, families, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MotherToFemale_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MotherToFemale_24_5_matchcorrcontext_blackFBBBB(Persons persons,
			Families families, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (FamiliesToPersonsCorr families2persons : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(persons, FamiliesToPersonsCorr.class, "target")) {
				if (families.equals(families2persons.getSource())) {
					_result.add(new Object[] { families2persons, persons, families, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_24_5_matchcorrcontext_greenBBBF(
			FamiliesToPersonsCorr families2persons, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MotherToFemale";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(families2persons);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { families2persons, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MotherToFemale_24_6_createcorrespondence_blackBBBBBB(Female p, Persons persons,
			Family f, FamilyMember fm, Families families, CCMatch ccMatch) {
		return new Object[] { p, persons, f, fm, families, ccMatch };
	}

	public static final Object[] pattern_MotherToFemale_24_6_createcorrespondence_greenBFBB(Female p, FamilyMember fm,
			CCMatch ccMatch) {
		FamilyMemberToPerson familyMember2Persons = FamiliesToPersonsFactory.eINSTANCE.createFamilyMemberToPerson();
		familyMember2Persons.setSource(fm);
		familyMember2Persons.setTarget(p);
		ccMatch.getCreateCorr().add(familyMember2Persons);
		return new Object[] { p, familyMember2Persons, fm, ccMatch };
	}

	public static final Object[] pattern_MotherToFemale_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MotherToFemale_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MotherToFemale";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MotherToFemale_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_27_1_matchtggpattern_black_nac_0BB(FamilyMember fm, Family f) {
		Family __DEC_fm_family_father_395979 = fm.getFamily_father();
		if (__DEC_fm_family_father_395979 != null) {
			if (!f.equals(__DEC_fm_family_father_395979)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_MotherToFemale_27_1_matchtggpattern_black_nac_1BB(FamilyMember fm, Family f) {
		Family __DEC_fm_family_son_566940 = fm.getFamily_son();
		if (__DEC_fm_family_son_566940 != null) {
			if (!f.equals(__DEC_fm_family_son_566940)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_MotherToFemale_27_1_matchtggpattern_black_nac_2BB(FamilyMember fm, Family f) {
		Family __DEC_fm_family_daughter_160991 = fm.getFamily_daughter();
		if (__DEC_fm_family_daughter_160991 != null) {
			if (!f.equals(__DEC_fm_family_daughter_160991)) {
				return new Object[] { fm, f };
			}
		}

		return null;
	}

	public static final Object[] pattern_MotherToFemale_27_1_matchtggpattern_black_nac_3BB(FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_father())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_27_1_matchtggpattern_black_nac_4BB(FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_son())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_27_1_matchtggpattern_black_nac_5BB(FamilyMember fm, Family f) {
		if (f.equals(fm.getFamily_daughter())) {
			return new Object[] { fm, f };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_27_1_matchtggpattern_blackBBB(Family f, FamilyMember fm,
			Families families) {
		if (families.getFamily().contains(f)) {
			if (f.equals(fm.getFamily_mother())) {
				if (pattern_MotherToFemale_27_1_matchtggpattern_black_nac_0BB(fm, f) == null) {
					if (pattern_MotherToFemale_27_1_matchtggpattern_black_nac_1BB(fm, f) == null) {
						if (pattern_MotherToFemale_27_1_matchtggpattern_black_nac_2BB(fm, f) == null) {
							if (pattern_MotherToFemale_27_1_matchtggpattern_black_nac_3BB(fm, f) == null) {
								if (pattern_MotherToFemale_27_1_matchtggpattern_black_nac_4BB(fm, f) == null) {
									if (pattern_MotherToFemale_27_1_matchtggpattern_black_nac_5BB(fm, f) == null) {
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

	public static final boolean pattern_MotherToFemale_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MotherToFemale_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_28_1_matchtggpattern_blackBB(Female p, Persons persons) {
		if (persons.getPerson().contains(p)) {
			return new Object[] { p, persons };
		}
		return null;
	}

	public static final boolean pattern_MotherToFemale_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MotherToFemale_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_29_1_createresult_blackB(MotherToFemale _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MotherToFemale_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MotherToFemale_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, FamiliesToPersonsCorr families2persons) {
		if (ruleResult.getCorrObjects().contains(families2persons)) {
			return new Object[] { ruleResult, families2persons };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Persons persons) {
		if (ruleResult.getTargetObjects().contains(persons)) {
			return new Object[] { ruleResult, persons };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Families families) {
		if (ruleResult.getSourceObjects().contains(families)) {
			return new Object[] { ruleResult, families };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MotherToFemale_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList families2personsList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpFamilies2persons : families2personsList.getEntryObjects()) {
				if (tmpFamilies2persons instanceof FamiliesToPersonsCorr) {
					FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) tmpFamilies2persons;
					Persons persons = families2persons.getTarget();
					if (persons != null) {
						Families families = families2persons.getSource();
						if (families != null) {
							if (pattern_MotherToFemale_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									families2persons) == null) {
								if (pattern_MotherToFemale_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										persons) == null) {
									if (pattern_MotherToFemale_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											families) == null) {
										_result.add(new Object[] { families2personsList, families2persons, persons,
												families, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_MotherToFemale_29_3_solveCSP_bindingFBBBBBB(MotherToFemale _this,
			IsApplicableMatch isApplicableMatch, FamiliesToPersonsCorr families2persons, Persons persons,
			Families families, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, families2persons, persons, families,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, families, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MotherToFemale_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MotherToFemale_29_3_solveCSP_bindingAndBlackFBBBBBB(MotherToFemale _this,
			IsApplicableMatch isApplicableMatch, FamiliesToPersonsCorr families2persons, Persons persons,
			Families families, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MotherToFemale_29_3_solveCSP_binding = pattern_MotherToFemale_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, families2persons, persons, families, ruleResult);
		if (result_pattern_MotherToFemale_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MotherToFemale_29_3_solveCSP_binding[0];

			Object[] result_pattern_MotherToFemale_29_3_solveCSP_black = pattern_MotherToFemale_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MotherToFemale_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, families2persons, persons, families, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MotherToFemale_29_4_checkCSP_expressionFBB(MotherToFemale _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MotherToFemale_29_5_checknacs_blackBBB(FamiliesToPersonsCorr families2persons,
			Persons persons, Families families) {
		return new Object[] { families2persons, persons, families };
	}

	public static final Object[] pattern_MotherToFemale_29_6_perform_blackBBBB(FamiliesToPersonsCorr families2persons,
			Persons persons, Families families, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { families2persons, persons, families, ruleResult };
	}

	public static final Object[] pattern_MotherToFemale_29_6_perform_greenFBFFFBBB(Persons persons, Families families,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Female p = PersonsModelFactory.eINSTANCE.createFemale();
		FamilyMemberToPerson familyMember2Persons = FamiliesToPersonsFactory.eINSTANCE.createFamilyMemberToPerson();
		Family f = FamiliesModelFactory.eINSTANCE.createFamily();
		FamilyMember fm = FamiliesModelFactory.eINSTANCE.createFamilyMember();
		Object _localVariable_0 = csp.getValue("p", "fullName");
		Object _localVariable_1 = csp.getValue("f", "familyName");
		Object _localVariable_2 = csp.getValue("fm", "firstName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		persons.getPerson().add(p);
		ruleResult.getTargetObjects().add(p);
		familyMember2Persons.setTarget(p);
		ruleResult.getCorrObjects().add(familyMember2Persons);
		families.getFamily().add(f);
		ruleResult.getSourceObjects().add(f);
		familyMember2Persons.setSource(fm);
		fm.setFamily_mother(f);
		ruleResult.getSourceObjects().add(fm);
		String p_fullName_prime = (String) _localVariable_0;
		String f_familyName_prime = (String) _localVariable_1;
		String fm_firstName_prime = (String) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		p.setFullName(p_fullName_prime);
		f.setFamilyName(f_familyName_prime);
		fm.setFirstName(fm_firstName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { p, persons, familyMember2Persons, f, fm, families, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MotherToFemale_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MotherToFemaleImpl
