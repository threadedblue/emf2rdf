/**
 */
package littleints.thoseInts.impl;

import federatecore.HLAObject;

import littleints.thoseInts.Obj4;
import littleints.thoseInts.ThoseIntsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obj4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link littleints.thoseInts.impl.Obj4Impl#isBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link littleints.thoseInts.impl.Obj4Impl#getDoubVal <em>Doub Val</em>}</li>
 *   <li>{@link littleints.thoseInts.impl.Obj4Impl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link littleints.thoseInts.impl.Obj4Impl#getHlaType <em>Hla Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Obj4Impl extends MinimalEObjectImpl.Container implements Obj4 {
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
	 * The default value of the '{@link #getDoubVal() <em>Doub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubVal()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUB_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDoubVal() <em>Doub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubVal()
	 * @generated
	 * @ordered
	 */
	protected double doubVal = DOUB_VAL_EDEFAULT;

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
	protected HLAObject hlaType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Obj4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThoseIntsPackage.Literals.OBJ4;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.OBJ4__BOOL_VAL, oldBoolVal, boolVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDoubVal() {
		return doubVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubVal(double newDoubVal) {
		double oldDoubVal = doubVal;
		doubVal = newDoubVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.OBJ4__DOUB_VAL, oldDoubVal, doubVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.OBJ4__STR_VAL, oldStrVal, strVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLAObject getHlaType() {
		if (hlaType != null && hlaType.eIsProxy()) {
			InternalEObject oldHlaType = (InternalEObject)hlaType;
			hlaType = (HLAObject)eResolveProxy(oldHlaType);
			if (hlaType != oldHlaType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThoseIntsPackage.OBJ4__HLA_TYPE, oldHlaType, hlaType));
			}
		}
		return hlaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLAObject basicGetHlaType() {
		return hlaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHlaType(HLAObject newHlaType) {
		HLAObject oldHlaType = hlaType;
		hlaType = newHlaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThoseIntsPackage.OBJ4__HLA_TYPE, oldHlaType, hlaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThoseIntsPackage.OBJ4__BOOL_VAL:
				return isBoolVal();
			case ThoseIntsPackage.OBJ4__DOUB_VAL:
				return getDoubVal();
			case ThoseIntsPackage.OBJ4__STR_VAL:
				return getStrVal();
			case ThoseIntsPackage.OBJ4__HLA_TYPE:
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
			case ThoseIntsPackage.OBJ4__BOOL_VAL:
				setBoolVal((Boolean)newValue);
				return;
			case ThoseIntsPackage.OBJ4__DOUB_VAL:
				setDoubVal((Double)newValue);
				return;
			case ThoseIntsPackage.OBJ4__STR_VAL:
				setStrVal((String)newValue);
				return;
			case ThoseIntsPackage.OBJ4__HLA_TYPE:
				setHlaType((HLAObject)newValue);
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
			case ThoseIntsPackage.OBJ4__BOOL_VAL:
				setBoolVal(BOOL_VAL_EDEFAULT);
				return;
			case ThoseIntsPackage.OBJ4__DOUB_VAL:
				setDoubVal(DOUB_VAL_EDEFAULT);
				return;
			case ThoseIntsPackage.OBJ4__STR_VAL:
				setStrVal(STR_VAL_EDEFAULT);
				return;
			case ThoseIntsPackage.OBJ4__HLA_TYPE:
				setHlaType((HLAObject)null);
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
			case ThoseIntsPackage.OBJ4__BOOL_VAL:
				return boolVal != BOOL_VAL_EDEFAULT;
			case ThoseIntsPackage.OBJ4__DOUB_VAL:
				return doubVal != DOUB_VAL_EDEFAULT;
			case ThoseIntsPackage.OBJ4__STR_VAL:
				return STR_VAL_EDEFAULT == null ? strVal != null : !STR_VAL_EDEFAULT.equals(strVal);
			case ThoseIntsPackage.OBJ4__HLA_TYPE:
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
		result.append(", doubVal: ");
		result.append(doubVal);
		result.append(", strVal: ");
		result.append(strVal);
		result.append(')');
		return result.toString();
	}

} //Obj4Impl
