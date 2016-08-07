/**
 */
package FamiliesModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FamiliesModel.Family#getFather <em>Father</em>}</li>
 *   <li>{@link FamiliesModel.Family#getMother <em>Mother</em>}</li>
 *   <li>{@link FamiliesModel.Family#getSons <em>Sons</em>}</li>
 *   <li>{@link FamiliesModel.Family#getDaughters <em>Daughters</em>}</li>
 *   <li>{@link FamiliesModel.Family#getFamilyName <em>Family Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FamiliesModel.FamiliesModelPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>Father</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.FamilyMember#getFamily_father <em>Family father</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' containment reference.
	 * @see #setFather(FamilyMember)
	 * @see FamiliesModel.FamiliesModelPackage#getFamily_Father()
	 * @see FamiliesModel.FamilyMember#getFamily_father
	 * @model opposite="family_father" containment="true"
	 * @generated
	 */
	FamilyMember getFather();

	/**
	 * Sets the value of the '{@link FamiliesModel.Family#getFather <em>Father</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' containment reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(FamilyMember value);

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.FamilyMember#getFamily_mother <em>Family mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' containment reference.
	 * @see #setMother(FamilyMember)
	 * @see FamiliesModel.FamiliesModelPackage#getFamily_Mother()
	 * @see FamiliesModel.FamilyMember#getFamily_mother
	 * @model opposite="family_mother" containment="true"
	 * @generated
	 */
	FamilyMember getMother();

	/**
	 * Sets the value of the '{@link FamiliesModel.Family#getMother <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' containment reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(FamilyMember value);

	/**
	 * Returns the value of the '<em><b>Sons</b></em>' containment reference list.
	 * The list contents are of type {@link FamiliesModel.FamilyMember}.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.FamilyMember#getFamily_son <em>Family son</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sons</em>' containment reference list.
	 * @see FamiliesModel.FamiliesModelPackage#getFamily_Sons()
	 * @see FamiliesModel.FamilyMember#getFamily_son
	 * @model opposite="family_son" containment="true"
	 * @generated
	 */
	EList<FamilyMember> getSons();

	/**
	 * Returns the value of the '<em><b>Daughters</b></em>' containment reference list.
	 * The list contents are of type {@link FamiliesModel.FamilyMember}.
	 * It is bidirectional and its opposite is '{@link FamiliesModel.FamilyMember#getFamily_daughter <em>Family daughter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daughters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daughters</em>' containment reference list.
	 * @see FamiliesModel.FamiliesModelPackage#getFamily_Daughters()
	 * @see FamiliesModel.FamilyMember#getFamily_daughter
	 * @model opposite="family_daughter" containment="true"
	 * @generated
	 */
	EList<FamilyMember> getDaughters();

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #setFamilyName(String)
	 * @see FamiliesModel.FamiliesModelPackage#getFamily_FamilyName()
	 * @model
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link FamiliesModel.Family#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Family
