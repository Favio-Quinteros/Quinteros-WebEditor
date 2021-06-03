/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Binding Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.VariableBindingTerm#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getVariableBindingTerm()
 * @model
 * @generated
 */
public interface VariableBindingTerm extends ExtendedTerm
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.VariableTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getVariableBindingTerm_Variable()
   * @model containment="true"
   * @generated
   */
  EList<VariableTerm> getVariable();

} // VariableBindingTerm
