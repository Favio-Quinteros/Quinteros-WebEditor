/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.Header#getImportClause <em>Import Clause</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.Header#getExportClause <em>Export Clause</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.Header#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Clause</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.ImportClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Clause</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getHeader_ImportClause()
   * @model containment="true"
   * @generated
   */
  EList<ImportClause> getImportClause();

  /**
   * Returns the value of the '<em><b>Export Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export Clause</em>' containment reference.
   * @see #setExportClause(ExportClause)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getHeader_ExportClause()
   * @model containment="true"
   * @generated
   */
  ExportClause getExportClause();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.Header#getExportClause <em>Export Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Export Clause</em>' containment reference.
   * @see #getExportClause()
   * @generated
   */
  void setExportClause(ExportClause value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(Signature)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getHeader_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.Header#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

} // Header