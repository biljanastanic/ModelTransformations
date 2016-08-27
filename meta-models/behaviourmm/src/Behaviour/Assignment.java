/**
 */
package Behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Behaviour.Assignment#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link Behaviour.Assignment#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link Behaviour.Assignment#getVariableType <em>Variable Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Behaviour.BehaviourPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Operation {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see Behaviour.BehaviourPackage#getAssignment_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link Behaviour.Assignment#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Value</em>' attribute.
	 * @see #setVariableValue(String)
	 * @see Behaviour.BehaviourPackage#getAssignment_VariableValue()
	 * @model
	 * @generated
	 */
	String getVariableValue();

	/**
	 * Sets the value of the '{@link Behaviour.Assignment#getVariableValue <em>Variable Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Value</em>' attribute.
	 * @see #getVariableValue()
	 * @generated
	 */
	void setVariableValue(String value);

	/**
	 * Returns the value of the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type</em>' attribute.
	 * @see #setVariableType(String)
	 * @see Behaviour.BehaviourPackage#getAssignment_VariableType()
	 * @model
	 * @generated
	 */
	String getVariableType();

	/**
	 * Sets the value of the '{@link Behaviour.Assignment#getVariableType <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type</em>' attribute.
	 * @see #getVariableType()
	 * @generated
	 */
	void setVariableType(String value);

} // Assignment
