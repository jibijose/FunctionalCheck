package com.test.customfunction;

public class MultiplicationInteger implements Operation<Integer> {

  @Override
  public Integer result(Integer a, Integer b) {
    return a * b;
  }

}
