/**
 */
package littleints.theseints.impl;

import federatecore.FederatecorePackage;

import federatecore.impl.FederatecorePackageImpl;

import littleints.theseints.Int1;
import littleints.theseints.Int2;
import littleints.theseints.Int3;
import littleints.theseints.TheseintsFactory;
import littleints.theseints.TheseintsPackage;

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
public class TheseintsPackageImpl extends EPackageImpl implements TheseintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass int3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass int2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass int1EClass = null;

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
	 * @see littleints.theseints.TheseintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TheseintsPackageImpl() {
		super(eNS_URI, TheseintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TheseintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TheseintsPackage init() {
		if (isInited) return (TheseintsPackage)EPackage.Registry.INSTANCE.getEPackage(TheseintsPackage.eNS_URI);

		// Obtain or create and register package
		TheseintsPackageImpl theTheseintsPackage = (TheseintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TheseintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TheseintsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ThoseIntsPackageImpl theThoseIntsPackage = (ThoseIntsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThoseIntsPackage.eNS_URI) instanceof ThoseIntsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThoseIntsPackage.eNS_URI) : ThoseIntsPackage.eINSTANCE);
		FederatecorePackageImpl theFederatecorePackage = (FederatecorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FederatecorePackage.eNS_URI) instanceof FederatecorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FederatecorePackage.eNS_URI) : FederatecorePackage.eINSTANCE);

		// Create package meta-data objects
		theTheseintsPackage.createPackageContents();
		theThoseIntsPackage.createPackageContents();
		theFederatecorePackage.createPackageContents();

		// Initialize created meta-data
		theTheseintsPackage.initializePackageContents();
		theThoseIntsPackage.initializePackageContents();
		theFederatecorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTheseintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TheseintsPackage.eNS_URI, theTheseintsPackage);
		return theTheseintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt3() {
		return int3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt3_BoolVal() {
		return (EAttribute)int3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt3_DoubVal() {
		return (EAttribute)int3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt3_StrVal() {
		return (EAttribute)int3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInt3_HlaType() {
		return (EReference)int3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt2() {
		return int2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt2_BoolVal() {
		return (EAttribute)int2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt2_DoubVal() {
		return (EAttribute)int2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt2_StrVal() {
		return (EAttribute)int2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInt2_HlaType() {
		return (EReference)int2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt1() {
		return int1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt1_BoolVal() {
		return (EAttribute)int1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt1_DoubVal() {
		return (EAttribute)int1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt1_StrVal() {
		return (EAttribute)int1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInt1_HlaType() {
		return (EReference)int1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheseintsFactory getTheseintsFactory() {
		return (TheseintsFactory)getEFactoryInstance();
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
		int3EClass = createEClass(INT3);
		createEAttribute(int3EClass, INT3__BOOL_VAL);
		createEAttribute(int3EClass, INT3__DOUB_VAL);
		createEAttribute(int3EClass, INT3__STR_VAL);
		createEReference(int3EClass, INT3__HLA_TYPE);

		int2EClass = createEClass(INT2);
		createEAttribute(int2EClass, INT2__BOOL_VAL);
		createEAttribute(int2EClass, INT2__DOUB_VAL);
		createEAttribute(int2EClass, INT2__STR_VAL);
		createEReference(int2EClass, INT2__HLA_TYPE);

		int1EClass = createEClass(INT1);
		createEAttribute(int1EClass, INT1__BOOL_VAL);
		createEAttribute(int1EClass, INT1__DOUB_VAL);
		createEAttribute(int1EClass, INT1__STR_VAL);
		createEReference(int1EClass, INT1__HLA_TYPE);
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

		// Obtain other dependent packages
		FederatecorePackage theFederatecorePackage = (FederatecorePackage)EPackage.Registry.INSTANCE.getEPackage(FederatecorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(int3EClass, Int3.class, "Int3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt3_BoolVal(), ecorePackage.getEBoolean(), "boolVal", null, 0, 1, Int3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt3_DoubVal(), ecorePackage.getEDouble(), "doubVal", null, 0, 1, Int3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt3_StrVal(), ecorePackage.getEString(), "strVal", null, 0, 1, Int3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInt3_HlaType(), theFederatecorePackage.getHLAInteraction(), null, "hlaType", null, 0, 1, Int3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(int2EClass, Int2.class, "Int2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt2_BoolVal(), ecorePackage.getEBoolean(), "boolVal", null, 0, 1, Int2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt2_DoubVal(), ecorePackage.getEDouble(), "doubVal", null, 0, 1, Int2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt2_StrVal(), ecorePackage.getEString(), "strVal", null, 0, 1, Int2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInt2_HlaType(), theFederatecorePackage.getHLAInteraction(), null, "hlaType", null, 0, 1, Int2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(int1EClass, Int1.class, "Int1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt1_BoolVal(), ecorePackage.getEBoolean(), "boolVal", null, 0, 1, Int1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt1_DoubVal(), ecorePackage.getEDouble(), "doubVal", null, 0, 1, Int1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt1_StrVal(), ecorePackage.getEString(), "strVal", null, 0, 1, Int1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInt1_HlaType(), theFederatecorePackage.getHLAInteraction(), null, "hlaType", null, 0, 1, Int1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TheseintsPackageImpl
