package ua.com.cbs.methods;

import java.util.Scanner;

/**
 * Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
 */

public class Average {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number a :");
    int a = sc.nextInt();
    System.out.println("Input number b :");
    int b = sc.nextInt();

    System.out.printf("Average numbers %s and %s = %s",a,b,average(a,b));
    sc.close();
  }

  private static double average(int a, int b) {
    return (float) (a + b)/2;
  }
}
