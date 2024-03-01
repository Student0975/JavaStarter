package ua.com.cbs.logicalOperation;

import java.util.Scanner;

/**
 * Даны три целых числа: A, B, C.
 * Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
 */

public class CompareThreeIntNumbers {

  public static void main(String[] args) {
    int a = 0, b = 0, c = 0;
    boolean isInputCorrect = true;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input 1st integer number, A :");
    String input = scanner.nextLine().trim();

    if (!input.matches("-?\\d+")) {
      System.out.println("Input must be only integer number!");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      a = Integer.parseInt(input);

      System.out.println("Input 2nd integer number, B :");
      input = scanner.nextLine().trim();

      if (!input.matches("-?\\d+")) {
        System.out.println("Input must be only integer number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      b = Integer.parseInt(input);

      System.out.println("Input 3rd integer number, C :");
      input = scanner.nextLine().trim();

      if (!input.matches("-?\\d+")) {
        System.out.println("Input must be only integer number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      c = Integer.parseInt(input);
      boolean rez = (a < b) && (b < c);
      System.out.println("Is statement correct (A < B < C) : " + rez);
    }
    scanner.close();
  }
}
