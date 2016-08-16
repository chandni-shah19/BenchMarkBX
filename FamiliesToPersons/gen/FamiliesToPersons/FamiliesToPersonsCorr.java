/**
 */
package FamiliesToPersons;

import FamiliesModel.Families;

import PersonsModel.Persons;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FamiliesToPersons.FamiliesToPersonsCorr#getSource <em>Source</em>}</li>
 *   <li>{@link FamiliesToPersons.FamiliesToPersonsCorr#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see FamiliesToPersons.FamiliesToPersonsPackage#getFamiliesToPersonsCorr()
 * @model
 * @generated
 */
public interface FamiliesToPersonsCorr extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Families)
	 * @see FamiliesToPersons.FamiliesToPersonsPackage#getFamiliesToPersonsCorr_Source()
	 * @model required="true"
	 * @generated
	 */
	Families getSource();

	/**
	 * Sets the value of the '{@link FamiliesToPersons.FamiliesToPersonsCorr#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Families value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Persons)
	 * @see FamiliesToPersons.FamiliesToPersonsPackage#getFamiliesToPersonsCorr_Target()
	 * @model required="true"
	 * @generated
	 */
	Persons getTarget();

	/**
	 * Sets the value of the '{@link FamiliesToPersons.FamiliesToPersonsCorr#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Persons value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FamiliesToPersonsCorr
