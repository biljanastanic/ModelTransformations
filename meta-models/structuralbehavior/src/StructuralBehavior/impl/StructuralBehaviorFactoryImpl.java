/**
 */
package StructuralBehavior.impl;

import StructuralBehavior.Assignment;
import StructuralBehavior.Attribute;
import StructuralBehavior.Body;
import StructuralBehavior.Condition;
import StructuralBehavior.If;
import StructuralBehavior.Method;
import StructuralBehavior.StructuralBehaviorFactory;
import StructuralBehavior.StructuralBehaviorPackage;
import StructuralBehavior.While;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuralBehaviorFactoryImpl extends EFactoryImpl implements StructuralBehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuralBehaviorFactory init() {
		try {
			StructuralBehaviorFactory theStructuralBehaviorFactory = (StructuralBehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(StructuralBehaviorPackage.eNS_URI);
			if (theStructuralBehaviorFactory != null) {
				return theStructuralBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuralBehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralBehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructuralBehaviorPackage.CLASS: return createClass();
			case StructuralBehaviorPackage.METHOD: return createMethod();
			case StructuralBehaviorPackage.ATTRIBUTE: return createAttribute();
			case StructuralBehaviorPackage.ASSIGNMENT: return createAssignment();
			case StructuralBehaviorPackage.WHILE: return createWhile();
			case StructuralBehaviorPackage.IF: return createIf();
			case StructuralBehaviorPackage.CONDITION: return createCondition();
			case StructuralBehaviorPackage.BODY: return createBody();
			case StructuralBehaviorPackage.PACKAGE: return createPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralBehavior.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralBehavior.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralBehaviorPackage getStructuralBehaviorPackage() {
		return (StructuralBehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuralBehaviorPackage getPackage() {
		return StructuralBehaviorPackage.eINSTANCE;
	}

} //StructuralBehaviorFactoryImpl
