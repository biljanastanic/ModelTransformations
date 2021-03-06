/**
 */
package Structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Structure.Class#getName <em>Name</em>}</li>
 *   <li>{@link Structure.Class#getHave <em>Have</em>}</li>
 *   <li>{@link Structure.Class#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see Structure.StructurePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Structure.StructurePackage#getClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Structure.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Have</b></em>' containment reference list.
	 * The list contents are of type {@link Structure.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Have</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have</em>' containment reference list.
	 * @see Structure.StructurePackage#getClass_Have()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getHave();

	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference list.
	 * The list contents are of type {@link Structure.AbstractMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference list.
	 * @see Structure.StructurePackage#getClass_Do()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMethod> getDo();

} // Class
