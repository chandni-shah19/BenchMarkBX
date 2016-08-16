/**
 */
package FamiliesToPersons;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FamiliesToPersons.FamiliesToPersonsFactory
 * @model kind="package"
 * @generated
 */
public interface FamiliesToPersonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FamiliesToPersons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/FamiliesToPersons/model/FamiliesToPersons.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FamiliesToPersons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamiliesToPersonsPackage eINSTANCE = FamiliesToPersons.impl.FamiliesToPersonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link FamiliesToPersons.impl.FamilyMemberToPersonImpl <em>Family Member To Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.impl.FamilyMemberToPersonImpl
	 * @see FamiliesToPersons.impl.FamiliesToPersonsPackageImpl#getFamilyMemberToPerson()
	 * @generated
	 */
	int FAMILY_MEMBER_TO_PERSON = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_TO_PERSON__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_TO_PERSON__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Family Member To Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_TO_PERSON_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Family Member To Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_TO_PERSON_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.impl.FamiliesToPersonsCorrImpl <em>Corr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.impl.FamiliesToPersonsCorrImpl
	 * @see FamiliesToPersons.impl.FamiliesToPersonsPackageImpl#getFamiliesToPersonsCorr()
	 * @generated
	 */
	int FAMILIES_TO_PERSONS_CORR = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES_TO_PERSONS_CORR__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES_TO_PERSONS_CORR__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES_TO_PERSONS_CORR_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES_TO_PERSONS_CORR_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.FamilyMemberToPerson <em>Family Member To Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Member To Person</em>'.
	 * @see FamiliesToPersons.FamilyMemberToPerson
	 * @generated
	 */
	EClass getFamilyMemberToPerson();

	/**
	 * Returns the meta object for the reference '{@link FamiliesToPersons.FamilyMemberToPerson#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see FamiliesToPersons.FamilyMemberToPerson#getSource()
	 * @see #getFamilyMemberToPerson()
	 * @generated
	 */
	EReference getFamilyMemberToPerson_Source();

	/**
	 * Returns the meta object for the reference '{@link FamiliesToPersons.FamilyMemberToPerson#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see FamiliesToPersons.FamilyMemberToPerson#getTarget()
	 * @see #getFamilyMemberToPerson()
	 * @generated
	 */
	EReference getFamilyMemberToPerson_Target();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.FamiliesToPersonsCorr <em>Corr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr</em>'.
	 * @see FamiliesToPersons.FamiliesToPersonsCorr
	 * @generated
	 */
	EClass getFamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the reference '{@link FamiliesToPersons.FamiliesToPersonsCorr#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see FamiliesToPersons.FamiliesToPersonsCorr#getSource()
	 * @see #getFamiliesToPersonsCorr()
	 * @generated
	 */
	EReference getFamiliesToPersonsCorr_Source();

	/**
	 * Returns the meta object for the reference '{@link FamiliesToPersons.FamiliesToPersonsCorr#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see FamiliesToPersons.FamiliesToPersonsCorr#getTarget()
	 * @see #getFamiliesToPersonsCorr()
	 * @generated
	 */
	EReference getFamiliesToPersonsCorr_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamiliesToPersonsFactory getFamiliesToPersonsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FamiliesToPersons.impl.FamilyMemberToPersonImpl <em>Family Member To Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesToPersons.impl.FamilyMemberToPersonImpl
		 * @see FamiliesToPersons.impl.FamiliesToPersonsPackageImpl#getFamilyMemberToPerson()
		 * @generated
		 */
		EClass FAMILY_MEMBER_TO_PERSON = eINSTANCE.getFamilyMemberToPerson();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER_TO_PERSON__SOURCE = eINSTANCE.getFamilyMemberToPerson_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER_TO_PERSON__TARGET = eINSTANCE.getFamilyMemberToPerson_Target();

		/**
		 * The meta object literal for the '{@link FamiliesToPersons.impl.FamiliesToPersonsCorrImpl <em>Corr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesToPersons.impl.FamiliesToPersonsCorrImpl
		 * @see FamiliesToPersons.impl.FamiliesToPersonsPackageImpl#getFamiliesToPersonsCorr()
		 * @generated
		 */
		EClass FAMILIES_TO_PERSONS_CORR = eINSTANCE.getFamiliesToPersonsCorr();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILIES_TO_PERSONS_CORR__SOURCE = eINSTANCE.getFamiliesToPersonsCorr_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILIES_TO_PERSONS_CORR__TARGET = eINSTANCE.getFamiliesToPersonsCorr_Target();

	}

} //FamiliesToPersonsPackage
