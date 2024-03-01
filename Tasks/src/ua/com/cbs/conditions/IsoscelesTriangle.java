package ua.com.cbs.conditions;

/**
 * Определить, является ли треугольник со сторонами а, в, с равнобедренным.
 */

import java.util.Scanner;

public class IsoscelesTriangle {

  public static void main(String[] args) {
    String side1="", side2="", side3="";
    boolean isInputCorrect = true;

    Scanner sc = new Scanner(System.in);
    System.out.println("Input value 1st side of triangle :");
    side1 = sc.nextLine();

    if (!side1.trim().matches("\\d+.?\\d+?")) {
      System.out.println("Value must be only positive number!");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      System.out.println("Input value 2nd side of triangle :");
      side2 = sc.nextLine();

      if (!side2.trim().matches("\\d+.?\\d+?")) {
        System.out.println("Value must be only positive number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      System.out.println("Input value 3rd side of triangle :");
      side3 = sc.nextLine();

      if (!side3.trim().matches("\\d+.?\\d+?")) {
        System.out.println("Value must be only positive number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      if (Double.parseDouble(side1) == Double.parseDouble(side2) ||
          Double.parseDouble(side1) == Double.parseDouble(side3) ||
          Double.parseDouble(side2) == Double.parseDouble(side3))
      {
        System.out.println("The triangle is Isosceles!");
      } else {
        System.out.println("The triangle is not Isosceles!");
      }
    }
    sc.close();
  }
}
