package ua.com.cbs.conditions;

import java.util.Scanner;

/**
 * Дано два числа, не используя стандартную функцию, определить:
 * а) полусумму абсолютных величин этих чисел;
 * б) квадратный корень произведения модулей этих чисел.
 */

public class HalfSumSqrtTwoNumbers {



  public static void main(String[] args) {
    String operand1 = "", operand2 = "";
    boolean isInputCorrect = true;

    Scanner sc = new Scanner(System.in);

    System.out.println("Input 1st number:");
    operand1 = sc.nextLine();

    if (!operand1.trim().matches("[-|\\+]?\\d+.?\\d+?")) {
      System.out.println("Input must be a number!");
      isInputCorrect = false;
    }

    if (isInputCorrect) {
      System.out.println("Input 2nd number:");
      operand2 = sc.nextLine();
      if (!operand2.trim().matches("[-|\\+]?\\d+.?\\d+?")) {
        System.out.println("Input must be a number!");
        isInputCorrect = false;
      }
    }

    if (isInputCorrect) {
      System.out.printf("Half sum of abs of the numbers : %.2f\n",
          (Math.abs(Double.parseDouble(operand1)) + Math.abs(Double.parseDouble(operand2)))/2);

      System.out.printf("Sqrt : %.2f",
          Math.pow(Math.abs(Double.parseDouble(operand1)) * Math.abs(Double.parseDouble(operand2)), 0.5));
    }
    sc.close();
  }
}
