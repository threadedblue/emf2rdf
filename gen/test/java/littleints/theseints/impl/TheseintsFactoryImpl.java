/**
 */
package littleints.theseints.impl;

import littleints.theseints.*;

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
public class TheseintsFactoryImpl extends EFactoryImpl implements TheseintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TheseintsFactory init() {
		try {
			TheseintsFactory theTheseintsFactory = (TheseintsFactory)EPackage.Registry.INSTANCE.getEFactory(TheseintsPackage.eNS_URI);
			if (theTheseintsFactory != null) {
				return theTheseintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TheseintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheseintsFactoryImpl() {
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
			case TheseintsPackage.INT3: return createInt3();
			case TheseintsPackage.INT2: return createInt2();
			case TheseintsPackage.INT1: return createInt1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int3 createInt3() {
		Int3Impl int3 = new Int3Impl();
		return int3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int2 createInt2() {
		Int2Impl int2 = new Int2Impl();
		return int2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int1 createInt1() {
		Int1Impl int1 = new Int1Impl();
		return int1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheseintsPackage getTheseintsPackage() {
		return (TheseintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TheseintsPackage getPackage() {
		return TheseintsPackage.eINSTANCE;
	}

} //TheseintsFactoryImpl
