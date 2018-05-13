package com.test.customfunction.anonymousclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.test.customfunction.Operation;

@RunWith(BlockJUnit4ClassRunner.class)
public class TriFunctionTest {

  @Test
  public void checkSummation() {
    assertEquals("Sum should be 80", Integer.valueOf(80), new Operation<Integer>() {
      @Override
      public Integer result(Integer a, Integer b) {
        return a + b;
      }
    }.result(60, 20));
  }

  @Test
  public void checkMultiplication() {
    assertEquals("Multiplication should be 1200", Integer.valueOf(1200), new Operation<Integer>() {
      @Override
      public Integer result(Integer a, Integer b) {
        return a * b;
      }
    }.result(60, 20));
  }
}
