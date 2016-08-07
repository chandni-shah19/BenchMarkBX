/**
 */
package FamiliesModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see FamiliesModel.FamiliesModelFactory
 * @model kind="package"
 * @generated
 */
public interface FamiliesModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FamiliesModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/FamiliesModel/model/FamiliesModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FamiliesModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamiliesModelPackage eINSTANCE = FamiliesModel.impl.FamiliesModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link FamiliesModel.impl.FamiliesImpl <em>Families</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesModel.impl.FamiliesImpl
	 * @see FamiliesModel.impl.FamiliesModelPackageImpl#getFamilies()
	 * @generated
	 */
	int FAMILIES = 0;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES__FAMILY = 0;

	/**
	 * The number of structural features of the '<em>Families</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Families</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FamiliesModel.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesModel.impl.FamilyImpl
	 * @see FamiliesModel.impl.FamiliesModelPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Father</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__FATHER = 0;

	/**
	 * The feature id for the '<em><b>Mother</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MOTHER = 1;

	/**
	 * The feature id for the '<em><b>Sons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__SONS = 2;

	/**
	 * The feature id for the '<em><b>Daughters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DAUGHTERS = 3;

	/**
	 * The feature id for the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__FAMILY_NAME = 4;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FamiliesModel.impl.FamilyMemberImpl <em>Family Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesModel.impl.FamilyMemberImpl
	 * @see FamiliesModel.impl.FamiliesModelPackageImpl#getFamilyMember()
	 * @generated
	 */
	int FAMILY_MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Family father</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__FAMILY_FATHER = 0;

	/**
	 * The feature id for the '<em><b>Family mother</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__FAMILY_MOTHER = 1;

	/**
	 * The feature id for the '<em><b>Family son</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__FAMILY_SON = 2;

	/**
	 * The feature id for the '<em><b>Family daughter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__FAMILY_DAUGHTER = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__FIRST_NAME = 4;

	/**
	 * The number of structural features of the '<em>Family Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Family Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link FamiliesModel.Families <em>Families</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Families</em>'.
	 * @see FamiliesModel.Families
	 * @generated
	 */
	EClass getFamilies();

	/**
	 * Returns the meta object for the containment reference list '{@link FamiliesModel.Families#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Family</em>'.
	 * @see FamiliesModel.Families#getFamily()
	 * @see #getFamilies()
	 * @generated
	 */
	EReference getFamilies_Family();

	/**
	 * Returns the meta object for class '{@link FamiliesModel.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see FamiliesModel.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference '{@link FamiliesModel.Family#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Father</em>'.
	 * @see FamiliesModel.Family#getFather()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Father();

	/**
	 * Returns the meta object for the containment reference '{@link FamiliesModel.Family#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mother</em>'.
	 * @see FamiliesModel.Family#getMother()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Mother();

	/**
	 * Returns the meta object for the containment reference list '{@link FamiliesModel.Family#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sons</em>'.
	 * @see FamiliesModel.Family#getSons()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Sons();

	/**
	 * Returns the meta object for the containment reference list '{@link FamiliesModel.Family#getDaughters <em>Daughters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daughters</em>'.
	 * @see FamiliesModel.Family#getDaughters()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Daughters();

	/**
	 * Returns the meta object for the attribute '{@link FamiliesModel.Family#getFamilyName <em>Family Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family Name</em>'.
	 * @see FamiliesModel.Family#getFamilyName()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_FamilyName();

	/**
	 * Returns the meta object for class '{@link FamiliesModel.FamilyMember <em>Family Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Member</em>'.
	 * @see FamiliesModel.FamilyMember
	 * @generated
	 */
	EClass getFamilyMember();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesModel.FamilyMember#getFamily_father <em>Family father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Family father</em>'.
	 * @see FamiliesModel.FamilyMember#getFamily_father()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_Family_father();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesModel.FamilyMember#getFamily_mother <em>Family mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Family mother</em>'.
	 * @see FamiliesModel.FamilyMember#getFamily_mother()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_Family_mother();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesModel.FamilyMember#getFamily_son <em>Family son</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Family son</em>'.
	 * @see FamiliesModel.FamilyMember#getFamily_son()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_Family_son();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesModel.FamilyMember#getFamily_daughter <em>Family daughter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Family daughter</em>'.
	 * @see FamiliesModel.FamilyMember#getFamily_daughter()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_Family_daughter();

	/**
	 * Returns the meta object for the attribute '{@link FamiliesModel.FamilyMember#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see FamiliesModel.FamilyMember#getFirstName()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EAttribute getFamilyMember_FirstName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamiliesModelFactory getFamiliesModelFactory();

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
		 * The meta object literal for the '{@link FamiliesModel.impl.FamiliesImpl <em>Families</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesModel.impl.FamiliesImpl
		 * @see FamiliesModel.impl.FamiliesModelPackageImpl#getFamilies()
		 * @generated
		 */
		EClass FAMILIES = eINSTANCE.getFamilies();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILIES__FAMILY = eINSTANCE.getFamilies_Family();

		/**
		 * The meta object literal for the '{@link FamiliesModel.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesModel.impl.FamilyImpl
		 * @see FamiliesModel.impl.FamiliesModelPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Father</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__FATHER = eINSTANCE.getFamily_Father();

		/**
		 * The meta object literal for the '<em><b>Mother</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MOTHER = eINSTANCE.getFamily_Mother();

		/**
		 * The meta object literal for the '<em><b>Sons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__SONS = eINSTANCE.getFamily_Sons();

		/**
		 * The meta object literal for the '<em><b>Daughters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__DAUGHTERS = eINSTANCE.getFamily_Daughters();

		/**
		 * The meta object literal for the '<em><b>Family Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__FAMILY_NAME = eINSTANCE.getFamily_FamilyName();

		/**
		 * The meta object literal for the '{@link FamiliesModel.impl.FamilyMemberImpl <em>Family Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesModel.impl.FamilyMemberImpl
		 * @see FamiliesModel.impl.FamiliesModelPackageImpl#getFamilyMember()
		 * @generated
		 */
		EClass FAMILY_MEMBER = eINSTANCE.getFamilyMember();

		/**
		 * The meta object literal for the '<em><b>Family father</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__FAMILY_FATHER = eINSTANCE.getFamilyMember_Family_father();

		/**
		 * The meta object literal for the '<em><b>Family mother</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__FAMILY_MOTHER = eINSTANCE.getFamilyMember_Family_mother();

		/**
		 * The meta object literal for the '<em><b>Family son</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__FAMILY_SON = eINSTANCE.getFamilyMember_Family_son();

		/**
		 * The meta object literal for the '<em><b>Family daughter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__FAMILY_DAUGHTER = eINSTANCE.getFamilyMember_Family_daughter();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY_MEMBER__FIRST_NAME = eINSTANCE.getFamilyMember_FirstName();

	}

} //FamiliesModelPackage
