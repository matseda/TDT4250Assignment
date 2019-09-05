/**
 */
package study.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import study.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyFactoryImpl extends EFactoryImpl implements StudyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyFactory init() {
		try {
			StudyFactory theStudyFactory = (StudyFactory)EPackage.Registry.INSTANCE.getEFactory(StudyPackage.eNS_URI);
			if (theStudyFactory != null) {
				return theStudyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyFactoryImpl() {
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
			case StudyPackage.PROGRAMME: return createProgramme();
			case StudyPackage.SEMESTER: return createSemester();
			case StudyPackage.SPECIALIZATION: return createSpecialization();
			case StudyPackage.SEMESTER_COURSE: return createSemesterCourse();
			case StudyPackage.COURSE: return createCourse();
			case StudyPackage.DEPARTMENT: return createDepartment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterCourse createSemesterCourse() {
		SemesterCourseImpl semesterCourse = new SemesterCourseImpl();
		return semesterCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPackage getStudyPackage() {
		return (StudyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyPackage getPackage() {
		return StudyPackage.eINSTANCE;
	}

} //StudyFactoryImpl
