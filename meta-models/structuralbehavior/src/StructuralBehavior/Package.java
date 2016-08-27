/**
 */
package StructuralBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StructuralBehavior.Package#getComposed <em>Composed</em>}</li>
 * </ul>
 * </p>
 *
 * @see StructuralBehavior.StructuralBehaviorPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Composed</b></em>' containment reference list.
	 * The list contents are of type {@link StructuralBehavior.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' containment reference list.
	 * @see StructuralBehavior.StructuralBehaviorPackage#getPackage_Composed()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuralBehavior.Class> getComposed();

} // Package
