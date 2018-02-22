/**
 */
package littleints.theseints.impl;

import federatecore.HLAInteraction;

import littleints.theseints.Int1;
import littleints.theseints.TheseintsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link littleints.theseints.impl.Int1Impl#isBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link littleints.theseints.impl.Int1Impl#getDoubVal <em>Doub Val</em>}</li>
 *   <li>{@link littleints.theseints.impl.Int1Impl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link littleints.theseints.impl.Int1Impl#getHlaType <em>Hla Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Int1Impl extends MinimalEObjectImpl.Container implements Int1 {
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
	protected HLAInteraction hlaType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Int1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheseintsPackage.Literals.INT1;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TheseintsPackage.INT1__BOOL_VAL, oldBoolVal, boolVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TheseintsPackage.INT1__DOUB_VAL, oldDoubVal, doubVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TheseintsPackage.INT1__STR_VAL, oldStrVal, strVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TheseintsPackage.INT1__HLA_TYPE, oldHlaType, hlaType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TheseintsPackage.INT1__HLA_TYPE, oldHlaType, hlaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TheseintsPackage.INT1__BOOL_VAL:
				return isBoolVal();
			case TheseintsPackage.INT1__DOUB_VAL:
				return getDoubVal();
			case TheseintsPackage.INT1__STR_VAL:
				return getStrVal();
			case TheseintsPackage.INT1__HLA_TYPE:
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
			case TheseintsPackage.INT1__BOOL_VAL:
				setBoolVal((Boolean)newValue);
				return;
			case TheseintsPackage.INT1__DOUB_VAL:
				setDoubVal((Double)newValue);
				return;
			case TheseintsPackage.INT1__STR_VAL:
				setStrVal((String)newValue);
				return;
			case TheseintsPackage.INT1__HLA_TYPE:
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
			case TheseintsPackage.INT1__BOOL_VAL:
				setBoolVal(BOOL_VAL_EDEFAULT);
				return;
			case TheseintsPackage.INT1__DOUB_VAL:
				setDoubVal(DOUB_VAL_EDEFAULT);
				return;
			case TheseintsPackage.INT1__STR_VAL:
				setStrVal(STR_VAL_EDEFAULT);
				return;
			case TheseintsPackage.INT1__HLA_TYPE:
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
			case TheseintsPackage.INT1__BOOL_VAL:
				return boolVal != BOOL_VAL_EDEFAULT;
			case TheseintsPackage.INT1__DOUB_VAL:
				return doubVal != DOUB_VAL_EDEFAULT;
			case TheseintsPackage.INT1__STR_VAL:
				return STR_VAL_EDEFAULT == null ? strVal != null : !STR_VAL_EDEFAULT.equals(strVal);
			case TheseintsPackage.INT1__HLA_TYPE:
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

} //Int1Impl
