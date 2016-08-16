/**
 */
package FamiliesModel.impl;

import FamiliesModel.FamiliesModelPackage;
import FamiliesModel.Family;
import FamiliesModel.FamilyMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FamiliesModel.impl.FamilyMemberImpl#getFamily_father <em>Family father</em>}</li>
 *   <li>{@link FamiliesModel.impl.FamilyMemberImpl#getFamily_mother <em>Family mother</em>}</li>
 *   <li>{@link FamiliesModel.impl.FamilyMemberImpl#getFamily_son <em>Family son</em>}</li>
 *   <li>{@link FamiliesModel.impl.FamilyMemberImpl#getFamily_daughter <em>Family daughter</em>}</li>
 *   <li>{@link FamiliesModel.impl.FamilyMemberImpl#getFirstName <em>First Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyMemberImpl extends EObjectImpl implements FamilyMember {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamiliesModelPackage.Literals.FAMILY_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getFamily_father() {
		if (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER)
			return null;
		return (Family) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily_father(Family newFamily_father, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFamily_father, FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily_father(Family newFamily_father) {
		if (newFamily_father != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER
						&& newFamily_father != null)) {
			if (EcoreUtil.isAncestor(this, newFamily_father))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFamily_father != null)
				msgs = ((InternalEObject) newFamily_father).eInverseAdd(this, FamiliesModelPackage.FAMILY__FATHER,
						Family.class, msgs);
			msgs = basicSetFamily_father(newFamily_father, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER,
					newFamily_father, newFamily_father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getFamily_mother() {
		if (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER)
			return null;
		return (Family) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily_mother(Family newFamily_mother, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFamily_mother, FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily_mother(Family newFamily_mother) {
		if (newFamily_mother != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER
						&& newFamily_mother != null)) {
			if (EcoreUtil.isAncestor(this, newFamily_mother))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFamily_mother != null)
				msgs = ((InternalEObject) newFamily_mother).eInverseAdd(this, FamiliesModelPackage.FAMILY__MOTHER,
						Family.class, msgs);
			msgs = basicSetFamily_mother(newFamily_mother, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER,
					newFamily_mother, newFamily_mother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getFamily_son() {
		if (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON)
			return null;
		return (Family) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily_son(Family newFamily_son, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFamily_son, FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily_son(Family newFamily_son) {
		if (newFamily_son != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON && newFamily_son != null)) {
			if (EcoreUtil.isAncestor(this, newFamily_son))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFamily_son != null)
				msgs = ((InternalEObject) newFamily_son).eInverseAdd(this, FamiliesModelPackage.FAMILY__SONS,
						Family.class, msgs);
			msgs = basicSetFamily_son(newFamily_son, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON,
					newFamily_son, newFamily_son));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getFamily_daughter() {
		if (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER)
			return null;
		return (Family) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily_daughter(Family newFamily_daughter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFamily_daughter,
				FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily_daughter(Family newFamily_daughter) {
		if (newFamily_daughter != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER
						&& newFamily_daughter != null)) {
			if (EcoreUtil.isAncestor(this, newFamily_daughter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFamily_daughter != null)
				msgs = ((InternalEObject) newFamily_daughter).eInverseAdd(this, FamiliesModelPackage.FAMILY__DAUGHTERS,
						Family.class, msgs);
			msgs = basicSetFamily_daughter(newFamily_daughter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER,
					newFamily_daughter, newFamily_daughter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesModelPackage.FAMILY_MEMBER__FIRST_NAME,
					oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFamily_father((Family) otherEnd, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFamily_mother((Family) otherEnd, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFamily_son((Family) otherEnd, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFamily_daughter((Family) otherEnd, msgs);
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
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER:
			return basicSetFamily_father(null, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER:
			return basicSetFamily_mother(null, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON:
			return basicSetFamily_son(null, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER:
			return basicSetFamily_daughter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER:
			return eInternalContainer().eInverseRemove(this, FamiliesModelPackage.FAMILY__FATHER, Family.class, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER:
			return eInternalContainer().eInverseRemove(this, FamiliesModelPackage.FAMILY__MOTHER, Family.class, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON:
			return eInternalContainer().eInverseRemove(this, FamiliesModelPackage.FAMILY__SONS, Family.class, msgs);
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER:
			return eInternalContainer().eInverseRemove(this, FamiliesModelPackage.FAMILY__DAUGHTERS, Family.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER:
			return getFamily_father();
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER:
			return getFamily_mother();
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON:
			return getFamily_son();
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER:
			return getFamily_daughter();
		case FamiliesModelPackage.FAMILY_MEMBER__FIRST_NAME:
			return getFirstName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER:
			setFamily_father((Family) newValue);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER:
			setFamily_mother((Family) newValue);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON:
			setFamily_son((Family) newValue);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER:
			setFamily_daughter((Family) newValue);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FIRST_NAME:
			setFirstName((String) newValue);
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
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER:
			setFamily_father((Family) null);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER:
			setFamily_mother((Family) null);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON:
			setFamily_son((Family) null);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER:
			setFamily_daughter((Family) null);
			return;
		case FamiliesModelPackage.FAMILY_MEMBER__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
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
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_FATHER:
			return getFamily_father() != null;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_MOTHER:
			return getFamily_mother() != null;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_SON:
			return getFamily_son() != null;
		case FamiliesModelPackage.FAMILY_MEMBER__FAMILY_DAUGHTER:
			return getFamily_daughter() != null;
		case FamiliesModelPackage.FAMILY_MEMBER__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FamilyMemberImpl
