package ua.com.cbs.homework;

/**
 * Є 3 змінні типу int x = 10, y = 12 та z = 3.
 * Виконайте розрахунок результату таких операцій для цих змінних:
 * §  x += y – x++ * z;
 * §  z = --x – y * 5;
 * §  y /= x + 5 % z;
 * §  z = x++ + y * 5;
 * §  x = y – x++ * z;
 */

public class ArithmeticOperatorsTreeIntNumbers_Task1 {

  public static void main(String[] args) {
    int x = 10;
    int y = 12;
    int z = 3;

    x += y - x++ * z;
    System.out.printf("Result of 'x += y – x++ * z' is : %s", x);
    // x = -8; y = 12; z = 3;

    z = --x - y * 5;
    System.out.printf("\nResult of 'z = --x – y * 5'  is : %s", z);
    // x = -9; y = 12; z = -69;

    y /= x + 5 % z;
    System.out.println("\nResult of 'y /= x + 5 % z'   is : " + y);
    // x = -9; y = -3; z = -69;

    z = x++ + y * 5;
    System.out.printf("Result of 'z = x++ + y * 5'  is : %s", z);
    // x = -8; y = -3; z = -24;

    x = y - x++ * z;
    System.out.printf("\nResult of 'x = y - x++ * z' is : %s", x);
    // x = -195; y = -3; z = -24;
  }
}