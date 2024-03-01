package ua.com.cbs.homework;

import java.util.Random;

/**
 * Створіть метод з ім'ям calculate,
 * який приймає як параметри три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.
 */

public class CalcNumDivBy5 {

  public static void main(String[] args) {
    Random random = new Random();
    int number1 = random.nextInt(100);
    int number2 = random.nextInt(100);
    int number3 = random.nextInt(100);

    calculate(number1, number2, number3);
  }

  private static void calculate(int a, int b, int c) {
    double aDiv5 = (double) a / 5;
    double bDiv5 = (double) b / 5;
    double cDiv5 = (double) c / 5;
    System.out.println(a + " / 5 = " + aDiv5);
    System.out.println(b + " / 5 = " + bDiv5);
    System.out.println(c + " / 5 = " + cDiv5);
  }
}
