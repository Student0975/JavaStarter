package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Використовуючи IntelliJ IDEA, створіть клас Volume.
 * Напишіть програму розрахунку об'єму – V та площі поверхні -S циліндра.
 * Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2h.
 * Площа поверхні циліндра обчислюється за формулою: S = 2πR2 + 2πR2 = 2πR(R+h).
 * Результати розрахунків виведіть на екран.
 */

public class Volume_Task1 {

  public static void main(String[] args) {
    final double PI = Math.PI;

    Scanner sc = new Scanner(System.in);
    System.out.println("Input cylinder's radius, R : ");
    double r = sc.nextDouble();
    System.out.println("Input cylinder's height, h : ");
    double h = sc.nextDouble();
    double V = PI*r*2*h;
    double S = 2*PI*r*(r+h);
    sc.close();

    System.out.printf("Cylinder's volume is : %5.2f", V);
    System.out.printf("\nCylinder's area   is : %5.2f", S);
  }
}
