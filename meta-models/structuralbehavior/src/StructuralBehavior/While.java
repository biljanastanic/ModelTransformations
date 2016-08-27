/**
 */
package StructuralBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StructuralBehavior.While#getCheckWhile <em>Check While</em>}</li>
 *   <li>{@link StructuralBehavior.While#getDoWhile <em>Do While</em>}</li>
 * </ul>
 * </p>
 *
 * @see StructuralBehavior.StructuralBehaviorPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Operation {
	/**
	 * Returns the value of the '<em><b>Check While</b></em>' containment reference list.
	 * The list contents are of type {@link StructuralBehavior.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check While</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check While</em>' containment reference list.
	 * @see StructuralBehavior.StructuralBehaviorPackage#getWhile_CheckWhile()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Condition> getCheckWhile();

	/**
	 * Returns the value of the '<em><b>Do While</b></em>' containment reference list.
	 * The list contents are of type {@link StructuralBehavior.Body}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do While</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do While</em>' containment reference list.
	 * @see StructuralBehavior.StructuralBehaviorPackage#getWhile_DoWhile()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Body> getDoWhile();

} // While
