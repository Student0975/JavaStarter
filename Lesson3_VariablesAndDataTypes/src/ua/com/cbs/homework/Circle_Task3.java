package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Використовуючи IntelliJ IDEA, створіть клас Circle.
 * Створіть константу під назвою PI (число π «пі»), створіть змінну радіус із назвою – r.
 * Використовуючи формулу πR2, обчисліть площу кола та виведіть результат на екран.
 */

public class Circle_Task3 {

  public static void main(String[] args) {
    final double PI = Math.PI;

    Scanner sc = new Scanner(System.in);
    System.out.println("Input circle's radius : ");
    double r = sc.nextDouble();
    sc.close();

    System.out.printf("Circle's area is : %5.2f", PI*Math.pow(r,2));
  }
}
