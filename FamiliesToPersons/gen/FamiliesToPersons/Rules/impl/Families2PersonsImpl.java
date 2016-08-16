/**
 */
package FamiliesToPersons.Rules.impl;

import FamiliesModel.Families;
import FamiliesModel.FamiliesModelFactory;

import FamiliesToPersons.FamiliesToPersonsCorr;
import FamiliesToPersons.FamiliesToPersonsFactory;

import FamiliesToPersons.Rules.Families2Persons;
import FamiliesToPersons.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Families2 Persons</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Families2PersonsImpl extends AbstractRuleImpl implements Families2Persons {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Families2PersonsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFamilies2Persons();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Families families) {
		// initial bindings
		Object[] result1_black = Families2PersonsImpl.pattern_Families2Persons_0_1_initialbindings_blackBBB(this, match,
				families);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[families] = " + families + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_0_2_SolveCSP_bindingAndBlackFBBB(this, match, families);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[families] = " + families + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Families2PersonsImpl.pattern_Families2Persons_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Families2PersonsImpl
					.pattern_Families2Persons_0_4_collectelementstobetranslated_blackBB(match, families);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[families] = " + families + ".");
			}
			Families2PersonsImpl.pattern_Families2Persons_0_4_collectelementstobetranslated_greenBB(match, families);

			// collect context elements
			Object[] result5_black = Families2PersonsImpl
					.pattern_Families2Persons_0_5_collectcontextelements_blackBB(match, families);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[families] = " + families + ".");
			}
			// register objects to match
			Families2PersonsImpl.pattern_Families2Persons_0_6_registerobjectstomatch_expressionBBB(this, match,
					families);
			return Families2PersonsImpl.pattern_Families2Persons_0_7_expressionF();
		} else {
			return Families2PersonsImpl.pattern_Families2Persons_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Families families = (Families) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Families2PersonsImpl
				.pattern_Families2Persons_1_1_performtransformation_greenFBF(families);
		FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result1_green[0];
		Persons persons = (Persons) result1_green[2];

		// collect translated elements
		Object[] result2_black = Families2PersonsImpl
				.pattern_Families2Persons_1_2_collecttranslatedelements_blackBBB(families2persons, families, persons);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[families2persons] = " + families2persons + ", " + "[families] = " + families + ", "
					+ "[persons] = " + persons + ".");
		}
		Object[] result2_green = Families2PersonsImpl
				.pattern_Families2Persons_1_2_collecttranslatedelements_greenFBBB(families2persons, families, persons);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Families2PersonsImpl.pattern_Families2Persons_1_3_bookkeepingforedges_blackBBBB(
				ruleresult, families2persons, families, persons);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[families2persons] = " + families2persons + ", "
					+ "[families] = " + families + ", " + "[persons] = " + persons + ".");
		}
		Families2PersonsImpl.pattern_Families2Persons_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, families2persons,
				families, persons);
		// EMoflonEdge families2persons__families____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge families2persons__persons____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Families2PersonsImpl.pattern_Families2Persons_1_5_registerobjects_expressionBBBBB(this, ruleresult,
				families2persons, families, persons);
		return Families2PersonsImpl.pattern_Families2Persons_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Families2PersonsImpl
				.pattern_Families2Persons_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Families2PersonsImpl.pattern_Families2Persons_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Families families = (Families) result2_binding[0];
		for (Object[] result2_black : Families2PersonsImpl.pattern_Families2Persons_2_2_corematch_blackBB(families,
				match)) {
			// ForEach find context
			for (Object[] result3_black : Families2PersonsImpl
					.pattern_Families2Persons_2_3_findcontext_blackB(families)) {
				Object[] result3_green = Families2PersonsImpl
						.pattern_Families2Persons_2_3_findcontext_greenBF(families);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Families2PersonsImpl
						.pattern_Families2Persons_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, families);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[families] = " + families + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Families2PersonsImpl.pattern_Families2Persons_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Families2PersonsImpl
							.pattern_Families2Persons_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Families2PersonsImpl.pattern_Families2Persons_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Families2PersonsImpl.pattern_Families2Persons_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Families families) {
		match.registerObject("families", families);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Families families) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Families families) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject families2persons, EObject families,
			EObject persons) {
		ruleresult.registerObject("families2persons", families2persons);
		ruleresult.registerObject("families", families);
		ruleresult.registerObject("persons", persons);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("families").eClass())
				.equals("FamiliesModel.Families.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Persons persons) {
		// initial bindings
		Object[] result1_black = Families2PersonsImpl.pattern_Families2Persons_10_1_initialbindings_blackBBB(this,
				match, persons);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[persons] = " + persons + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_10_2_SolveCSP_bindingAndBlackFBBB(this, match, persons);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[persons] = " + persons + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Families2PersonsImpl.pattern_Families2Persons_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Families2PersonsImpl
					.pattern_Families2Persons_10_4_collectelementstobetranslated_blackBB(match, persons);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[persons] = " + persons + ".");
			}
			Families2PersonsImpl.pattern_Families2Persons_10_4_collectelementstobetranslated_greenBB(match, persons);

			// collect context elements
			Object[] result5_black = Families2PersonsImpl
					.pattern_Families2Persons_10_5_collectcontextelements_blackBB(match, persons);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[persons] = " + persons + ".");
			}
			// register objects to match
			Families2PersonsImpl.pattern_Families2Persons_10_6_registerobjectstomatch_expressionBBB(this, match,
					persons);
			return Families2PersonsImpl.pattern_Families2Persons_10_7_expressionF();
		} else {
			return Families2PersonsImpl.pattern_Families2Persons_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Persons persons = (Persons) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Families2PersonsImpl
				.pattern_Families2Persons_11_1_performtransformation_greenFFB(persons);
		FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result1_green[0];
		Families families = (Families) result1_green[1];

		// collect translated elements
		Object[] result2_black = Families2PersonsImpl
				.pattern_Families2Persons_11_2_collecttranslatedelements_blackBBB(families2persons, families, persons);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[families2persons] = " + families2persons + ", " + "[families] = " + families + ", "
					+ "[persons] = " + persons + ".");
		}
		Object[] result2_green = Families2PersonsImpl
				.pattern_Families2Persons_11_2_collecttranslatedelements_greenFBBB(families2persons, families, persons);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Families2PersonsImpl.pattern_Families2Persons_11_3_bookkeepingforedges_blackBBBB(
				ruleresult, families2persons, families, persons);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[families2persons] = " + families2persons + ", "
					+ "[families] = " + families + ", " + "[persons] = " + persons + ".");
		}
		Families2PersonsImpl.pattern_Families2Persons_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, families2persons,
				families, persons);
		// EMoflonEdge families2persons__families____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge families2persons__persons____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Families2PersonsImpl.pattern_Families2Persons_11_5_registerobjects_expressionBBBBB(this, ruleresult,
				families2persons, families, persons);
		return Families2PersonsImpl.pattern_Families2Persons_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Families2PersonsImpl
				.pattern_Families2Persons_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Families2PersonsImpl.pattern_Families2Persons_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Persons persons = (Persons) result2_binding[0];
		for (Object[] result2_black : Families2PersonsImpl.pattern_Families2Persons_12_2_corematch_blackBB(persons,
				match)) {
			// ForEach find context
			for (Object[] result3_black : Families2PersonsImpl
					.pattern_Families2Persons_12_3_findcontext_blackB(persons)) {
				Object[] result3_green = Families2PersonsImpl
						.pattern_Families2Persons_12_3_findcontext_greenBF(persons);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Families2PersonsImpl
						.pattern_Families2Persons_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, persons);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[persons] = " + persons + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Families2PersonsImpl.pattern_Families2Persons_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Families2PersonsImpl
							.pattern_Families2Persons_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Families2PersonsImpl.pattern_Families2Persons_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Families2PersonsImpl.pattern_Families2Persons_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Persons persons) {
		match.registerObject("persons", persons);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Persons persons) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Persons persons) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("persons", persons);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject families2persons, EObject families,
			EObject persons) {
		ruleresult.registerObject("families2persons", families2persons);
		ruleresult.registerObject("families", families);
		ruleresult.registerObject("persons", persons);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("persons").eClass())
				.equals("PersonsModel.Persons.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_Families_4(Families families) {
		// prepare return value
		Object[] result1_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = Families2PersonsImpl.pattern_Families2Persons_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Families2PersonsImpl
				.pattern_Families2Persons_20_2_testcorematchandDECs_blackB(families)) {
			Object[] result2_green = Families2PersonsImpl
					.pattern_Families2Persons_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Families2PersonsImpl
					.pattern_Families2Persons_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							families)) {
				// Ensure that the correct types of elements are matched
				if (Families2PersonsImpl
						.pattern_Families2Persons_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Families2PersonsImpl
							.pattern_Families2Persons_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					Families2PersonsImpl.pattern_Families2Persons_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return Families2PersonsImpl.pattern_Families2Persons_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Persons_4(Persons persons) {
		// prepare return value
		Object[] result1_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = Families2PersonsImpl.pattern_Families2Persons_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Families2PersonsImpl
				.pattern_Families2Persons_21_2_testcorematchandDECs_blackB(persons)) {
			Object[] result2_green = Families2PersonsImpl
					.pattern_Families2Persons_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Families2PersonsImpl
					.pattern_Families2Persons_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							persons)) {
				// Ensure that the correct types of elements are matched
				if (Families2PersonsImpl
						.pattern_Families2Persons_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Families2PersonsImpl
							.pattern_Families2Persons_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					Families2PersonsImpl.pattern_Families2Persons_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return Families2PersonsImpl.pattern_Families2Persons_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Families2Persons");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		ruleResult.setRule("Families2Persons");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		Object[] result1_black = Families2PersonsImpl.pattern_Families2Persons_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Families2PersonsImpl.pattern_Families2Persons_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// match src trg context
		Object[] result2_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [match src trg context] failed." + " Variables: "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Families families = (Families) result2_bindingAndBlack[0];
		Persons persons = (Persons) result2_bindingAndBlack[1];

		// solve csp
		Object[] result3_bindingAndBlack = Families2PersonsImpl
				.pattern_Families2Persons_24_3_solvecsp_bindingAndBlackFBBBBB(this, families, persons, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [solve csp] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[families] = " + families + ", " + "[persons] = " + persons + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// check CSP
		if (Families2PersonsImpl.pattern_Families2Persons_24_4_checkCSP_expressionFB(csp)) {
			// ForEach match corr context
			for (Object[] result5_black : Families2PersonsImpl
					.pattern_Families2Persons_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = Families2PersonsImpl
						.pattern_Families2Persons_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				// create correspondence
				Object[] result6_black = Families2PersonsImpl
						.pattern_Families2Persons_24_6_createcorrespondence_blackBBB(families, persons, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[families] = " + families + ", " + "[persons] = " + persons + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				Families2PersonsImpl.pattern_Families2Persons_24_6_createcorrespondence_greenFBBB(families, persons,
						ccMatch);
				// FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result6_green[0];

				// add to returned result
				Object[] result7_black = Families2PersonsImpl
						.pattern_Families2Persons_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching in node [add to returned result] failed."
							+ " Variables: " + "[result] = " + result + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				Families2PersonsImpl.pattern_Families2Persons_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return Families2PersonsImpl.pattern_Families2Persons_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Families families, Persons persons, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Families families) {// match tgg pattern
		Object[] result1_black = Families2PersonsImpl.pattern_Families2Persons_27_1_matchtggpattern_blackB(families);
		if (result1_black != null) {
			return Families2PersonsImpl.pattern_Families2Persons_27_2_expressionF();
		} else {
			return Families2PersonsImpl.pattern_Families2Persons_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Persons persons) {// match tgg pattern
		Object[] result1_black = Families2PersonsImpl.pattern_Families2Persons_28_1_matchtggpattern_blackB(persons);
		if (result1_black != null) {
			return Families2PersonsImpl.pattern_Families2Persons_28_2_expressionF();
		} else {
			return Families2PersonsImpl.pattern_Families2Persons_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {
		// create result
		Object[] result1_black = Families2PersonsImpl.pattern_Families2Persons_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Families2PersonsImpl.pattern_Families2Persons_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// is applicable core
		Object[] result2_black = Families2PersonsImpl.pattern_Families2Persons_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			// solve CSP
			Object[] result3_bindingAndBlack = Families2PersonsImpl
					.pattern_Families2Persons_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Families2PersonsImpl.pattern_Families2Persons_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs story node is empty

				// perform
				Object[] result6_black = Families2PersonsImpl.pattern_Families2Persons_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
							+ "[ruleResult] = " + ruleResult + ".");
				}
				Families2PersonsImpl.pattern_Families2Persons_29_6_perform_greenFFFB(ruleResult);
				// FamiliesToPersonsCorr families2persons = (FamiliesToPersonsCorr) result6_green[0];
				// Families families = (Families) result6_green[1];
				// Persons persons = (Persons) result6_green[2];

			} else {
			}

		} else {
		}
		return Families2PersonsImpl.pattern_Families2Persons_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_FWD__MATCH_FAMILIES:
			return isAppropriate_FWD((Match) arguments.get(0), (Families) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILIES:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Families) arguments.get(1));
			return null;
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILIES:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Families) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIES:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Families) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.FAMILIES2_PERSONS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_BWD__MATCH_PERSONS:
			return isAppropriate_BWD((Match) arguments.get(0), (Persons) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PERSONS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Persons) arguments.get(1));
			return null;
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PERSONS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Persons) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PERSONS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Persons) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.FAMILIES2_PERSONS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_FWD_FAMILIES_4__FAMILIES:
			return isAppropriate_FWD_Families_4((Families) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPROPRIATE_BWD_PERSONS_4__PERSONS:
			return isAppropriate_BWD_Persons_4((Persons) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_SOLVE_CSP_CC__FAMILIES_PERSONS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Families) arguments.get(0), (Persons) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.FAMILIES2_PERSONS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___CHECK_DEC_FWD__FAMILIES:
			return checkDEC_FWD((Families) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___CHECK_DEC_BWD__PERSONS:
			return checkDEC_BWD((Persons) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.FAMILIES2_PERSONS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.FAMILIES2_PERSONS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Families2Persons_0_1_initialbindings_blackBBB(Families2Persons _this,
			Match match, Families families) {
		return new Object[] { _this, match, families };
	}

	public static final Object[] pattern_Families2Persons_0_2_SolveCSP_bindingFBBB(Families2Persons _this, Match match,
			Families families) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, families };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Families2Persons_0_2_SolveCSP_bindingAndBlackFBBB(Families2Persons _this,
			Match match, Families families) {
		Object[] result_pattern_Families2Persons_0_2_SolveCSP_binding = pattern_Families2Persons_0_2_SolveCSP_bindingFBBB(
				_this, match, families);
		if (result_pattern_Families2Persons_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Families2Persons_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Families2Persons_0_2_SolveCSP_black = pattern_Families2Persons_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Families2Persons_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, families };
			}
		}
		return null;
	}

	public static final boolean pattern_Families2Persons_0_3_CheckCSP_expressionFBB(Families2Persons _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Families2Persons_0_4_collectelementstobetranslated_blackBB(Match match,
			Families families) {
		return new Object[] { match, families };
	}

	public static final Object[] pattern_Families2Persons_0_4_collectelementstobetranslated_greenBB(Match match,
			Families families) {
		match.getToBeTranslatedNodes().add(families);
		return new Object[] { match, families };
	}

	public static final Object[] pattern_Families2Persons_0_5_collectcontextelements_blackBB(Match match,
			Families families) {
		return new Object[] { match, families };
	}

	public static final void pattern_Families2Persons_0_6_registerobjectstomatch_expressionBBB(Families2Persons _this,
			Match match, Families families) {
		_this.registerObjectsToMatch_FWD(match, families);

	}

	public static final boolean pattern_Families2Persons_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Families2Persons_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("families");
		EObject tmpFamilies = _localVariable_0;
		if (tmpFamilies instanceof Families) {
			Families families = (Families) tmpFamilies;
			return new Object[] { families, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_1_1_performtransformation_blackBFBB(Families families,
			Families2Persons _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_1_1_performtransformation_bindingAndBlackFFBB(
			Families2Persons _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Families2Persons_1_1_performtransformation_binding = pattern_Families2Persons_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_Families2Persons_1_1_performtransformation_binding != null) {
			Families families = (Families) result_pattern_Families2Persons_1_1_performtransformation_binding[0];

			Object[] result_pattern_Families2Persons_1_1_performtransformation_black = pattern_Families2Persons_1_1_performtransformation_blackBFBB(
					families, _this, isApplicableMatch);
			if (result_pattern_Families2Persons_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Families2Persons_1_1_performtransformation_black[1];

				return new Object[] { families, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_1_1_performtransformation_greenFBF(Families families) {
		FamiliesToPersonsCorr families2persons = FamiliesToPersonsFactory.eINSTANCE.createFamiliesToPersonsCorr();
		Persons persons = PersonsModelFactory.eINSTANCE.createPersons();
		families2persons.setSource(families);
		families2persons.setTarget(persons);
		return new Object[] { families2persons, families, persons };
	}

	public static final Object[] pattern_Families2Persons_1_2_collecttranslatedelements_blackBBB(
			FamiliesToPersonsCorr families2persons, Families families, Persons persons) {
		return new Object[] { families2persons, families, persons };
	}

	public static final Object[] pattern_Families2Persons_1_2_collecttranslatedelements_greenFBBB(
			FamiliesToPersonsCorr families2persons, Families families, Persons persons) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(families2persons);
		ruleresult.getTranslatedElements().add(families);
		ruleresult.getCreatedElements().add(persons);
		return new Object[] { ruleresult, families2persons, families, persons };
	}

	public static final Object[] pattern_Families2Persons_1_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject families2persons, EObject families, EObject persons) {
		if (!families2persons.equals(persons)) {
			if (!families.equals(families2persons)) {
				if (!families.equals(persons)) {
					return new Object[] { ruleresult, families2persons, families, persons };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject families2persons, EObject families, EObject persons) {
		EMoflonEdge families2persons__families____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__persons____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Families2Persons";
		String families2persons__families____source_name_prime = "source";
		String families2persons__persons____target_name_prime = "target";
		families2persons__families____source.setSrc(families2persons);
		families2persons__families____source.setTrg(families);
		ruleresult.getCreatedEdges().add(families2persons__families____source);
		families2persons__persons____target.setSrc(families2persons);
		families2persons__persons____target.setTrg(persons);
		ruleresult.getCreatedEdges().add(families2persons__persons____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		families2persons__families____source.setName(families2persons__families____source_name_prime);
		families2persons__persons____target.setName(families2persons__persons____target_name_prime);
		return new Object[] { ruleresult, families2persons, families, persons, families2persons__families____source,
				families2persons__persons____target };
	}

	public static final void pattern_Families2Persons_1_5_registerobjects_expressionBBBBB(Families2Persons _this,
			PerformRuleResult ruleresult, EObject families2persons, EObject families, EObject persons) {
		_this.registerObjects_FWD(ruleresult, families2persons, families, persons);

	}

	public static final PerformRuleResult pattern_Families2Persons_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_2_1_preparereturnvalue_bindingFB(Families2Persons _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_2_1_preparereturnvalue_blackFBB(EClass eClass,
			Families2Persons _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_2_1_preparereturnvalue_bindingAndBlackFFB(
			Families2Persons _this) {
		Object[] result_pattern_Families2Persons_2_1_preparereturnvalue_binding = pattern_Families2Persons_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Families2Persons_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Families2Persons_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Families2Persons_2_1_preparereturnvalue_black = pattern_Families2Persons_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Families2Persons_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Families2Persons_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Families2Persons";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Families2Persons_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("families");
		EObject tmpFamilies = _localVariable_0;
		if (tmpFamilies instanceof Families) {
			Families families = (Families) tmpFamilies;
			return new Object[] { families, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Families2Persons_2_2_corematch_blackBB(Families families,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { families, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Families2Persons_2_3_findcontext_blackB(Families families) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { families });
		return _result;
	}

	public static final Object[] pattern_Families2Persons_2_3_findcontext_greenBF(Families families) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(families);
		return new Object[] { families, isApplicableMatch };
	}

	public static final Object[] pattern_Families2Persons_2_4_solveCSP_bindingFBBB(Families2Persons _this,
			IsApplicableMatch isApplicableMatch, Families families) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, families);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, families };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Families2Persons_2_4_solveCSP_bindingAndBlackFBBB(Families2Persons _this,
			IsApplicableMatch isApplicableMatch, Families families) {
		Object[] result_pattern_Families2Persons_2_4_solveCSP_binding = pattern_Families2Persons_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, families);
		if (result_pattern_Families2Persons_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Families2Persons_2_4_solveCSP_binding[0];

			Object[] result_pattern_Families2Persons_2_4_solveCSP_black = pattern_Families2Persons_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_Families2Persons_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, families };
			}
		}
		return null;
	}

	public static final boolean pattern_Families2Persons_2_5_checkCSP_expressionFBB(Families2Persons _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Families2Persons_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Families2Persons_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Families2Persons";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Families2Persons_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_10_1_initialbindings_blackBBB(Families2Persons _this,
			Match match, Persons persons) {
		return new Object[] { _this, match, persons };
	}

	public static final Object[] pattern_Families2Persons_10_2_SolveCSP_bindingFBBB(Families2Persons _this, Match match,
			Persons persons) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, persons);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, persons };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Families2Persons_10_2_SolveCSP_bindingAndBlackFBBB(Families2Persons _this,
			Match match, Persons persons) {
		Object[] result_pattern_Families2Persons_10_2_SolveCSP_binding = pattern_Families2Persons_10_2_SolveCSP_bindingFBBB(
				_this, match, persons);
		if (result_pattern_Families2Persons_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Families2Persons_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Families2Persons_10_2_SolveCSP_black = pattern_Families2Persons_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Families2Persons_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, persons };
			}
		}
		return null;
	}

	public static final boolean pattern_Families2Persons_10_3_CheckCSP_expressionFBB(Families2Persons _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Families2Persons_10_4_collectelementstobetranslated_blackBB(Match match,
			Persons persons) {
		return new Object[] { match, persons };
	}

	public static final Object[] pattern_Families2Persons_10_4_collectelementstobetranslated_greenBB(Match match,
			Persons persons) {
		match.getToBeTranslatedNodes().add(persons);
		return new Object[] { match, persons };
	}

	public static final Object[] pattern_Families2Persons_10_5_collectcontextelements_blackBB(Match match,
			Persons persons) {
		return new Object[] { match, persons };
	}

	public static final void pattern_Families2Persons_10_6_registerobjectstomatch_expressionBBB(Families2Persons _this,
			Match match, Persons persons) {
		_this.registerObjectsToMatch_BWD(match, persons);

	}

	public static final boolean pattern_Families2Persons_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Families2Persons_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("persons");
		EObject tmpPersons = _localVariable_0;
		if (tmpPersons instanceof Persons) {
			Persons persons = (Persons) tmpPersons;
			return new Object[] { persons, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_11_1_performtransformation_blackBFBB(Persons persons,
			Families2Persons _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { persons, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_11_1_performtransformation_bindingAndBlackFFBB(
			Families2Persons _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Families2Persons_11_1_performtransformation_binding = pattern_Families2Persons_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_Families2Persons_11_1_performtransformation_binding != null) {
			Persons persons = (Persons) result_pattern_Families2Persons_11_1_performtransformation_binding[0];

			Object[] result_pattern_Families2Persons_11_1_performtransformation_black = pattern_Families2Persons_11_1_performtransformation_blackBFBB(
					persons, _this, isApplicableMatch);
			if (result_pattern_Families2Persons_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Families2Persons_11_1_performtransformation_black[1];

				return new Object[] { persons, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_11_1_performtransformation_greenFFB(Persons persons) {
		FamiliesToPersonsCorr families2persons = FamiliesToPersonsFactory.eINSTANCE.createFamiliesToPersonsCorr();
		Families families = FamiliesModelFactory.eINSTANCE.createFamilies();
		families2persons.setTarget(persons);
		families2persons.setSource(families);
		return new Object[] { families2persons, families, persons };
	}

	public static final Object[] pattern_Families2Persons_11_2_collecttranslatedelements_blackBBB(
			FamiliesToPersonsCorr families2persons, Families families, Persons persons) {
		return new Object[] { families2persons, families, persons };
	}

	public static final Object[] pattern_Families2Persons_11_2_collecttranslatedelements_greenFBBB(
			FamiliesToPersonsCorr families2persons, Families families, Persons persons) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(families2persons);
		ruleresult.getCreatedElements().add(families);
		ruleresult.getTranslatedElements().add(persons);
		return new Object[] { ruleresult, families2persons, families, persons };
	}

	public static final Object[] pattern_Families2Persons_11_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject families2persons, EObject families, EObject persons) {
		if (!families2persons.equals(persons)) {
			if (!families.equals(families2persons)) {
				if (!families.equals(persons)) {
					return new Object[] { ruleresult, families2persons, families, persons };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject families2persons, EObject families, EObject persons) {
		EMoflonEdge families2persons__families____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge families2persons__persons____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Families2Persons";
		String families2persons__families____source_name_prime = "source";
		String families2persons__persons____target_name_prime = "target";
		families2persons__families____source.setSrc(families2persons);
		families2persons__families____source.setTrg(families);
		ruleresult.getCreatedEdges().add(families2persons__families____source);
		families2persons__persons____target.setSrc(families2persons);
		families2persons__persons____target.setTrg(persons);
		ruleresult.getCreatedEdges().add(families2persons__persons____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		families2persons__families____source.setName(families2persons__families____source_name_prime);
		families2persons__persons____target.setName(families2persons__persons____target_name_prime);
		return new Object[] { ruleresult, families2persons, families, persons, families2persons__families____source,
				families2persons__persons____target };
	}

	public static final void pattern_Families2Persons_11_5_registerobjects_expressionBBBBB(Families2Persons _this,
			PerformRuleResult ruleresult, EObject families2persons, EObject families, EObject persons) {
		_this.registerObjects_BWD(ruleresult, families2persons, families, persons);

	}

	public static final PerformRuleResult pattern_Families2Persons_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_12_1_preparereturnvalue_bindingFB(Families2Persons _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_12_1_preparereturnvalue_blackFBB(EClass eClass,
			Families2Persons _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_12_1_preparereturnvalue_bindingAndBlackFFB(
			Families2Persons _this) {
		Object[] result_pattern_Families2Persons_12_1_preparereturnvalue_binding = pattern_Families2Persons_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Families2Persons_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Families2Persons_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Families2Persons_12_1_preparereturnvalue_black = pattern_Families2Persons_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Families2Persons_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Families2Persons_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Families2Persons";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Families2Persons_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("persons");
		EObject tmpPersons = _localVariable_0;
		if (tmpPersons instanceof Persons) {
			Persons persons = (Persons) tmpPersons;
			return new Object[] { persons, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Families2Persons_12_2_corematch_blackBB(Persons persons,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { persons, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Families2Persons_12_3_findcontext_blackB(Persons persons) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { persons });
		return _result;
	}

	public static final Object[] pattern_Families2Persons_12_3_findcontext_greenBF(Persons persons) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(persons);
		return new Object[] { persons, isApplicableMatch };
	}

	public static final Object[] pattern_Families2Persons_12_4_solveCSP_bindingFBBB(Families2Persons _this,
			IsApplicableMatch isApplicableMatch, Persons persons) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, persons);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, persons };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Families2Persons_12_4_solveCSP_bindingAndBlackFBBB(Families2Persons _this,
			IsApplicableMatch isApplicableMatch, Persons persons) {
		Object[] result_pattern_Families2Persons_12_4_solveCSP_binding = pattern_Families2Persons_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, persons);
		if (result_pattern_Families2Persons_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Families2Persons_12_4_solveCSP_binding[0];

			Object[] result_pattern_Families2Persons_12_4_solveCSP_black = pattern_Families2Persons_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_Families2Persons_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, persons };
			}
		}
		return null;
	}

	public static final boolean pattern_Families2Persons_12_5_checkCSP_expressionFBB(Families2Persons _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Families2Persons_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Families2Persons_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Families2Persons";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Families2Persons_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_20_1_preparereturnvalue_bindingFB(Families2Persons _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Families2Persons _this) {
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

	public static final Object[] pattern_Families2Persons_20_1_preparereturnvalue_bindingAndBlackFFBF(
			Families2Persons _this) {
		Object[] result_pattern_Families2Persons_20_1_preparereturnvalue_binding = pattern_Families2Persons_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Families2Persons_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Families2Persons_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Families2Persons_20_1_preparereturnvalue_black = pattern_Families2Persons_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Families2Persons_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Families2Persons_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Families2Persons_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Families2Persons_20_2_testcorematchandDECs_blackB(
			Families families) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { families });
		return _result;
	}

	public static final Object[] pattern_Families2Persons_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Families2Persons_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			Families2Persons _this, Match match, Families families) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, families);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Families2Persons_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Families2Persons _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Families2Persons_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Families2Persons_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_21_1_preparereturnvalue_bindingFB(Families2Persons _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Families2Persons _this) {
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

	public static final Object[] pattern_Families2Persons_21_1_preparereturnvalue_bindingAndBlackFFBF(
			Families2Persons _this) {
		Object[] result_pattern_Families2Persons_21_1_preparereturnvalue_binding = pattern_Families2Persons_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Families2Persons_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Families2Persons_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Families2Persons_21_1_preparereturnvalue_black = pattern_Families2Persons_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Families2Persons_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Families2Persons_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Families2Persons_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Families2Persons_21_2_testcorematchandDECs_blackB(Persons persons) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { persons });
		return _result;
	}

	public static final Object[] pattern_Families2Persons_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Families2Persons_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			Families2Persons _this, Match match, Persons persons) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, persons);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Families2Persons_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Families2Persons _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Families2Persons_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Families2Persons_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_24_1_prepare_blackB(Families2Persons _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Families2Persons_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Families2Persons_24_2_matchsrctrgcontext_bindingFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("families");
		EObject _localVariable_1 = targetMatch.getObject("persons");
		EObject tmpFamilies = _localVariable_0;
		EObject tmpPersons = _localVariable_1;
		if (tmpFamilies instanceof Families) {
			Families families = (Families) tmpFamilies;
			if (tmpPersons instanceof Persons) {
				Persons persons = (Persons) tmpPersons;
				return new Object[] { families, persons, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_24_2_matchsrctrgcontext_blackBBBB(Families families,
			Persons persons, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { families, persons, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_24_2_matchsrctrgcontext_bindingAndBlackFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Families2Persons_24_2_matchsrctrgcontext_binding = pattern_Families2Persons_24_2_matchsrctrgcontext_bindingFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_Families2Persons_24_2_matchsrctrgcontext_binding != null) {
			Families families = (Families) result_pattern_Families2Persons_24_2_matchsrctrgcontext_binding[0];
			Persons persons = (Persons) result_pattern_Families2Persons_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_Families2Persons_24_2_matchsrctrgcontext_black = pattern_Families2Persons_24_2_matchsrctrgcontext_blackBBBB(
					families, persons, sourceMatch, targetMatch);
			if (result_pattern_Families2Persons_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { families, persons, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_24_3_solvecsp_bindingFBBBBB(Families2Persons _this,
			Families families, Persons persons, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(families, persons, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, families, persons, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Families2Persons_24_3_solvecsp_bindingAndBlackFBBBBB(Families2Persons _this,
			Families families, Persons persons, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Families2Persons_24_3_solvecsp_binding = pattern_Families2Persons_24_3_solvecsp_bindingFBBBBB(
				_this, families, persons, sourceMatch, targetMatch);
		if (result_pattern_Families2Persons_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_Families2Persons_24_3_solvecsp_binding[0];

			Object[] result_pattern_Families2Persons_24_3_solvecsp_black = pattern_Families2Persons_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_Families2Persons_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, families, persons, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_Families2Persons_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Families2Persons_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_Families2Persons_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "Families2Persons";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_Families2Persons_24_6_createcorrespondence_blackBBB(Families families,
			Persons persons, CCMatch ccMatch) {
		return new Object[] { families, persons, ccMatch };
	}

	public static final Object[] pattern_Families2Persons_24_6_createcorrespondence_greenFBBB(Families families,
			Persons persons, CCMatch ccMatch) {
		FamiliesToPersonsCorr families2persons = FamiliesToPersonsFactory.eINSTANCE.createFamiliesToPersonsCorr();
		families2persons.setSource(families);
		families2persons.setTarget(persons);
		ccMatch.getCreateCorr().add(families2persons);
		return new Object[] { families2persons, families, persons, ccMatch };
	}

	public static final Object[] pattern_Families2Persons_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_Families2Persons_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "Families2Persons";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_Families2Persons_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_27_1_matchtggpattern_blackB(Families families) {
		return new Object[] { families };
	}

	public static final boolean pattern_Families2Persons_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Families2Persons_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_28_1_matchtggpattern_blackB(Persons persons) {
		return new Object[] { persons };
	}

	public static final boolean pattern_Families2Persons_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Families2Persons_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Families2Persons_29_1_createresult_blackB(Families2Persons _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Families2Persons_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Families2Persons_29_2_isapplicablecore_blackB(Families2Persons _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Families2Persons_29_3_solveCSP_bindingFBBB(Families2Persons _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Families2Persons_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Families2Persons_29_3_solveCSP_bindingAndBlackFBBB(Families2Persons _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Families2Persons_29_3_solveCSP_binding = pattern_Families2Persons_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_Families2Persons_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Families2Persons_29_3_solveCSP_binding[0];

			Object[] result_pattern_Families2Persons_29_3_solveCSP_black = pattern_Families2Persons_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_Families2Persons_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Families2Persons_29_4_checkCSP_expressionFBB(Families2Persons _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Families2Persons_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_Families2Persons_29_6_perform_greenFFFB(ModelgeneratorRuleResult ruleResult) {
		FamiliesToPersonsCorr families2persons = FamiliesToPersonsFactory.eINSTANCE.createFamiliesToPersonsCorr();
		Families families = FamiliesModelFactory.eINSTANCE.createFamilies();
		Persons persons = PersonsModelFactory.eINSTANCE.createPersons();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(families2persons);
		families2persons.setSource(families);
		ruleResult.getSourceObjects().add(families);
		families2persons.setTarget(persons);
		ruleResult.getTargetObjects().add(persons);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { families2persons, families, persons, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Families2Persons_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Families2PersonsImpl
