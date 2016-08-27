/**
 */
package StructuralBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StructuralBehavior.Method#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link StructuralBehavior.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link StructuralBehavior.Method#getInput <em>Input</em>}</li>
 *   <li>{@link StructuralBehavior.Method#getContain <em>Contain</em>}</li>
 *   <li>{@link StructuralBehavior.Method#getMethodVisibility <em>Method Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see StructuralBehavior.StructuralBehaviorPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
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
	 * @see StructuralBehavior.StructuralBehaviorPackage#getMethod_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Method#getMethodName <em>Method Name</em>}' attribute.
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
	 * @see StructuralBehavior.StructuralBehaviorPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link StructuralBehavior.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see StructuralBehavior.StructuralBehaviorPackage#getMethod_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getInput();

	/**
	 * Returns the value of the '<em><b>Contain</b></em>' containment reference list.
	 * The list contents are of type {@link StructuralBehavior.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain</em>' containment reference list.
	 * @see StructuralBehavior.StructuralBehaviorPackage#getMethod_Contain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getContain();

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
	 * @see StructuralBehavior.StructuralBehaviorPackage#getMethod_MethodVisibility()
	 * @model
	 * @generated
	 */
	String getMethodVisibility();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Method#getMethodVisibility <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Visibility</em>' attribute.
	 * @see #getMethodVisibility()
	 * @generated
	 */
	void setMethodVisibility(String value);

} // Method
