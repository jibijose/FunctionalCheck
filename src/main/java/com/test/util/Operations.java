package com.test.util;

import com.test.customfunction.Operation;

public class Operations {

  private Operations() {
  }

  public static <T> T operate(T[] a, Operation<T> o) {
    
    if ( a == null) {
      throw new RuntimeException("Cannot operate on null array");
    }
    
    if ( a.length == 0) {
      throw new RuntimeException("Cannot operate on empty array");
    }
    
    T result = a[0];
    for ( int i=1; i<a.length; i++) {
      result = (T) o.result(result, a[i]);
    }
    
    return result;
  }

}
