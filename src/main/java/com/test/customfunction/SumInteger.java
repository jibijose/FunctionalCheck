package com.test.customfunction;

public class SumInteger implements Operation<Integer> {

  @Override
  public Integer result(Integer a, Integer b) {
    return a + b;
  }

}
