package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Дано два цілих числа A і B (A < B). Знайдіть суму всіх цілих чисел від A до B включно.
 */

public class SumIntNumFromRange {

  public static void main(String[] args) {
    int a = 0, b = 0, sum = 0;
    boolean isInputCorrect = true;
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Input an integer number, A :");
      a = sc.nextInt();
    } catch (InputMismatchException ex) {
      isInputCorrect = false;
      System.out.println("Input must be an integer number!");
    }

    if (isInputCorrect) {
      try {
        System.out.println("Input an integer number, B :");
        b = sc.nextInt();
        if (a > b) {
          isInputCorrect = false;
          System.out.println("Integer number B must be greater than A!");
        }
      } catch (InputMismatchException ex) {
        isInputCorrect = false;
        System.out.println("Input must be an integer number!");
      }
    }

    if (isInputCorrect) {
      for (int i = a; i <= b; i++) {
        sum += i;
      }
      System.out.printf("Sum integer numbers from range [%s,%s] = %s",a,b,sum);
    }
  }
}
