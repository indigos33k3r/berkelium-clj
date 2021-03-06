/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package berkelium;

public class Widget {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Widget(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Widget obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BerkeliumCppJNI.delete_Widget(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void destroy() {
    BerkeliumCppJNI.Widget_destroy(swigCPtr, this);
  }

  public int getId() {
    return BerkeliumCppJNI.Widget_getId(swigCPtr, this);
  }

  public void focus() {
    BerkeliumCppJNI.Widget_focus(swigCPtr, this);
  }

  public void unfocus() {
    BerkeliumCppJNI.Widget_unfocus(swigCPtr, this);
  }

  public boolean hasFocus() {
    return BerkeliumCppJNI.Widget_hasFocus(swigCPtr, this);
  }

  public void mouseMoved(int xPos, int yPos) {
    BerkeliumCppJNI.Widget_mouseMoved(swigCPtr, this, xPos, yPos);
  }

  public void mouseButton(long buttonID, boolean down, int clickCount) {
    BerkeliumCppJNI.Widget_mouseButton__SWIG_0(swigCPtr, this, buttonID, down, clickCount);
  }

  public void mouseButton(long buttonID, boolean down) {
    BerkeliumCppJNI.Widget_mouseButton__SWIG_1(swigCPtr, this, buttonID, down);
  }

  public void mouseWheel(int xScroll, int yScroll) {
    BerkeliumCppJNI.Widget_mouseWheel(swigCPtr, this, xScroll, yScroll);
  }

  public void textEvent(SWIGTYPE_p_wchar_t evt, long evtLength) {
    BerkeliumCppJNI.Widget_textEvent__SWIG_0(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(evt), evtLength);
  }

  public void keyEvent(boolean pressed, int mods, int vk_code, int scancode) {
    BerkeliumCppJNI.Widget_keyEvent(swigCPtr, this, pressed, mods, vk_code, scancode);
  }

  public Rect getRect() {
    return new Rect(BerkeliumCppJNI.Widget_getRect(swigCPtr, this), true);
  }

  public void setPos(int x, int y) {
    BerkeliumCppJNI.Widget_setPos(swigCPtr, this, x, y);
  }

  public void textEvent(wcharWeakString text) {
    BerkeliumCppJNI.Widget_textEvent__SWIG_1(swigCPtr, this, wcharWeakString.getCPtr(text), text);
  }

}
