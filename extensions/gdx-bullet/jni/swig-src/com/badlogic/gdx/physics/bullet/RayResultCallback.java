/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class RayResultCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RayResultCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(RayResultCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_RayResultCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_closestHitFraction(float value) {
    gdxBulletJNI.RayResultCallback_m_closestHitFraction_set(swigCPtr, this, value);
  }

  public float getM_closestHitFraction() {
    return gdxBulletJNI.RayResultCallback_m_closestHitFraction_get(swigCPtr, this);
  }

  public void setM_collisionObject(btCollisionObject value) {
    gdxBulletJNI.RayResultCallback_m_collisionObject_set(swigCPtr, this, btCollisionObject.getCPtr(value), value);
  }

  public btCollisionObject getM_collisionObject() {
	long cPtr = gdxBulletJNI.RayResultCallback_m_collisionObject_get(swigCPtr, this);
	return (cPtr == 0) ? null : btCollisionObject.getInstance(cPtr, false);
}

  public void setM_collisionFilterGroup(short value) {
    gdxBulletJNI.RayResultCallback_m_collisionFilterGroup_set(swigCPtr, this, value);
  }

  public short getM_collisionFilterGroup() {
    return gdxBulletJNI.RayResultCallback_m_collisionFilterGroup_get(swigCPtr, this);
  }

  public void setM_collisionFilterMask(short value) {
    gdxBulletJNI.RayResultCallback_m_collisionFilterMask_set(swigCPtr, this, value);
  }

  public short getM_collisionFilterMask() {
    return gdxBulletJNI.RayResultCallback_m_collisionFilterMask_get(swigCPtr, this);
  }

  public void setM_flags(long value) {
    gdxBulletJNI.RayResultCallback_m_flags_set(swigCPtr, this, value);
  }

  public long getM_flags() {
    return gdxBulletJNI.RayResultCallback_m_flags_get(swigCPtr, this);
  }

  public boolean hasHit() {
    return gdxBulletJNI.RayResultCallback_hasHit(swigCPtr, this);
  }

  public boolean needsCollision(btBroadphaseProxy proxy0) {
    return gdxBulletJNI.RayResultCallback_needsCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0);
  }

  public float addSingleResult(LocalRayResult rayResult, boolean normalInWorldSpace) {
    return gdxBulletJNI.RayResultCallback_addSingleResult(swigCPtr, this, LocalRayResult.getCPtr(rayResult), rayResult, normalInWorldSpace);
  }

}
