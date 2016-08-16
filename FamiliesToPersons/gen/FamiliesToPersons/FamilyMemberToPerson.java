/**
 */
package FamiliesToPersons;

import FamiliesModel.FamilyMember;

import PersonsModel.Person;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member To Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FamiliesToPersons.FamilyMemberToPerson#getSource <em>Source</em>}</li>
 *   <li>{@link FamiliesToPersons.FamilyMemberToPerson#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see FamiliesToPersons.FamiliesToPersonsPackage#getFamilyMemberToPerson()
 * @model
 * @generated
 */
public interface FamilyMemberToPerson extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FamilyMember)
	 * @see FamiliesToPersons.FamiliesToPersonsPackage#getFamilyMemberToPerson_Source()
	 * @model required="true"
	 * @generated
	 */
	FamilyMember getSource();

	/**
	 * Sets the value of the '{@link FamiliesToPersons.FamilyMemberToPerson#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FamilyMember value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Person)
	 * @see FamiliesToPersons.FamiliesToPersonsPackage#getFamilyMemberToPerson_Target()
	 * @model required="true"
	 * @generated
	 */
	Person getTarget();

	/**
	 * Sets the value of the '{@link FamiliesToPersons.FamilyMemberToPerson#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Person value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FamilyMemberToPerson
