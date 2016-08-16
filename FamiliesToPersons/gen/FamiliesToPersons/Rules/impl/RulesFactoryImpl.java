/**
 */
package FamiliesToPersons.Rules.impl;

import FamiliesToPersons.Rules.*;

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
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.FAMILY_MEMBER2_PERSON:
			return createFamilyMember2Person();
		case RulesPackage.MOTHER_TO_FEMALE:
			return createMotherToFemale();
		case RulesPackage.FAMILIES2_PERSONS:
			return createFamilies2Persons();
		case RulesPackage.DAUGHTER_TO_FEMALE:
			return createDaughterToFemale();
		case RulesPackage.SON_OF_EXISTING_FAMILY_TO_MALE:
			return createSonOfExistingFamilyToMale();
		case RulesPackage.DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE:
			return createDaughterOfExistingFamilyToFemale();
		case RulesPackage.EXISTING_FAMILY2_PERSON:
			return createExistingFamily2Person();
		case RulesPackage.FATHER_OF_EXISTING_FAMILY_TO_MALE:
			return createFatherOfExistingFamilyToMale();
		case RulesPackage.FATHER_TO_MALE:
			return createFatherToMale();
		case RulesPackage.MOTHER_OF_EXISTING_FAMILY_TO_FEMALE:
			return createMotherOfExistingFamilyToFemale();
		case RulesPackage.SON_TO_MALE:
			return createSonToMale();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember2Person createFamilyMember2Person() {
		FamilyMember2PersonImpl familyMember2Person = new FamilyMember2PersonImpl();
		return familyMember2Person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotherToFemale createMotherToFemale() {
		MotherToFemaleImpl motherToFemale = new MotherToFemaleImpl();
		return motherToFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Families2Persons createFamilies2Persons() {
		Families2PersonsImpl families2Persons = new Families2PersonsImpl();
		return families2Persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaughterToFemale createDaughterToFemale() {
		DaughterToFemaleImpl daughterToFemale = new DaughterToFemaleImpl();
		return daughterToFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SonOfExistingFamilyToMale createSonOfExistingFamilyToMale() {
		SonOfExistingFamilyToMaleImpl sonOfExistingFamilyToMale = new SonOfExistingFamilyToMaleImpl();
		return sonOfExistingFamilyToMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaughterOfExistingFamilyToFemale createDaughterOfExistingFamilyToFemale() {
		DaughterOfExistingFamilyToFemaleImpl daughterOfExistingFamilyToFemale = new DaughterOfExistingFamilyToFemaleImpl();
		return daughterOfExistingFamilyToFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingFamily2Person createExistingFamily2Person() {
		ExistingFamily2PersonImpl existingFamily2Person = new ExistingFamily2PersonImpl();
		return existingFamily2Person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FatherOfExistingFamilyToMale createFatherOfExistingFamilyToMale() {
		FatherOfExistingFamilyToMaleImpl fatherOfExistingFamilyToMale = new FatherOfExistingFamilyToMaleImpl();
		return fatherOfExistingFamilyToMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FatherToMale createFatherToMale() {
		FatherToMaleImpl fatherToMale = new FatherToMaleImpl();
		return fatherToMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotherOfExistingFamilyToFemale createMotherOfExistingFamilyToFemale() {
		MotherOfExistingFamilyToFemaleImpl motherOfExistingFamilyToFemale = new MotherOfExistingFamilyToFemaleImpl();
		return motherOfExistingFamilyToFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SonToMale createSonToMale() {
		SonToMaleImpl sonToMale = new SonToMaleImpl();
		return sonToMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
