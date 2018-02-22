/**
 */
package littleints.theseints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see littleints.theseints.TheseintsPackage
 * @generated
 */
public interface TheseintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TheseintsFactory eINSTANCE = littleints.theseints.impl.TheseintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Int3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int3</em>'.
	 * @generated
	 */
	Int3 createInt3();

	/**
	 * Returns a new object of class '<em>Int2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int2</em>'.
	 * @generated
	 */
	Int2 createInt2();

	/**
	 * Returns a new object of class '<em>Int1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int1</em>'.
	 * @generated
	 */
	Int1 createInt1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TheseintsPackage getTheseintsPackage();

} //TheseintsFactory
