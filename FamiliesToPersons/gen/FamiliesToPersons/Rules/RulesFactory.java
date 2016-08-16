/**
 */
package FamiliesToPersons.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FamiliesToPersons.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = FamiliesToPersons.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Father To Male</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Father To Male</em>'.
	 * @generated
	 */
	FatherToMale createFatherToMale();

	/**
	 * Returns a new object of class '<em>Existing Family2 Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existing Family2 Person</em>'.
	 * @generated
	 */
	ExistingFamily2Person createExistingFamily2Person();

	/**
	 * Returns a new object of class '<em>Daughter Of Existing Family To Female</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Daughter Of Existing Family To Female</em>'.
	 * @generated
	 */
	DaughterOfExistingFamilyToFemale createDaughterOfExistingFamilyToFemale();

	/**
	 * Returns a new object of class '<em>Son Of Existing Family To Male</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Son Of Existing Family To Male</em>'.
	 * @generated
	 */
	SonOfExistingFamilyToMale createSonOfExistingFamilyToMale();

	/**
	 * Returns a new object of class '<em>Mother Of Existing Family To Female</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mother Of Existing Family To Female</em>'.
	 * @generated
	 */
	MotherOfExistingFamilyToFemale createMotherOfExistingFamilyToFemale();

	/**
	 * Returns a new object of class '<em>Family Member2 Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Member2 Person</em>'.
	 * @generated
	 */
	FamilyMember2Person createFamilyMember2Person();

	/**
	 * Returns a new object of class '<em>Son To Male</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Son To Male</em>'.
	 * @generated
	 */
	SonToMale createSonToMale();

	/**
	 * Returns a new object of class '<em>Daughter To Female</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Daughter To Female</em>'.
	 * @generated
	 */
	DaughterToFemale createDaughterToFemale();

	/**
	 * Returns a new object of class '<em>Mother To Female</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mother To Female</em>'.
	 * @generated
	 */
	MotherToFemale createMotherToFemale();

	/**
	 * Returns a new object of class '<em>Father Of Existing Family To Male</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Father Of Existing Family To Male</em>'.
	 * @generated
	 */
	FatherOfExistingFamilyToMale createFatherOfExistingFamilyToMale();

	/**
	 * Returns a new object of class '<em>Families2 Persons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Families2 Persons</em>'.
	 * @generated
	 */
	Families2Persons createFamilies2Persons();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
