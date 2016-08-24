/**
 */
package Families.impl;

import Families.FamiliesPackage;
import Families.Family;
import Families.FamilyMember;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Families.impl.FamilyImpl#getFather <em>Father</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getSons <em>Sons</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getDaughters <em>Daughters</em>}</li>
 *   <li>{@link Families.impl.FamilyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyImpl extends EObjectImpl implements Family {
	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected FamilyMember father;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected FamilyMember mother;

	/**
	 * The cached value of the '{@link #getSons() <em>Sons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSons()
	 * @generated
	 * @ordered
	 */
	protected EList<FamilyMember> sons;

	/**
	 * The cached value of the '{@link #getDaughters() <em>Daughters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaughters()
	 * @generated
	 * @ordered
	 */
	protected EList<FamilyMember> daughters;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamiliesPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember getFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFather(FamilyMember newFather, NotificationChain msgs) {
		FamilyMember oldFather = father;
		father = newFather;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FamiliesPackage.FAMILY__FATHER, oldFather, newFather);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(FamilyMember newFather) {
		if (newFather != father) {
			NotificationChain msgs = null;
			if (father != null)
				msgs = ((InternalEObject) father).eInverseRemove(this, FamiliesPackage.FAMILY_MEMBER__FAMILY_FATHER,
						FamilyMember.class, msgs);
			if (newFather != null)
				msgs = ((InternalEObject) newFather).eInverseAdd(this, FamiliesPackage.FAMILY_MEMBER__FAMILY_FATHER,
						FamilyMember.class, msgs);
			msgs = basicSetFather(newFather, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__FATHER, newFather,
					newFather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember getMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMother(FamilyMember newMother, NotificationChain msgs) {
		FamilyMember oldMother = mother;
		mother = newMother;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FamiliesPackage.FAMILY__MOTHER, oldMother, newMother);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(FamilyMember newMother) {
		if (newMother != mother) {
			NotificationChain msgs = null;
			if (mother != null)
				msgs = ((InternalEObject) mother).eInverseRemove(this, FamiliesPackage.FAMILY_MEMBER__FAMILY_MOTHER,
						FamilyMember.class, msgs);
			if (newMother != null)
				msgs = ((InternalEObject) newMother).eInverseAdd(this, FamiliesPackage.FAMILY_MEMBER__FAMILY_MOTHER,
						FamilyMember.class, msgs);
			msgs = basicSetMother(newMother, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__MOTHER, newMother,
					newMother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyMember> getSons() {
		if (sons == null) {
			sons = new EObjectContainmentWithInverseEList<FamilyMember>(FamilyMember.class, this,
					FamiliesPackage.FAMILY__SONS, FamiliesPackage.FAMILY_MEMBER__FAMILY_SON);
		}
		return sons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyMember> getDaughters() {
		if (daughters == null) {
			daughters = new EObjectContainmentWithInverseEList<FamilyMember>(FamilyMember.class, this,
					FamiliesPackage.FAMILY__DAUGHTERS, FamiliesPackage.FAMILY_MEMBER__FAMILY_DAUGHTER);
		}
		return daughters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesPackage.FAMILY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FamiliesPackage.FAMILY__FATHER:
			if (father != null)
				msgs = ((InternalEObject) father).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FamiliesPackage.FAMILY__FATHER, null, msgs);
			return basicSetFather((FamilyMember) otherEnd, msgs);
		case FamiliesPackage.FAMILY__MOTHER:
			if (mother != null)
				msgs = ((InternalEObject) mother).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FamiliesPackage.FAMILY__MOTHER, null, msgs);
			return basicSetMother((FamilyMember) otherEnd, msgs);
		case FamiliesPackage.FAMILY__SONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSons()).basicAdd(otherEnd, msgs);
		case FamiliesPackage.FAMILY__DAUGHTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDaughters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FamiliesPackage.FAMILY__FATHER:
			return basicSetFather(null, msgs);
		case FamiliesPackage.FAMILY__MOTHER:
			return basicSetMother(null, msgs);
		case FamiliesPackage.FAMILY__SONS:
			return ((InternalEList<?>) getSons()).basicRemove(otherEnd, msgs);
		case FamiliesPackage.FAMILY__DAUGHTERS:
			return ((InternalEList<?>) getDaughters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FamiliesPackage.FAMILY__FATHER:
			return getFather();
		case FamiliesPackage.FAMILY__MOTHER:
			return getMother();
		case FamiliesPackage.FAMILY__SONS:
			return getSons();
		case FamiliesPackage.FAMILY__DAUGHTERS:
			return getDaughters();
		case FamiliesPackage.FAMILY__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FamiliesPackage.FAMILY__FATHER:
			setFather((FamilyMember) newValue);
			return;
		case FamiliesPackage.FAMILY__MOTHER:
			setMother((FamilyMember) newValue);
			return;
		case FamiliesPackage.FAMILY__SONS:
			getSons().clear();
			getSons().addAll((Collection<? extends FamilyMember>) newValue);
			return;
		case FamiliesPackage.FAMILY__DAUGHTERS:
			getDaughters().clear();
			getDaughters().addAll((Collection<? extends FamilyMember>) newValue);
			return;
		case FamiliesPackage.FAMILY__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FamiliesPackage.FAMILY__FATHER:
			setFather((FamilyMember) null);
			return;
		case FamiliesPackage.FAMILY__MOTHER:
			setMother((FamilyMember) null);
			return;
		case FamiliesPackage.FAMILY__SONS:
			getSons().clear();
			return;
		case FamiliesPackage.FAMILY__DAUGHTERS:
			getDaughters().clear();
			return;
		case FamiliesPackage.FAMILY__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FamiliesPackage.FAMILY__FATHER:
			return father != null;
		case FamiliesPackage.FAMILY__MOTHER:
			return mother != null;
		case FamiliesPackage.FAMILY__SONS:
			return sons != null && !sons.isEmpty();
		case FamiliesPackage.FAMILY__DAUGHTERS:
			return daughters != null && !daughters.isEmpty();
		case FamiliesPackage.FAMILY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FamilyImpl
