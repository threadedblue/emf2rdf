/**
 */
package littleints.theseints;

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
 * @see littleints.theseints.TheseintsFactory
 * @model kind="package"
 * @generated
 */
public interface TheseintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "theseints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://theseInts.edu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "theseints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TheseintsPackage eINSTANCE = littleints.theseints.impl.TheseintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link littleints.theseints.impl.Int3Impl <em>Int3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see littleints.theseints.impl.Int3Impl
	 * @see littleints.theseints.impl.TheseintsPackageImpl#getInt3()
	 * @generated
	 */
	int INT3 = 0;

	/**
	 * The feature id for the '<em><b>Bool Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT3__BOOL_VAL = 0;

	/**
	 * The feature id for the '<em><b>Doub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT3__DOUB_VAL = 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT3__STR_VAL = 2;

	/**
	 * The feature id for the '<em><b>Hla Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT3__HLA_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Int3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT3_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Int3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link littleints.theseints.impl.Int2Impl <em>Int2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see littleints.theseints.impl.Int2Impl
	 * @see littleints.theseints.impl.TheseintsPackageImpl#getInt2()
	 * @generated
	 */
	int INT2 = 1;

	/**
	 * The feature id for the '<em><b>Bool Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT2__BOOL_VAL = 0;

	/**
	 * The feature id for the '<em><b>Doub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT2__DOUB_VAL = 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT2__STR_VAL = 2;

	/**
	 * The feature id for the '<em><b>Hla Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT2__HLA_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Int2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT2_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Int2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link littleints.theseints.impl.Int1Impl <em>Int1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see littleints.theseints.impl.Int1Impl
	 * @see littleints.theseints.impl.TheseintsPackageImpl#getInt1()
	 * @generated
	 */
	int INT1 = 2;

	/**
	 * The feature id for the '<em><b>Bool Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1__BOOL_VAL = 0;

	/**
	 * The feature id for the '<em><b>Doub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1__DOUB_VAL = 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1__STR_VAL = 2;

	/**
	 * The feature id for the '<em><b>Hla Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1__HLA_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Int1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Int1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link littleints.theseints.Int3 <em>Int3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int3</em>'.
	 * @see littleints.theseints.Int3
	 * @generated
	 */
	EClass getInt3();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int3#isBoolVal <em>Bool Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Val</em>'.
	 * @see littleints.theseints.Int3#isBoolVal()
	 * @see #getInt3()
	 * @generated
	 */
	EAttribute getInt3_BoolVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int3#getDoubVal <em>Doub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doub Val</em>'.
	 * @see littleints.theseints.Int3#getDoubVal()
	 * @see #getInt3()
	 * @generated
	 */
	EAttribute getInt3_DoubVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int3#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str Val</em>'.
	 * @see littleints.theseints.Int3#getStrVal()
	 * @see #getInt3()
	 * @generated
	 */
	EAttribute getInt3_StrVal();

	/**
	 * Returns the meta object for the reference '{@link littleints.theseints.Int3#getHlaType <em>Hla Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hla Type</em>'.
	 * @see littleints.theseints.Int3#getHlaType()
	 * @see #getInt3()
	 * @generated
	 */
	EReference getInt3_HlaType();

	/**
	 * Returns the meta object for class '{@link littleints.theseints.Int2 <em>Int2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int2</em>'.
	 * @see littleints.theseints.Int2
	 * @generated
	 */
	EClass getInt2();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int2#isBoolVal <em>Bool Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Val</em>'.
	 * @see littleints.theseints.Int2#isBoolVal()
	 * @see #getInt2()
	 * @generated
	 */
	EAttribute getInt2_BoolVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int2#getDoubVal <em>Doub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doub Val</em>'.
	 * @see littleints.theseints.Int2#getDoubVal()
	 * @see #getInt2()
	 * @generated
	 */
	EAttribute getInt2_DoubVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int2#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str Val</em>'.
	 * @see littleints.theseints.Int2#getStrVal()
	 * @see #getInt2()
	 * @generated
	 */
	EAttribute getInt2_StrVal();

	/**
	 * Returns the meta object for the reference '{@link littleints.theseints.Int2#getHlaType <em>Hla Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hla Type</em>'.
	 * @see littleints.theseints.Int2#getHlaType()
	 * @see #getInt2()
	 * @generated
	 */
	EReference getInt2_HlaType();

	/**
	 * Returns the meta object for class '{@link littleints.theseints.Int1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int1</em>'.
	 * @see littleints.theseints.Int1
	 * @generated
	 */
	EClass getInt1();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int1#isBoolVal <em>Bool Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Val</em>'.
	 * @see littleints.theseints.Int1#isBoolVal()
	 * @see #getInt1()
	 * @generated
	 */
	EAttribute getInt1_BoolVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int1#getDoubVal <em>Doub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doub Val</em>'.
	 * @see littleints.theseints.Int1#getDoubVal()
	 * @see #getInt1()
	 * @generated
	 */
	EAttribute getInt1_DoubVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.theseints.Int1#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str Val</em>'.
	 * @see littleints.theseints.Int1#getStrVal()
	 * @see #getInt1()
	 * @generated
	 */
	EAttribute getInt1_StrVal();

	/**
	 * Returns the meta object for the reference '{@link littleints.theseints.Int1#getHlaType <em>Hla Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hla Type</em>'.
	 * @see littleints.theseints.Int1#getHlaType()
	 * @see #getInt1()
	 * @generated
	 */
	EReference getInt1_HlaType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TheseintsFactory getTheseintsFactory();

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
		 * The meta object literal for the '{@link littleints.theseints.impl.Int3Impl <em>Int3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see littleints.theseints.impl.Int3Impl
		 * @see littleints.theseints.impl.TheseintsPackageImpl#getInt3()
		 * @generated
		 */
		EClass INT3 = eINSTANCE.getInt3();

		/**
		 * The meta object literal for the '<em><b>Bool Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT3__BOOL_VAL = eINSTANCE.getInt3_BoolVal();

		/**
		 * The meta object literal for the '<em><b>Doub Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT3__DOUB_VAL = eINSTANCE.getInt3_DoubVal();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT3__STR_VAL = eINSTANCE.getInt3_StrVal();

		/**
		 * The meta object literal for the '<em><b>Hla Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT3__HLA_TYPE = eINSTANCE.getInt3_HlaType();

		/**
		 * The meta object literal for the '{@link littleints.theseints.impl.Int2Impl <em>Int2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see littleints.theseints.impl.Int2Impl
		 * @see littleints.theseints.impl.TheseintsPackageImpl#getInt2()
		 * @generated
		 */
		EClass INT2 = eINSTANCE.getInt2();

		/**
		 * The meta object literal for the '<em><b>Bool Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT2__BOOL_VAL = eINSTANCE.getInt2_BoolVal();

		/**
		 * The meta object literal for the '<em><b>Doub Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT2__DOUB_VAL = eINSTANCE.getInt2_DoubVal();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT2__STR_VAL = eINSTANCE.getInt2_StrVal();

		/**
		 * The meta object literal for the '<em><b>Hla Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT2__HLA_TYPE = eINSTANCE.getInt2_HlaType();

		/**
		 * The meta object literal for the '{@link littleints.theseints.impl.Int1Impl <em>Int1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see littleints.theseints.impl.Int1Impl
		 * @see littleints.theseints.impl.TheseintsPackageImpl#getInt1()
		 * @generated
		 */
		EClass INT1 = eINSTANCE.getInt1();

		/**
		 * The meta object literal for the '<em><b>Bool Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT1__BOOL_VAL = eINSTANCE.getInt1_BoolVal();

		/**
		 * The meta object literal for the '<em><b>Doub Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT1__DOUB_VAL = eINSTANCE.getInt1_DoubVal();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT1__STR_VAL = eINSTANCE.getInt1_StrVal();

		/**
		 * The meta object literal for the '<em><b>Hla Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT1__HLA_TYPE = eINSTANCE.getInt1_HlaType();

	}

} //TheseintsPackage
