/**
 */
package PersonsModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PersonsModel.PersonsModelPackage
 * @generated
 */
public interface PersonsModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersonsModelFactory eINSTANCE = PersonsModel.impl.PersonsModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Persons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persons</em>'.
	 * @generated
	 */
	Persons createPersons();

	/**
	 * Returns a new object of class '<em>Male</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Male</em>'.
	 * @generated
	 */
	Male createMale();

	/**
	 * Returns a new object of class '<em>Female</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Female</em>'.
	 * @generated
	 */
	Female createFemale();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersonsModelPackage getPersonsModelPackage();

} //PersonsModelFactory
