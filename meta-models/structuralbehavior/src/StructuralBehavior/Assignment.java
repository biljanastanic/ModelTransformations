/**
 */
package StructuralBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StructuralBehavior.Assignment#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link StructuralBehavior.Assignment#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link StructuralBehavior.Assignment#getVaribleType <em>Varible Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see StructuralBehavior.StructuralBehaviorPackage#getAssignment()
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
	 * @see StructuralBehavior.StructuralBehaviorPackage#getAssignment_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Assignment#getVariableName <em>Variable Name</em>}' attribute.
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
	 * @see StructuralBehavior.StructuralBehaviorPackage#getAssignment_VariableValue()
	 * @model
	 * @generated
	 */
	String getVariableValue();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Assignment#getVariableValue <em>Variable Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Value</em>' attribute.
	 * @see #getVariableValue()
	 * @generated
	 */
	void setVariableValue(String value);

	/**
	 * Returns the value of the '<em><b>Varible Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varible Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varible Type</em>' attribute.
	 * @see #setVaribleType(String)
	 * @see StructuralBehavior.StructuralBehaviorPackage#getAssignment_VaribleType()
	 * @model
	 * @generated
	 */
	String getVaribleType();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Assignment#getVaribleType <em>Varible Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varible Type</em>' attribute.
	 * @see #getVaribleType()
	 * @generated
	 */
	void setVaribleType(String value);

} // Assignment
