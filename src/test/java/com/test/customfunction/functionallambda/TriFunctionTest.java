package com.test.customfunction.functionallambda;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.test.customfunction.MultiplicationInteger;
import com.test.customfunction.Operation;
import com.test.customfunction.SumInteger;
import com.test.customfunction.TriFunction;

@RunWith(BlockJUnit4ClassRunner.class)
public class TriFunctionTest {

  TriFunction<Operation<Integer>, Integer, Integer, Integer> triFunction;

  @Before
  public void beforeEachTest() {
    triFunction = (Operation<Integer> o, Integer a, Integer b) -> o.result(a, b);
  }

  @Test
  public void checkSummation() {
    assertEquals("Sum should be 80", Integer.valueOf(80), triFunction.apply(new SumInteger(), 60, 20));
  }

  @Test
  public void checkMultiplication() {
    assertEquals("Multiplication should be 1200", Integer.valueOf(1200),
        triFunction.apply(new MultiplicationInteger(), 60, 20));
  }
}
