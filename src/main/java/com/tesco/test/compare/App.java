package com.tesco.test.compare;

import java.util.Arrays;

import com.tesco.test.compare.objectoriented.PersonAgeComparator;

public class App {

  public static void main(String[] args) {
    App app = new App();
    app.invokeObjectOrientedClassWay();
  }

  private void invokeObjectOrientedClassWay() {
    System.out.println("************************************ invokeObjectOrientedClassWay *********************************************");
    Person[] rosterAsArray = null;
    Arrays.sort(rosterAsArray, new PersonAgeComparator());
    System.out.println(Arrays.toString(rosterAsArray));
    System.out.println("*****************************************************************************************");
    Arrays.sort(rosterAsArray, new PersonAgeComparator());
    System.out.println(Arrays.toString(rosterAsArray));
  }
  
  
}
