/**
 */
package study;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.SemesterCourse#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link study.SemesterCourse#getCourse <em>Course</em>}</li>
 *   <li>{@link study.SemesterCourse#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSemesterCourse()
 * @model
 * @generated
 */
public interface SemesterCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see study.StudyPackage#getSemesterCourse_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link study.SemesterCourse#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see study.StudyPackage#getSemesterCourse_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link study.SemesterCourse#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see study.StudyPackage#getSemesterCourse_Semester()
	 * @see study.Semester#getCourses
	 * @model opposite="courses" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link study.SemesterCourse#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // SemesterCourse
