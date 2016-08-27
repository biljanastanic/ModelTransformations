/**
 */
package Behaviour;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Behaviour.Body#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see Behaviour.BehaviourPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' attribute.
	 * @see #setOperations(String)
	 * @see Behaviour.BehaviourPackage#getBody_Operations()
	 * @model required="true"
	 * @generated
	 */
	String getOperations();

	/**
	 * Sets the value of the '{@link Behaviour.Body#getOperations <em>Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' attribute.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(String value);

} // Body
