/**
 */
package littleints.thoseInts.util;

import littleints.thoseInts.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see littleints.thoseInts.ThoseIntsPackage
 * @generated
 */
public class ThoseIntsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ThoseIntsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoseIntsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ThoseIntsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThoseIntsSwitch<Adapter> modelSwitch =
		new ThoseIntsSwitch<Adapter>() {
			@Override
			public Adapter caseInt4(Int4 object) {
				return createInt4Adapter();
			}
			@Override
			public Adapter caseInt5(Int5 object) {
				return createInt5Adapter();
			}
			@Override
			public Adapter caseInt6(Int6 object) {
				return createInt6Adapter();
			}
			@Override
			public Adapter caseObj4(Obj4 object) {
				return createObj4Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link littleints.thoseInts.Int4 <em>Int4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see littleints.thoseInts.Int4
	 * @generated
	 */
	public Adapter createInt4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link littleints.thoseInts.Int5 <em>Int5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see littleints.thoseInts.Int5
	 * @generated
	 */
	public Adapter createInt5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link littleints.thoseInts.Int6 <em>Int6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see littleints.thoseInts.Int6
	 * @generated
	 */
	public Adapter createInt6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link littleints.thoseInts.Obj4 <em>Obj4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see littleints.thoseInts.Obj4
	 * @generated
	 */
	public Adapter createObj4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ThoseIntsAdapterFactory
