/**
 */
package federatecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resign Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link federatecore.ResignInteraction#getHlaType <em>Hla Type</em>}</li>
 *   <li>{@link federatecore.ResignInteraction#getFederateName <em>Federate Name</em>}</li>
 * </ul>
 *
 * @see federatecore.FederatecorePackage#getResignInteraction()
 * @model
 * @generated
 */
public interface ResignInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Hla Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hla Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hla Type</em>' reference.
	 * @see federatecore.FederatecorePackage#getResignInteraction_HlaType()
	 * @model changeable="false"
	 * @generated
	 */
	SignalInteraction getHlaType();

	/**
	 * Returns the value of the '<em><b>Federate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federate Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federate Name</em>' attribute.
	 * @see #setFederateName(String)
	 * @see federatecore.FederatecorePackage#getResignInteraction_FederateName()
	 * @model
	 * @generated
	 */
	String getFederateName();

	/**
	 * Sets the value of the '{@link federatecore.ResignInteraction#getFederateName <em>Federate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federate Name</em>' attribute.
	 * @see #getFederateName()
	 * @generated
	 */
	void setFederateName(String value);

} // ResignInteraction
