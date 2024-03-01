package ua.com.cbs.homework;

import java.util.Random;

/**
 * Опишіть метод powerA234(a),
 * який обчислює другий, третій та четвертий степінь числа A та виводить ці степені в консоль (усі параметри є дійсними).
 * За допомогою цієї процедури знайдіть другий, третій та четвертий степені п'яти зазначених чисел.
 */

public class PowerNumber234 {

  public static void main(String[] args) {
    int i;
    int counter = 0;
    Random random = new Random();

    do {
      i = random.nextInt(100 );
      powerA234(i);
      counter++;
    }
    while (counter < 5);
  }

  private static void powerA234(int i) {
    System.out.printf("Power 2 of the number %s = %.0f\n", i, Math.pow(i,2));
    System.out.printf("Power 3 of the number %s = %.0f\n", i, Math.pow(i,3));
    System.out.printf("Power 4 of the number %s = %.0f\n", i, Math.pow(i,4));
    System.out.println("-".repeat(15));
  }
}
