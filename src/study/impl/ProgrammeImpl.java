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
import study.Department;
import study.Programme;
import study.Semester;
import study.Specialization;
import study.StudyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link study.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link study.impl.ProgrammeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link study.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link study.impl.ProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link study.impl.ProgrammeImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.PROGRAMME__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, StudyPackage.PROGRAMME__SEMESTERS, StudyPackage.SEMESTER__PROGRAMME);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, StudyPackage.PROGRAMME__SPECIALIZATIONS, StudyPackage.SPECIALIZATION__PROGRAMME);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getDepartment() {
		if (eContainerFeatureID() != StudyPackage.PROGRAMME__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, StudyPackage.PROGRAMME__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != StudyPackage.PROGRAMME__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, StudyPackage.DEPARTMENT__PROGRAMS, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.PROGRAMME__DEPARTMENT, newDepartment, newDepartment));
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
			case StudyPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case StudyPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
			case StudyPackage.PROGRAMME__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
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
			case StudyPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case StudyPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case StudyPackage.PROGRAMME__DEPARTMENT:
				return basicSetDepartment(null, msgs);
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
			case StudyPackage.PROGRAMME__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, StudyPackage.DEPARTMENT__PROGRAMS, Department.class, msgs);
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
			case StudyPackage.PROGRAMME__NAME:
				return getName();
			case StudyPackage.PROGRAMME__CODE:
				return getCode();
			case StudyPackage.PROGRAMME__DURATION:
				return getDuration();
			case StudyPackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case StudyPackage.PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case StudyPackage.PROGRAMME__DEPARTMENT:
				return getDepartment();
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
			case StudyPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyPackage.PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case StudyPackage.PROGRAMME__DURATION:
				setDuration((Integer)newValue);
				return;
			case StudyPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyPackage.PROGRAMME__DEPARTMENT:
				setDepartment((Department)newValue);
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
			case StudyPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyPackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyPackage.PROGRAMME__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case StudyPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case StudyPackage.PROGRAMME__DEPARTMENT:
				setDepartment((Department)null);
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
			case StudyPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyPackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyPackage.PROGRAMME__DURATION:
				return duration != DURATION_EDEFAULT;
			case StudyPackage.PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyPackage.PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case StudyPackage.PROGRAMME__DEPARTMENT:
				return getDepartment() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
