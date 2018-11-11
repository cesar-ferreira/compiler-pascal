/**
 * generated by Xtext 2.15.0
 */
package org.xtext.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.pascal.PascalPackage;
import org.xtext.pascal.constant_definition;
import org.xtext.pascal.constant_definition_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant definition part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.pascal.impl.constant_definition_partImpl#getConsts <em>Consts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constant_definition_partImpl extends MinimalEObjectImpl.Container implements constant_definition_part
{
  /**
   * The cached value of the '{@link #getConsts() <em>Consts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsts()
   * @generated
   * @ordered
   */
  protected EList<constant_definition> consts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constant_definition_partImpl()
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
    return PascalPackage.Literals.CONSTANT_DEFINITION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<constant_definition> getConsts()
  {
    if (consts == null)
    {
      consts = new EObjectContainmentEList<constant_definition>(constant_definition.class, this, PascalPackage.CONSTANT_DEFINITION_PART__CONSTS);
    }
    return consts;
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTS:
        return ((InternalEList<?>)getConsts()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTS:
        return getConsts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTS:
        getConsts().clear();
        getConsts().addAll((Collection<? extends constant_definition>)newValue);
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTS:
        getConsts().clear();
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
      case PascalPackage.CONSTANT_DEFINITION_PART__CONSTS:
        return consts != null && !consts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //constant_definition_partImpl
