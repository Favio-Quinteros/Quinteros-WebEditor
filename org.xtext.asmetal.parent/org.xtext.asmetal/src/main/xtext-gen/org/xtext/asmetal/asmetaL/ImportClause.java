/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.ImportClause#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.ImportClause#getImportedList <em>Imported List</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getImportClause()
 * @model
 * @generated
 */
public interface ImportClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Module Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module Name</em>' attribute.
   * @see #setModuleName(String)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getImportClause_ModuleName()
   * @model
   * @generated
   */
  String getModuleName();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.ImportClause#getModuleName <em>Module Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module Name</em>' attribute.
   * @see #getModuleName()
   * @generated
   */
  void setModuleName(String value);

  /**
   * Returns the value of the '<em><b>Imported List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.importData}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported List</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getImportClause_ImportedList()
   * @model containment="true"
   * @generated
   */
  EList<importData> getImportedList();

} // ImportClause
