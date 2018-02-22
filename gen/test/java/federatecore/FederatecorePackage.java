/**
 */
package federatecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see federatecore.FederatecoreFactory
 * @model kind="package"
 * @generated
 */
public interface FederatecorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "federatecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://federatecore/core.hla.iox";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iox.hla.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FederatecorePackage eINSTANCE = federatecore.impl.FederatecorePackageImpl.init();

	/**
	 * The meta object id for the '{@link federatecore.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see federatecore.impl.MessageImpl
	 * @see federatecore.impl.FederatecorePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link federatecore.HLAInteraction <em>HLA Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see federatecore.HLAInteraction
	 * @see federatecore.impl.FederatecorePackageImpl#getHLAInteraction()
	 * @generated
	 */
	int HLA_INTERACTION = 1;

	/**
	 * The number of structural features of the '<em>HLA Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLA_INTERACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>HLA Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLA_INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link federatecore.HLAObject <em>HLA Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see federatecore.HLAObject
	 * @see federatecore.impl.FederatecorePackageImpl#getHLAObject()
	 * @generated
	 */
	int HLA_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>HLA Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLA_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>HLA Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLA_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link federatecore.impl.JoinInteractionImpl <em>Join Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see federatecore.impl.JoinInteractionImpl
	 * @see federatecore.impl.FederatecorePackageImpl#getJoinInteraction()
	 * @generated
	 */
	int JOIN_INTERACTION = 3;

	/**
	 * The feature id for the '<em><b>Hla Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_INTERACTION__HLA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Federate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_INTERACTION__FEDERATE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Join Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_INTERACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Join Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link federatecore.impl.ResignInteractionImpl <em>Resign Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see federatecore.impl.ResignInteractionImpl
	 * @see federatecore.impl.FederatecorePackageImpl#getResignInteraction()
	 * @generated
	 */
	int RESIGN_INTERACTION = 4;

	/**
	 * The feature id for the '<em><b>Hla Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIGN_INTERACTION__HLA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Federate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIGN_INTERACTION__FEDERATE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Resign Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIGN_INTERACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resign Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIGN_INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link federatecore.SignalInteraction <em>Signal Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see federatecore.SignalInteraction
	 * @see federatecore.impl.FederatecorePackageImpl#getSignalInteraction()
	 * @generated
	 */
	int SIGNAL_INTERACTION = 5;

	/**
	 * The number of structural features of the '<em>Signal Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERACTION_FEATURE_COUNT = HLA_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERACTION_OPERATION_COUNT = HLA_INTERACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link federatecore.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see federatecore.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link federatecore.Message#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see federatecore.Message#getMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Message();

	/**
	 * Returns the meta object for class '{@link federatecore.HLAInteraction <em>HLA Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLA Interaction</em>'.
	 * @see federatecore.HLAInteraction
	 * @generated
	 */
	EClass getHLAInteraction();

	/**
	 * Returns the meta object for class '{@link federatecore.HLAObject <em>HLA Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLA Object</em>'.
	 * @see federatecore.HLAObject
	 * @generated
	 */
	EClass getHLAObject();

	/**
	 * Returns the meta object for class '{@link federatecore.JoinInteraction <em>Join Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Interaction</em>'.
	 * @see federatecore.JoinInteraction
	 * @generated
	 */
	EClass getJoinInteraction();

	/**
	 * Returns the meta object for the reference '{@link federatecore.JoinInteraction#getHlaType <em>Hla Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hla Type</em>'.
	 * @see federatecore.JoinInteraction#getHlaType()
	 * @see #getJoinInteraction()
	 * @generated
	 */
	EReference getJoinInteraction_HlaType();

	/**
	 * Returns the meta object for the attribute '{@link federatecore.JoinInteraction#getFederateName <em>Federate Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federate Name</em>'.
	 * @see federatecore.JoinInteraction#getFederateName()
	 * @see #getJoinInteraction()
	 * @generated
	 */
	EAttribute getJoinInteraction_FederateName();

	/**
	 * Returns the meta object for class '{@link federatecore.ResignInteraction <em>Resign Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resign Interaction</em>'.
	 * @see federatecore.ResignInteraction
	 * @generated
	 */
	EClass getResignInteraction();

	/**
	 * Returns the meta object for the reference '{@link federatecore.ResignInteraction#getHlaType <em>Hla Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hla Type</em>'.
	 * @see federatecore.ResignInteraction#getHlaType()
	 * @see #getResignInteraction()
	 * @generated
	 */
	EReference getResignInteraction_HlaType();

	/**
	 * Returns the meta object for the attribute '{@link federatecore.ResignInteraction#getFederateName <em>Federate Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federate Name</em>'.
	 * @see federatecore.ResignInteraction#getFederateName()
	 * @see #getResignInteraction()
	 * @generated
	 */
	EAttribute getResignInteraction_FederateName();

	/**
	 * Returns the meta object for class '{@link federatecore.SignalInteraction <em>Signal Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Interaction</em>'.
	 * @see federatecore.SignalInteraction
	 * @generated
	 */
	EClass getSignalInteraction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FederatecoreFactory getFederatecoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link federatecore.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see federatecore.impl.MessageImpl
		 * @see federatecore.impl.FederatecorePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE = eINSTANCE.getMessage_Message();

		/**
		 * The meta object literal for the '{@link federatecore.HLAInteraction <em>HLA Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see federatecore.HLAInteraction
		 * @see federatecore.impl.FederatecorePackageImpl#getHLAInteraction()
		 * @generated
		 */
		EClass HLA_INTERACTION = eINSTANCE.getHLAInteraction();

		/**
		 * The meta object literal for the '{@link federatecore.HLAObject <em>HLA Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see federatecore.HLAObject
		 * @see federatecore.impl.FederatecorePackageImpl#getHLAObject()
		 * @generated
		 */
		EClass HLA_OBJECT = eINSTANCE.getHLAObject();

		/**
		 * The meta object literal for the '{@link federatecore.impl.JoinInteractionImpl <em>Join Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see federatecore.impl.JoinInteractionImpl
		 * @see federatecore.impl.FederatecorePackageImpl#getJoinInteraction()
		 * @generated
		 */
		EClass JOIN_INTERACTION = eINSTANCE.getJoinInteraction();

		/**
		 * The meta object literal for the '<em><b>Hla Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_INTERACTION__HLA_TYPE = eINSTANCE.getJoinInteraction_HlaType();

		/**
		 * The meta object literal for the '<em><b>Federate Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_INTERACTION__FEDERATE_NAME = eINSTANCE.getJoinInteraction_FederateName();

		/**
		 * The meta object literal for the '{@link federatecore.impl.ResignInteractionImpl <em>Resign Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see federatecore.impl.ResignInteractionImpl
		 * @see federatecore.impl.FederatecorePackageImpl#getResignInteraction()
		 * @generated
		 */
		EClass RESIGN_INTERACTION = eINSTANCE.getResignInteraction();

		/**
		 * The meta object literal for the '<em><b>Hla Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESIGN_INTERACTION__HLA_TYPE = eINSTANCE.getResignInteraction_HlaType();

		/**
		 * The meta object literal for the '<em><b>Federate Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIGN_INTERACTION__FEDERATE_NAME = eINSTANCE.getResignInteraction_FederateName();

		/**
		 * The meta object literal for the '{@link federatecore.SignalInteraction <em>Signal Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see federatecore.SignalInteraction
		 * @see federatecore.impl.FederatecorePackageImpl#getSignalInteraction()
		 * @generated
		 */
		EClass SIGNAL_INTERACTION = eINSTANCE.getSignalInteraction();

	}

} //FederatecorePackage
