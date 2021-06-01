/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.FunctionInitialization#getInizializedFunctionName <em>Inizialized Function Name</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.FunctionInitialization#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.FunctionInitialization#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.FunctionInitialization#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getFunctionInitialization()
 * @model
 * @generated
 */
public interface FunctionInitialization extends EObject
{
  /**
   * Returns the value of the '<em><b>Inizialized Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inizialized Function Name</em>' attribute.
   * @see #setInizializedFunctionName(String)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getFunctionInitialization_InizializedFunctionName()
   * @model
   * @generated
   */
  String getInizializedFunctionName();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.FunctionInitialization#getInizializedFunctionName <em>Inizialized Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inizialized Function Name</em>' attribute.
   * @see #getInizializedFunctionName()
   * @generated
   */
  void setInizializedFunctionName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getFunctionInitialization_Variables()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariables();

  /**
   * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.Domain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getFunctionInitialization_Domain()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomain();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getFunctionInitialization_Body()
   * @model containment="true"
   * @generated
   */
  Term getBody();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.FunctionInitialization#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Term value);

} // FunctionInitialization
