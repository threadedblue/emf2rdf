/**
 */
package littleints.thoseInts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see littleints.thoseInts.ThoseIntsPackage
 * @generated
 */
public interface ThoseIntsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThoseIntsFactory eINSTANCE = littleints.thoseInts.impl.ThoseIntsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Int4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int4</em>'.
	 * @generated
	 */
	Int4 createInt4();

	/**
	 * Returns a new object of class '<em>Int5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int5</em>'.
	 * @generated
	 */
	Int5 createInt5();

	/**
	 * Returns a new object of class '<em>Int6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int6</em>'.
	 * @generated
	 */
	Int6 createInt6();

	/**
	 * Returns a new object of class '<em>Obj4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obj4</em>'.
	 * @generated
	 */
	Obj4 createObj4();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ThoseIntsPackage getThoseIntsPackage();

} //ThoseIntsFactory
