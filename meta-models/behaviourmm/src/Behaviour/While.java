/**
 */
package Behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Behaviour.While#getCheckWhile <em>Check While</em>}</li>
 *   <li>{@link Behaviour.While#getDoWhile <em>Do While</em>}</li>
 * </ul>
 * </p>
 *
 * @see Behaviour.BehaviourPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Operation {
	/**
	 * Returns the value of the '<em><b>Check While</b></em>' containment reference list.
	 * The list contents are of type {@link Behaviour.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check While</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check While</em>' containment reference list.
	 * @see Behaviour.BehaviourPackage#getWhile_CheckWhile()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Condition> getCheckWhile();

	/**
	 * Returns the value of the '<em><b>Do While</b></em>' containment reference list.
	 * The list contents are of type {@link Behaviour.Body}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do While</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do While</em>' containment reference list.
	 * @see Behaviour.BehaviourPackage#getWhile_DoWhile()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Body> getDoWhile();

} // While
