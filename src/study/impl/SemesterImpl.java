/**
 */
package study.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import study.Programme;
import study.Semester;
import study.SemesterCourse;
import study.Specialization;
import study.StudyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#isSpring <em>Spring</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpring() <em>Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpring() <em>Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpring()
	 * @generated
	 * @ordered
	 */
	protected boolean spring = SPRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<SemesterCourse> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpring() {
		return spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpring(boolean newSpring) {
		boolean oldSpring = spring;
		spring = newSpring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__SPRING, oldSpring, spring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemesterCourse> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<SemesterCourse>(SemesterCourse.class, this, StudyPackage.SEMESTER__COURSES, StudyPackage.SEMESTER_COURSE__SEMESTER);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getProgramme() {
		if (eContainerFeatureID() != StudyPackage.SEMESTER__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, StudyPackage.SEMESTER__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != StudyPackage.SEMESTER__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, StudyPackage.PROGRAMME__SEMESTERS, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getSpecialization() {
		if (eContainerFeatureID() != StudyPackage.SEMESTER__SPECIALIZATION) return null;
		return (Specialization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialization(Specialization newSpecialization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecialization, StudyPackage.SEMESTER__SPECIALIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialization(Specialization newSpecialization) {
		if (newSpecialization != eInternalContainer() || (eContainerFeatureID() != StudyPackage.SEMESTER__SPECIALIZATION && newSpecialization != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialization != null)
				msgs = ((InternalEObject)newSpecialization).eInverseAdd(this, StudyPackage.SPECIALIZATION__SEMESTERS, Specialization.class, msgs);
			msgs = basicSetSpecialization(newSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__SPECIALIZATION, newSpecialization, newSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.SEMESTER__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case StudyPackage.SEMESTER__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
			case StudyPackage.SEMESTER__SPECIALIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecialization((Specialization)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.SEMESTER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case StudyPackage.SEMESTER__PROGRAMME:
				return basicSetProgramme(null, msgs);
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return basicSetSpecialization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyPackage.SEMESTER__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, StudyPackage.PROGRAMME__SEMESTERS, Programme.class, msgs);
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return eInternalContainer().eInverseRemove(this, StudyPackage.SPECIALIZATION__SEMESTERS, Specialization.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPackage.SEMESTER__YEAR:
				return getYear();
			case StudyPackage.SEMESTER__SPRING:
				return isSpring();
			case StudyPackage.SEMESTER__COURSES:
				return getCourses();
			case StudyPackage.SEMESTER__PROGRAMME:
				return getProgramme();
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return getSpecialization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyPackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case StudyPackage.SEMESTER__SPRING:
				setSpring((Boolean)newValue);
				return;
			case StudyPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends SemesterCourse>)newValue);
				return;
			case StudyPackage.SEMESTER__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case StudyPackage.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyPackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case StudyPackage.SEMESTER__SPRING:
				setSpring(SPRING_EDEFAULT);
				return;
			case StudyPackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case StudyPackage.SEMESTER__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case StudyPackage.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyPackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case StudyPackage.SEMESTER__SPRING:
				return spring != SPRING_EDEFAULT;
			case StudyPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyPackage.SEMESTER__PROGRAMME:
				return getProgramme() != null;
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return getSpecialization() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(", spring: ");
		result.append(spring);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
