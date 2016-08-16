/**
 */
package PersonsModel;

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
 * @see PersonsModel.PersonsModelFactory
 * @model kind="package"
 * @generated
 */
public interface PersonsModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PersonsModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/PersonsModel/model/PersonsModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PersonsModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersonsModelPackage eINSTANCE = PersonsModel.impl.PersonsModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link PersonsModel.impl.PersonsImpl <em>Persons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PersonsModel.impl.PersonsImpl
	 * @see PersonsModel.impl.PersonsModelPackageImpl#getPersons()
	 * @generated
	 */
	int PERSONS = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__PERSON = 0;

	/**
	 * The number of structural features of the '<em>Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PersonsModel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PersonsModel.impl.PersonImpl
	 * @see PersonsModel.impl.PersonsModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTHDAY = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PersonsModel.impl.MaleImpl <em>Male</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PersonsModel.impl.MaleImpl
	 * @see PersonsModel.impl.PersonsModelPackageImpl#getMale()
	 * @generated
	 */
	int MALE = 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE__FULL_NAME = PERSON__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE__BIRTHDAY = PERSON__BIRTHDAY;

	/**
	 * The number of structural features of the '<em>Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PersonsModel.impl.FemaleImpl <em>Female</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PersonsModel.impl.FemaleImpl
	 * @see PersonsModel.impl.PersonsModelPackageImpl#getFemale()
	 * @generated
	 */
	int FEMALE = 3;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE__FULL_NAME = PERSON__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE__BIRTHDAY = PERSON__BIRTHDAY;

	/**
	 * The number of structural features of the '<em>Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link PersonsModel.Persons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persons</em>'.
	 * @see PersonsModel.Persons
	 * @generated
	 */
	EClass getPersons();

	/**
	 * Returns the meta object for the containment reference list '{@link PersonsModel.Persons#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see PersonsModel.Persons#getPerson()
	 * @see #getPersons()
	 * @generated
	 */
	EReference getPersons_Person();

	/**
	 * Returns the meta object for class '{@link PersonsModel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see PersonsModel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link PersonsModel.Person#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see PersonsModel.Person#getFullName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FullName();

	/**
	 * Returns the meta object for the attribute '{@link PersonsModel.Person#getBirthday <em>Birthday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthday</em>'.
	 * @see PersonsModel.Person#getBirthday()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Birthday();

	/**
	 * Returns the meta object for class '{@link PersonsModel.Male <em>Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Male</em>'.
	 * @see PersonsModel.Male
	 * @generated
	 */
	EClass getMale();

	/**
	 * Returns the meta object for class '{@link PersonsModel.Female <em>Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Female</em>'.
	 * @see PersonsModel.Female
	 * @generated
	 */
	EClass getFemale();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersonsModelFactory getPersonsModelFactory();

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
		 * The meta object literal for the '{@link PersonsModel.impl.PersonsImpl <em>Persons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PersonsModel.impl.PersonsImpl
		 * @see PersonsModel.impl.PersonsModelPackageImpl#getPersons()
		 * @generated
		 */
		EClass PERSONS = eINSTANCE.getPersons();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONS__PERSON = eINSTANCE.getPersons_Person();

		/**
		 * The meta object literal for the '{@link PersonsModel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PersonsModel.impl.PersonImpl
		 * @see PersonsModel.impl.PersonsModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULL_NAME = eINSTANCE.getPerson_FullName();

		/**
		 * The meta object literal for the '<em><b>Birthday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTHDAY = eINSTANCE.getPerson_Birthday();

		/**
		 * The meta object literal for the '{@link PersonsModel.impl.MaleImpl <em>Male</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PersonsModel.impl.MaleImpl
		 * @see PersonsModel.impl.PersonsModelPackageImpl#getMale()
		 * @generated
		 */
		EClass MALE = eINSTANCE.getMale();

		/**
		 * The meta object literal for the '{@link PersonsModel.impl.FemaleImpl <em>Female</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PersonsModel.impl.FemaleImpl
		 * @see PersonsModel.impl.PersonsModelPackageImpl#getFemale()
		 * @generated
		 */
		EClass FEMALE = eINSTANCE.getFemale();

	}

} //PersonsModelPackage
