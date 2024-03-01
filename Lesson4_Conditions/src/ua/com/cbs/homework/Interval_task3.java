package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Напишіть програму визначення, чи потрапляє вказане користувачем число від 0 до 100 до числового проміжку
 * [0 - 14] [15 - 35] [36 - 50][51 - 100].
 * Якщо так, то вкажіть, в який саме проміжок.
 * Якщо користувач вказує число, що не входить до жодного з наявних числових проміжків,
 * то виводиться відповідне повідомлення.
 */

public class Interval_task3 {
  public static void main(String[] args) {
    boolean isInputCorrect = true;

    System.out.println("Input an integer number from 0 to 100 :");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine().trim();

    if (input.length() > 3 || !input.matches("\\+?\\d+") || Integer.parseInt(input) > 100) {
      System.out.println("Input must be an integer number from 0 to 100 !");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      int inputToInt = Integer.parseInt(input);

      if (0 <= inputToInt && inputToInt <= 14) {
        System.out.println("The number : " + inputToInt + " belongs to the range [0 - 14]");
      } else if (15 <= inputToInt && inputToInt <= 35) {
        System.out.println("The number : " + inputToInt + " belongs to the range [15 - 35]");
      } else if (36 <= inputToInt && inputToInt <= 50) {
        System.out.println("The number : " + inputToInt + " belongs to the range [36 - 50]");
      } else
        System.out.println("The number : " + inputToInt + " belongs to the range [51 - 100]");
    }
    scanner.close();
  }
}
