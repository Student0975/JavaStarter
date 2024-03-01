package ua.com.cbs.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Опишіть метод powerA3(a), який обчислює третю степінь числа та повертає це значення. 
 * За допомогою цієї процедури знайдіть третій степінь п'яти зазначених чисел.
 */

public class PowerNumThree {

  public static void main(String[] args) {
    int i;
    int counter = 0;
    Random random = new Random();

    do {
      i = random.nextInt(100 );
      System.out.printf("Power 3 of the number %s = %s\n", i, powerA3(i));
      counter++;
    }
    while (counter < 5);
  }

  private static int powerA3(int i) {
    return i * i * i;
  }
}
