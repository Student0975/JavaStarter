package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Дано два числа A та B (A<B).
 * Виведіть суму всіх чисел, які розташовані між цими числами на екран.
 * Дано два числа A та B (A<B).
 * Виведіть усі непарні значення, які розташовані між цими числами.
 */

public class SumMin {

  public static void main(String[] args) {
    int a = 0, b = 0;
    boolean isInputCorrect = true;

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Input an integer number(A) or type Exit to finish :");
      String input = sc.nextLine().trim();

      if (input.toUpperCase().equals("EXIT")) {
        isInputCorrect = false;
        System.out.println("Bye-bye");
        break;
      }

      if (!input.matches("-?\\d+")) {
        System.out.println("Input must be an integer number!");
        continue;
      }
      a = Integer.parseInt(input);
      break;
    }

    if (isInputCorrect) {
      while (true) {
        System.out.println("Input an integer number(B) or type Exit to finish :");
        String input = sc.nextLine().trim();

        if (input.toUpperCase().equals("EXIT")) {
          isInputCorrect = false;
          System.out.println("Bye-bye");
          break;
        }

        if (!input.matches("-?\\d+")) {
          System.out.println("Input must be an integer number!");
          continue;
        }
        b = Integer.parseInt(input);

        if (b <= a) {
          System.out.println("Number 'B' must be greater than A!");
          continue;
        }
        break;
      }

      if (isInputCorrect) {
        int sum = 0;
        String oddNumbers = "";
        for (int i = a; i < b; i++) {
          sum += i;
          if ((i & 1) == 1) {
            oddNumbers += " " + i;
          }
        }
        System.out.printf("Sum all numbers between %s and %s is : %s%n", a, b, sum);
        System.out.printf("List of the odd numbers between %s and %s is : %s%n", a, b, oddNumbers.trim());
      }
    }
    sc.close();
  }
}
