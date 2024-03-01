package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Створити метод, який виконуватиме збільшення довжини масиву, переданого як аргумент, на 1 елемент.
 * Елементи масиву мають зберегти своє значення та порядок індексів.
 *
 * Створити метод, який приймає два аргументи, перший аргумент типу int [] array, другий аргумент типу int value.
 * У тілі методу реалізуйте можливість додавання другого аргументу методу в масив за індексом 0,
 * водночас довжина нового масиву має збільшитися на 1 елемент,
 * а елементи одержуваного масиву як перший аргумент мають скопіюватися в новий масив починаючи з індексу 1.
 */

public class UserArray {

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
    System.out.printf("Original array[%s] :\n", n);
    printArray(arrayFull);

    int[] extendedArray1 = increaseArrayLengthByOneVar1(arrayFull);
    System.out.printf("\nExtended array[%s] via FOR loop :\n", extendedArray1.length);
    printArray(extendedArray1);

    int[] extendedArray2 = increaseArrayLengthByOneVar2(arrayFull);
    System.out.printf("\nExtended array[%s] via System.arraycopy() :\n", extendedArray2.length);
    printArray(extendedArray2);

    int[] modifyArrayVar1 = modifyArrayVar1(arrayFull, n);
    System.out.printf("\nModified array[%s] via FOR loop :\n", modifyArrayVar1.length);
    printArray(modifyArrayVar1);

    int[] modifyArrayVar2 = modifyArrayVar2(arrayFull, n);
    System.out.printf("\nModified array[%s] via System.arraycopy() :\n", modifyArrayVar2.length);
    printArray(modifyArrayVar2);
  }

  private static int[] modifyArrayVar1(int[] arrayFull, int n) {
    int[] modifiedArray = new int[arrayFull.length+1];
    modifiedArray[0] = arrayFull[0] + n;
    for (int i = 0; i < arrayFull.length; i++) {
      modifiedArray[i+1] = arrayFull[i];
    }
    return modifiedArray;
  }

  private static int[] modifyArrayVar2(int[] arrayFull, int n) {
    int[] modifiedArray = new int[arrayFull.length+1];
    modifiedArray[0] = arrayFull[0] + n;
    System.arraycopy(arrayFull, 0, modifiedArray, 1, arrayFull.length);
    return modifiedArray;
  }

  private static int[] increaseArrayLengthByOneVar1(int[] arrayFull) {
    int[] extendedArray = new int[arrayFull.length+1];
    System.arraycopy(arrayFull, 0, extendedArray, 0, arrayFull.length);
    return extendedArray;
  }

  private static int[] increaseArrayLengthByOneVar2(int[] arrayFull) {
    int[] extendedArray = new int[arrayFull.length+1];
    for (int i = 0; i < arrayFull.length; i++) {
      extendedArray[i] = arrayFull[i];
    }
    return extendedArray;
  }

  private static void printArray(int[] arrayFull) {
    System.out.print("[ ");
    for (int elem:arrayFull) {
      System.out.print(elem + " ");
    }
    System.out.println("]");
  }

  private static int[] fillInArray(int N) {
    int[] array = new int[N];
    Random random = new Random();
    for (int i = 0; i < N; i++) {
      array[i] = random.nextInt(100);
    }
    return array;
  }

  private static boolean conditionInputVerify(int n) {
    if (n < 0) {
      System.out.println("""
          Input must be a positive integer number!\n
          Try to input it again!
          """);
    }
    return false;
  }
}
