package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Дано ціле число.
 * Якщо воно є позитивним, додайте до нього 1; інакше не змінюйте його.
 * Виведіть отримане число.
 */

public class ManipulationIntNumber_task4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input an integer number :");
    String input = scanner.nextLine().trim();

    if (!input.matches("[-|\\+]?\\d+")) {
      System.out.println("Input must be an integer number!");
    } else {
      int result = (Integer.parseInt(input)>0)
          ? Integer.parseInt(input) + 1
          : Integer.parseInt(input);
      System.out.println(result);
    }
    scanner.close();
  }
}
