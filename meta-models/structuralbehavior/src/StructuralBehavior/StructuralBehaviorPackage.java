/**
 */
package StructuralBehavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see StructuralBehavior.StructuralBehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface StructuralBehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StructuralBehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://SB";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StructuralBehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuralBehaviorPackage eINSTANCE = StructuralBehavior.impl.StructuralBehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.ClassImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Have</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAVE = 1;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DO = 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.MethodImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Contain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTAIN = 3;

	/**
	 * The feature id for the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_VISIBILITY = 4;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.AttributeImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.OperationImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.AssignmentImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE_NAME = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE_VALUE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Varible Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIBLE_TYPE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.WhileImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 5;

	/**
	 * The feature id for the '<em><b>Check While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CHECK_WHILE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DO_WHILE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.IfImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getIf()
	 * @generated
	 */
	int IF = 6;

	/**
	 * The feature id for the '<em><b>Check If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CHECK_IF = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DO_IF = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.ConditionImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.BodyImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 8;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__OPERATIONS = 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StructuralBehavior.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StructuralBehavior.impl.PackageImpl
	 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMPOSED = 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see StructuralBehavior.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StructuralBehavior.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.Class#getHave <em>Have</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Have</em>'.
	 * @see StructuralBehavior.Class#getHave()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Have();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.Class#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do</em>'.
	 * @see StructuralBehavior.Class#getDo()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Do();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see StructuralBehavior.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Method#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see StructuralBehavior.Method#getMethodName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see StructuralBehavior.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.Method#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see StructuralBehavior.Method#getInput()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.Method#getContain <em>Contain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contain</em>'.
	 * @see StructuralBehavior.Method#getContain()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Contain();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Method#getMethodVisibility <em>Method Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Visibility</em>'.
	 * @see StructuralBehavior.Method#getMethodVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodVisibility();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see StructuralBehavior.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Attribute#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see StructuralBehavior.Attribute#getAttributeName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Attribute#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Type</em>'.
	 * @see StructuralBehavior.Attribute#getAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeType();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Attribute#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Value</em>'.
	 * @see StructuralBehavior.Attribute#getAttributeValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeValue();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see StructuralBehavior.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see StructuralBehavior.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Assignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see StructuralBehavior.Assignment#getVariableName()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Assignment#getVariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Value</em>'.
	 * @see StructuralBehavior.Assignment#getVariableValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_VariableValue();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Assignment#getVaribleType <em>Varible Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varible Type</em>'.
	 * @see StructuralBehavior.Assignment#getVaribleType()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_VaribleType();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see StructuralBehavior.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.While#getCheckWhile <em>Check While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check While</em>'.
	 * @see StructuralBehavior.While#getCheckWhile()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_CheckWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.While#getDoWhile <em>Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do While</em>'.
	 * @see StructuralBehavior.While#getDoWhile()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_DoWhile();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see StructuralBehavior.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.If#getCheckIf <em>Check If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check If</em>'.
	 * @see StructuralBehavior.If#getCheckIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_CheckIf();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.If#getDoIf <em>Do If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do If</em>'.
	 * @see StructuralBehavior.If#getDoIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_DoIf();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see StructuralBehavior.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see StructuralBehavior.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see StructuralBehavior.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the attribute '{@link StructuralBehavior.Body#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operations</em>'.
	 * @see StructuralBehavior.Body#getOperations()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Operations();

	/**
	 * Returns the meta object for class '{@link StructuralBehavior.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see StructuralBehavior.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link StructuralBehavior.Package#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed</em>'.
	 * @see StructuralBehavior.Package#getComposed()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Composed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuralBehaviorFactory getStructuralBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.ClassImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Have</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAVE = eINSTANCE.getClass_Have();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__DO = eINSTANCE.getClass_Do();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.MethodImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_NAME = eINSTANCE.getMethod_MethodName();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__INPUT = eINSTANCE.getMethod_Input();

		/**
		 * The meta object literal for the '<em><b>Contain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CONTAIN = eINSTANCE.getMethod_Contain();

		/**
		 * The meta object literal for the '<em><b>Method Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_VISIBILITY = eINSTANCE.getMethod_MethodVisibility();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.AttributeImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_TYPE = eINSTANCE.getAttribute_AttributeType();

		/**
		 * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getAttribute_AttributeValue();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.OperationImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.AssignmentImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VARIABLE_NAME = eINSTANCE.getAssignment_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VARIABLE_VALUE = eINSTANCE.getAssignment_VariableValue();

		/**
		 * The meta object literal for the '<em><b>Varible Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VARIBLE_TYPE = eINSTANCE.getAssignment_VaribleType();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.WhileImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Check While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CHECK_WHILE = eINSTANCE.getWhile_CheckWhile();

		/**
		 * The meta object literal for the '<em><b>Do While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__DO_WHILE = eINSTANCE.getWhile_DoWhile();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.IfImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Check If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CHECK_IF = eINSTANCE.getIf_CheckIf();

		/**
		 * The meta object literal for the '<em><b>Do If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__DO_IF = eINSTANCE.getIf_DoIf();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.ConditionImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.BodyImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__OPERATIONS = eINSTANCE.getBody_Operations();

		/**
		 * The meta object literal for the '{@link StructuralBehavior.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StructuralBehavior.impl.PackageImpl
		 * @see StructuralBehavior.impl.StructuralBehaviorPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__COMPOSED = eINSTANCE.getPackage_Composed();

	}

} //StructuralBehaviorPackage
