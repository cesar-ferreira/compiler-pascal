/**
 * generated by Xtext 2.15.0
 */
package org.xtext.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unpacked conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.pascal.unpacked_conformant_array_schema#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.xtext.pascal.unpacked_conformant_array_schema#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.pascal.PascalPackage#getunpacked_conformant_array_schema()
 * @model
 * @generated
 */
public interface unpacked_conformant_array_schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Bounds</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.bound_specification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bounds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bounds</em>' containment reference list.
   * @see org.xtext.pascal.PascalPackage#getunpacked_conformant_array_schema_Bounds()
   * @model containment="true"
   * @generated
   */
  EList<bound_specification> getBounds();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(parameter_type)
   * @see org.xtext.pascal.PascalPackage#getunpacked_conformant_array_schema_Type()
   * @model containment="true"
   * @generated
   */
  parameter_type getType();

  /**
   * Sets the value of the '{@link org.xtext.pascal.unpacked_conformant_array_schema#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(parameter_type value);

} // unpacked_conformant_array_schema
