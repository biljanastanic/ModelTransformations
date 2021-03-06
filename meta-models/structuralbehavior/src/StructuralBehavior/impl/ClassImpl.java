/**
 */
package StructuralBehavior.impl;

import StructuralBehavior.Attribute;
import StructuralBehavior.Method;
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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StructuralBehavior.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link StructuralBehavior.impl.ClassImpl#getHave <em>Have</em>}</li>
 *   <li>{@link StructuralBehavior.impl.ClassImpl#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements StructuralBehavior.Class {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHave() <em>Have</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHave()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> have;

	/**
	 * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> do_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralBehaviorPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralBehaviorPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getHave() {
		if (have == null) {
			have = new EObjectContainmentEList<Attribute>(Attribute.class, this, StructuralBehaviorPackage.CLASS__HAVE);
		}
		return have;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getDo() {
		if (do_ == null) {
			do_ = new EObjectContainmentEList<Method>(Method.class, this, StructuralBehaviorPackage.CLASS__DO);
		}
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralBehaviorPackage.CLASS__HAVE:
				return ((InternalEList<?>)getHave()).basicRemove(otherEnd, msgs);
			case StructuralBehaviorPackage.CLASS__DO:
				return ((InternalEList<?>)getDo()).basicRemove(otherEnd, msgs);
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
			case StructuralBehaviorPackage.CLASS__NAME:
				return getName();
			case StructuralBehaviorPackage.CLASS__HAVE:
				return getHave();
			case StructuralBehaviorPackage.CLASS__DO:
				return getDo();
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
			case StructuralBehaviorPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case StructuralBehaviorPackage.CLASS__HAVE:
				getHave().clear();
				getHave().addAll((Collection<? extends Attribute>)newValue);
				return;
			case StructuralBehaviorPackage.CLASS__DO:
				getDo().clear();
				getDo().addAll((Collection<? extends Method>)newValue);
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
			case StructuralBehaviorPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructuralBehaviorPackage.CLASS__HAVE:
				getHave().clear();
				return;
			case StructuralBehaviorPackage.CLASS__DO:
				getDo().clear();
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
			case StructuralBehaviorPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructuralBehaviorPackage.CLASS__HAVE:
				return have != null && !have.isEmpty();
			case StructuralBehaviorPackage.CLASS__DO:
				return do_ != null && !do_.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
