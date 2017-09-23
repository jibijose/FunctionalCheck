package com.tesco.test.method;

import java.util.function.Consumer;

public class Mechanic {

  public void fix(Car c, String fixMode) {
    System.out.println("Fixing car=" + c.getId() + " in mode=" + fixMode);
  }
  
  public void execute(Car car, Consumer<Car> c) {
    c.accept(car);
  }

}
