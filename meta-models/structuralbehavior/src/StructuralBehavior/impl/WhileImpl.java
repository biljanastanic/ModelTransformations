/**
 */
package StructuralBehavior.impl;

import StructuralBehavior.Body;
import StructuralBehavior.Condition;
import StructuralBehavior.StructuralBehaviorPackage;
import StructuralBehavior.While;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StructuralBehavior.impl.WhileImpl#getCheckWhile <em>Check While</em>}</li>
 *   <li>{@link StructuralBehavior.impl.WhileImpl#getDoWhile <em>Do While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileImpl extends OperationImpl implements While {
	/**
	 * The cached value of the '{@link #getCheckWhile() <em>Check While</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckWhile()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> checkWhile;

	/**
	 * The cached value of the '{@link #getDoWhile() <em>Do While</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoWhile()
	 * @generated
	 * @ordered
	 */
	protected EList<Body> doWhile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralBehaviorPackage.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCheckWhile() {
		if (checkWhile == null) {
			checkWhile = new EObjectContainmentEList<Condition>(Condition.class, this, StructuralBehaviorPackage.WHILE__CHECK_WHILE);
		}
		return checkWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Body> getDoWhile() {
		if (doWhile == null) {
			doWhile = new EObjectContainmentEList<Body>(Body.class, this, StructuralBehaviorPackage.WHILE__DO_WHILE);
		}
		return doWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralBehaviorPackage.WHILE__CHECK_WHILE:
				return ((InternalEList<?>)getCheckWhile()).basicRemove(otherEnd, msgs);
			case StructuralBehaviorPackage.WHILE__DO_WHILE:
				return ((InternalEList<?>)getDoWhile()).basicRemove(otherEnd, msgs);
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
			case StructuralBehaviorPackage.WHILE__CHECK_WHILE:
				return getCheckWhile();
			case StructuralBehaviorPackage.WHILE__DO_WHILE:
				return getDoWhile();
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
			case StructuralBehaviorPackage.WHILE__CHECK_WHILE:
				getCheckWhile().clear();
				getCheckWhile().addAll((Collection<? extends Condition>)newValue);
				return;
			case StructuralBehaviorPackage.WHILE__DO_WHILE:
				getDoWhile().clear();
				getDoWhile().addAll((Collection<? extends Body>)newValue);
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
			case StructuralBehaviorPackage.WHILE__CHECK_WHILE:
				getCheckWhile().clear();
				return;
			case StructuralBehaviorPackage.WHILE__DO_WHILE:
				getDoWhile().clear();
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
			case StructuralBehaviorPackage.WHILE__CHECK_WHILE:
				return checkWhile != null && !checkWhile.isEmpty();
			case StructuralBehaviorPackage.WHILE__DO_WHILE:
				return doWhile != null && !doWhile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhileImpl
