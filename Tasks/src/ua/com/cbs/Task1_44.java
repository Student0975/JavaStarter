package ua.com.cbs;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Дано целое число N (> 0).
 * Сформировать и вывести целочисленный массив размера N,
 * содержащий N первых положительных нечетных чисел:
 * 1, 3, 5, . . . .
 */

public class Task1_44 {
  public static void main(String[] args) {
    int n = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Input a number N :");
      try {
        n = scanner.nextInt();
      } catch (InputMismatchException ex) {
        scanner.next();
      }
    } while (checkingInputConditions(n));

    int[] array = new int[n];

    // case 1. When consequence is only positive integer numbers
    System.out.println("Case1.");
    int j = 0;
    System.out.print("Initial consequence numbers : ");
    for (int i = 0; i < n; i++) {
      if (i > 0 && i % 2 != 0) {
        array[j] = i;
        j++;
      }
      System.out.print(i + " ");
    }
    showArray(array);

    int[] array1 = new int[n];

    // case 2. When consequence is negative/positive integer numbers
    System.out.println("\nCase 2.");
    Random random = new Random();

    StringBuilder stringConsequence = new StringBuilder();
    for (int i = 0; i < n; i++) {
      int val = random.nextInt(50) - 25;
      stringConsequence.append(val).append(" ");
    }

    System.out.printf("Initial consequence numbers : %s", stringConsequence);
    String[] s = stringConsequence.toString().trim().split(" ");

    j = 0;
    for (int i = 0; i < s.length; i++) {
      if (Integer.parseInt(s[i]) > 0 && Integer.parseInt(s[i]) % 2 != 0) {
        array1[j] = Integer.parseInt(s[i]);
        j++;
      }
    }
    showArray(array1);

    scanner.close();
  }

  private static void showArray(int[] array) {
    System.out.print("\nOutcome array               : ");
    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  private static boolean checkingInputConditions(int n) {
    if (n <= 0) {
      System.out.println("""
          Input must be a positive integer number!\n
          Try to input again, please!
          """);
      return true;
    }
    return false;
  }
}


