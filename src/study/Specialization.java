/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link study.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link study.Specialization#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link study.Semester}.
	 * It is bidirectional and its opposite is '{@link study.Semester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see study.StudyPackage#getSpecialization_Semesters()
	 * @see study.Semester#getSpecialization
	 * @model opposite="specialization" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see study.StudyPackage#getSpecialization_Programme()
	 * @see study.Programme#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link study.Specialization#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

} // Specialization
