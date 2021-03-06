/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package lbfgsb.jniwrapper;

public class lbfgsb_wrapper implements lbfgsb_wrapperConstants {
  public static SWIGTYPE_p_int new_intArray(int nelements) {
    long cPtr = lbfgsb_wrapperJNI.new_intArray(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static void delete_intArray(SWIGTYPE_p_int ary) {
    lbfgsb_wrapperJNI.delete_intArray(SWIGTYPE_p_int.getCPtr(ary));
  }

  public static int intArray_getitem(SWIGTYPE_p_int ary, int index) {
    return lbfgsb_wrapperJNI.intArray_getitem(SWIGTYPE_p_int.getCPtr(ary), index);
  }

  public static void intArray_setitem(SWIGTYPE_p_int ary, int index, int value) {
    lbfgsb_wrapperJNI.intArray_setitem(SWIGTYPE_p_int.getCPtr(ary), index, value);
  }

  public static SWIGTYPE_p_double new_doubleArray(int nelements) {
    long cPtr = lbfgsb_wrapperJNI.new_doubleArray(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void delete_doubleArray(SWIGTYPE_p_double ary) {
    lbfgsb_wrapperJNI.delete_doubleArray(SWIGTYPE_p_double.getCPtr(ary));
  }

  public static double doubleArray_getitem(SWIGTYPE_p_double ary, int index) {
    return lbfgsb_wrapperJNI.doubleArray_getitem(SWIGTYPE_p_double.getCPtr(ary), index);
  }

  public static void doubleArray_setitem(SWIGTYPE_p_double ary, int index, double value) {
    lbfgsb_wrapperJNI.doubleArray_setitem(SWIGTYPE_p_double.getCPtr(ary), index, value);
  }

  public static lbfgsb lbfgsb_create(int n, int m) {
    long cPtr = lbfgsb_wrapperJNI.lbfgsb_create(n, m);
    return (cPtr == 0) ? null : new lbfgsb(cPtr, false);
  }

  public static void lbfgsb_delete(lbfgsb data) {
    lbfgsb_wrapperJNI.lbfgsb_delete(lbfgsb.getCPtr(data), data);
  }

  public static void lbfgsb_step(lbfgsb data) {
    lbfgsb_wrapperJNI.lbfgsb_step(lbfgsb.getCPtr(data), data);
  }

  public static void lbfgsb_set_task(lbfgsb data, lbfgsb_task_type type) {
    lbfgsb_wrapperJNI.lbfgsb_set_task(lbfgsb.getCPtr(data), data, type.swigValue());
  }

  public static lbfgsb_task_type lbfgsb_get_task(lbfgsb data) {
    return lbfgsb_task_type.swigToEnum(lbfgsb_wrapperJNI.lbfgsb_get_task(lbfgsb.getCPtr(data), data));
  }

  public static void lbfgsb_set_task_str(lbfgsb data, String c_str) {
    lbfgsb_wrapperJNI.lbfgsb_set_task_str(lbfgsb.getCPtr(data), data, c_str);
  }

  public static int lbfgsb_is_task_str_equal(lbfgsb data, String c_str) {
    return lbfgsb_wrapperJNI.lbfgsb_is_task_str_equal(lbfgsb.getCPtr(data), data, c_str);
  }

}
