package ua.com.cbs.trelloPractice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Дано целое число N и набор из N вещественных чисел.
 * Вывести сумму и произведение чисел из данного набора.
 */

public class Task17 {

  public static void main(String[] args) {
    int n = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Input a positive integer number, N :");
      try {
        n = scanner.nextInt();

      } catch (InputMismatchException ex) {
        scanner.next();
      }
    } while (verifyInputConditions(n));

    int[] fullArray = generateIntegerNumbers(n);

    showArray(fullArray);
    System.out.println();
    System.out.println("Sum all array's elements is : " + sumAllElemArray(fullArray));
    System.out.println("Multiply all array's elements is : " + multiAllElemArray(fullArray));
    scanner.close();
  }

  private static double multiAllElemArray(int[] fullArray) {
    double multi = 1;
    for (int elem : fullArray) {
      multi *= elem;
    }
    return multi;
  }

  private static double sumAllElemArray(int[] fullArray) {
    int sum = 0;
    for (int elem : fullArray) {
      sum += elem;
    }
    return sum;
  }

  private static void showArray(int[] fullArray) {
    System.out.println("Provided array is :");
    for (int elem : fullArray) {
      System.out.print(elem + " ");
    }
  }

  private static int[] generateIntegerNumbers(int n) {
    int[] array = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      array[i] = random.nextInt(100) + 1;
    }
    return array;
  }

  private static boolean verifyInputConditions(int n) {
    if (n <= 0) {
      System.out.println("""
          Input must be >0 and integer!
          Try to input again, please!
          """);
      return true;
    }
    return false;
  }
}
