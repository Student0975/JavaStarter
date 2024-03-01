package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Створіть чотири методи для виконання арифметичних операцій з іменами:
 * add – додавання, sub – віднімання, mul – множення, div – ділення.
 * Кожен метод має приймати два цілих аргументи та виводити на екран результат виконання арифметичної операції
 * відповідної імені методу.
 * Метод поділу div має виконувати перевірку спроби поділу на нуль.
 * Потрібно надати користувачеві можливість вводити з клавіатури значення операндів і знак арифметичної операції
 * для виконання обчислень.
 */

public class Arithmetics {

  public static void main(String[] args) {
    int a = 0, b = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int choiceNumber = choiceFromMenu(scanner);

     if (choiceNumber == 0) {
        System.out.println("Good Bye!");
        break;
      } else if (choiceNumber != -1) {
        try {
          System.out.println("Input 1st integer number :");
          a = scanner.nextInt();
          System.out.println("Input 2nd integer number :");
          b = scanner.nextInt();
        } catch (InputMismatchException ex) {
          System.out.println("Input must be integer number!");
          scanner.next();
          choiceNumber = -1;
        }
      }

      switch (choiceNumber) {
        case 1 -> add(a,b);
        case 2 -> sub(a,b);
        case 3 -> mul(a,b);
        case 4 -> div(a,b);
      }
    }
    scanner.close();
  }

  private static void div(int a, int b) {
    if (b==0) System.out.println("Error!\nDivision by O is impossible!");
    else System.out.printf("%s / %s = %.2f\n", a, b, (double) a/b);
  }

  private static void mul(int a, int b) { System.out.printf("%s * %s = %s\n", a, b, a*b); }

  private static void sub(int a, int b) {
    System.out.printf("%s - %s = %s\n", a, b, a-b);
  }

  private static void add(int a, int b) { System.out.printf("%s + %s = %s\n", a, b, a+b); }

  private static int choiceFromMenu(Scanner sc) {
    int choice;
    System.out.println("\nMake your choice :");

    try {
      choice = sc.nextInt();
      if (choice < 0 || choice > 4) {
        System.out.println("Be attentive! Choice must be only among 1 / 2 / 3 / 4 / 0");
        choice = -1;
      }
    } catch (InputMismatchException ex) {
      System.out.println("Be attentive! Choice must be only among 1 / 2 / 3 / 4 / 0");
      choice = -1;
    }
    return choice;
  }

  public static void printMenu() {
    System.out.println("\nSimple Calculator:");
    System.out.println("--------------------");
    System.out.println("1 - Addition");
    System.out.println("2 - Subtraction");
    System.out.println("3 - Multiplication");
    System.out.println("4 - Division");
    System.out.println("--------------------");
    System.out.println("0 - Exit(stop)");
  }
}
