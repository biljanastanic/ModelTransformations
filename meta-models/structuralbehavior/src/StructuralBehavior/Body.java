/**
 */
package StructuralBehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StructuralBehavior.Body#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see StructuralBehavior.StructuralBehaviorPackage#getBody()
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
	 * @see StructuralBehavior.StructuralBehaviorPackage#getBody_Operations()
	 * @model required="true"
	 * @generated
	 */
	String getOperations();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Body#getOperations <em>Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' attribute.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(String value);

} // Body
