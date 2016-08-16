/**
 */
package FamiliesModel.impl;

import FamiliesModel.Families;
import FamiliesModel.FamiliesModelFactory;
import FamiliesModel.FamiliesModelPackage;
import FamiliesModel.Family;
import FamiliesModel.FamilyMember;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamiliesModelPackageImpl extends EPackageImpl implements FamiliesModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FamiliesModel.FamiliesModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FamiliesModelPackageImpl() {
		super(eNS_URI, FamiliesModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FamiliesModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FamiliesModelPackage init() {
		if (isInited)
			return (FamiliesModelPackage) EPackage.Registry.INSTANCE.getEPackage(FamiliesModelPackage.eNS_URI);

		// Obtain or create and register package
		FamiliesModelPackageImpl theFamiliesModelPackage = (FamiliesModelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FamiliesModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new FamiliesModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFamiliesModelPackage.createPackageContents();

		// Initialize created meta-data
		theFamiliesModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFamiliesModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FamiliesModelPackage.eNS_URI, theFamiliesModelPackage);
		return theFamiliesModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilies() {
		return familiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilies_Family() {
		return (EReference) familiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Father() {
		return (EReference) familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Mother() {
		return (EReference) familyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Sons() {
		return (EReference) familyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Daughters() {
		return (EReference) familyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamily_FamilyName() {
		return (EAttribute) familyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMember() {
		return familyMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_Family_father() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_Family_mother() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_Family_son() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_Family_daughter() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamilyMember_FirstName() {
		return (EAttribute) familyMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesModelFactory getFamiliesModelFactory() {
		return (FamiliesModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		familiesEClass = createEClass(FAMILIES);
		createEReference(familiesEClass, FAMILIES__FAMILY);

		familyEClass = createEClass(FAMILY);
		createEReference(familyEClass, FAMILY__FATHER);
		createEReference(familyEClass, FAMILY__MOTHER);
		createEReference(familyEClass, FAMILY__SONS);
		createEReference(familyEClass, FAMILY__DAUGHTERS);
		createEAttribute(familyEClass, FAMILY__FAMILY_NAME);

		familyMemberEClass = createEClass(FAMILY_MEMBER);
		createEReference(familyMemberEClass, FAMILY_MEMBER__FAMILY_FATHER);
		createEReference(familyMemberEClass, FAMILY_MEMBER__FAMILY_MOTHER);
		createEReference(familyMemberEClass, FAMILY_MEMBER__FAMILY_SON);
		createEReference(familyMemberEClass, FAMILY_MEMBER__FAMILY_DAUGHTER);
		createEAttribute(familyMemberEClass, FAMILY_MEMBER__FIRST_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(familiesEClass, Families.class, "Families", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamilies_Family(), this.getFamily(), null, "family", null, 0, -1, Families.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamily_Father(), this.getFamilyMember(), this.getFamilyMember_Family_father(), "father", null,
				0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Mother(), this.getFamilyMember(), this.getFamilyMember_Family_mother(), "mother", null,
				0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Sons(), this.getFamilyMember(), this.getFamilyMember_Family_son(), "sons", null, 0, -1,
				Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Daughters(), this.getFamilyMember(), this.getFamilyMember_Family_daughter(),
				"daughters", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFamily_FamilyName(), ecorePackage.getEString(), "familyName", null, 0, 1, Family.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familyMemberEClass, FamilyMember.class, "FamilyMember", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamilyMember_Family_father(), this.getFamily(), this.getFamily_Father(), "family_father",
				null, 0, 1, FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyMember_Family_mother(), this.getFamily(), this.getFamily_Mother(), "family_mother",
				null, 0, 1, FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyMember_Family_son(), this.getFamily(), this.getFamily_Sons(), "family_son", null, 0, 1,
				FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyMember_Family_daughter(), this.getFamily(), this.getFamily_Daughters(),
				"family_daughter", null, 0, 1, FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFamilyMember_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1,
				FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FamiliesModelPackageImpl
