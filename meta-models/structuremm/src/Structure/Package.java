/**
 */
package Structure;

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
 *   <li>{@link Structure.Package#getComposed <em>Composed</em>}</li>
 * </ul>
 * </p>
 *
 * @see Structure.StructurePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Composed</b></em>' containment reference list.
	 * The list contents are of type {@link Structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' containment reference list.
	 * @see Structure.StructurePackage#getPackage_Composed()
	 * @model containment="true"
	 * @generated
	 */
	EList<Structure.Class> getComposed();

} // Package
