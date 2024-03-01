package ua.com.cbs.logicalOperation;

import java.util.Scanner;

/**
 * Дано целое число A. Проверить истинность высказывания: «Число A является четным».
 */

public class EvenNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input an integer number :");
    String input = scanner.nextLine();

    if (!input.trim().matches("\\d+")) {
      System.out.println("Input must be integer number!");
    } else {
      boolean rez = (Integer.parseInt(input.trim()) % 2) == 0;
      System.out.println("Is number even : " + rez);
    }
    scanner.close();
  }
}
