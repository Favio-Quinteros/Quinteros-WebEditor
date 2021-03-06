/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comprehension Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.ComprehensionTerm#getRanges <em>Ranges</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.ComprehensionTerm#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.ComprehensionTerm#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getComprehensionTerm()
 * @model
 * @generated
 */
public interface ComprehensionTerm extends VariableBindingTerm
{
  /**
   * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.Term}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ranges</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getComprehensionTerm_Ranges()
   * @model containment="true"
   * @generated
   */
  EList<Term> getRanges();

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getComprehensionTerm_Guard()
   * @model containment="true"
   * @generated
   */
  Term getGuard();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.ComprehensionTerm#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Term value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getComprehensionTerm_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.ComprehensionTerm#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

} // ComprehensionTerm
