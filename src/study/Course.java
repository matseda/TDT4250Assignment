/**
 */
package study;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Course#getCode <em>Code</em>}</li>
 *   <li>{@link study.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link study.Course#getName <em>Name</em>}</li>
 *   <li>{@link study.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link study.Course#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see study.StudyPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link study.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see study.StudyPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link study.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see study.StudyPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link study.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see study.StudyPackage#getCourse_Department()
	 * @see study.Department#getCourses
	 * @model opposite="courses" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link study.Course#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Course
