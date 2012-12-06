/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package berkelium;

public class Context {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Context(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Context obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BerkeliumCppJNI.delete_Context(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static Context create() {
    long cPtr = BerkeliumCppJNI.Context_create();
    return (cPtr == 0) ? null : new Context(cPtr, false);
  }

  public void destroy() {
    BerkeliumCppJNI.Context_destroy(swigCPtr, this);
  }

  public Context clone() {
    long cPtr = BerkeliumCppJNI.Context_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Context(cPtr, false);
  }

  public SWIGTYPE_p_ContextImpl getImpl() {
    long cPtr = BerkeliumCppJNI.Context_getImpl(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ContextImpl(cPtr, false);
  }

}
