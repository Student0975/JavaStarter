package ua.com.cbs.homework;

import java.util.Random;

/**
 * Є N клієнтів, яким компанія-виробник має доставити товар.
 * Скільки є можливих маршрутів доставлення товару з урахуванням того, що товар доставлятиме одна машина?
 * Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть програму,
 * яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
 * Для розв'язку задачі, використовуйте факторіал N!, що розраховується рекурсією.
 * Поясніть, чому не рекомендується використовувати рекурсію для розрахунку факторіала.
 * Вкажіть слабкі місця цього підходу.
 */

public class DeliveryUsingRecursion {

  public static void main(String[] args) {
    Random random = new Random();

    //The largest factorial that can be computed in Java using int is 12! = 479001600. (12! = 479,001,600).
    int numberClients = random.nextInt(12 - 1 ) + 1;

    System.out.printf("There are %s possible delivery routs for %s clients.", factorial(numberClients), numberClients);
  }

  public static int factorial(int n) {
    if (n == 0)
      return 1;
    else
      return n * factorial(n - 1);
  }
  // Вкажіть слабкі місця цього підходу -> За надмірно великої глибини рекурсії може настати переповнення стека викликів
}
