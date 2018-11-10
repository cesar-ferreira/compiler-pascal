/**
 * generated by Xtext 2.15.0
 */
package org.xtext.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>any number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.pascal.any_number#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.xtext.pascal.any_number#getReal <em>Real</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.pascal.PascalPackage#getany_number()
 * @model
 * @generated
 */
public interface any_number extends EObject
{
  /**
   * Returns the value of the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer</em>' attribute.
   * @see #setInteger(String)
   * @see org.xtext.pascal.PascalPackage#getany_number_Integer()
   * @model
   * @generated
   */
  String getInteger();

  /**
   * Sets the value of the '{@link org.xtext.pascal.any_number#getInteger <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer</em>' attribute.
   * @see #getInteger()
   * @generated
   */
  void setInteger(String value);

  /**
   * Returns the value of the '<em><b>Real</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real</em>' attribute.
   * @see #setReal(String)
   * @see org.xtext.pascal.PascalPackage#getany_number_Real()
   * @model
   * @generated
   */
  String getReal();

  /**
   * Sets the value of the '{@link org.xtext.pascal.any_number#getReal <em>Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real</em>' attribute.
   * @see #getReal()
   * @generated
   */
  void setReal(String value);

} // any_number
