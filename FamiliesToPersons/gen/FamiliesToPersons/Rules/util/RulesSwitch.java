/**
 */
package FamiliesToPersons.Rules.util;

import FamiliesToPersons.Rules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see FamiliesToPersons.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.FATHER_TO_MALE: {
			FatherToMale fatherToMale = (FatherToMale) theEObject;
			T result = caseFatherToMale(fatherToMale);
			if (result == null)
				result = caseAbstractRule(fatherToMale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EXISTING_FAMILY2_PERSON: {
			ExistingFamily2Person existingFamily2Person = (ExistingFamily2Person) theEObject;
			T result = caseExistingFamily2Person(existingFamily2Person);
			if (result == null)
				result = caseAbstractRule(existingFamily2Person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE: {
			DaughterOfExistingFamilyToFemale daughterOfExistingFamilyToFemale = (DaughterOfExistingFamilyToFemale) theEObject;
			T result = caseDaughterOfExistingFamilyToFemale(daughterOfExistingFamilyToFemale);
			if (result == null)
				result = caseAbstractRule(daughterOfExistingFamilyToFemale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SON_OF_EXISTING_FAMILY_TO_MALE: {
			SonOfExistingFamilyToMale sonOfExistingFamilyToMale = (SonOfExistingFamilyToMale) theEObject;
			T result = caseSonOfExistingFamilyToMale(sonOfExistingFamilyToMale);
			if (result == null)
				result = caseAbstractRule(sonOfExistingFamilyToMale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MOTHER_OF_EXISTING_FAMILY_TO_FEMALE: {
			MotherOfExistingFamilyToFemale motherOfExistingFamilyToFemale = (MotherOfExistingFamilyToFemale) theEObject;
			T result = caseMotherOfExistingFamilyToFemale(motherOfExistingFamilyToFemale);
			if (result == null)
				result = caseAbstractRule(motherOfExistingFamilyToFemale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FAMILY_MEMBER2_PERSON: {
			FamilyMember2Person familyMember2Person = (FamilyMember2Person) theEObject;
			T result = caseFamilyMember2Person(familyMember2Person);
			if (result == null)
				result = caseAbstractRule(familyMember2Person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SON_TO_MALE: {
			SonToMale sonToMale = (SonToMale) theEObject;
			T result = caseSonToMale(sonToMale);
			if (result == null)
				result = caseAbstractRule(sonToMale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DAUGHTER_TO_FEMALE: {
			DaughterToFemale daughterToFemale = (DaughterToFemale) theEObject;
			T result = caseDaughterToFemale(daughterToFemale);
			if (result == null)
				result = caseAbstractRule(daughterToFemale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MOTHER_TO_FEMALE: {
			MotherToFemale motherToFemale = (MotherToFemale) theEObject;
			T result = caseMotherToFemale(motherToFemale);
			if (result == null)
				result = caseAbstractRule(motherToFemale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FATHER_OF_EXISTING_FAMILY_TO_MALE: {
			FatherOfExistingFamilyToMale fatherOfExistingFamilyToMale = (FatherOfExistingFamilyToMale) theEObject;
			T result = caseFatherOfExistingFamilyToMale(fatherOfExistingFamilyToMale);
			if (result == null)
				result = caseAbstractRule(fatherOfExistingFamilyToMale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FAMILIES2_PERSONS: {
			Families2Persons families2Persons = (Families2Persons) theEObject;
			T result = caseFamilies2Persons(families2Persons);
			if (result == null)
				result = caseAbstractRule(families2Persons);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Father To Male</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Father To Male</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFatherToMale(FatherToMale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existing Family2 Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existing Family2 Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistingFamily2Person(ExistingFamily2Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daughter Of Existing Family To Female</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daughter Of Existing Family To Female</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaughterOfExistingFamilyToFemale(DaughterOfExistingFamilyToFemale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Son Of Existing Family To Male</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Son Of Existing Family To Male</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonOfExistingFamilyToMale(SonOfExistingFamilyToMale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mother Of Existing Family To Female</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mother Of Existing Family To Female</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotherOfExistingFamilyToFemale(MotherOfExistingFamilyToFemale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Member2 Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Member2 Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMember2Person(FamilyMember2Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Son To Male</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Son To Male</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonToMale(SonToMale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daughter To Female</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daughter To Female</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaughterToFemale(DaughterToFemale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mother To Female</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mother To Female</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotherToFemale(MotherToFemale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Father Of Existing Family To Male</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Father Of Existing Family To Male</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFatherOfExistingFamilyToMale(FatherOfExistingFamilyToMale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Families2 Persons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Families2 Persons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilies2Persons(Families2Persons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
