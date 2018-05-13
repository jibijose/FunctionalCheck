package com.test.customfunction;

public class Sum implements Operation<Integer> {

  @Override
  public Integer result(Integer a, Integer b) {
    return a + b;
  }

}
