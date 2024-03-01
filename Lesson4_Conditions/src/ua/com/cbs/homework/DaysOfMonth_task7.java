package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Дано номер місяця – ціле число в діапазоні 1–12 (1 – січень, 2 – лютий і так далі).
 * Визначте кількість днів цього місяця для невисокосного року.
 */

public class DaysOfMonth_task7 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a month's number [1-12] :");
    String input = scanner.nextLine();

    if (input.trim().length() > 2 ||
        (input.trim().length() == 1 && !input.matches("[1-9]")) ||
        (input.trim().length() == 2 && !input.matches("[0-1][0-2]"))) {
      System.out.println("Month's number must be only from 1 to 12!");
    } else {
      int month = Integer.parseInt(input.trim());
      switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
          System.out.printf("There are 31 days in the month - %s", month);
          break;
        case 2:
          System.out.printf("There are 28 days in the month - %s", month);
          break;
        default:
          System.out.printf("There are 30 days in the month - %s", month);
          break;
      }
    }
    scanner.close();
  }
}
