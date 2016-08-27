/**
 */
package StructuralBehavior.impl;

import StructuralBehavior.Attribute;
import StructuralBehavior.Method;
import StructuralBehavior.Operation;
import StructuralBehavior.StructuralBehaviorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StructuralBehavior.impl.MethodImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link StructuralBehavior.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link StructuralBehavior.impl.MethodImpl#getInput <em>Input</em>}</li>
 *   <li>{@link StructuralBehavior.impl.MethodImpl#getContain <em>Contain</em>}</li>
 *   <li>{@link StructuralBehavior.impl.MethodImpl#getMethodVisibility <em>Method Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> input;

	/**
	 * The cached value of the '{@link #getContain() <em>Contain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> contain;

	/**
	 * The default value of the '{@link #getMethodVisibility() <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodVisibility() <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodVisibility()
	 * @generated
	 * @ordered
	 */
	protected String methodVisibility = METHOD_VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralBehaviorPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.METHOD__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Attribute>(Attribute.class, this, StructuralBehaviorPackage.METHOD__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getContain() {
		if (contain == null) {
			contain = new EObjectContainmentEList<Operation>(Operation.class, this, StructuralBehaviorPackage.METHOD__CONTAIN);
		}
		return contain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodVisibility() {
		return methodVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodVisibility(String newMethodVisibility) {
		String oldMethodVisibility = methodVisibility;
		methodVisibility = newMethodVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.METHOD__METHOD_VISIBILITY, oldMethodVisibility, methodVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralBehaviorPackage.METHOD__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case StructuralBehaviorPackage.METHOD__CONTAIN:
				return ((InternalEList<?>)getContain()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralBehaviorPackage.METHOD__METHOD_NAME:
				return getMethodName();
			case StructuralBehaviorPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case StructuralBehaviorPackage.METHOD__INPUT:
				return getInput();
			case StructuralBehaviorPackage.METHOD__CONTAIN:
				return getContain();
			case StructuralBehaviorPackage.METHOD__METHOD_VISIBILITY:
				return getMethodVisibility();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralBehaviorPackage.METHOD__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case StructuralBehaviorPackage.METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case StructuralBehaviorPackage.METHOD__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Attribute>)newValue);
				return;
			case StructuralBehaviorPackage.METHOD__CONTAIN:
				getContain().clear();
				getContain().addAll((Collection<? extends Operation>)newValue);
				return;
			case StructuralBehaviorPackage.METHOD__METHOD_VISIBILITY:
				setMethodVisibility((String)newValue);
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
			case StructuralBehaviorPackage.METHOD__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case StructuralBehaviorPackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case StructuralBehaviorPackage.METHOD__INPUT:
				getInput().clear();
				return;
			case StructuralBehaviorPackage.METHOD__CONTAIN:
				getContain().clear();
				return;
			case StructuralBehaviorPackage.METHOD__METHOD_VISIBILITY:
				setMethodVisibility(METHOD_VISIBILITY_EDEFAULT);
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
			case StructuralBehaviorPackage.METHOD__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case StructuralBehaviorPackage.METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case StructuralBehaviorPackage.METHOD__INPUT:
				return input != null && !input.isEmpty();
			case StructuralBehaviorPackage.METHOD__CONTAIN:
				return contain != null && !contain.isEmpty();
			case StructuralBehaviorPackage.METHOD__METHOD_VISIBILITY:
				return METHOD_VISIBILITY_EDEFAULT == null ? methodVisibility != null : !METHOD_VISIBILITY_EDEFAULT.equals(methodVisibility);
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
		result.append(" (methodName: ");
		result.append(methodName);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", methodVisibility: ");
		result.append(methodVisibility);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
