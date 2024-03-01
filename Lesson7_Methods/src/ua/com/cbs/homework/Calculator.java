package ua.com.cbs.homework;

import java.util.Random;

/**
 * Створіть метод з ім'ям calculate,
 * який приймає як параметри три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.
 */

public class Calculator {

  public static void main(String[] args) {
    Random random = new Random();
    int a = random.nextInt(100);
    int b = random.nextInt(100);
    int c = random.nextInt(100);
    System.out.printf("Average of the numbers %s, %s, %s = %.2f\n", a, b, c, calculate(a,b,c));
  }

  private static double calculate(int a, int b, int c) {
    return (double) (a+b+c)/3;
  }
}
