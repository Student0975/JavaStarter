package ua.com.cbs.logicalOperation;

import java.util.Scanner;

/**
 * Даны два целых числа: A, B. Проверить истинность высказывания:
 * «Каждое из чисел A и B нечетное».
 */

public class EachNumbersIsOdd {

  public static void main(String[] args) {
    int a = 0, b=0;
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

      System.out.println("Input 1st integer number, B :");
      input = scanner.nextLine().trim();

      if (!input.matches("-?\\d+")) {
        System.out.println("Input must be only integer number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      b = Integer.parseInt(input);
      boolean res = (a % 2 != 0) && (b % 2 != 0);
      System.out.println("Is statement 'each number A and B is odd' correct : " + res);
    }
    scanner.close();
  }
}
