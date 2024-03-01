package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Створити метод myReverse(int [] array),
 * який приймає як аргумент масив цілочислових елементів і повертає інвертований масив (елементи масиву у зворотному порядку).
 *
 * Створити метод int [] subArray (int [] array, int index, int count).
 * Метод повертає частину отриманого як аргумент масиву, починаючи з позиції, яка зазначена в аргументі index,
 * розмірністю, що відповідає значенню аргументу count.
 * Якщо аргумент count містить значення більше, ніж кількість елементів,
 * що входять до частини вихідного масиву (від зазначеного індексу index до індексу останнього елемента),
 * то під час формування нового масиву розмірністю в count, заповніть одиницями ті елементи,
 * які не були скопійовані з вихідного масиву.
 */

public class ReversedArray {

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
    System.out.printf("Original array[%s]:", n);
    printArray(arrayFull);

    int[] arrayReverse = myReverse(arrayFull);
    System.out.printf("\nReversed array[%s]:", n);
    printArray(arrayReverse);

    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      int index = random.nextInt(n);
      int count = random.nextInt(n+10);
      int[] arraySub = subArray(arrayFull,index,count);
      System.out.printf("\nSub array[%s] which is got from the original array starting elem[%s]:", count, index);
      printArray(arraySub);
    }
  }

  private static int[] subArray (int [] arrayOrigin, int index, int count) {
    int j = 0;
    int[] array = new int[count];

    for (int i = index; i < index+count; i++) {
      if (i < arrayOrigin.length) array[j] = arrayOrigin[i];
      else array[j]=1;
      j++;
    }
  return array;
  }

  private static int[] myReverse(int[] arrayFull) {
    int[] array = new int[arrayFull.length];
    for (int i = 0; i < arrayFull.length/2 + 1; i++) {
      array[i] = arrayFull[arrayFull.length-1-i];
      array[array.length-1-i] = arrayFull[i];
    }
    return array;
  }

  private static void printArray(int[] arrayFull) {
    System.out.print("\n[ ");
    for (int elem:arrayFull) {
      System.out.print(elem + " ");
    }
    System.out.println("]");
  }

  private static int[] fillInArray(int N) {
    int[] array = new int[N];
    Random random = new Random();
    for (int i = 0; i < N; i++) {
      array[i] = random.nextInt(1000 - 1) + 1;
    }
    return array;
  }

  private static boolean conditionInputVerify(int n) {
    if (n < 0) {
      System.out.println("""
          Input must be a positive integer number!
          Try to input again!
          """);
      return true;
    }
    return false;
  }
}
