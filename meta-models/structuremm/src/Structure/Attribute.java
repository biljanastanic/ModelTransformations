/**
 */
package Structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Structure.Attribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link Structure.Attribute#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link Structure.Attribute#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Structure.StructurePackage#getAttribute()
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
	 * @see Structure.StructurePackage#getAttribute_AttributeName()
	 * @model required="true"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link Structure.Attribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' attribute.
	 * @see #setAttributeType(String)
	 * @see Structure.StructurePackage#getAttribute_AttributeType()
	 * @model default=""
	 * @generated
	 */
	String getAttributeType();

	/**
	 * Sets the value of the '{@link Structure.Attribute#getAttributeType <em>Attribute Type</em>}' attribute.
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
	 * @see Structure.StructurePackage#getAttribute_AttributeValue()
	 * @model
	 * @generated
	 */
	String getAttributeValue();

	/**
	 * Sets the value of the '{@link Structure.Attribute#getAttributeValue <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' attribute.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(String value);

} // Attribute
