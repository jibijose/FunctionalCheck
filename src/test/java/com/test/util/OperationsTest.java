package com.test.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.test.customfunction.MultiplicationInteger;
import com.test.customfunction.SumInteger;

@RunWith(BlockJUnit4ClassRunner.class)
public class OperationsTest {

  @Test
  public void checkSumIntegerOperations() {
    Integer[] intArray = constructIntegersRandom();
    
    Integer sum = Operations.operate(intArray, new SumInteger());
    
    assertEquals(new Integer(15), sum);
  }
  
  @Test
  public void checkMultiplicationIntegerOperations() {
    Integer[] intArray = constructIntegersRandom();
    
    Integer sum = Operations.operate(intArray, new MultiplicationInteger());
    
    assertEquals(new Integer(120), sum);
  }
  
  private Integer[] constructIntegersRandom() {
    Integer[] intArray = new Integer[5];
    
    intArray[0] = new Integer(1);
    intArray[1] = new Integer(5);
    intArray[2] = new Integer(2);
    intArray[3] = new Integer(4);
    intArray[4] = new Integer(3);
    
    return intArray;
  }
}
