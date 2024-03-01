package ua.com.cbs.homework;

import java.util.Random;

/**
 * Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
 * створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.
 */


public class MidMaxMinOverloadedMethods {

  public static void main(String[] args) {
    Random random = new Random();
    int number1 = random.nextInt(100);
    int number2 = random.nextInt(100);
    int number3 = random.nextInt(100);
    int number4 = random.nextInt(100);
    int number5 = random.nextInt(100);

    average(number1,number2,number3);
    maxNumber(number1,number2,number3,number4);
    minNumber(number1,number2,number3,number4,number5);
  }

  private static void minNumber(int number1, int number2, int number3, int number4, int number5) {
    int minFirst  = (number1 <= number2) ? number1 : number2;
    int minSecond = (number3 <= number4) ? number3 : number4;
    int min = (minFirst <= minSecond) ? minFirst : minSecond;
    System.out.printf("Min number among %s, %s, %s, %s, %s is %s\n", number1, number2, number3, number4, number5,
        Math.min(min, number5));
  }

  private static void maxNumber(int number1, int number2, int number3, int number4) {
    int maxFirst  = (number1 <= number2) ? number2 : number1;
    int maxSecond = (number3 <= number4) ? number4 : number3;
    int max = (maxFirst <= maxSecond) ? maxSecond : maxFirst;
    System.out.printf("Max number among %s, %s, %s, %s is %s\n", number1, number2, number3, number4, max);
  }

  private static void average(int number1, int number2, int number3) {
    System.out.printf("Average of %s, %s, %s numbers is %.2f\n", number1, number2, number3,
                                            (double) (number1 + number2 + number3) / 3);
  }
}
