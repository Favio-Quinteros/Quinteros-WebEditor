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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.asmetal.asmetaL.AsmetaLPackage;
import org.xtext.asmetal.asmetaL.ImportClause;
import org.xtext.asmetal.asmetaL.importData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.impl.ImportClauseImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.impl.ImportClauseImpl#getImportedList <em>Imported List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportClauseImpl extends MinimalEObjectImpl.Container implements ImportClause
{
  /**
   * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleName()
   * @generated
   * @ordered
   */
  protected static final String MODULE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleName()
   * @generated
   * @ordered
   */
  protected String moduleName = MODULE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportedList() <em>Imported List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedList()
   * @generated
   * @ordered
   */
  protected EList<importData> importedList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportClauseImpl()
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
    return AsmetaLPackage.Literals.IMPORT_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModuleName()
  {
    return moduleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModuleName(String newModuleName)
  {
    String oldModuleName = moduleName;
    moduleName = newModuleName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetaLPackage.IMPORT_CLAUSE__MODULE_NAME, oldModuleName, moduleName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<importData> getImportedList()
  {
    if (importedList == null)
    {
      importedList = new EObjectContainmentEList<importData>(importData.class, this, AsmetaLPackage.IMPORT_CLAUSE__IMPORTED_LIST);
    }
    return importedList;
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
      case AsmetaLPackage.IMPORT_CLAUSE__IMPORTED_LIST:
        return ((InternalEList<?>)getImportedList()).basicRemove(otherEnd, msgs);
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
      case AsmetaLPackage.IMPORT_CLAUSE__MODULE_NAME:
        return getModuleName();
      case AsmetaLPackage.IMPORT_CLAUSE__IMPORTED_LIST:
        return getImportedList();
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
      case AsmetaLPackage.IMPORT_CLAUSE__MODULE_NAME:
        setModuleName((String)newValue);
        return;
      case AsmetaLPackage.IMPORT_CLAUSE__IMPORTED_LIST:
        getImportedList().clear();
        getImportedList().addAll((Collection<? extends importData>)newValue);
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
      case AsmetaLPackage.IMPORT_CLAUSE__MODULE_NAME:
        setModuleName(MODULE_NAME_EDEFAULT);
        return;
      case AsmetaLPackage.IMPORT_CLAUSE__IMPORTED_LIST:
        getImportedList().clear();
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
      case AsmetaLPackage.IMPORT_CLAUSE__MODULE_NAME:
        return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
      case AsmetaLPackage.IMPORT_CLAUSE__IMPORTED_LIST:
        return importedList != null && !importedList.isEmpty();
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
    result.append(" (moduleName: ");
    result.append(moduleName);
    result.append(')');
    return result.toString();
  }

} //ImportClauseImpl
