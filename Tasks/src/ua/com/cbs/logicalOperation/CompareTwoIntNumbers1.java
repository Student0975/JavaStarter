package ua.com.cbs.logicalOperation;

import java.util.Scanner;

/**
 * Даны два целых числа: A, B. Проверить истинность высказывания:
 * «Справедливы неравенства A ≥ 0 или B < −2».
 */

public class CompareTwoIntNumbers1 {

  public static void main(String[] args) {
    int a = 0, b = 0;
    boolean isInputCorrect = true;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input 1st integer number, A :");
    String input = scanner.nextLine().trim();

    if (!input.matches("-?\\d+")) {
      System.out.println("Input must be only an integer number!");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      a = Integer.parseInt(input);

      System.out.println("Input 1st integer number, B :");
      input = scanner.nextLine().trim();

      if (!input.matches("-?\\d+")) {
        System.out.println("Input must be only an integer number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      b = Integer.parseInt(input);
      boolean rez = (a >= 0) || (b < -2);
      System.out.println("Are inequalities correct (A ≥ 0 or B < −2) : " + rez);
    }
    scanner.close();
  }
}
