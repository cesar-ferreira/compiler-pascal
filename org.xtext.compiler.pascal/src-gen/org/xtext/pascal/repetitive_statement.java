/**
 * generated by Xtext 2.15.0
 */
package org.xtext.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>repetitive statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.pascal.repetitive_statement#getWhileStmt <em>While Stmt</em>}</li>
 *   <li>{@link org.xtext.pascal.repetitive_statement#getRepeatStmt <em>Repeat Stmt</em>}</li>
 *   <li>{@link org.xtext.pascal.repetitive_statement#getForStmt <em>For Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.pascal.PascalPackage#getrepetitive_statement()
 * @model
 * @generated
 */
public interface repetitive_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>While Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Stmt</em>' containment reference.
   * @see #setWhileStmt(while_statement)
   * @see org.xtext.pascal.PascalPackage#getrepetitive_statement_WhileStmt()
   * @model containment="true"
   * @generated
   */
  while_statement getWhileStmt();

  /**
   * Sets the value of the '{@link org.xtext.pascal.repetitive_statement#getWhileStmt <em>While Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Stmt</em>' containment reference.
   * @see #getWhileStmt()
   * @generated
   */
  void setWhileStmt(while_statement value);

  /**
   * Returns the value of the '<em><b>Repeat Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat Stmt</em>' containment reference.
   * @see #setRepeatStmt(repeat_statement)
   * @see org.xtext.pascal.PascalPackage#getrepetitive_statement_RepeatStmt()
   * @model containment="true"
   * @generated
   */
  repeat_statement getRepeatStmt();

  /**
   * Sets the value of the '{@link org.xtext.pascal.repetitive_statement#getRepeatStmt <em>Repeat Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat Stmt</em>' containment reference.
   * @see #getRepeatStmt()
   * @generated
   */
  void setRepeatStmt(repeat_statement value);

  /**
   * Returns the value of the '<em><b>For Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Stmt</em>' containment reference.
   * @see #setForStmt(for_statement)
   * @see org.xtext.pascal.PascalPackage#getrepetitive_statement_ForStmt()
   * @model containment="true"
   * @generated
   */
  for_statement getForStmt();

  /**
   * Sets the value of the '{@link org.xtext.pascal.repetitive_statement#getForStmt <em>For Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Stmt</em>' containment reference.
   * @see #getForStmt()
   * @generated
   */
  void setForStmt(for_statement value);

} // repetitive_statement
