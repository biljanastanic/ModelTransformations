/**
 */
package Behaviour.impl;

import Behaviour.BehaviourPackage;
import Behaviour.Body;
import Behaviour.Condition;
import Behaviour.If;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Behaviour.impl.IfImpl#getCheckIf <em>Check If</em>}</li>
 *   <li>{@link Behaviour.impl.IfImpl#getDoIf <em>Do If</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends OperationImpl implements If {
	/**
	 * The cached value of the '{@link #getCheckIf() <em>Check If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckIf()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> checkIf;

	/**
	 * The cached value of the '{@link #getDoIf() <em>Do If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoIf()
	 * @generated
	 * @ordered
	 */
	protected EList<Body> doIf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCheckIf() {
		if (checkIf == null) {
			checkIf = new EObjectContainmentEList<Condition>(Condition.class, this, BehaviourPackage.IF__CHECK_IF);
		}
		return checkIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Body> getDoIf() {
		if (doIf == null) {
			doIf = new EObjectContainmentEList<Body>(Body.class, this, BehaviourPackage.IF__DO_IF);
		}
		return doIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.IF__CHECK_IF:
				return ((InternalEList<?>)getCheckIf()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.IF__DO_IF:
				return ((InternalEList<?>)getDoIf()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.IF__CHECK_IF:
				return getCheckIf();
			case BehaviourPackage.IF__DO_IF:
				return getDoIf();
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
			case BehaviourPackage.IF__CHECK_IF:
				getCheckIf().clear();
				getCheckIf().addAll((Collection<? extends Condition>)newValue);
				return;
			case BehaviourPackage.IF__DO_IF:
				getDoIf().clear();
				getDoIf().addAll((Collection<? extends Body>)newValue);
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
			case BehaviourPackage.IF__CHECK_IF:
				getCheckIf().clear();
				return;
			case BehaviourPackage.IF__DO_IF:
				getDoIf().clear();
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
			case BehaviourPackage.IF__CHECK_IF:
				return checkIf != null && !checkIf.isEmpty();
			case BehaviourPackage.IF__DO_IF:
				return doIf != null && !doIf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
