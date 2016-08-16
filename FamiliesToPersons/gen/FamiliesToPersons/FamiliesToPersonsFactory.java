/**
 */
package FamiliesToPersons;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FamiliesToPersons.FamiliesToPersonsPackage
 * @generated
 */
public interface FamiliesToPersonsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamiliesToPersonsFactory eINSTANCE = FamiliesToPersons.impl.FamiliesToPersonsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Family Member To Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Member To Person</em>'.
	 * @generated
	 */
	FamilyMemberToPerson createFamilyMemberToPerson();

	/**
	 * Returns a new object of class '<em>Corr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr</em>'.
	 * @generated
	 */
	FamiliesToPersonsCorr createFamiliesToPersonsCorr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FamiliesToPersonsPackage getFamiliesToPersonsPackage();

} //FamiliesToPersonsFactory
