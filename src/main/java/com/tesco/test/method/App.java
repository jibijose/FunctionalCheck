package com.tesco.test.method;

import java.util.function.Consumer;

public class App {

  private static String FIXMODE = "Auto";
  
  public static void main(String[] args) {
    App app = new App();
    app.invoke();
  }

  private void invoke() {
    final Mechanic mechanic = new Mechanic();
    Car car = new Car();

    // Using an anonymous class
    mechanic.execute(car, new Consumer<Car>() {
      public void accept(Car c) {
        mechanic.fix(c, FIXMODE);
      }
    });

    // Using a lambda expression
    mechanic.execute(car, c -> mechanic.fix(c, FIXMODE));

    // Using a method reference
//    mechanic.execute(car, mechanic::fix);
  }
}
