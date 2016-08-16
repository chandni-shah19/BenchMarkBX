/**
 */
package FamiliesToPersons.Rules.util;

import FamiliesToPersons.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FamiliesToPersons.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseFatherToMale(FatherToMale object) {
			return createFatherToMaleAdapter();
		}

		@Override
		public Adapter caseExistingFamily2Person(ExistingFamily2Person object) {
			return createExistingFamily2PersonAdapter();
		}

		@Override
		public Adapter caseDaughterOfExistingFamilyToFemale(DaughterOfExistingFamilyToFemale object) {
			return createDaughterOfExistingFamilyToFemaleAdapter();
		}

		@Override
		public Adapter caseSonOfExistingFamilyToMale(SonOfExistingFamilyToMale object) {
			return createSonOfExistingFamilyToMaleAdapter();
		}

		@Override
		public Adapter caseMotherOfExistingFamilyToFemale(MotherOfExistingFamilyToFemale object) {
			return createMotherOfExistingFamilyToFemaleAdapter();
		}

		@Override
		public Adapter caseFamilyMember2Person(FamilyMember2Person object) {
			return createFamilyMember2PersonAdapter();
		}

		@Override
		public Adapter caseSonToMale(SonToMale object) {
			return createSonToMaleAdapter();
		}

		@Override
		public Adapter caseDaughterToFemale(DaughterToFemale object) {
			return createDaughterToFemaleAdapter();
		}

		@Override
		public Adapter caseMotherToFemale(MotherToFemale object) {
			return createMotherToFemaleAdapter();
		}

		@Override
		public Adapter caseFatherOfExistingFamilyToMale(FatherOfExistingFamilyToMale object) {
			return createFatherOfExistingFamilyToMaleAdapter();
		}

		@Override
		public Adapter caseFamilies2Persons(Families2Persons object) {
			return createFamilies2PersonsAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.FatherToMale <em>Father To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.FatherToMale
	 * @generated
	 */
	public Adapter createFatherToMaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.ExistingFamily2Person <em>Existing Family2 Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.ExistingFamily2Person
	 * @generated
	 */
	public Adapter createExistingFamily2PersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale <em>Daughter Of Existing Family To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale
	 * @generated
	 */
	public Adapter createDaughterOfExistingFamilyToFemaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale <em>Son Of Existing Family To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale
	 * @generated
	 */
	public Adapter createSonOfExistingFamilyToMaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale <em>Mother Of Existing Family To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale
	 * @generated
	 */
	public Adapter createMotherOfExistingFamilyToFemaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.FamilyMember2Person <em>Family Member2 Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.FamilyMember2Person
	 * @generated
	 */
	public Adapter createFamilyMember2PersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.SonToMale <em>Son To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.SonToMale
	 * @generated
	 */
	public Adapter createSonToMaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.DaughterToFemale <em>Daughter To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.DaughterToFemale
	 * @generated
	 */
	public Adapter createDaughterToFemaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.MotherToFemale <em>Mother To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.MotherToFemale
	 * @generated
	 */
	public Adapter createMotherToFemaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale <em>Father Of Existing Family To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale
	 * @generated
	 */
	public Adapter createFatherOfExistingFamilyToMaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FamiliesToPersons.Rules.Families2Persons <em>Families2 Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FamiliesToPersons.Rules.Families2Persons
	 * @generated
	 */
	public Adapter createFamilies2PersonsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RulesAdapterFactory
