/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.LetRule#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.LetRule#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.LetRule#getInRule <em>In Rule</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getLetRule()
 * @model
 * @generated
 */
public interface LetRule extends BasicRule
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.VariableTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getLetRule_Variable()
   * @model containment="true"
   * @generated
   */
  EList<VariableTerm> getVariable();

  /**
   * Returns the value of the '<em><b>Init Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.Term}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Expression</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getLetRule_InitExpression()
   * @model containment="true"
   * @generated
   */
  EList<Term> getInitExpression();

  /**
   * Returns the value of the '<em><b>In Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Rule</em>' containment reference.
   * @see #setInRule(Rule)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getLetRule_InRule()
   * @model containment="true"
   * @generated
   */
  Rule getInRule();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.LetRule#getInRule <em>In Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Rule</em>' containment reference.
   * @see #getInRule()
   * @generated
   */
  void setInRule(Rule value);

} // LetRule
