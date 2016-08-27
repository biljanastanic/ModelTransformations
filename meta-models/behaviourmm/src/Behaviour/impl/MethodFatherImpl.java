/**
 */
package Behaviour.impl;

import Behaviour.BehaviourPackage;
import Behaviour.MethodFather;
import Behaviour.Operation;

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
 * An implementation of the model object '<em><b>Method Father</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Behaviour.impl.MethodFatherImpl#getContain <em>Contain</em>}</li>
 *   <li>{@link Behaviour.impl.MethodFatherImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link Behaviour.impl.MethodFatherImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Behaviour.impl.MethodFatherImpl#getMethodVisibility <em>Method Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodFatherImpl extends MinimalEObjectImpl.Container implements MethodFather {
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
	protected MethodFatherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.METHOD_FATHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getContain() {
		if (contain == null) {
			contain = new EObjectContainmentEList<Operation>(Operation.class, this, BehaviourPackage.METHOD_FATHER__CONTAIN);
		}
		return contain;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.METHOD_FATHER__METHOD_NAME, oldMethodName, methodName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.METHOD_FATHER__RETURN_TYPE, oldReturnType, returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.METHOD_FATHER__METHOD_VISIBILITY, oldMethodVisibility, methodVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.METHOD_FATHER__CONTAIN:
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
			case BehaviourPackage.METHOD_FATHER__CONTAIN:
				return getContain();
			case BehaviourPackage.METHOD_FATHER__METHOD_NAME:
				return getMethodName();
			case BehaviourPackage.METHOD_FATHER__RETURN_TYPE:
				return getReturnType();
			case BehaviourPackage.METHOD_FATHER__METHOD_VISIBILITY:
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
			case BehaviourPackage.METHOD_FATHER__CONTAIN:
				getContain().clear();
				getContain().addAll((Collection<? extends Operation>)newValue);
				return;
			case BehaviourPackage.METHOD_FATHER__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case BehaviourPackage.METHOD_FATHER__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case BehaviourPackage.METHOD_FATHER__METHOD_VISIBILITY:
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
			case BehaviourPackage.METHOD_FATHER__CONTAIN:
				getContain().clear();
				return;
			case BehaviourPackage.METHOD_FATHER__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case BehaviourPackage.METHOD_FATHER__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case BehaviourPackage.METHOD_FATHER__METHOD_VISIBILITY:
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
			case BehaviourPackage.METHOD_FATHER__CONTAIN:
				return contain != null && !contain.isEmpty();
			case BehaviourPackage.METHOD_FATHER__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case BehaviourPackage.METHOD_FATHER__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case BehaviourPackage.METHOD_FATHER__METHOD_VISIBILITY:
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

} //MethodFatherImpl
