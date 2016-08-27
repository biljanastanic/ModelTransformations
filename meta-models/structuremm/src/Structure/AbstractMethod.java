/**
 */
package Structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Structure.AbstractMethod#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link Structure.AbstractMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Structure.AbstractMethod#getInput <em>Input</em>}</li>
 *   <li>{@link Structure.AbstractMethod#getMethodVisibility <em>Method Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see Structure.StructurePackage#getAbstractMethod()
 * @model
 * @generated
 */
public interface AbstractMethod extends EObject {
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
	 * @see Structure.StructurePackage#getAbstractMethod_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link Structure.AbstractMethod#getMethodName <em>Method Name</em>}' attribute.
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
	 * @see Structure.StructurePackage#getAbstractMethod_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link Structure.AbstractMethod#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link Structure.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see Structure.StructurePackage#getAbstractMethod_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getInput();

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
	 * @see Structure.StructurePackage#getAbstractMethod_MethodVisibility()
	 * @model
	 * @generated
	 */
	String getMethodVisibility();

	/**
	 * Sets the value of the '{@link Structure.AbstractMethod#getMethodVisibility <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Visibility</em>' attribute.
	 * @see #getMethodVisibility()
	 * @generated
	 */
	void setMethodVisibility(String value);

} // AbstractMethod
