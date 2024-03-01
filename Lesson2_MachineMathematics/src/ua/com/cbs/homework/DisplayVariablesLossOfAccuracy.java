package ua.com.cbs.homework;

/**
 * Дано значення числа pi, яке дорівнює 3,141592653, та значення числа Ейлера е, яке дорівнює 2,7182818284590452.
 * Створіть дві змінні, надайте їм значення числа pi та числа е та виведіть їх на екран без втрати точності.
 */

import java.math.BigDecimal;

public class DisplayVariablesLossOfAccuracy {

  public static void main(String[] args) {
    double pi = 3.141592653d;
    double e  = 2.7182818284590452d;

    String e1 = "2.7182818284590452"; // використовуємо тип даних String, щоб не втратити останню цифру
    BigDecimal bgE = new BigDecimal("2.7182818284590452"); // використовуємо клас BigDecimal, щоб не втратити останню цифру

    System.out.println(pi);
    System.out.println(e);
    System.out.println(e1);
    System.out.println(bgE);
  }
}
