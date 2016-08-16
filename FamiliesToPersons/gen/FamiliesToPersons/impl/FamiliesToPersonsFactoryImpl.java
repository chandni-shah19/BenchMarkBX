/**
 */
package FamiliesToPersons.impl;

import FamiliesToPersons.*;

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
public class FamiliesToPersonsFactoryImpl extends EFactoryImpl implements FamiliesToPersonsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamiliesToPersonsFactory init() {
		try {
			FamiliesToPersonsFactory theFamiliesToPersonsFactory = (FamiliesToPersonsFactory) EPackage.Registry.INSTANCE
					.getEFactory(FamiliesToPersonsPackage.eNS_URI);
			if (theFamiliesToPersonsFactory != null) {
				return theFamiliesToPersonsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FamiliesToPersonsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesToPersonsFactoryImpl() {
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
		case FamiliesToPersonsPackage.FAMILY_MEMBER_TO_PERSON:
			return createFamilyMemberToPerson();
		case FamiliesToPersonsPackage.FAMILIES_TO_PERSONS_CORR:
			return createFamiliesToPersonsCorr();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberToPerson createFamilyMemberToPerson() {
		FamilyMemberToPersonImpl familyMemberToPerson = new FamilyMemberToPersonImpl();
		return familyMemberToPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesToPersonsCorr createFamiliesToPersonsCorr() {
		FamiliesToPersonsCorrImpl familiesToPersonsCorr = new FamiliesToPersonsCorrImpl();
		return familiesToPersonsCorr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesToPersonsPackage getFamiliesToPersonsPackage() {
		return (FamiliesToPersonsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FamiliesToPersonsPackage getPackage() {
		return FamiliesToPersonsPackage.eINSTANCE;
	}

} //FamiliesToPersonsFactoryImpl
