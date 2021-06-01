/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.ProductDomain#getDomains <em>Domains</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getProductDomain()
 * @model
 * @generated
 */
public interface ProductDomain extends StructuredTD
{
  /**
   * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.Domain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domains</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getProductDomain_Domains()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomains();

} // ProductDomain
