/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.asmetal.asmetaL.AsmetaLPackage;
import org.xtext.asmetal.asmetaL.Term;
import org.xtext.asmetal.asmetaL.TurboCallRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turbo Call Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.impl.TurboCallRuleImpl#getCalledRuleName <em>Called Rule Name</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.impl.TurboCallRuleImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurboCallRuleImpl extends TurboRuleImpl implements TurboCallRule
{
  /**
   * The default value of the '{@link #getCalledRuleName() <em>Called Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledRuleName()
   * @generated
   * @ordered
   */
  protected static final String CALLED_RULE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCalledRuleName() <em>Called Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledRuleName()
   * @generated
   * @ordered
   */
  protected String calledRuleName = CALLED_RULE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Term> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TurboCallRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsmetaLPackage.Literals.TURBO_CALL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCalledRuleName()
  {
    return calledRuleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCalledRuleName(String newCalledRuleName)
  {
    String oldCalledRuleName = calledRuleName;
    calledRuleName = newCalledRuleName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetaLPackage.TURBO_CALL_RULE__CALLED_RULE_NAME, oldCalledRuleName, calledRuleName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Term> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Term>(Term.class, this, AsmetaLPackage.TURBO_CALL_RULE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsmetaLPackage.TURBO_CALL_RULE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsmetaLPackage.TURBO_CALL_RULE__CALLED_RULE_NAME:
        return getCalledRuleName();
      case AsmetaLPackage.TURBO_CALL_RULE__PARAMETERS:
        return getParameters();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsmetaLPackage.TURBO_CALL_RULE__CALLED_RULE_NAME:
        setCalledRuleName((String)newValue);
        return;
      case AsmetaLPackage.TURBO_CALL_RULE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Term>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsmetaLPackage.TURBO_CALL_RULE__CALLED_RULE_NAME:
        setCalledRuleName(CALLED_RULE_NAME_EDEFAULT);
        return;
      case AsmetaLPackage.TURBO_CALL_RULE__PARAMETERS:
        getParameters().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsmetaLPackage.TURBO_CALL_RULE__CALLED_RULE_NAME:
        return CALLED_RULE_NAME_EDEFAULT == null ? calledRuleName != null : !CALLED_RULE_NAME_EDEFAULT.equals(calledRuleName);
      case AsmetaLPackage.TURBO_CALL_RULE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (calledRuleName: ");
    result.append(calledRuleName);
    result.append(')');
    return result.toString();
  }

} //TurboCallRuleImpl
