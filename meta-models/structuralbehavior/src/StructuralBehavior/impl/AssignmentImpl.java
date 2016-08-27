/**
 */
package StructuralBehavior.impl;

import StructuralBehavior.Assignment;
import StructuralBehavior.StructuralBehaviorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StructuralBehavior.impl.AssignmentImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link StructuralBehavior.impl.AssignmentImpl#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link StructuralBehavior.impl.AssignmentImpl#getVaribleType <em>Varible Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends OperationImpl implements Assignment {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableValue() <em>Variable Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableValue() <em>Variable Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableValue()
	 * @generated
	 * @ordered
	 */
	protected String variableValue = VARIABLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVaribleType() <em>Varible Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaribleType()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIBLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVaribleType() <em>Varible Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaribleType()
	 * @generated
	 * @ordered
	 */
	protected String varibleType = VARIBLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralBehaviorPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableValue() {
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableValue(String newVariableValue) {
		String oldVariableValue = variableValue;
		variableValue = newVariableValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_VALUE, oldVariableValue, variableValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVaribleType() {
		return varibleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaribleType(String newVaribleType) {
		String oldVaribleType = varibleType;
		varibleType = newVaribleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.ASSIGNMENT__VARIBLE_TYPE, oldVaribleType, varibleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_NAME:
				return getVariableName();
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_VALUE:
				return getVariableValue();
			case StructuralBehaviorPackage.ASSIGNMENT__VARIBLE_TYPE:
				return getVaribleType();
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
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_VALUE:
				setVariableValue((String)newValue);
				return;
			case StructuralBehaviorPackage.ASSIGNMENT__VARIBLE_TYPE:
				setVaribleType((String)newValue);
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
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_VALUE:
				setVariableValue(VARIABLE_VALUE_EDEFAULT);
				return;
			case StructuralBehaviorPackage.ASSIGNMENT__VARIBLE_TYPE:
				setVaribleType(VARIBLE_TYPE_EDEFAULT);
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
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case StructuralBehaviorPackage.ASSIGNMENT__VARIABLE_VALUE:
				return VARIABLE_VALUE_EDEFAULT == null ? variableValue != null : !VARIABLE_VALUE_EDEFAULT.equals(variableValue);
			case StructuralBehaviorPackage.ASSIGNMENT__VARIBLE_TYPE:
				return VARIBLE_TYPE_EDEFAULT == null ? varibleType != null : !VARIBLE_TYPE_EDEFAULT.equals(varibleType);
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
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", variableValue: ");
		result.append(variableValue);
		result.append(", varibleType: ");
		result.append(varibleType);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
