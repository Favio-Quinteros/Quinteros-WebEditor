/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.MapDomain#getSourceDomain <em>Source Domain</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.MapDomain#getTargetDomain <em>Target Domain</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getMapDomain()
 * @model
 * @generated
 */
public interface MapDomain extends StructuredTD
{
  /**
   * Returns the value of the '<em><b>Source Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Domain</em>' containment reference.
   * @see #setSourceDomain(Domain)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getMapDomain_SourceDomain()
   * @model containment="true"
   * @generated
   */
  Domain getSourceDomain();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.MapDomain#getSourceDomain <em>Source Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Domain</em>' containment reference.
   * @see #getSourceDomain()
   * @generated
   */
  void setSourceDomain(Domain value);

  /**
   * Returns the value of the '<em><b>Target Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Domain</em>' containment reference.
   * @see #setTargetDomain(Domain)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getMapDomain_TargetDomain()
   * @model containment="true"
   * @generated
   */
  Domain getTargetDomain();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.MapDomain#getTargetDomain <em>Target Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Domain</em>' containment reference.
   * @see #getTargetDomain()
   * @generated
   */
  void setTargetDomain(Domain value);

} // MapDomain
