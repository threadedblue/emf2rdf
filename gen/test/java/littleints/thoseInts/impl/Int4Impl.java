/**
 */
package littleints.thoseInts.impl;

import federatecore.HLAInteraction;

import littleints.thoseInts.Int4;
import littleints.thoseInts.ThoseIntsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link littleints.thoseInts.impl.Int4Impl#isBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link littleints.thoseInts.impl.Int4Impl#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link littleints.thoseInts.impl.Int4Impl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link littleints.thoseInts.impl.Int4Impl#getHlaType <em>Hla Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Int4Impl extends MinimalEObjectImpl.Container implements Int4 {
	/**
	 * The default value of the '{@link #isBoolVal() <em>Bool Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOL_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolVal() <em>Bool Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolVal()
	 * @generated
	 * @ordered
	 */
	protected boolean boolVal = BOOL_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntVal()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntVal()
	 * @generated
	 * @ordered
	 */
	protected int intVal = INT_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrVal() <em>Str Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrVal()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrVal() <em>Str Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrVal()
	 * @generated
	 * @ordered
	 */
	protected String strVal = STR_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHlaType() <em>Hla Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHlaType()
	 * @generated
	 * @ordered
	 */
	protected HLAInteraction hlaType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Int4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThoseIntsPackage.Literals.INT4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolVal() {
		return boolVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolVal(boolean newBoolVal) {
		boolean oldBoolVal = boolVal;
		boolVal = newBoolVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.INT4__BOOL_VAL, oldBoolVal, boolVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntVal() {
		return intVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntVal(int newIntVal) {
		int oldIntVal = intVal;
		intVal = newIntVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.INT4__INT_VAL, oldIntVal, intVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrVal() {
		return strVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrVal(String newStrVal) {
		String oldStrVal = strVal;
		strVal = newStrVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.INT4__STR_VAL, oldStrVal, strVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLAInteraction getHlaType() {
		if (hlaType != null && hlaType.eIsProxy()) {
			InternalEObject oldHlaType = (InternalEObject)hlaType;
			hlaType = (HLAInteraction)eResolveProxy(oldHlaType);
			if (hlaType != oldHlaType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThoseIntsPackage.INT4__HLA_TYPE, oldHlaType, hlaType));
			}
		}
		return hlaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLAInteraction basicGetHlaType() {
		return hlaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHlaType(HLAInteraction newHlaType) {
		HLAInteraction oldHlaType = hlaType;
		hlaType = newHlaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.INT4__HLA_TYPE, oldHlaType, hlaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThoseIntsPackage.INT4__BOOL_VAL:
				return isBoolVal();
			case ThoseIntsPackage.INT4__INT_VAL:
				return getIntVal();
			case ThoseIntsPackage.INT4__STR_VAL:
				return getStrVal();
			case ThoseIntsPackage.INT4__HLA_TYPE:
				if (resolve) return getHlaType();
				return basicGetHlaType();
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
			case ThoseIntsPackage.INT4__BOOL_VAL:
				setBoolVal((Boolean)newValue);
				return;
			case ThoseIntsPackage.INT4__INT_VAL:
				setIntVal((Integer)newValue);
				return;
			case ThoseIntsPackage.INT4__STR_VAL:
				setStrVal((String)newValue);
				return;
			case ThoseIntsPackage.INT4__HLA_TYPE:
				setHlaType((HLAInteraction)newValue);
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
			case ThoseIntsPackage.INT4__BOOL_VAL:
				setBoolVal(BOOL_VAL_EDEFAULT);
				return;
			case ThoseIntsPackage.INT4__INT_VAL:
				setIntVal(INT_VAL_EDEFAULT);
				return;
			case ThoseIntsPackage.INT4__STR_VAL:
				setStrVal(STR_VAL_EDEFAULT);
				return;
			case ThoseIntsPackage.INT4__HLA_TYPE:
				setHlaType((HLAInteraction)null);
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
			case ThoseIntsPackage.INT4__BOOL_VAL:
				return boolVal != BOOL_VAL_EDEFAULT;
			case ThoseIntsPackage.INT4__INT_VAL:
				return intVal != INT_VAL_EDEFAULT;
			case ThoseIntsPackage.INT4__STR_VAL:
				return STR_VAL_EDEFAULT == null ? strVal != null : !STR_VAL_EDEFAULT.equals(strVal);
			case ThoseIntsPackage.INT4__HLA_TYPE:
				return hlaType != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (boolVal: ");
		result.append(boolVal);
		result.append(", intVal: ");
		result.append(intVal);
		result.append(", strVal: ");
		result.append(strVal);
		result.append(')');
		return result.toString();
	}

} //Int4Impl
