/**
 */
package littleints.thoseInts;

import federatecore.HLAInteraction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link littleints.thoseInts.Int5#isBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link littleints.thoseInts.Int5#getDoubVal <em>Doub Val</em>}</li>
 *   <li>{@link littleints.thoseInts.Int5#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link littleints.thoseInts.Int5#getHlaType <em>Hla Type</em>}</li>
 * </ul>
 *
 * @see littleints.thoseInts.ThoseIntsPackage#getInt5()
 * @model
 * @generated
 */
public interface Int5 extends EObject {
	/**
	 * Returns the value of the '<em><b>Bool Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Val</em>' attribute.
	 * @see #setBoolVal(boolean)
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt5_BoolVal()
	 * @model
	 * @generated
	 */
	boolean isBoolVal();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int5#isBoolVal <em>Bool Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Val</em>' attribute.
	 * @see #isBoolVal()
	 * @generated
	 */
	void setBoolVal(boolean value);

	/**
	 * Returns the value of the '<em><b>Doub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doub Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doub Val</em>' attribute.
	 * @see #setDoubVal(double)
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt5_DoubVal()
	 * @model
	 * @generated
	 */
	double getDoubVal();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int5#getDoubVal <em>Doub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doub Val</em>' attribute.
	 * @see #getDoubVal()
	 * @generated
	 */
	void setDoubVal(double value);

	/**
	 * Returns the value of the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Val</em>' attribute.
	 * @see #setStrVal(String)
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt5_StrVal()
	 * @model
	 * @generated
	 */
	String getStrVal();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int5#getStrVal <em>Str Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Val</em>' attribute.
	 * @see #getStrVal()
	 * @generated
	 */
	void setStrVal(String value);

	/**
	 * Returns the value of the '<em><b>Hla Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hla Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hla Type</em>' reference.
	 * @see #setHlaType(HLAInteraction)
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt5_HlaType()
	 * @model
	 * @generated
	 */
	HLAInteraction getHlaType();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int5#getHlaType <em>Hla Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hla Type</em>' reference.
	 * @see #getHlaType()
	 * @generated
	 */
	void setHlaType(HLAInteraction value);

} // Int5
