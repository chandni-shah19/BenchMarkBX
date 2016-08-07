/**
 */
package PersonsModel.impl;

import PersonsModel.*;

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
public class PersonsModelFactoryImpl extends EFactoryImpl implements PersonsModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersonsModelFactory init() {
		try {
			PersonsModelFactory thePersonsModelFactory = (PersonsModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(PersonsModelPackage.eNS_URI);
			if (thePersonsModelFactory != null) {
				return thePersonsModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersonsModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonsModelFactoryImpl() {
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
		case PersonsModelPackage.PERSONS:
			return createPersons();
		case PersonsModelPackage.MALE:
			return createMale();
		case PersonsModelPackage.FEMALE:
			return createFemale();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persons createPersons() {
		PersonsImpl persons = new PersonsImpl();
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Male createMale() {
		MaleImpl male = new MaleImpl();
		return male;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Female createFemale() {
		FemaleImpl female = new FemaleImpl();
		return female;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonsModelPackage getPersonsModelPackage() {
		return (PersonsModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersonsModelPackage getPackage() {
		return PersonsModelPackage.eINSTANCE;
	}

} //PersonsModelFactoryImpl
