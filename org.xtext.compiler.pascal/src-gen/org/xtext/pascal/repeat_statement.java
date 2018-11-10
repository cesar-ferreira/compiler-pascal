/**
 * generated by Xtext 2.15.0
 */
package org.xtext.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>repeat statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.pascal.repeat_statement#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.xtext.pascal.repeat_statement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.pascal.PascalPackage#getrepeat_statement()
 * @model
 * @generated
 */
public interface repeat_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference.
   * @see #setSequence(statement_sequence)
   * @see org.xtext.pascal.PascalPackage#getrepeat_statement_Sequence()
   * @model containment="true"
   * @generated
   */
  statement_sequence getSequence();

  /**
   * Sets the value of the '{@link org.xtext.pascal.repeat_statement#getSequence <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' containment reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(statement_sequence value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.pascal.PascalPackage#getrepeat_statement_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.pascal.repeat_statement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

} // repeat_statement