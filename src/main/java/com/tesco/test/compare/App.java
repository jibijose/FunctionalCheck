package com.tesco.test.compare;

import java.util.Arrays;

public class App {

  private static String FIXMODE = "Auto";

  public static void main(String[] args) {
    App app = new App();
    app.invoke();
  }

  private void invoke() {
    
    
    ComparisonProvider myComparisonProvider = new ComparisonProvider();
    Arrays.sort(stringArray, myComparisonProvider::compareByName);
    
    String[] stringArray =
      {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};
    Arrays.sort(stringArray, String::compareToIgnoreCase);
  }
}
