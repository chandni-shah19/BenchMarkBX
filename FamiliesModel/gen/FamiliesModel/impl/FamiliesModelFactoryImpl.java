/**
 */
package FamiliesModel.impl;

import FamiliesModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamiliesModelFactoryImpl extends EFactoryImpl implements FamiliesModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamiliesModelFactory init() {
		try {
			FamiliesModelFactory theFamiliesModelFactory = (FamiliesModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(FamiliesModelPackage.eNS_URI);
			if (theFamiliesModelFactory != null) {
				return theFamiliesModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FamiliesModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FamiliesModelPackage.FAMILIES:
			return createFamilies();
		case FamiliesModelPackage.FAMILY:
			return createFamily();
		case FamiliesModelPackage.FAMILY_MEMBER:
			return createFamilyMember();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Families createFamilies() {
		FamiliesImpl families = new FamiliesImpl();
		return families;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember createFamilyMember() {
		FamilyMemberImpl familyMember = new FamilyMemberImpl();
		return familyMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesModelPackage getFamiliesModelPackage() {
		return (FamiliesModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FamiliesModelPackage getPackage() {
		return FamiliesModelPackage.eINSTANCE;
	}

} //FamiliesModelFactoryImpl
