/**
 */
package Behaviour;

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
 * @see Behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Behaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://behaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Behaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourPackage eINSTANCE = Behaviour.impl.BehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link Behaviour.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Behaviour.impl.OperationImpl
	 * @see Behaviour.impl.BehaviourPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 0;

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
	 * The meta object id for the '{@link Behaviour.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Behaviour.impl.IfImpl
	 * @see Behaviour.impl.BehaviourPackageImpl#getIf()
	 * @generated
	 */
	int IF = 1;

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
	 * The meta object id for the '{@link Behaviour.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Behaviour.impl.WhileImpl
	 * @see Behaviour.impl.BehaviourPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 2;

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
	 * The meta object id for the '{@link Behaviour.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Behaviour.impl.ConditionImpl
	 * @see Behaviour.impl.BehaviourPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

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
	 * The meta object id for the '{@link Behaviour.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Behaviour.impl.BodyImpl
	 * @see Behaviour.impl.BehaviourPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 4;

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
	 * The meta object id for the '{@link Behaviour.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Behaviour.impl.AssignmentImpl
	 * @see Behaviour.impl.BehaviourPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 5;

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
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE_TYPE = OPERATION_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link Behaviour.impl.MethodFatherImpl <em>Method Father</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Behaviour.impl.MethodFatherImpl
	 * @see Behaviour.impl.BehaviourPackageImpl#getMethodFather()
	 * @generated
	 */
	int METHOD_FATHER = 6;

	/**
	 * The feature id for the '<em><b>Contain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FATHER__CONTAIN = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FATHER__METHOD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FATHER__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FATHER__METHOD_VISIBILITY = 3;

	/**
	 * The number of structural features of the '<em>Method Father</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FATHER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Method Father</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FATHER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Behaviour.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see Behaviour.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link Behaviour.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see Behaviour.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference list '{@link Behaviour.If#getCheckIf <em>Check If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check If</em>'.
	 * @see Behaviour.If#getCheckIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_CheckIf();

	/**
	 * Returns the meta object for the containment reference list '{@link Behaviour.If#getDoIf <em>Do If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do If</em>'.
	 * @see Behaviour.If#getDoIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_DoIf();

	/**
	 * Returns the meta object for class '{@link Behaviour.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see Behaviour.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link Behaviour.While#getCheckWhile <em>Check While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check While</em>'.
	 * @see Behaviour.While#getCheckWhile()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_CheckWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link Behaviour.While#getDoWhile <em>Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do While</em>'.
	 * @see Behaviour.While#getDoWhile()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_DoWhile();

	/**
	 * Returns the meta object for class '{@link Behaviour.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see Behaviour.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see Behaviour.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link Behaviour.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see Behaviour.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.Body#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operations</em>'.
	 * @see Behaviour.Body#getOperations()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Operations();

	/**
	 * Returns the meta object for class '{@link Behaviour.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see Behaviour.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.Assignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see Behaviour.Assignment#getVariableName()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.Assignment#getVariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Value</em>'.
	 * @see Behaviour.Assignment#getVariableValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_VariableValue();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.Assignment#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type</em>'.
	 * @see Behaviour.Assignment#getVariableType()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_VariableType();

	/**
	 * Returns the meta object for class '{@link Behaviour.MethodFather <em>Method Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Father</em>'.
	 * @see Behaviour.MethodFather
	 * @generated
	 */
	EClass getMethodFather();

	/**
	 * Returns the meta object for the containment reference list '{@link Behaviour.MethodFather#getContain <em>Contain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contain</em>'.
	 * @see Behaviour.MethodFather#getContain()
	 * @see #getMethodFather()
	 * @generated
	 */
	EReference getMethodFather_Contain();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.MethodFather#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see Behaviour.MethodFather#getMethodName()
	 * @see #getMethodFather()
	 * @generated
	 */
	EAttribute getMethodFather_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.MethodFather#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see Behaviour.MethodFather#getReturnType()
	 * @see #getMethodFather()
	 * @generated
	 */
	EAttribute getMethodFather_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link Behaviour.MethodFather#getMethodVisibility <em>Method Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Visibility</em>'.
	 * @see Behaviour.MethodFather#getMethodVisibility()
	 * @see #getMethodFather()
	 * @generated
	 */
	EAttribute getMethodFather_MethodVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourFactory getBehaviourFactory();

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
		 * The meta object literal for the '{@link Behaviour.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Behaviour.impl.OperationImpl
		 * @see Behaviour.impl.BehaviourPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link Behaviour.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Behaviour.impl.IfImpl
		 * @see Behaviour.impl.BehaviourPackageImpl#getIf()
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
		 * The meta object literal for the '{@link Behaviour.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Behaviour.impl.WhileImpl
		 * @see Behaviour.impl.BehaviourPackageImpl#getWhile()
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
		 * The meta object literal for the '{@link Behaviour.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Behaviour.impl.ConditionImpl
		 * @see Behaviour.impl.BehaviourPackageImpl#getCondition()
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
		 * The meta object literal for the '{@link Behaviour.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Behaviour.impl.BodyImpl
		 * @see Behaviour.impl.BehaviourPackageImpl#getBody()
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
		 * The meta object literal for the '{@link Behaviour.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Behaviour.impl.AssignmentImpl
		 * @see Behaviour.impl.BehaviourPackageImpl#getAssignment()
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
		 * The meta object literal for the '<em><b>Variable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VARIABLE_TYPE = eINSTANCE.getAssignment_VariableType();

		/**
		 * The meta object literal for the '{@link Behaviour.impl.MethodFatherImpl <em>Method Father</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Behaviour.impl.MethodFatherImpl
		 * @see Behaviour.impl.BehaviourPackageImpl#getMethodFather()
		 * @generated
		 */
		EClass METHOD_FATHER = eINSTANCE.getMethodFather();

		/**
		 * The meta object literal for the '<em><b>Contain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_FATHER__CONTAIN = eINSTANCE.getMethodFather_Contain();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_FATHER__METHOD_NAME = eINSTANCE.getMethodFather_MethodName();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_FATHER__RETURN_TYPE = eINSTANCE.getMethodFather_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Method Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_FATHER__METHOD_VISIBILITY = eINSTANCE.getMethodFather_MethodVisibility();

	}

} //BehaviourPackage
