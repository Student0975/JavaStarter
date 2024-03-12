package ua.com.cbs.trelloPractice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Единицы длины пронумерованы следующим образом:
 * 1 — дециметр,
 * 2 — километр,
 * 3 — метр,
 * 4 — миллиметр,
 * 5 — сантиметр.
 * Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в этих единицах (вещественное число).
 * Найти длину отрезка в метрах.
 */

public class Task8 {

  public static void main(String[] args) {
    boolean exit = true;
    Scanner scanner = new Scanner(System.in);
    int unit = 0;
    double length;

    System.out.println("Please, input any number of the range from 1 to 5 :");
    while (exit) {
      do {
        try {
          unit = scanner.nextInt();
        } catch (InputMismatchException ex) {
          scanner.next();
        }
      } while (verifyInputCondition(unit));

      length = whatChosen(unit);
      transferToMeter(length, unit);

      exit = false;
      System.out.println("Bye!");
      scanner.close();
    }
  }

  private static void transferToMeter(double length, int unit) {
    System.out.print("The same line is : ");
    switch (unit) {
      case 1 -> System.out.print(length/10);
      case 2 -> System.out.print(length*1000);
      case 4 -> System.out.print(length/100);
      case 5 -> System.out.print(length/1000);
      default -> System.out.print(length);
    }
    System.out.println(" meter");
  }

  private static double whatChosen(int unit) {
    String unitName;
    switch (unit) {
      case 1 -> unitName  = "decimeter";
      case 2 -> unitName  = "kilometer";
      case 4 -> unitName  = "centimeter";
      case 5 -> unitName = "millimeter";
      default -> unitName  = "meter";
    }

    System.out.printf("You chose %s. Means %s.\n", unit, unitName);
    Random random = new Random();
    double length = random.nextDouble(50);
    System.out.printf("It is a random length line : %s %s\n", length, unitName);

    return length;
  }

  private static boolean verifyInputCondition(int number) {
    if (number <= 0 || number > 5) {
      System.out.print("""
          Be attentive!
          Input must be from 1 to 5 only!
          Please, input any number of the range from 1 to 5 again :
          """);
      return true;
    }

    return false;
  }

}
