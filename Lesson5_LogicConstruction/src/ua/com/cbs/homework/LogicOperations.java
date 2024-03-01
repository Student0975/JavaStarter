package ua.com.cbs.homework;

/**
 * Є 3 змінні типу int x = 5, y = 10, і z = 15.
 * Виконайте та розрахуйте результат таких операцій для цих змінних:
 * x += y >> x++ * z;
 * z = ++x & y * 5;
 * y /= x + 5 | z;
 * z = x++ & y * 5;
 * x = y << x++ ^ z;
 */

public class LogicOperations {

  public static void main(String[] args) {
    int x = 5, y = 10, z = 15;

    System.out.printf("x = %s, y = %s, z = %s%n%n", x,y,z);

    System.out.printf("1) x += y >> x++ * z : %s%n", x += y >> x++ * z);
    System.out.printf("2) z = ++x & y * 5   : %s%n", z = ++x & y * 5);
    System.out.printf("3) y /= x + 5 | z    : %s%n", y /= x + 5 | z);
    System.out.printf("4) z = x++ & y * 5   : %s%n", z = x++ & y * 5);
    System.out.printf("5) x = y << x++ ^ z  : %s%n", x = y << x++ ^ z);
  }
}
