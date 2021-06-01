/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compassion Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.CompassionConstraint#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.CompassionConstraint#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getCompassionConstraint()
 * @model
 * @generated
 */
public interface CompassionConstraint extends FairnessConstraint
{
  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getCompassionConstraint_P()
   * @model containment="true"
   * @generated
   */
  Term getP();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.CompassionConstraint#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(Term value);

  /**
   * Returns the value of the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Q</em>' containment reference.
   * @see #setQ(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getCompassionConstraint_Q()
   * @model containment="true"
   * @generated
   */
  Term getQ();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.CompassionConstraint#getQ <em>Q</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Q</em>' containment reference.
   * @see #getQ()
   * @generated
   */
  void setQ(Term value);

} // CompassionConstraint
