/**
 */
package PersonsModel.impl;

import PersonsModel.Person;
import PersonsModel.PersonsModelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PersonsModel.impl.PersonImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link PersonsModel.impl.PersonImpl#getBirthday <em>Birthday</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected Date birthday = BIRTHDAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonsModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonsModelPackage.PERSON__FULL_NAME, oldFullName,
					fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthday(Date newBirthday) {
		Date oldBirthday = birthday;
		birthday = newBirthday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonsModelPackage.PERSON__BIRTHDAY, oldBirthday,
					birthday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PersonsModelPackage.PERSON__FULL_NAME:
			return getFullName();
		case PersonsModelPackage.PERSON__BIRTHDAY:
			return getBirthday();
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
		case PersonsModelPackage.PERSON__FULL_NAME:
			setFullName((String) newValue);
			return;
		case PersonsModelPackage.PERSON__BIRTHDAY:
			setBirthday((Date) newValue);
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
		case PersonsModelPackage.PERSON__FULL_NAME:
			setFullName(FULL_NAME_EDEFAULT);
			return;
		case PersonsModelPackage.PERSON__BIRTHDAY:
			setBirthday(BIRTHDAY_EDEFAULT);
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
		case PersonsModelPackage.PERSON__FULL_NAME:
			return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
		case PersonsModelPackage.PERSON__BIRTHDAY:
			return BIRTHDAY_EDEFAULT == null ? birthday != null : !BIRTHDAY_EDEFAULT.equals(birthday);
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
		result.append(" (fullName: ");
		result.append(fullName);
		result.append(", birthday: ");
		result.append(birthday);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PersonImpl
