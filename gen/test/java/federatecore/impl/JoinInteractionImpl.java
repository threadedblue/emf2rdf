/**
 */
package federatecore.impl;

import federatecore.FederatecorePackage;
import federatecore.JoinInteraction;
import federatecore.SignalInteraction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link federatecore.impl.JoinInteractionImpl#getHlaType <em>Hla Type</em>}</li>
 *   <li>{@link federatecore.impl.JoinInteractionImpl#getFederateName <em>Federate Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinInteractionImpl extends MinimalEObjectImpl.Container implements JoinInteraction {
	/**
	 * The cached value of the '{@link #getHlaType() <em>Hla Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHlaType()
	 * @generated
	 * @ordered
	 */
	protected SignalInteraction hlaType;

	/**
	 * The default value of the '{@link #getFederateName() <em>Federate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederateName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEDERATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFederateName() <em>Federate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederateName()
	 * @generated
	 * @ordered
	 */
	protected String federateName = FEDERATE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FederatecorePackage.Literals.JOIN_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInteraction getHlaType() {
		if (hlaType != null && hlaType.eIsProxy()) {
			InternalEObject oldHlaType = (InternalEObject)hlaType;
			hlaType = (SignalInteraction)eResolveProxy(oldHlaType);
			if (hlaType != oldHlaType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FederatecorePackage.JOIN_INTERACTION__HLA_TYPE, oldHlaType, hlaType));
			}
		}
		return hlaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInteraction basicGetHlaType() {
		return hlaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFederateName() {
		return federateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederateName(String newFederateName) {
		String oldFederateName = federateName;
		federateName = newFederateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FederatecorePackage.JOIN_INTERACTION__FEDERATE_NAME, oldFederateName, federateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FederatecorePackage.JOIN_INTERACTION__HLA_TYPE:
				if (resolve) return getHlaType();
				return basicGetHlaType();
			case FederatecorePackage.JOIN_INTERACTION__FEDERATE_NAME:
				return getFederateName();
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
			case FederatecorePackage.JOIN_INTERACTION__FEDERATE_NAME:
				setFederateName((String)newValue);
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
			case FederatecorePackage.JOIN_INTERACTION__FEDERATE_NAME:
				setFederateName(FEDERATE_NAME_EDEFAULT);
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
			case FederatecorePackage.JOIN_INTERACTION__HLA_TYPE:
				return hlaType != null;
			case FederatecorePackage.JOIN_INTERACTION__FEDERATE_NAME:
				return FEDERATE_NAME_EDEFAULT == null ? federateName != null : !FEDERATE_NAME_EDEFAULT.equals(federateName);
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
		result.append(" (federateName: ");
		result.append(federateName);
		result.append(')');
		return result.toString();
	}

} //JoinInteractionImpl
