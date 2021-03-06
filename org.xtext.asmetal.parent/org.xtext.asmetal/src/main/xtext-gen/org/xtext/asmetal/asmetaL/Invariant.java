/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.Invariant#getInvar_list <em>Invar list</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends Property
{
  /**
   * Returns the value of the '<em><b>Invar list</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.InvariantElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invar list</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getInvariant_Invar_list()
   * @model containment="true"
   * @generated
   */
  EList<InvariantElement> getInvar_list();

} // Invariant
