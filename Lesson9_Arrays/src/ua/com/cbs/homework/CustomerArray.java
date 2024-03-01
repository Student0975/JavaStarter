package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Створити масив розміру N-елементів, заповнити його довільними цілими значеннями (розмір масиву задає користувач).
 * Вивести на екран: найбільше значення масиву,
 * найменше значення масиву,
 * загальну суму всіх елементів,
 * середнє арифметичне всіх елементів,
 * вивести всі непарні значення.
 */

public class CustomerArray {

  public static void main(String[] args) {
    int n = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Input array's dimension, N :");
      try {
        n = scanner.nextInt();
      } catch (InputMismatchException ex) {
        scanner.next();
      }
    } while (conditionInputVerify(n));

    int[] arrayFull = fillInArray(n);

    System.out.printf("Array[%s] is :\n", n);
    printArray(arrayFull);

    System.out.println("\n");
    System.out.printf("Max element of the array          : %s\n", maxElemArray(arrayFull));
    System.out.printf("Min element of the array          : %s\n", minElemArray(arrayFull));
    System.out.printf("Sum all elements of the array     : %s\n", sumElemArray(arrayFull));
    System.out.printf("Average all elements of the array : %.2f\n", averageElemArray(arrayFull));
    System.out.print ("All odd elements of the array     : ");
    oddElemArray(arrayFull);
  }

  private static int maxElemArray(int[] arrayFull) {
    int max = arrayFull[0];
    for (int i = 1; i < arrayFull.length; i++) {
      if (arrayFull[i] >= max) max = arrayFull[i];
    }
    return max;
  }

  private static int minElemArray(int[] arrayFull) {
    int min = arrayFull[0];
    for (int i = 1; i < arrayFull.length; i++) {
      if (arrayFull[i] <= min) min = arrayFull[i];
    }
    return min;
  }

  private static int sumElemArray(int[] arrayFull) {
    int sum = 0;
    for (int elem : arrayFull) {
      sum += elem;
    }
    return sum;
  }

  private static double averageElemArray(int[] arrayFull) {
    return sumElemArray(arrayFull)/arrayFull.length;
  }

  private static void oddElemArray(int[] arrayFull) {
    System.out.print("\n[ ");
    for (int i = 1; i < arrayFull.length; i += 2) {
      System.out.print(arrayFull[i] + " ");
    }
    System.out.print("]");
  }

  private static void printArray(int[] arrayFull) {
//    for (int element:arrayFull) {
//      System.out.print(element + " ");
//    }
    System.out.print("[ ");
    for (int i = 0; i < arrayFull.length; i++) {
      System.out.print(arrayFull[i] + " ");
      if (i > 0 && i % 30 == 0) {
        System.out.print("\n");
      }
    }
    System.out.print("]");
  }

  private static int[] fillInArray(int N) {
    int[] array = new int[N];
    Random random = new Random();
    for (int i = 0; i < N; i++) {
      array[i] = random.nextInt(1000 - 1) + 1;
    }
    return array;
  }

  private static boolean conditionInputVerify(int length) {
    if (length <= 0) {
      System.out.println("""
          Input must be a positive integer number!
          Try to input again!
          """);
      return true;
    }
    return false;
  }
}
