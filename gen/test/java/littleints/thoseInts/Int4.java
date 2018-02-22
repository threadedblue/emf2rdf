/**
 */
package littleints.thoseInts;

import federatecore.HLAInteraction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link littleints.thoseInts.Int4#isBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link littleints.thoseInts.Int4#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link littleints.thoseInts.Int4#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link littleints.thoseInts.Int4#getHlaType <em>Hla Type</em>}</li>
 * </ul>
 *
 * @see littleints.thoseInts.ThoseIntsPackage#getInt4()
 * @model
 * @generated
 */
public interface Int4 extends EObject {
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
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt4_BoolVal()
	 * @model
	 * @generated
	 */
	boolean isBoolVal();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int4#isBoolVal <em>Bool Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Val</em>' attribute.
	 * @see #isBoolVal()
	 * @generated
	 */
	void setBoolVal(boolean value);

	/**
	 * Returns the value of the '<em><b>Int Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Val</em>' attribute.
	 * @see #setIntVal(int)
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt4_IntVal()
	 * @model
	 * @generated
	 */
	int getIntVal();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int4#getIntVal <em>Int Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Val</em>' attribute.
	 * @see #getIntVal()
	 * @generated
	 */
	void setIntVal(int value);

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
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt4_StrVal()
	 * @model
	 * @generated
	 */
	String getStrVal();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int4#getStrVal <em>Str Val</em>}' attribute.
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
	 * @see littleints.thoseInts.ThoseIntsPackage#getInt4_HlaType()
	 * @model
	 * @generated
	 */
	HLAInteraction getHlaType();

	/**
	 * Sets the value of the '{@link littleints.thoseInts.Int4#getHlaType <em>Hla Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hla Type</em>' reference.
	 * @see #getHlaType()
	 * @generated
	 */
	void setHlaType(HLAInteraction value);

} // Int4
