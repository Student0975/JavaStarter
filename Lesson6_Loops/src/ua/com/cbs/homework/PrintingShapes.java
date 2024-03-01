package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Використовуючи цикли та метод:
 * System.out.print("*"), System.out.print(" "), System.out.print("\n") (для переходу на новий рядок).
 * Виведіть на екран:
 * · прямокутник;
 * · прямокутний трикутник;
 * · рівносторонній трикутник;
 * · ромб.
 */

public class PrintingShapes {

  public static void main(String[] args) {
    int a = 0;
    int b = 0;
    boolean isInputCorrect = true;

    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Input a positive odd integer number :");
      a = sc.nextInt();
      if (a <= 0 || (a % 2 == 0)) {
        System.out.println("Input must be a positive odd integer number!");
        isInputCorrect = false;
      }
    } catch (InputMismatchException ex) {
      isInputCorrect = false;
      System.out.println("Input must be a positive odd integer number!");
    }

    if (isInputCorrect) {
      try {
        System.out.println("Input a positive integer number :");
        b = sc.nextInt();
        if (b <= 0) {
          System.out.println("Input must be a positive integer number!");
          isInputCorrect = false;
        }
      } catch (InputMismatchException ex) {
        isInputCorrect = false;
        System.out.println("Input must be a positive odd integer number!");
      }
    }

    if (isInputCorrect) {
      System.out.printf("\nRectangle (%sx%s):%n", a, b);
      for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
          System.out.print("*");
        }
        System.out.print("\n");
      }

      System.out.printf("\nRight triangle with a leg %s:\n",a);
      for (int i = 0; i < a; i++) {
        b = i + 1;
        for (int j = 0; j < b; j++) {
          System.out.print("*");
        }
        System.out.print("\n");
      }

      System.out.printf("\nEquilateral triangle with a side = %s\n", a);
      for (int i = 0; i <= a / 2; i++) {
        for (int j = 0; j < a; j++) {
          if (j < (a / 2 - i) || j > (a / 2 + i)) System.out.print(" ");
          else System.out.print("*");
        }
        System.out.print("\n");
      }

      System.out.printf("\nRhombus with a diagonal = %s\n", a);
      for (int i = 0; i <= a / 2; i++) {
        for (int j = 0; j < a; j++) {
          if (j < (a / 2 - i) || j > (a / 2 + i)) System.out.print(" ");
          else System.out.print("*");
        }
        System.out.print("\n");
      }

      for (int i = a / 2; i > 0; i--) {
        for (int j = 0; j < a; j++) {
          if (j <= (a / 2 - i) || j >= (a / 2 + i)) System.out.print(" ");
          else System.out.print("*");
        }
        System.out.print("\n");
      }
    }
    sc.close();
  }
}

