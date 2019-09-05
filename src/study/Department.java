/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Department#getCourses <em>Courses</em>}</li>
 *   <li>{@link study.Department#getPrograms <em>Programs</em>}</li>
 *   <li>{@link study.Department#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link study.Course}.
	 * It is bidirectional and its opposite is '{@link study.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Courses()
	 * @see study.Course#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link study.Programme}.
	 * It is bidirectional and its opposite is '{@link study.Programme#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Programs()
	 * @see study.Programme#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Programme> getPrograms();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Department
