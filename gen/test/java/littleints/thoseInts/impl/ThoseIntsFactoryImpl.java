/**
 */
package littleints.thoseInts.impl;

import littleints.thoseInts.*;

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
public class ThoseIntsFactoryImpl extends EFactoryImpl implements ThoseIntsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThoseIntsFactory init() {
		try {
			ThoseIntsFactory theThoseIntsFactory = (ThoseIntsFactory)EPackage.Registry.INSTANCE.getEFactory(ThoseIntsPackage.eNS_URI);
			if (theThoseIntsFactory != null) {
				return theThoseIntsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThoseIntsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoseIntsFactoryImpl() {
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
			case ThoseIntsPackage.INT4: return createInt4();
			case ThoseIntsPackage.INT5: return createInt5();
			case ThoseIntsPackage.INT6: return createInt6();
			case ThoseIntsPackage.OBJ4: return createObj4();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int4 createInt4() {
		Int4Impl int4 = new Int4Impl();
		return int4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int5 createInt5() {
		Int5Impl int5 = new Int5Impl();
		return int5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int6 createInt6() {
		Int6Impl int6 = new Int6Impl();
		return int6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obj4 createObj4() {
		Obj4Impl obj4 = new Obj4Impl();
		return obj4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoseIntsPackage getThoseIntsPackage() {
		return (ThoseIntsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThoseIntsPackage getPackage() {
		return ThoseIntsPackage.eINSTANCE;
	}

} //ThoseIntsFactoryImpl
