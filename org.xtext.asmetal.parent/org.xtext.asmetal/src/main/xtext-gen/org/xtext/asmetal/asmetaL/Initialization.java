/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.Initialization#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.Initialization#getDomainInitialization <em>Domain Initialization</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.Initialization#getFunctionInitialization <em>Function Initialization</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.Initialization#getAgentInitialization <em>Agent Initialization</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInitialization()
 * @model
 * @generated
 */
public interface Initialization extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInitialization_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.Initialization#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Domain Initialization</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.DomainInitialization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Initialization</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInitialization_DomainInitialization()
   * @model containment="true"
   * @generated
   */
  EList<DomainInitialization> getDomainInitialization();

  /**
   * Returns the value of the '<em><b>Function Initialization</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.FunctionInitialization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Initialization</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInitialization_FunctionInitialization()
   * @model containment="true"
   * @generated
   */
  EList<FunctionInitialization> getFunctionInitialization();

  /**
   * Returns the value of the '<em><b>Agent Initialization</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.AgentInitialization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Initialization</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInitialization_AgentInitialization()
   * @model containment="true"
   * @generated
   */
  EList<AgentInitialization> getAgentInitialization();

} // Initialization
