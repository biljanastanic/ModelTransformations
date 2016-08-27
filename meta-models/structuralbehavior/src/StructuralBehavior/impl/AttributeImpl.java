/**
 */
package StructuralBehavior.impl;

import StructuralBehavior.Attribute;
import StructuralBehavior.StructuralBehaviorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StructuralBehavior.impl.AttributeImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link StructuralBehavior.impl.AttributeImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link StructuralBehavior.impl.AttributeImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected String attributeType = ATTRIBUTE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected String attributeValue = ATTRIBUTE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralBehaviorPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeType() {
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(String newAttributeType) {
		String oldAttributeType = attributeType;
		attributeType = newAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeValue() {
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeValue(String newAttributeValue) {
		String oldAttributeValue = attributeValue;
		attributeValue = newAttributeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_VALUE, oldAttributeValue, attributeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_NAME:
				return getAttributeName();
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return getAttributeType();
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
				return getAttributeValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((String)newValue);
				return;
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
				setAttributeValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
				return;
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
				setAttributeValue(ATTRIBUTE_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
			case StructuralBehaviorPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
				return ATTRIBUTE_VALUE_EDEFAULT == null ? attributeValue != null : !ATTRIBUTE_VALUE_EDEFAULT.equals(attributeValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", attributeType: ");
		result.append(attributeType);
		result.append(", attributeValue: ");
		result.append(attributeValue);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
