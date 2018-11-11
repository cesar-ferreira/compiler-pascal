/**
 * generated by Xtext 2.15.0
 */
package org.xtext.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.pascal.PascalPackage;
import org.xtext.pascal.label;
import org.xtext.pascal.simple_statement;
import org.xtext.pascal.statement;
import org.xtext.pascal.structured_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.pascal.impl.statementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.pascal.impl.statementImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.xtext.pascal.impl.statementImpl#getStructured <em>Structured</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statementImpl extends MinimalEObjectImpl.Container implements statement
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected label label;

  /**
   * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple()
   * @generated
   * @ordered
   */
  protected simple_statement simple;

  /**
   * The cached value of the '{@link #getStructured() <em>Structured</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructured()
   * @generated
   * @ordered
   */
  protected structured_statement structured;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(label newLabel, NotificationChain msgs)
  {
    label oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(label newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_statement getSimple()
  {
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimple(simple_statement newSimple, NotificationChain msgs)
  {
    simple_statement oldSimple = simple;
    simple = newSimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__SIMPLE, oldSimple, newSimple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimple(simple_statement newSimple)
  {
    if (newSimple != simple)
    {
      NotificationChain msgs = null;
      if (simple != null)
        msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__SIMPLE, null, msgs);
      if (newSimple != null)
        msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__SIMPLE, null, msgs);
      msgs = basicSetSimple(newSimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__SIMPLE, newSimple, newSimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_statement getStructured()
  {
    return structured;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructured(structured_statement newStructured, NotificationChain msgs)
  {
    structured_statement oldStructured = structured;
    structured = newStructured;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__STRUCTURED, oldStructured, newStructured);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructured(structured_statement newStructured)
  {
    if (newStructured != structured)
    {
      NotificationChain msgs = null;
      if (structured != null)
        msgs = ((InternalEObject)structured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__STRUCTURED, null, msgs);
      if (newStructured != null)
        msgs = ((InternalEObject)newStructured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__STRUCTURED, null, msgs);
      msgs = basicSetStructured(newStructured, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__STRUCTURED, newStructured, newStructured));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.STATEMENT__LABEL:
        return basicSetLabel(null, msgs);
      case PascalPackage.STATEMENT__SIMPLE:
        return basicSetSimple(null, msgs);
      case PascalPackage.STATEMENT__STRUCTURED:
        return basicSetStructured(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.STATEMENT__LABEL:
        return getLabel();
      case PascalPackage.STATEMENT__SIMPLE:
        return getSimple();
      case PascalPackage.STATEMENT__STRUCTURED:
        return getStructured();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.STATEMENT__LABEL:
        setLabel((label)newValue);
        return;
      case PascalPackage.STATEMENT__SIMPLE:
        setSimple((simple_statement)newValue);
        return;
      case PascalPackage.STATEMENT__STRUCTURED:
        setStructured((structured_statement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.STATEMENT__LABEL:
        setLabel((label)null);
        return;
      case PascalPackage.STATEMENT__SIMPLE:
        setSimple((simple_statement)null);
        return;
      case PascalPackage.STATEMENT__STRUCTURED:
        setStructured((structured_statement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.STATEMENT__LABEL:
        return label != null;
      case PascalPackage.STATEMENT__SIMPLE:
        return simple != null;
      case PascalPackage.STATEMENT__STRUCTURED:
        return structured != null;
    }
    return super.eIsSet(featureID);
  }

} //statementImpl
