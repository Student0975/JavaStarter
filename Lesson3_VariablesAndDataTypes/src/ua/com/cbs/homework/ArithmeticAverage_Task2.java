package ua.com.cbs.homework;

/**
 * Використовуючи IntelliJ IDEA, створіть клас Arithmetic Average.
 * Обчисліть середнє арифметичне трьох цілих значень та виведіть його на екран.
 * З якою проблемою ви зіткнулися?
 * Який тип змінних краще використовуватиме для коректного показу результату?
 */

public class ArithmeticAverage_Task2 {

  public static void main(String[] args) {
    int x = 10;
    int y = 12;
    int z = 3;

    System.out.println((x+y+z)/3);
    System.out.println((double) (x+y+z)/3);
    //може бути ситуація коли середнє аріфметичне не є цілим числом, тоді дробна частина "губиться",
    // тому краще для результату використовувати тип данних double
  }
}
