/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package berkelium;

public class BerkeliumCppJNI {
  public final static native boolean init__SWIG_0(long jarg1, charWeakString jarg1_, long jarg2, charWeakString jarg2_, long jarg3, long jarg4);
  public final static native boolean init__SWIG_1(long jarg1, charWeakString jarg1_, long jarg2, charWeakString jarg2_, long jarg3);
  public final static native boolean init__SWIG_2(long jarg1, charWeakString jarg1_, long jarg2, charWeakString jarg2_);
  public final static native void destroy();
  public final static native void update();
  public final static native String charWeakString_data(long jarg1, charWeakString jarg1_);
  public final static native long charWeakString_length(long jarg1, charWeakString jarg1_);
  public final static native long charWeakString_size(long jarg1, charWeakString jarg1_);
  public final static native long charWeakString_point_to(byte[] jarg1);
  public final static native long charWeakString_empty();
  public final static native long new_charWeakString();
  public final static native void delete_charWeakString(long jarg1);
  public final static native long wcharWeakString_data(long jarg1, wcharWeakString jarg1_);
  public final static native long wcharWeakString_length(long jarg1, wcharWeakString jarg1_);
  public final static native long wcharWeakString_size(long jarg1, wcharWeakString jarg1_);
  public final static native long wcharWeakString_point_to(long jarg1, long jarg2);
  public final static native long wcharWeakString_empty();
  public final static native long new_wcharWeakString();
  public final static native void delete_wcharWeakString(long jarg1);
  public final static native void Rect_mLeft_set(long jarg1, Rect jarg1_, int jarg2);
  public final static native int Rect_mLeft_get(long jarg1, Rect jarg1_);
  public final static native void Rect_mTop_set(long jarg1, Rect jarg1_, int jarg2);
  public final static native int Rect_mTop_get(long jarg1, Rect jarg1_);
  public final static native void Rect_mWidth_set(long jarg1, Rect jarg1_, int jarg2);
  public final static native int Rect_mWidth_get(long jarg1, Rect jarg1_);
  public final static native void Rect_mHeight_set(long jarg1, Rect jarg1_, int jarg2);
  public final static native int Rect_mHeight_get(long jarg1, Rect jarg1_);
  public final static native int Rect_y(long jarg1, Rect jarg1_);
  public final static native int Rect_x(long jarg1, Rect jarg1_);
  public final static native int Rect_top(long jarg1, Rect jarg1_);
  public final static native int Rect_left(long jarg1, Rect jarg1_);
  public final static native int Rect_width(long jarg1, Rect jarg1_);
  public final static native int Rect_height(long jarg1, Rect jarg1_);
  public final static native int Rect_right(long jarg1, Rect jarg1_);
  public final static native int Rect_bottom(long jarg1, Rect jarg1_);
  public final static native boolean Rect_contains(long jarg1, Rect jarg1_, int jarg2, int jarg3);
  public final static native long Rect_intersect(long jarg1, Rect jarg1_, long jarg2, Rect jarg2_);
  public final static native long Rect_translate(long jarg1, Rect jarg1_, int jarg2, int jarg3);
  public final static native long new_Rect();
  public final static native void delete_Rect(long jarg1);
  public final static native long Context_create();
  public final static native void Context_destroy(long jarg1, Context jarg1_);
  public final static native void delete_Context(long jarg1);
  public final static native long Context_clone(long jarg1, Context jarg1_);
  public final static native long Context_getImpl(long jarg1, Context jarg1_);
  public final static native long Window_create(long jarg1, Context jarg1_);
  public final static native void Window_destroy(long jarg1, Window jarg1_);
  public final static native void delete_Window(long jarg1);
  public final static native void Window_refresh(long jarg1, Window jarg1_);
  public final static native long Window_getWidget(long jarg1, Window jarg1_);
  public final static native long Window_getContext(long jarg1, Window jarg1_);
  public final static native void Window_setDelegate(long jarg1, Window jarg1_, long jarg2, WindowDelegate jarg2_);
  public final static native long Window_backIter(long jarg1, Window jarg1_);
  public final static native long Window_backEnd(long jarg1, Window jarg1_);
  public final static native long Window_frontIter(long jarg1, Window jarg1_);
  public final static native long Window_frontEnd(long jarg1, Window jarg1_);
  public final static native int Window_getId(long jarg1, Window jarg1_);
  public final static native void Window_setTransparent(long jarg1, Window jarg1_, boolean jarg2);
  public final static native void Window_focus(long jarg1, Window jarg1_);
  public final static native void Window_unfocus(long jarg1, Window jarg1_);
  public final static native void Window_mouseMoved(long jarg1, Window jarg1_, int jarg2, int jarg3);
  public final static native void Window_mouseButton(long jarg1, Window jarg1_, long jarg2, boolean jarg3);
  public final static native void Window_mouseWheel(long jarg1, Window jarg1_, int jarg2, int jarg3);
  public final static native void Window_textEvent__SWIG_0(long jarg1, Window jarg1_, long jarg2, long jarg3);
  public final static native void Window_keyEvent(long jarg1, Window jarg1_, boolean jarg2, int jarg3, int jarg4, int jarg5);
  public final static native void Window_resize(long jarg1, Window jarg1_, int jarg2, int jarg3);
  public final static native void Window_adjustZoom(long jarg1, Window jarg1_, int jarg2);
  public final static native void Window_executeJavascript(long jarg1, Window jarg1_, long jarg2, wcharWeakString jarg2_);
  public final static native void Window_insertCSS(long jarg1, Window jarg1_, long jarg2, wcharWeakString jarg2_, long jarg3, wcharWeakString jarg3_);
  public final static native boolean Window_navigateTo__SWIG_0(long jarg1, Window jarg1_, long jarg2, charWeakString jarg2_);
  public final static native boolean Window_navigateTo__SWIG_1(long jarg1, Window jarg1_, String jarg2, long jarg3);
  public final static native void Window_textEvent__SWIG_1(long jarg1, Window jarg1_, String jarg2);
  public final static native void delete_Widget(long jarg1);
  public final static native void Widget_destroy(long jarg1, Widget jarg1_);
  public final static native int Widget_getId(long jarg1, Widget jarg1_);
  public final static native void Widget_focus(long jarg1, Widget jarg1_);
  public final static native void Widget_unfocus(long jarg1, Widget jarg1_);
  public final static native boolean Widget_hasFocus(long jarg1, Widget jarg1_);
  public final static native void Widget_mouseMoved(long jarg1, Widget jarg1_, int jarg2, int jarg3);
  public final static native void Widget_mouseButton__SWIG_0(long jarg1, Widget jarg1_, long jarg2, boolean jarg3, int jarg4);
  public final static native void Widget_mouseButton__SWIG_1(long jarg1, Widget jarg1_, long jarg2, boolean jarg3);
  public final static native void Widget_mouseWheel(long jarg1, Widget jarg1_, int jarg2, int jarg3);
  public final static native void Widget_textEvent__SWIG_0(long jarg1, Widget jarg1_, long jarg2, long jarg3);
  public final static native void Widget_keyEvent(long jarg1, Widget jarg1_, boolean jarg2, int jarg3, int jarg4, int jarg5);
  public final static native long Widget_getRect(long jarg1, Widget jarg1_);
  public final static native void Widget_setPos(long jarg1, Widget jarg1_, int jarg2, int jarg3);
  public final static native void Widget_textEvent__SWIG_1(long jarg1, Widget jarg1_, long jarg2, wcharWeakString jarg2_);
  public final static native int ContextMenuEventArgs_CanDoNone_get();
  public final static native int ContextMenuEventArgs_CanUndo_get();
  public final static native int ContextMenuEventArgs_CanRedo_get();
  public final static native int ContextMenuEventArgs_CanCut_get();
  public final static native int ContextMenuEventArgs_CanCopy_get();
  public final static native int ContextMenuEventArgs_CanPaste_get();
  public final static native int ContextMenuEventArgs_CanDelete_get();
  public final static native int ContextMenuEventArgs_CanSelectAll_get();
  public final static native void ContextMenuEventArgs_mediaType_set(long jarg1, ContextMenuEventArgs jarg1_, int jarg2);
  public final static native int ContextMenuEventArgs_mediaType_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_mouseX_set(long jarg1, ContextMenuEventArgs jarg1_, int jarg2);
  public final static native int ContextMenuEventArgs_mouseX_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_mouseY_set(long jarg1, ContextMenuEventArgs jarg1_, int jarg2);
  public final static native int ContextMenuEventArgs_mouseY_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_linkUrl_set(long jarg1, ContextMenuEventArgs jarg1_, long jarg2, charWeakString jarg2_);
  public final static native long ContextMenuEventArgs_linkUrl_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_srcUrl_set(long jarg1, ContextMenuEventArgs jarg1_, long jarg2, charWeakString jarg2_);
  public final static native long ContextMenuEventArgs_srcUrl_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_pageUrl_set(long jarg1, ContextMenuEventArgs jarg1_, long jarg2, charWeakString jarg2_);
  public final static native long ContextMenuEventArgs_pageUrl_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_frameUrl_set(long jarg1, ContextMenuEventArgs jarg1_, long jarg2, charWeakString jarg2_);
  public final static native long ContextMenuEventArgs_frameUrl_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_selectedText_set(long jarg1, ContextMenuEventArgs jarg1_, long jarg2, wcharWeakString jarg2_);
  public final static native long ContextMenuEventArgs_selectedText_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_isEditable_set(long jarg1, ContextMenuEventArgs jarg1_, boolean jarg2);
  public final static native boolean ContextMenuEventArgs_isEditable_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native void ContextMenuEventArgs_editFlags_set(long jarg1, ContextMenuEventArgs jarg1_, int jarg2);
  public final static native int ContextMenuEventArgs_editFlags_get(long jarg1, ContextMenuEventArgs jarg1_);
  public final static native long new_ContextMenuEventArgs();
  public final static native void delete_ContextMenuEventArgs(long jarg1);
  public final static native int JavascriptAlert_get();
  public final static native int JavascriptConfirm_get();
  public final static native int JavascriptPrompt_get();
  public final static native int FileOpen_get();
  public final static native int FileOpenMultiple_get();
  public final static native int FileOpenFolder_get();
  public final static native int FileSaveAs_get();
  public final static native long new_ucharArray(int jarg1);
  public final static native void delete_ucharArray(long jarg1);
  public final static native short ucharArray_getitem(long jarg1, int jarg2);
  public final static native void ucharArray_setitem(long jarg1, int jarg2, short jarg3);
  public final static native void ucharArray_nio_memcopy(java.nio.ByteBuffer jarg1, long jarg2, long jarg3);
  public final static native long Java_To_WStr(long jarg1, String jarg2);
  public final static native long c_str(long jarg1);
  public final static native long new_WindowDelegate();
  public final static native void delete_WindowDelegate(long jarg1);
  public final static native void WindowDelegate_onAddressBarChanged(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_);
  public final static native void WindowDelegate_onAddressBarChangedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_);
  public final static native void WindowDelegate_onStartLoading(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_);
  public final static native void WindowDelegate_onStartLoadingSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_);
  public final static native void WindowDelegate_onLoad(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onLoadSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onCrashedWorker(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onCrashedWorkerSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onCrashedPlugin(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_);
  public final static native void WindowDelegate_onCrashedPluginSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_);
  public final static native void WindowDelegate_onProvisionalLoadError(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_, int jarg4, boolean jarg5);
  public final static native void WindowDelegate_onProvisionalLoadErrorSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_, int jarg4, boolean jarg5);
  public final static native void WindowDelegate_onConsoleMessage(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_, long jarg4, wcharWeakString jarg4_, int jarg5);
  public final static native void WindowDelegate_onConsoleMessageSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_, long jarg4, wcharWeakString jarg4_, int jarg5);
  public final static native void WindowDelegate_onScriptAlert(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_, long jarg4, wcharWeakString jarg4_, long jarg5, charWeakString jarg5_, int jarg6, long jarg7, long jarg8, wcharWeakString jarg8_);
  public final static native void WindowDelegate_onScriptAlertSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_, long jarg4, wcharWeakString jarg4_, long jarg5, charWeakString jarg5_, int jarg6, long jarg7, long jarg8, wcharWeakString jarg8_);
  public final static native void WindowDelegate_freeLastScriptAlert(long jarg1, WindowDelegate jarg1_, long jarg2, wcharWeakString jarg2_);
  public final static native void WindowDelegate_freeLastScriptAlertSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, wcharWeakString jarg2_);
  public final static native void WindowDelegate_onNavigationRequested(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_, long jarg4, charWeakString jarg4_, boolean jarg5, long jarg6);
  public final static native void WindowDelegate_onNavigationRequestedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, charWeakString jarg3_, long jarg4, charWeakString jarg4_, boolean jarg5, long jarg6);
  public final static native void WindowDelegate_onLoadingStateChanged(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, boolean jarg3);
  public final static native void WindowDelegate_onLoadingStateChangedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, boolean jarg3);
  public final static native void WindowDelegate_onTitleChanged(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_);
  public final static native void WindowDelegate_onTitleChangedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_);
  public final static native void WindowDelegate_onTooltipChanged(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_);
  public final static native void WindowDelegate_onTooltipChangedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_);
  public final static native void WindowDelegate_onCrashed(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onCrashedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onUnresponsive(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onUnresponsiveSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onResponsive(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onResponsiveSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_);
  public final static native void WindowDelegate_onExternalHost(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_, long jarg4, charWeakString jarg4_, long jarg5, charWeakString jarg5_);
  public final static native void WindowDelegate_onExternalHostSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, wcharWeakString jarg3_, long jarg4, charWeakString jarg4_, long jarg5, charWeakString jarg5_);
  public final static native void WindowDelegate_onCreatedWindow(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Window jarg3_, long jarg4, Rect jarg4_);
  public final static native void WindowDelegate_onCreatedWindowSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Window jarg3_, long jarg4, Rect jarg4_);
  public final static native void WindowDelegate_onPaint(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, long jarg4, Rect jarg4_, long jarg5, Rect[] jarg6, int jarg7, int jarg8, long jarg9, Rect jarg9_);
  public final static native void WindowDelegate_onPaintSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, long jarg4, Rect jarg4_, long jarg5, Rect[] jarg6, int jarg7, int jarg8, long jarg9, Rect jarg9_);
  public final static native void WindowDelegate_onWidgetCreated(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, int jarg4);
  public final static native void WindowDelegate_onWidgetCreatedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, int jarg4);
  public final static native void WindowDelegate_onWidgetDestroyed(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_);
  public final static native void WindowDelegate_onWidgetDestroyedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_);
  public final static native void WindowDelegate_onWidgetResize(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, int jarg4, int jarg5);
  public final static native void WindowDelegate_onWidgetResizeSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, int jarg4, int jarg5);
  public final static native void WindowDelegate_onWidgetMove(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, int jarg4, int jarg5);
  public final static native void WindowDelegate_onWidgetMoveSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, int jarg4, int jarg5);
  public final static native void WindowDelegate_onWidgetPaint(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, long jarg4, long jarg5, Rect jarg5_, long jarg6, Rect[] jarg7, int jarg8, int jarg9, long jarg10, Rect jarg10_);
  public final static native void WindowDelegate_onWidgetPaintSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, Widget jarg3_, long jarg4, long jarg5, Rect jarg5_, long jarg6, Rect[] jarg7, int jarg8, int jarg9, long jarg10, Rect jarg10_);
  public final static native void WindowDelegate_onCursorUpdated(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3);
  public final static native void WindowDelegate_onCursorUpdatedSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3);
  public final static native void WindowDelegate_onShowContextMenu(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, ContextMenuEventArgs jarg3_);
  public final static native void WindowDelegate_onShowContextMenuSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, ContextMenuEventArgs jarg3_);
  public final static native void WindowDelegate_onJavascriptCallback(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, long jarg4, charWeakString jarg4_, long jarg5, wcharWeakString jarg5_, long jarg6, long jarg7);
  public final static native void WindowDelegate_onJavascriptCallbackSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, long jarg3, long jarg4, charWeakString jarg4_, long jarg5, wcharWeakString jarg5_, long jarg6, long jarg7);
  public final static native void WindowDelegate_onRunFileChooser(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, int jarg3, long jarg4, wcharWeakString jarg4_, long jarg5, charWeakString jarg5_);
  public final static native void WindowDelegate_onRunFileChooserSwigExplicitWindowDelegate(long jarg1, WindowDelegate jarg1_, long jarg2, Window jarg2_, int jarg3, long jarg4, wcharWeakString jarg4_, long jarg5, charWeakString jarg5_);
  public final static native void WindowDelegate_director_connect(WindowDelegate obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void WindowDelegate_change_ownership(WindowDelegate obj, long cptr, boolean take_or_release);

  public static void SwigDirector_WindowDelegate_onAddressBarChanged(WindowDelegate self, long win, long newURL) {
    self.onAddressBarChanged((win == 0) ? null : new Window(win, false), new charWeakString(newURL, false));
  }
  public static void SwigDirector_WindowDelegate_onStartLoading(WindowDelegate self, long win, long newURL) {
    self.onStartLoading((win == 0) ? null : new Window(win, false), new charWeakString(newURL, false));
  }
  public static void SwigDirector_WindowDelegate_onLoad(WindowDelegate self, long win) {
    self.onLoad((win == 0) ? null : new Window(win, false));
  }
  public static void SwigDirector_WindowDelegate_onCrashedWorker(WindowDelegate self, long win) {
    self.onCrashedWorker((win == 0) ? null : new Window(win, false));
  }
  public static void SwigDirector_WindowDelegate_onCrashedPlugin(WindowDelegate self, long win, long pluginName) {
    self.onCrashedPlugin((win == 0) ? null : new Window(win, false), new wcharWeakString(pluginName, false));
  }
  public static void SwigDirector_WindowDelegate_onProvisionalLoadError(WindowDelegate self, long win, long url, int errorCode, boolean isMainFrame) {
    self.onProvisionalLoadError((win == 0) ? null : new Window(win, false), new charWeakString(url, false), errorCode, isMainFrame);
  }
  public static void SwigDirector_WindowDelegate_onConsoleMessage(WindowDelegate self, long win, long message, long sourceId, int line_no) {
    self.onConsoleMessage((win == 0) ? null : new Window(win, false), new wcharWeakString(message, false), new wcharWeakString(sourceId, false), line_no);
  }
  public static void SwigDirector_WindowDelegate_onScriptAlert(WindowDelegate self, long win, long message, long defaultValue, long url, int flags, long success, long value) {
    self.onScriptAlert((win == 0) ? null : new Window(win, false), new wcharWeakString(message, false), new wcharWeakString(defaultValue, false), new charWeakString(url, false), flags, new SWIGTYPE_p_bool(success, false), new wcharWeakString(value, false));
  }
  public static void SwigDirector_WindowDelegate_freeLastScriptAlert(WindowDelegate self, long lastValue) {
    self.freeLastScriptAlert(new wcharWeakString(lastValue, false));
  }
  public static void SwigDirector_WindowDelegate_onNavigationRequested(WindowDelegate self, long win, long newUrl, long referrer, boolean isNewWindow, long cancelDefaultAction) {
    self.onNavigationRequested((win == 0) ? null : new Window(win, false), new charWeakString(newUrl, false), new charWeakString(referrer, false), isNewWindow, new SWIGTYPE_p_bool(cancelDefaultAction, false));
  }
  public static void SwigDirector_WindowDelegate_onLoadingStateChanged(WindowDelegate self, long win, boolean isLoading) {
    self.onLoadingStateChanged((win == 0) ? null : new Window(win, false), isLoading);
  }
  public static void SwigDirector_WindowDelegate_onTitleChanged(WindowDelegate self, long win, long title) {
    self.onTitleChanged((win == 0) ? null : new Window(win, false), new wcharWeakString(title, false));
  }
  public static void SwigDirector_WindowDelegate_onTooltipChanged(WindowDelegate self, long win, long text) {
    self.onTooltipChanged((win == 0) ? null : new Window(win, false), new wcharWeakString(text, false));
  }
  public static void SwigDirector_WindowDelegate_onCrashed(WindowDelegate self, long win) {
    self.onCrashed((win == 0) ? null : new Window(win, false));
  }
  public static void SwigDirector_WindowDelegate_onUnresponsive(WindowDelegate self, long win) {
    self.onUnresponsive((win == 0) ? null : new Window(win, false));
  }
  public static void SwigDirector_WindowDelegate_onResponsive(WindowDelegate self, long win) {
    self.onResponsive((win == 0) ? null : new Window(win, false));
  }
  public static void SwigDirector_WindowDelegate_onExternalHost(WindowDelegate self, long win, long message, long origin, long target) {
    self.onExternalHost((win == 0) ? null : new Window(win, false), new wcharWeakString(message, false), new charWeakString(origin, false), new charWeakString(target, false));
  }
  public static void SwigDirector_WindowDelegate_onCreatedWindow(WindowDelegate self, long win, long newWindow, long initialRect) {
    self.onCreatedWindow((win == 0) ? null : new Window(win, false), (newWindow == 0) ? null : new Window(newWindow, false), new Rect(initialRect, false));
  }
  public static void SwigDirector_WindowDelegate_onPaint(WindowDelegate self, long win, long sourceBuffer, long sourceBufferRect, long numCopyRects, Rect[] copyRects, int dx, int dy, long scrollRect) {
    self.onPaint((win == 0) ? null : new Window(win, false), (sourceBuffer == 0) ? null : new SWIGTYPE_p_unsigned_char(sourceBuffer, false), new Rect(sourceBufferRect, false), numCopyRects, copyRects, dx, dy, new Rect(scrollRect, false));
  }
  public static void SwigDirector_WindowDelegate_onWidgetCreated(WindowDelegate self, long win, long newWidget, int zIndex) {
    self.onWidgetCreated((win == 0) ? null : new Window(win, false), (newWidget == 0) ? null : new Widget(newWidget, false), zIndex);
  }
  public static void SwigDirector_WindowDelegate_onWidgetDestroyed(WindowDelegate self, long win, long wid) {
    self.onWidgetDestroyed((win == 0) ? null : new Window(win, false), (wid == 0) ? null : new Widget(wid, false));
  }
  public static void SwigDirector_WindowDelegate_onWidgetResize(WindowDelegate self, long win, long wid, int newWidth, int newHeight) {
    self.onWidgetResize((win == 0) ? null : new Window(win, false), (wid == 0) ? null : new Widget(wid, false), newWidth, newHeight);
  }
  public static void SwigDirector_WindowDelegate_onWidgetMove(WindowDelegate self, long win, long wid, int newX, int newY) {
    self.onWidgetMove((win == 0) ? null : new Window(win, false), (wid == 0) ? null : new Widget(wid, false), newX, newY);
  }
  public static void SwigDirector_WindowDelegate_onWidgetPaint(WindowDelegate self, long win, long wid, long sourceBuffer, long sourceBufferRect, long numCopyRects, Rect[] copyRects, int dx, int dy, long scrollRect) {
    self.onWidgetPaint((win == 0) ? null : new Window(win, false), (wid == 0) ? null : new Widget(wid, false), (sourceBuffer == 0) ? null : new SWIGTYPE_p_unsigned_char(sourceBuffer, false), new Rect(sourceBufferRect, false), numCopyRects, copyRects, dx, dy, new Rect(scrollRect, false));
  }
  public static void SwigDirector_WindowDelegate_onCursorUpdated(WindowDelegate self, long win, long newCursor) {
    self.onCursorUpdated((win == 0) ? null : new Window(win, false), new SWIGTYPE_p_Cursor(newCursor, false));
  }
  public static void SwigDirector_WindowDelegate_onShowContextMenu(WindowDelegate self, long win, long args) {
    self.onShowContextMenu((win == 0) ? null : new Window(win, false), new ContextMenuEventArgs(args, false));
  }
  public static void SwigDirector_WindowDelegate_onJavascriptCallback(WindowDelegate self, long win, long replyMsg, long origin, long funcName, long args, long numArgs) {
    self.onJavascriptCallback((win == 0) ? null : new Window(win, false), (replyMsg == 0) ? null : new SWIGTYPE_p_void(replyMsg, false), new charWeakString(origin, false), new wcharWeakString(funcName, false), (args == 0) ? null : new SWIGTYPE_p_Script__Variant(args, false), numArgs);
  }
  public static void SwigDirector_WindowDelegate_onRunFileChooser(WindowDelegate self, long win, int mode, long title, long defaultFile) {
    self.onRunFileChooser((win == 0) ? null : new Window(win, false), mode, new wcharWeakString(title, false), new charWeakString(defaultFile, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
