package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Відомо, що в числах, які є ступенем двійки, лише один біт має значення 1.
 * Напишіть програму, яка перевірятиме, чи є вказане число ступенем двійки, чи ні.
 */

public class PowerOfTwo {

  public static void main(String[] args) {
    int number = 0;
    boolean isInputCorrect = true;
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Input a positive integer number, > 0 :");
      number = scanner.nextInt();
      if (number < 0) {
        isInputCorrect = false;
        System.out.println("Input must a positive integer number!");
      }
    } catch (InputMismatchException ex) {
      isInputCorrect = false;
      System.out.println("Input must an integer number!");
    }

    // рішення базується на тому, що число у бінарному вигляді, що передує числа, що є ступенем двійки,
    // складається з одиниць у всіх бітах, що йдуть до біта, де є одиниця у числа, що є ступенем двійки
    // результат побітового І цих 2х чисел буде дорівнювати 0
    // 0000 1000        - 8
    // 0000 0111        - 7
    // 0000 0000        - 0 результат побітового І

    if (isInputCorrect) {
      if ((number > 0) && (number & (number - 1)) == 0) {
        System.out.println("The specified is a power of 2");
      } else {
        System.out.println("The specified number is not a power of 2");
      }
    }
    scanner.close();
  }
}
