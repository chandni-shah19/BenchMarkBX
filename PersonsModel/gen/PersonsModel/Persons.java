/**
 */
package PersonsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PersonsModel.Persons#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see PersonsModel.PersonsModelPackage#getPersons()
 * @model
 * @generated
 */
public interface Persons extends EObject {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link PersonsModel.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see PersonsModel.PersonsModelPackage#getPersons_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Persons
