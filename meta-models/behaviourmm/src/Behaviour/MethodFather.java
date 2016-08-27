/**
 */
package Behaviour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Father</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Behaviour.MethodFather#getContain <em>Contain</em>}</li>
 *   <li>{@link Behaviour.MethodFather#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link Behaviour.MethodFather#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Behaviour.MethodFather#getMethodVisibility <em>Method Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see Behaviour.BehaviourPackage#getMethodFather()
 * @model
 * @generated
 */
public interface MethodFather extends EObject {
	/**
	 * Returns the value of the '<em><b>Contain</b></em>' containment reference list.
	 * The list contents are of type {@link Behaviour.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain</em>' containment reference list.
	 * @see Behaviour.BehaviourPackage#getMethodFather_Contain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getContain();

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see Behaviour.BehaviourPackage#getMethodFather_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link Behaviour.MethodFather#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see Behaviour.BehaviourPackage#getMethodFather_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link Behaviour.MethodFather#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Visibility</em>' attribute.
	 * @see #setMethodVisibility(String)
	 * @see Behaviour.BehaviourPackage#getMethodFather_MethodVisibility()
	 * @model
	 * @generated
	 */
	String getMethodVisibility();

	/**
	 * Sets the value of the '{@link Behaviour.MethodFather#getMethodVisibility <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Visibility</em>' attribute.
	 * @see #getMethodVisibility()
	 * @generated
	 */
	void setMethodVisibility(String value);

} // MethodFather
