/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package berkelium;

public class Window {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Window(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Window obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BerkeliumCppJNI.delete_Window(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  // Ensure that the GC doesn't collect any element set from Java
  // as the underlying C++ class stores a shallow copy
  private WindowDelegate wndDelegateReference;
  private long getCPtrAndAddReference(WindowDelegate w) {
    wndDelegateReference = w;
    return WindowDelegate.getCPtr(w);
  }

  public static Window create(Context context) {
    long cPtr = BerkeliumCppJNI.Window_create(Context.getCPtr(context), context);
    return (cPtr == 0) ? null : new Window(cPtr, false);
  }

  public void destroy() {
    BerkeliumCppJNI.Window_destroy(swigCPtr, this);
  }

  public void refresh() {
    BerkeliumCppJNI.Window_refresh(swigCPtr, this);
  }

  public Widget getWidget() {
    long cPtr = BerkeliumCppJNI.Window_getWidget(swigCPtr, this);
    return (cPtr == 0) ? null : new Widget(cPtr, false);
  }

  public Context getContext() {
    long cPtr = BerkeliumCppJNI.Window_getContext(swigCPtr, this);
    return (cPtr == 0) ? null : new Context(cPtr, false);
  }

  public void setDelegate(WindowDelegate delegate) {
    BerkeliumCppJNI.Window_setDelegate(swigCPtr, this, getCPtrAndAddReference(delegate), delegate);
  }

  public SWIGTYPE_p_WidgetList__const_iterator backIter() {
    return new SWIGTYPE_p_WidgetList__const_iterator(BerkeliumCppJNI.Window_backIter(swigCPtr, this), true);
  }

  public SWIGTYPE_p_WidgetList__const_iterator backEnd() {
    return new SWIGTYPE_p_WidgetList__const_iterator(BerkeliumCppJNI.Window_backEnd(swigCPtr, this), true);
  }

  public SWIGTYPE_p_WidgetList__const_reverse_iterator frontIter() {
    return new SWIGTYPE_p_WidgetList__const_reverse_iterator(BerkeliumCppJNI.Window_frontIter(swigCPtr, this), true);
  }

  public SWIGTYPE_p_WidgetList__const_reverse_iterator frontEnd() {
    return new SWIGTYPE_p_WidgetList__const_reverse_iterator(BerkeliumCppJNI.Window_frontEnd(swigCPtr, this), true);
  }

  public int getId() {
    return BerkeliumCppJNI.Window_getId(swigCPtr, this);
  }

  public void setTransparent(boolean istrans) {
    BerkeliumCppJNI.Window_setTransparent(swigCPtr, this, istrans);
  }

  public void focus() {
    BerkeliumCppJNI.Window_focus(swigCPtr, this);
  }

  public void unfocus() {
    BerkeliumCppJNI.Window_unfocus(swigCPtr, this);
  }

  public void mouseMoved(int xPos, int yPos) {
    BerkeliumCppJNI.Window_mouseMoved(swigCPtr, this, xPos, yPos);
  }

  public void mouseButton(long buttonID, boolean down) {
    BerkeliumCppJNI.Window_mouseButton(swigCPtr, this, buttonID, down);
  }

  public void mouseWheel(int xScroll, int yScroll) {
    BerkeliumCppJNI.Window_mouseWheel(swigCPtr, this, xScroll, yScroll);
  }

  public void textEvent(SWIGTYPE_p_wchar_t arg0, long evtLength) {
    BerkeliumCppJNI.Window_textEvent__SWIG_0(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(arg0), evtLength);
  }

  public void keyEvent(boolean pressed, int mods, int vk_code, int scancode) {
    BerkeliumCppJNI.Window_keyEvent(swigCPtr, this, pressed, mods, vk_code, scancode);
  }

  public void resize(int width, int height) {
    BerkeliumCppJNI.Window_resize(swigCPtr, this, width, height);
  }

  public void adjustZoom(int mode) {
    BerkeliumCppJNI.Window_adjustZoom(swigCPtr, this, mode);
  }

  public void executeJavascript(wcharWeakString javascript) {
    BerkeliumCppJNI.Window_executeJavascript(swigCPtr, this, wcharWeakString.getCPtr(javascript), javascript);
  }

  public void insertCSS(wcharWeakString css, wcharWeakString elementId) {
    BerkeliumCppJNI.Window_insertCSS(swigCPtr, this, wcharWeakString.getCPtr(css), css, wcharWeakString.getCPtr(elementId), elementId);
  }

  public boolean navigateTo(charWeakString url) {
    return BerkeliumCppJNI.Window_navigateTo__SWIG_0(swigCPtr, this, charWeakString.getCPtr(url), url);
  }

  public boolean navigateTo(String url, long url_length) {
    return BerkeliumCppJNI.Window_navigateTo__SWIG_1(swigCPtr, this, url, url_length);
  }

  public void textEvent(String s) {
    BerkeliumCppJNI.Window_textEvent__SWIG_1(swigCPtr, this, s);
  }

}
