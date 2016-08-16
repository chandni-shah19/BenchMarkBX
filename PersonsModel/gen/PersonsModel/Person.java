/**
 */
package PersonsModel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PersonsModel.Person#getFullName <em>Full Name</em>}</li>
 *   <li>{@link PersonsModel.Person#getBirthday <em>Birthday</em>}</li>
 * </ul>
 * </p>
 *
 * @see PersonsModel.PersonsModelPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see PersonsModel.PersonsModelPackage#getPerson_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link PersonsModel.Person#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see PersonsModel.PersonsModelPackage#getPerson_Birthday()
	 * @model default=""
	 * @generated
	 */
	Date getBirthday();

	/**
	 * Sets the value of the '{@link PersonsModel.Person#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	void setBirthday(Date value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Person
