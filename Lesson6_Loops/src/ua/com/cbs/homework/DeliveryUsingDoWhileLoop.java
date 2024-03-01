package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Є N клієнтів, яким компанія-виробник має доставити товар.
 * Скільки є можливих маршрутів доставлення товару з урахуванням того, що товар доставлятиме одна машина?
 * Напишіть програму, яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
 * Для розв’язку задачі використовуйте факторіал N!, що розраховується за допомогою циклу do-while.
 */

public class DeliveryUsingDoWhileLoop {
  public static void main(String[] args) {

    //The largest factorial that can be computed in Java using int is 12! = 479001600. (12! = 479,001,600).

    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Input number of clients (max=12) :");
      int a = sc.nextInt();
      int factorial = 1;

      if (a <= 0 || a > 12) {
        System.out.println("Input must be a positive integer number up to 12.");
      } else {

        System.out.print("There are possible delivery routs: " + a + "! = ");

        do {
          factorial *= a--;
        } while (a > 0);

        System.out.print(factorial);
      }
    } catch (InputMismatchException ex) {
      System.out.println("Input must be a positive integer number!");
    }
  }
}