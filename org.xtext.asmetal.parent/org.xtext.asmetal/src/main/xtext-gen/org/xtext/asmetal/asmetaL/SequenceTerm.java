/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.SequenceTerm#getStart_term <em>Start term</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.SequenceTerm#getOther_terms <em>Other terms</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.SequenceTerm#getEnd_term <em>End term</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.SequenceTerm#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getSequenceTerm()
 * @model
 * @generated
 */
public interface SequenceTerm extends CollectionTerm
{
  /**
   * Returns the value of the '<em><b>Start term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start term</em>' containment reference.
   * @see #setStart_term(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getSequenceTerm_Start_term()
   * @model containment="true"
   * @generated
   */
  Term getStart_term();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.SequenceTerm#getStart_term <em>Start term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start term</em>' containment reference.
   * @see #getStart_term()
   * @generated
   */
  void setStart_term(Term value);

  /**
   * Returns the value of the '<em><b>Other terms</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.Term}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other terms</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getSequenceTerm_Other_terms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getOther_terms();

  /**
   * Returns the value of the '<em><b>End term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End term</em>' containment reference.
   * @see #setEnd_term(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getSequenceTerm_End_term()
   * @model containment="true"
   * @generated
   */
  Term getEnd_term();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.SequenceTerm#getEnd_term <em>End term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End term</em>' containment reference.
   * @see #getEnd_term()
   * @generated
   */
  void setEnd_term(Term value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(ConstantTerm)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getSequenceTerm_Step()
   * @model containment="true"
   * @generated
   */
  ConstantTerm getStep();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.SequenceTerm#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(ConstantTerm value);

} // SequenceTerm