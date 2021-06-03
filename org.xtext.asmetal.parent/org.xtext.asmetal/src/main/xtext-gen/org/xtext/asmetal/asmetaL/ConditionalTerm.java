/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.ConditionalTerm#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.ConditionalTerm#getThenTerm <em>Then Term</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.ConditionalTerm#getElseTerm <em>Else Term</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getConditionalTerm()
 * @model
 * @generated
 */
public interface ConditionalTerm extends ExtendedTerm
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getConditionalTerm_Guard()
   * @model containment="true"
   * @generated
   */
  Term getGuard();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.ConditionalTerm#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Term value);

  /**
   * Returns the value of the '<em><b>Then Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Term</em>' containment reference.
   * @see #setThenTerm(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getConditionalTerm_ThenTerm()
   * @model containment="true"
   * @generated
   */
  Term getThenTerm();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.ConditionalTerm#getThenTerm <em>Then Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Term</em>' containment reference.
   * @see #getThenTerm()
   * @generated
   */
  void setThenTerm(Term value);

  /**
   * Returns the value of the '<em><b>Else Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Term</em>' containment reference.
   * @see #setElseTerm(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getConditionalTerm_ElseTerm()
   * @model containment="true"
   * @generated
   */
  Term getElseTerm();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.ConditionalTerm#getElseTerm <em>Else Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Term</em>' containment reference.
   * @see #getElseTerm()
   * @generated
   */
  void setElseTerm(Term value);

} // ConditionalTerm
