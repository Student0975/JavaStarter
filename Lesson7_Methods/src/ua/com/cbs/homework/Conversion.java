package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Напишіть програму, яка конвертуватиме валюти. Користувач вводить:
 * 1)  суму грошей у певній валюті;
 * 2)  курс конвертації в іншу валюту.
 * Організуйте виведення результату операції конвертування валюти на екран.
 */

public class Conversion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hrivna = 0;
    double rate = 0;
    do {
      System.out.println("Input amount of money needed to exchange, UAH :");
      hrivna = sc.nextInt();
    } while (conditionHrivnaVerify(hrivna));

    do {
      System.out.println("Input a rate exchange, UAH to USD :");
      rate = sc.nextDouble();
    } while (conditionRateVerify(rate));

    System.out.printf("Currency exchange UAH -> USD : \n" +
                      "%s UHR * %s ==> %s USD",hrivna, rate, exchange(hrivna, rate));

    sc.close();
  }

  private static boolean conditionHrivnaVerify(int n) {
    if(n<=0) {
      System.out.println("""
          Input must be > 0
          Try to input again!
          """);
      return true;
    }
    return false;
  }

  private static boolean conditionRateVerify(double n) {
    if(n<=0) {
      System.out.println("""
          Input must be > 0
          Try to input again!
          """);
      return true;
    }
    return false;
  }

  private static double exchange(int n, double r) {
    return n * r;
  }
}
