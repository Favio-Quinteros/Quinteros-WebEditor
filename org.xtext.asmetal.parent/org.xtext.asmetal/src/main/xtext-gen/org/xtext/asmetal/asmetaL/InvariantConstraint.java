/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.InvariantConstraint#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInvariantConstraint()
 * @model
 * @generated
 */
public interface InvariantConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInvariantConstraint_Body()
   * @model containment="true"
   * @generated
   */
  Term getBody();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.InvariantConstraint#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Term value);

} // InvariantConstraint
