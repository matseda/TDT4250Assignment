/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Programme#getName <em>Name</em>}</li>
 *   <li>{@link study.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link study.Programme#getDuration <em>Duration</em>}</li>
 *   <li>{@link study.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link study.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link study.Programme#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see study.StudyPackage#getProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link study.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see study.StudyPackage#getProgramme_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link study.Programme#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link study.Semester}.
	 * It is bidirectional and its opposite is '{@link study.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see study.StudyPackage#getProgramme_Semesters()
	 * @see study.Semester#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link study.Specialization}.
	 * It is bidirectional and its opposite is '{@link study.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see study.StudyPackage#getProgramme_Specializations()
	 * @see study.Specialization#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Department#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see study.StudyPackage#getProgramme_Department()
	 * @see study.Department#getPrograms
	 * @model opposite="programs" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link study.Programme#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Programme
