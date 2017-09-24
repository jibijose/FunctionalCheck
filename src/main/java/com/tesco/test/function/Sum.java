package com.tesco.test.function;

public class Sum {

  public static void main(String[] args) {
    System.out.println("Hello World Start!");

    TriFunction<Sum, String, String, Integer> anon =
        new TriFunction<Sum, String, String, Integer>() {

          public Integer apply(Sum s, String arg1, String arg2) {
            return s.doSum(arg1, arg2);
          }
        };
    System.out.println(anon.apply(new Sum(), "1", "4"));

    TriFunction<Sum, String, String, Integer> lambda =
        (Sum s, String arg1, String arg2) -> s.doSum(arg1, arg2);
    System.out.println(lambda.apply(new Sum(), "1", "44"));

    System.out.println("Hello World End!");
  }

  Integer doSum(String s1, String s2) {
    return Integer.parseInt(s1) + Integer.parseInt(s2);
  }


}
