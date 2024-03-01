package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Дано три цілих числа.
 * Знайдіть максимальне, мінімальне та середнє.
 */

public class MaxMinAverage_task6 {

  public static void main(String[] args) {
    int num1 = 0, num2 = 0, num3 = 0;
    int max, min, average;
    boolean isInputCorrect = true;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input 1st integer number :");
    String input = scanner.nextLine().trim();

    if (input.matches("[-|\\+]?\\d+")) {
      num1 = Integer.parseInt(input);
    } else {
      System.out.println("Input must be an integer number!");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      System.out.println("Input 2nd integer number :");
      input = scanner.nextLine().trim();

      if (input.matches("[-|\\+]?\\d+")) {
        num2 = Integer.parseInt(input);
      } else {
        System.out.println("Input must be an integer number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      System.out.println("Input 3rd integer number :");
      input = scanner.nextLine().trim();

      if (input.matches("[-|\\+]?\\d+")) {
        num3 = Integer.parseInt(input);
      } else {
        System.out.println("Input must be an integer number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      if (num1 >= num2 && num1 >= num3) {
        max = num1;
        if (num2 >= num3) {
          average = num2;
          min = num3;
        } else {
          average = num3;
          min = num2;
        }
      } else if (num2 > num1 && num2 >= num3) {
        max = num2;
        if (num1 >= num3) {
          average = num1;
          min = num3;
        } else {
          average = num3;
          min = num1;
        }
      } else {
        max = num3;
        if (num1 >= num2) {
          average = num1;
          min = num2;
        } else {
          average = num2;
          min = num1;
        }
      }
      System.out.printf("Number order (max-average-min) is : %s, %s, %s", max, average, min);
    }
    scanner.close();
  }
}
