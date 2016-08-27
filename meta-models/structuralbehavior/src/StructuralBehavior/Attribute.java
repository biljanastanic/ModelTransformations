/**
 */
package StructuralBehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StructuralBehavior.Attribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link StructuralBehavior.Attribute#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link StructuralBehavior.Attribute#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see StructuralBehavior.StructuralBehaviorPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see StructuralBehavior.StructuralBehaviorPackage#getAttribute_AttributeName()
	 * @model required="true"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Attribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' attribute.
	 * @see #setAttributeType(String)
	 * @see StructuralBehavior.StructuralBehaviorPackage#getAttribute_AttributeType()
	 * @model
	 * @generated
	 */
	String getAttributeType();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Attribute#getAttributeType <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' attribute.
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' attribute.
	 * @see #setAttributeValue(String)
	 * @see StructuralBehavior.StructuralBehaviorPackage#getAttribute_AttributeValue()
	 * @model
	 * @generated
	 */
	String getAttributeValue();

	/**
	 * Sets the value of the '{@link StructuralBehavior.Attribute#getAttributeValue <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' attribute.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(String value);

} // Attribute
