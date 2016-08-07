/**
 */
package FamiliesModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Families</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FamiliesModel.Families#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see FamiliesModel.FamiliesModelPackage#getFamilies()
 * @model
 * @generated
 */
public interface Families extends EObject {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference list.
	 * The list contents are of type {@link FamiliesModel.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' containment reference list.
	 * @see FamiliesModel.FamiliesModelPackage#getFamilies_Family()
	 * @model containment="true"
	 * @generated
	 */
	EList<Family> getFamily();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Families
