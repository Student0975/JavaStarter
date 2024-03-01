package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Напишіть метод, який визначатиме:
 * 1) чи є введене число позитивним, чи негативним;
 * 2) чи є воно простим (використовуйте техніку перебору значень).
 * Просте число – це натуральне число, яке ділиться на 1 й саме на себе.
 * Щоби визначити просте число чи ні, варто знайти всі його цілі дільники.
 * Якщо дільників більше 2-х, то воно не просте;
 * 3) чи ділиться воно на 2, 5, 3, 6, 9 без залишку.
 */

public class NumbersCheck {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;

    while (true) {
      try {
        System.out.println("Input an integer number :");
        number = sc.nextInt();
        numberCheck(number);
        break;
      } catch (InputMismatchException ex) {
        System.out.println("Input must be only an integer number!");
        sc.next();
      }
    }
    sc.close();
  }

  private static void numberCheck(int n) {
    if (n == 0) {
      System.out.println("No possible to execute number checking!\n" +
                         "Provide not 0 number.");
    } else {
      String isPositive = (n > 0) ? "Provided number is positive" : "Provided number is negative";
      System.out.println(isPositive);

      String isPrime = (n == 1) ? "Provided number is not prime" : "Provided number is prime";
       for (int i = 2; i < Math.abs(n); i++) {
          if (n % i == 0) {
            isPrime = "Provided number is not prime";
            break;
          }
        }
      System.out.println(isPrime);

      String division = "";
      String div = "Provided number can be divided by ";
      String divNot = "Provided number can not be divided by ";

      if (n % 2 == 0) division += div + " 2\n";
      else division += divNot + " 2\n";
      if (n % 3 == 0) division += div + " 3\n";
      else division += divNot + " 3\n";
      if (n % 5 == 0) division += div + " 5\n";
      else division += divNot + " 5\n";
      if (n % 6 == 0) division += div + " 6\n";
      else division += divNot + " 6\n";
      if (n % 9 == 0) division += div + " 9\n";
      else division += divNot + " 9\n";
      System.out.println(division);
    }
  }
}
