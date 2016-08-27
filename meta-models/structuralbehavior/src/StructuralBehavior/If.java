/**
 */
package StructuralBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StructuralBehavior.If#getCheckIf <em>Check If</em>}</li>
 *   <li>{@link StructuralBehavior.If#getDoIf <em>Do If</em>}</li>
 * </ul>
 * </p>
 *
 * @see StructuralBehavior.StructuralBehaviorPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Operation {
	/**
	 * Returns the value of the '<em><b>Check If</b></em>' containment reference list.
	 * The list contents are of type {@link StructuralBehavior.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check If</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check If</em>' containment reference list.
	 * @see StructuralBehavior.StructuralBehaviorPackage#getIf_CheckIf()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Condition> getCheckIf();

	/**
	 * Returns the value of the '<em><b>Do If</b></em>' containment reference list.
	 * The list contents are of type {@link StructuralBehavior.Body}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do If</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do If</em>' containment reference list.
	 * @see StructuralBehavior.StructuralBehaviorPackage#getIf_DoIf()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Body> getDoIf();

} // If
