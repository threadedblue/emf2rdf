/**
 */
package federatecore.impl;

import federatecore.*;

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
public class FederatecoreFactoryImpl extends EFactoryImpl implements FederatecoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FederatecoreFactory init() {
		try {
			FederatecoreFactory theFederatecoreFactory = (FederatecoreFactory)EPackage.Registry.INSTANCE.getEFactory(FederatecorePackage.eNS_URI);
			if (theFederatecoreFactory != null) {
				return theFederatecoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FederatecoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatecoreFactoryImpl() {
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
			case FederatecorePackage.MESSAGE: return createMessage();
			case FederatecorePackage.JOIN_INTERACTION: return createJoinInteraction();
			case FederatecorePackage.RESIGN_INTERACTION: return createResignInteraction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinInteraction createJoinInteraction() {
		JoinInteractionImpl joinInteraction = new JoinInteractionImpl();
		return joinInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignInteraction createResignInteraction() {
		ResignInteractionImpl resignInteraction = new ResignInteractionImpl();
		return resignInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatecorePackage getFederatecorePackage() {
		return (FederatecorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FederatecorePackage getPackage() {
		return FederatecorePackage.eINSTANCE;
	}

} //FederatecoreFactoryImpl
