/**
 */
package littleints.thoseInts.impl;

import federatecore.FederatecorePackage;

import federatecore.impl.FederatecorePackageImpl;

import littleints.theseints.TheseintsPackage;

import littleints.theseints.impl.TheseintsPackageImpl;

import littleints.thoseInts.Int4;
import littleints.thoseInts.Int5;
import littleints.thoseInts.Int6;
import littleints.thoseInts.Obj4;
import littleints.thoseInts.ThoseIntsFactory;
import littleints.thoseInts.ThoseIntsPackage;

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
public class ThoseIntsPackageImpl extends EPackageImpl implements ThoseIntsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass int4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass int5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass int6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obj4EClass = null;

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
	 * @see littleints.thoseInts.ThoseIntsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ThoseIntsPackageImpl() {
		super(eNS_URI, ThoseIntsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ThoseIntsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ThoseIntsPackage init() {
		if (isInited) return (ThoseIntsPackage)EPackage.Registry.INSTANCE.getEPackage(ThoseIntsPackage.eNS_URI);

		// Obtain or create and register package
		ThoseIntsPackageImpl theThoseIntsPackage = (ThoseIntsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThoseIntsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThoseIntsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TheseintsPackageImpl theTheseintsPackage = (TheseintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TheseintsPackage.eNS_URI) instanceof TheseintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TheseintsPackage.eNS_URI) : TheseintsPackage.eINSTANCE);
		FederatecorePackageImpl theFederatecorePackage = (FederatecorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FederatecorePackage.eNS_URI) instanceof FederatecorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FederatecorePackage.eNS_URI) : FederatecorePackage.eINSTANCE);

		// Create package meta-data objects
		theThoseIntsPackage.createPackageContents();
		theTheseintsPackage.createPackageContents();
		theFederatecorePackage.createPackageContents();

		// Initialize created meta-data
		theThoseIntsPackage.initializePackageContents();
		theTheseintsPackage.initializePackageContents();
		theFederatecorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThoseIntsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThoseIntsPackage.eNS_URI, theThoseIntsPackage);
		return theThoseIntsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt4() {
		return int4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt4_BoolVal() {
		return (EAttribute)int4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt4_IntVal() {
		return (EAttribute)int4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt4_StrVal() {
		return (EAttribute)int4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInt4_HlaType() {
		return (EReference)int4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt5() {
		return int5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt5_BoolVal() {
		return (EAttribute)int5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt5_DoubVal() {
		return (EAttribute)int5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt5_StrVal() {
		return (EAttribute)int5EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInt5_HlaType() {
		return (EReference)int5EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt6() {
		return int6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt6_BoolVal() {
		return (EAttribute)int6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt6_DoubVal() {
		return (EAttribute)int6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt6_StrVal() {
		return (EAttribute)int6EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInt6_HlaType() {
		return (EReference)int6EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObj4() {
		return obj4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObj4_BoolVal() {
		return (EAttribute)obj4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObj4_DoubVal() {
		return (EAttribute)obj4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObj4_StrVal() {
		return (EAttribute)obj4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObj4_HlaType() {
		return (EReference)obj4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoseIntsFactory getThoseIntsFactory() {
		return (ThoseIntsFactory)getEFactoryInstance();
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
		int4EClass = createEClass(INT4);
		createEAttribute(int4EClass, INT4__BOOL_VAL);
		createEAttribute(int4EClass, INT4__INT_VAL);
		createEAttribute(int4EClass, INT4__STR_VAL);
		createEReference(int4EClass, INT4__HLA_TYPE);

		int5EClass = createEClass(INT5);
		createEAttribute(int5EClass, INT5__BOOL_VAL);
		createEAttribute(int5EClass, INT5__DOUB_VAL);
		createEAttribute(int5EClass, INT5__STR_VAL);
		createEReference(int5EClass, INT5__HLA_TYPE);

		int6EClass = createEClass(INT6);
		createEAttribute(int6EClass, INT6__BOOL_VAL);
		createEAttribute(int6EClass, INT6__DOUB_VAL);
		createEAttribute(int6EClass, INT6__STR_VAL);
		createEReference(int6EClass, INT6__HLA_TYPE);

		obj4EClass = createEClass(OBJ4);
		createEAttribute(obj4EClass, OBJ4__BOOL_VAL);
		createEAttribute(obj4EClass, OBJ4__DOUB_VAL);
		createEAttribute(obj4EClass, OBJ4__STR_VAL);
		createEReference(obj4EClass, OBJ4__HLA_TYPE);
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
		initEClass(int4EClass, Int4.class, "Int4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt4_BoolVal(), ecorePackage.getEBoolean(), "boolVal", null, 0, 1, Int4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt4_IntVal(), ecorePackage.getEInt(), "intVal", null, 0, 1, Int4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt4_StrVal(), ecorePackage.getEString(), "strVal", null, 0, 1, Int4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInt4_HlaType(), theFederatecorePackage.getHLAInteraction(), null, "hlaType", null, 0, 1, Int4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(int5EClass, Int5.class, "Int5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt5_BoolVal(), ecorePackage.getEBoolean(), "boolVal", null, 0, 1, Int5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt5_DoubVal(), ecorePackage.getEDouble(), "doubVal", null, 0, 1, Int5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt5_StrVal(), ecorePackage.getEString(), "strVal", null, 0, 1, Int5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInt5_HlaType(), theFederatecorePackage.getHLAInteraction(), null, "hlaType", null, 0, 1, Int5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(int6EClass, Int6.class, "Int6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt6_BoolVal(), ecorePackage.getEBoolean(), "boolVal", null, 0, 1, Int6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt6_DoubVal(), ecorePackage.getEDouble(), "doubVal", null, 0, 1, Int6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt6_StrVal(), ecorePackage.getEString(), "strVal", null, 0, 1, Int6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInt6_HlaType(), theFederatecorePackage.getHLAInteraction(), null, "hlaType", null, 0, 1, Int6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obj4EClass, Obj4.class, "Obj4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObj4_BoolVal(), ecorePackage.getEBoolean(), "boolVal", null, 0, 1, Obj4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObj4_DoubVal(), ecorePackage.getEDouble(), "doubVal", null, 0, 1, Obj4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObj4_StrVal(), ecorePackage.getEString(), "strVal", null, 0, 1, Obj4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObj4_HlaType(), theFederatecorePackage.getHLAObject(), null, "hlaType", null, 0, 1, Obj4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ThoseIntsPackageImpl
