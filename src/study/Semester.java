/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link study.Semester#isSpring <em>Spring</em>}</li>
 *   <li>{@link study.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link study.Semester#getProgramme <em>Programme</em>}</li>
 *   <li>{@link study.Semester#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseCredits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 courseCredits='self.courses -&gt; select(s | s.mandatory ).course.credits -&gt; sum() &lt;= 30.0 '"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see study.StudyPackage#getSemester_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link study.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring</em>' attribute.
	 * @see #setSpring(boolean)
	 * @see study.StudyPackage#getSemester_Spring()
	 * @model
	 * @generated
	 */
	boolean isSpring();

	/**
	 * Sets the value of the '{@link study.Semester#isSpring <em>Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring</em>' attribute.
	 * @see #isSpring()
	 * @generated
	 */
	void setSpring(boolean value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link study.SemesterCourse}.
	 * It is bidirectional and its opposite is '{@link study.SemesterCourse#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see study.StudyPackage#getSemester_Courses()
	 * @see study.SemesterCourse#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<SemesterCourse> getCourses();

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see study.StudyPackage#getSemester_Programme()
	 * @see study.Programme#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link study.Semester#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' container reference.
	 * @see #setSpecialization(Specialization)
	 * @see study.StudyPackage#getSemester_Specialization()
	 * @see study.Specialization#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link study.Semester#getSpecialization <em>Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' container reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

} // Semester
