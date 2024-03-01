package ua.com.cbs.logicalOperation;

import java.util.Scanner;

/**
 * Даны два целых числа: A, B. Проверить истинность высказывания:
 * «Справедливы неравенства A > 2 и B ≤ 3».
 */

public class CompareTwoIntNumbers {
  public static void main(String[] args) {
    boolean isInputCorrect = true;
    int a =0, b=0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input 1st integer number, A :");
    String input = scanner.nextLine().trim();

    if (!input.matches("-?\\d+")) {
      System.out.println("Input must be an integer number!");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      a = Integer.parseInt(input);
      System.out.println("Input 2nd integer number, B :");
      input = scanner.nextLine();

      if (!input.matches("-?\\d+")) {
        System.out.println("Input must be an integer number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      b = Integer.parseInt(input);
      boolean res = (a>2) && (b<=3);
      System.out.println("Are inequalities correct (A > 2 and B ≤ 3) : " + res);
    }
    scanner.close();
  }
}
