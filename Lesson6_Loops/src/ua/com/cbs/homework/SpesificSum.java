package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Дано ціле число N (> 0).
 * Використовуючи один цикл, знайдіть суму 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)
 */

public class SpesificSum {

  public static void main(String[] args) {
    double sum  = 1.0;
    double factorial = 1.0;

    String exprStrFactorial;
    String exprStrFactorialValue;
    String exprSumWithFactorial = "1";
    String exprSumWithFactorialValue = "1";

    Scanner sc = new Scanner(System.in);
    System.out.println("Input a positive integer number, N :");
    double number = sc.nextDouble();

    for (int i = 1; i <= number; i++) {
      factorial *= i;
      sum += 1 / factorial;
      exprStrFactorial = String.format(" + 1/(%s!)", i);
      exprStrFactorialValue = String.format(" + 1/%s", factorial);
      exprSumWithFactorial += exprStrFactorial;
      exprSumWithFactorialValue += exprStrFactorialValue;
    }
    System.out.println("sum = " + sum);
    System.out.println(exprSumWithFactorial);
    System.out.println(exprSumWithFactorialValue);
  }
}
