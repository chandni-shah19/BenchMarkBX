/**
 */
package FamiliesModel;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FamiliesModel.FamilyMember#getFamily_father <em>Family father</em>}</li>
 *   <li>{@link FamiliesModel.FamilyMember#getFamily_mother <em>Family mother</em>}</li>
 *   <li>{@link FamiliesModel.FamilyMember#getFamily_son <em>Family son</em>}</li>
 *   <li>{@link FamiliesModel.FamilyMember#getFamily_daughter <em>Family daughter</em>}</li>
 *   <li>{@link FamiliesModel.FamilyMember#getFirstName <em>First Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FamiliesModel.FamiliesModelPackage#getFamilyMember()
 * @model
 * @generated
 */
public interface FamilyMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Family father</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.Family#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family father</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family father</em>' container reference.
	 * @see #setFamily_father(Family)
	 * @see FamiliesModel.FamiliesModelPackage#getFamilyMember_Family_father()
	 * @see FamiliesModel.Family#getFather
	 * @model opposite="father" transient="false"
	 * @generated
	 */
	Family getFamily_father();

	/**
	 * Sets the value of the '{@link FamiliesModel.FamilyMember#getFamily_father <em>Family father</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family father</em>' container reference.
	 * @see #getFamily_father()
	 * @generated
	 */
	void setFamily_father(Family value);

	/**
	 * Returns the value of the '<em><b>Family mother</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.Family#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family mother</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family mother</em>' container reference.
	 * @see #setFamily_mother(Family)
	 * @see FamiliesModel.FamiliesModelPackage#getFamilyMember_Family_mother()
	 * @see FamiliesModel.Family#getMother
	 * @model opposite="mother" transient="false"
	 * @generated
	 */
	Family getFamily_mother();

	/**
	 * Sets the value of the '{@link FamiliesModel.FamilyMember#getFamily_mother <em>Family mother</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family mother</em>' container reference.
	 * @see #getFamily_mother()
	 * @generated
	 */
	void setFamily_mother(Family value);

	/**
	 * Returns the value of the '<em><b>Family son</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.Family#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family son</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family son</em>' container reference.
	 * @see #setFamily_son(Family)
	 * @see FamiliesModel.FamiliesModelPackage#getFamilyMember_Family_son()
	 * @see FamiliesModel.Family#getSons
	 * @model opposite="sons" transient="false"
	 * @generated
	 */
	Family getFamily_son();

	/**
	 * Sets the value of the '{@link FamiliesModel.FamilyMember#getFamily_son <em>Family son</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family son</em>' container reference.
	 * @see #getFamily_son()
	 * @generated
	 */
	void setFamily_son(Family value);

	/**
	 * Returns the value of the '<em><b>Family daughter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.Family#getDaughters <em>Daughters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family daughter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family daughter</em>' container reference.
	 * @see #setFamily_daughter(Family)
	 * @see FamiliesModel.FamiliesModelPackage#getFamilyMember_Family_daughter()
	 * @see FamiliesModel.Family#getDaughters
	 * @model opposite="daughters" transient="false"
	 * @generated
	 */
	Family getFamily_daughter();

	/**
	 * Sets the value of the '{@link FamiliesModel.FamilyMember#getFamily_daughter <em>Family daughter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family daughter</em>' container reference.
	 * @see #getFamily_daughter()
	 * @generated
	 */
	void setFamily_daughter(Family value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see FamiliesModel.FamiliesModelPackage#getFamilyMember_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link FamiliesModel.FamilyMember#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FamilyMember
