package ua.com.cbs.conditions;

import java.util.Scanner;

/**
 * Проверить, является ли год високосным (кратным 4) в пределах от 2000
 * до нашей эры до 2000 нашей эры. Ввести с экрана год и признак эры,
 * вывести сообщение в виде «656 год нашей эры – високосный».
 */

public class LeapYear {
  public static void main(String[] args) {
    boolean isInputCorrect = true;
    Scanner sc = new Scanner(System.in);
    System.out.println("Input an year :");
    String year = sc.next();

    if (!year.trim().matches("[1-9][0-9]?[0-9]?[0-9]?")) {
      System.out.println("Entered value is not an year!");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      boolean isLeapYear;

      // divisible by 4
      isLeapYear = (Integer.parseInt(year) % 4 == 0);

      // divisible by 4, not by 100, or divisible by 400
      isLeapYear = isLeapYear && (Integer.parseInt(year) % 100 != 0 || Integer.parseInt(year) % 400 == 0);

      if (isLeapYear) {
        System.out.println(year + " is a leap year.");
      } else {
        System.out.println(year + " is not a leap year.");
      }
    }
    sc.close();
  }
}
