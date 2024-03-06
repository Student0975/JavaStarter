package ua.com.cbs.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
 * 1.4, . . . , 2 кг конфет.
 */

public class Task7_20 {

  public static void main(String[] args) {
    double price = 0;
    Scanner scanner = new Scanner(System.in);

    price = getPrice(price, scanner);

    for (double i = 1.2; i <= 2.0; i += 0.2) {
      howMuchCost(i, price);
    }
    scanner.close();
  }

  private static double getPrice(double price, Scanner scanner) {
    do {
      try {
        System.out.println("Input a price of candies :");
        price = scanner.nextDouble();
      } catch (InputMismatchException ex) {
        scanner.next();
      }
    } while (verifyInputConditions(price));
    return price;
  }

  private static void howMuchCost(double weight, double price) {
    System.out.printf("\n%.1fkg candies cost = %.2f", weight, (price * weight));
  }

  private static boolean verifyInputConditions(double price) {
    if (price <= 0) {
      System.out.println("""
          The price must be >0!
          Try to input again, please!
          """);
      return true;
    }
    return false;
  }
}
