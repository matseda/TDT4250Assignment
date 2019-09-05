/**
 */
package study;

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
 * @see study.StudyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "study";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TDT4250.Assignments.study";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TDT4250.Assignments.study";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyPackage eINSTANCE = study.impl.StudyPackageImpl.init();

	/**
	 * The meta object id for the '{@link study.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.ProgrammeImpl
	 * @see study.impl.StudyPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SEMESTERS = 3;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALIZATIONS = 4;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__DEPARTMENT = 5;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.SemesterImpl
	 * @see study.impl.StudyPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPRING = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAMME = 3;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALIZATION = 4;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.SpecializationImpl
	 * @see study.impl.StudyPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PROGRAMME = 2;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.SemesterCourseImpl <em>Semester Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.SemesterCourseImpl
	 * @see study.impl.StudyPackageImpl#getSemesterCourse()
	 * @generated
	 */
	int SEMESTER_COURSE = 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__MANDATORY = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Semester Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.CourseImpl
	 * @see study.impl.StudyPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEPARTMENT = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link study.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.DepartmentImpl
	 * @see study.impl.StudyPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link study.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see study.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link study.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link study.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see study.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for the attribute '{@link study.Programme#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see study.Programme#getDuration()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see study.Programme#getSemesters()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Semesters();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see study.Programme#getSpecializations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specializations();

	/**
	 * Returns the meta object for the container reference '{@link study.Programme#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see study.Programme#getDepartment()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Department();

	/**
	 * Returns the meta object for class '{@link study.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see study.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link study.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see study.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Year();

	/**
	 * Returns the meta object for the attribute '{@link study.Semester#isSpring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spring</em>'.
	 * @see study.Semester#isSpring()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Spring();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see study.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for the container reference '{@link study.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see study.Semester#getProgramme()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Programme();

	/**
	 * Returns the meta object for the container reference '{@link study.Semester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specialization</em>'.
	 * @see study.Semester#getSpecialization()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specialization();

	/**
	 * Returns the meta object for class '{@link study.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see study.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link study.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see study.Specialization#getSemesters()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Semesters();

	/**
	 * Returns the meta object for the container reference '{@link study.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see study.Specialization#getProgramme()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Programme();

	/**
	 * Returns the meta object for class '{@link study.SemesterCourse <em>Semester Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Course</em>'.
	 * @see study.SemesterCourse
	 * @generated
	 */
	EClass getSemesterCourse();

	/**
	 * Returns the meta object for the attribute '{@link study.SemesterCourse#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see study.SemesterCourse#isMandatory()
	 * @see #getSemesterCourse()
	 * @generated
	 */
	EAttribute getSemesterCourse_Mandatory();

	/**
	 * Returns the meta object for the reference '{@link study.SemesterCourse#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see study.SemesterCourse#getCourse()
	 * @see #getSemesterCourse()
	 * @generated
	 */
	EReference getSemesterCourse_Course();

	/**
	 * Returns the meta object for the container reference '{@link study.SemesterCourse#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see study.SemesterCourse#getSemester()
	 * @see #getSemesterCourse()
	 * @generated
	 */
	EReference getSemesterCourse_Semester();

	/**
	 * Returns the meta object for class '{@link study.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see study.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see study.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see study.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see study.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the container reference '{@link study.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see study.Course#getDepartment()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Department();

	/**
	 * Returns the meta object for class '{@link study.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see study.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see study.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Department#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see study.Department#getPrograms()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programs();

	/**
	 * Returns the meta object for the attribute '{@link study.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyFactory getStudyFactory();

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
		 * The meta object literal for the '{@link study.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.ProgrammeImpl
		 * @see study.impl.StudyPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__DURATION = eINSTANCE.getProgramme_Duration();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SEMESTERS = eINSTANCE.getProgramme_Semesters();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALIZATIONS = eINSTANCE.getProgramme_Specializations();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__DEPARTMENT = eINSTANCE.getProgramme_Department();

		/**
		 * The meta object literal for the '{@link study.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.SemesterImpl
		 * @see study.impl.StudyPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '<em><b>Spring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SPRING = eINSTANCE.getSemester_Spring();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PROGRAMME = eINSTANCE.getSemester_Programme();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALIZATION = eINSTANCE.getSemester_Specialization();

		/**
		 * The meta object literal for the '{@link study.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.SpecializationImpl
		 * @see study.impl.StudyPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SEMESTERS = eINSTANCE.getSpecialization_Semesters();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PROGRAMME = eINSTANCE.getSpecialization_Programme();

		/**
		 * The meta object literal for the '{@link study.impl.SemesterCourseImpl <em>Semester Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.SemesterCourseImpl
		 * @see study.impl.StudyPackageImpl#getSemesterCourse()
		 * @generated
		 */
		EClass SEMESTER_COURSE = eINSTANCE.getSemesterCourse();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_COURSE__MANDATORY = eINSTANCE.getSemesterCourse_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE__COURSE = eINSTANCE.getSemesterCourse_Course();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE__SEMESTER = eINSTANCE.getSemesterCourse_Semester();

		/**
		 * The meta object literal for the '{@link study.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.CourseImpl
		 * @see study.impl.StudyPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__DEPARTMENT = eINSTANCE.getCourse_Department();

		/**
		 * The meta object literal for the '{@link study.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.DepartmentImpl
		 * @see study.impl.StudyPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMS = eINSTANCE.getDepartment_Programs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

	}

} //StudyPackage
