/**
 */
package federatecore.impl;

import federatecore.FederatecoreFactory;
import federatecore.FederatecorePackage;
import federatecore.HLAInteraction;
import federatecore.HLAObject;
import federatecore.JoinInteraction;
import federatecore.Message;
import federatecore.ResignInteraction;
import federatecore.SignalInteraction;

import littleints.theseints.TheseintsPackage;

import littleints.theseints.impl.TheseintsPackageImpl;

import littleints.thoseInts.ThoseIntsPackage;

import littleints.thoseInts.impl.ThoseIntsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FederatecorePackageImpl extends EPackageImpl implements FederatecorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlaInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resignInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalInteractionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see federatecore.FederatecorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FederatecorePackageImpl() {
		super(eNS_URI, FederatecoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FederatecorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FederatecorePackage init() {
		if (isInited) return (FederatecorePackage)EPackage.Registry.INSTANCE.getEPackage(FederatecorePackage.eNS_URI);

		// Obtain or create and register package
		FederatecorePackageImpl theFederatecorePackage = (FederatecorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FederatecorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FederatecorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ThoseIntsPackageImpl theThoseIntsPackage = (ThoseIntsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThoseIntsPackage.eNS_URI) instanceof ThoseIntsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThoseIntsPackage.eNS_URI) : ThoseIntsPackage.eINSTANCE);
		TheseintsPackageImpl theTheseintsPackage = (TheseintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TheseintsPackage.eNS_URI) instanceof TheseintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TheseintsPackage.eNS_URI) : TheseintsPackage.eINSTANCE);

		// Create package meta-data objects
		theFederatecorePackage.createPackageContents();
		theThoseIntsPackage.createPackageContents();
		theTheseintsPackage.createPackageContents();

		// Initialize created meta-data
		theFederatecorePackage.initializePackageContents();
		theThoseIntsPackage.initializePackageContents();
		theTheseintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFederatecorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FederatecorePackage.eNS_URI, theFederatecorePackage);
		return theFederatecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Message() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLAInteraction() {
		return hlaInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLAObject() {
		return hlaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinInteraction() {
		return joinInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinInteraction_HlaType() {
		return (EReference)joinInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinInteraction_FederateName() {
		return (EAttribute)joinInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResignInteraction() {
		return resignInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResignInteraction_HlaType() {
		return (EReference)resignInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignInteraction_FederateName() {
		return (EAttribute)resignInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalInteraction() {
		return signalInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederatecoreFactory getFederatecoreFactory() {
		return (FederatecoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE);

		hlaInteractionEClass = createEClass(HLA_INTERACTION);

		hlaObjectEClass = createEClass(HLA_OBJECT);

		joinInteractionEClass = createEClass(JOIN_INTERACTION);
		createEReference(joinInteractionEClass, JOIN_INTERACTION__HLA_TYPE);
		createEAttribute(joinInteractionEClass, JOIN_INTERACTION__FEDERATE_NAME);

		resignInteractionEClass = createEClass(RESIGN_INTERACTION);
		createEReference(resignInteractionEClass, RESIGN_INTERACTION__HLA_TYPE);
		createEAttribute(resignInteractionEClass, RESIGN_INTERACTION__FEDERATE_NAME);

		signalInteractionEClass = createEClass(SIGNAL_INTERACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		signalInteractionEClass.getESuperTypes().add(this.getHLAInteraction());

		// Initialize classes, features, and operations; add parameters
		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hlaInteractionEClass, HLAInteraction.class, "HLAInteraction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hlaObjectEClass, HLAObject.class, "HLAObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinInteractionEClass, JoinInteraction.class, "JoinInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinInteraction_HlaType(), this.getSignalInteraction(), null, "hlaType", null, 0, 1, JoinInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinInteraction_FederateName(), ecorePackage.getEString(), "federateName", null, 0, 1, JoinInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resignInteractionEClass, ResignInteraction.class, "ResignInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResignInteraction_HlaType(), this.getSignalInteraction(), null, "hlaType", null, 0, 1, ResignInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResignInteraction_FederateName(), ecorePackage.getEString(), "federateName", null, 0, 1, ResignInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalInteractionEClass, SignalInteraction.class, "SignalInteraction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FederatecorePackageImpl
