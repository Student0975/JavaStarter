package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Напишіть програму розрахунку нарахування премій працівникам.
 * Премії розраховуються згідно з вислугою років.
 * Якщо вислуга до 5 років, премія становить 10% від заробітної плати.
 * Якщо вислуга від 5 років (включно) до 10 років, то премія становить 15% від заробітної плати.
 * Якщо вислуга від 10 років (включно) до 15 років, премія становить 25% від заробітної плати.
 * Якщо вислуга від 15 років (включно) до 20 років, премія становить 35% від заробітної плати.
 * Якщо вислуга від 20 років (включно) до 25 років, премія становить 45% від заробітної плати.
 * Якщо вислуга від 25 років (включно) та більше, премія складає 50% від заробітної плати.
 * Результати розрахунку виведіть на екран.
 */

public class Premium {

  public static void main(String[] args) {
    double salary = 0.0d;
    int countYears = 0;
    boolean isInputCorrect = true;

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Input an employee's salary :");
      salary = scanner.nextDouble();
      if (salary <= 0) {
        System.out.println("Salary can not be negative or zero!");
        isInputCorrect = false;
      }
    } catch (InputMismatchException ex) {
      isInputCorrect = false;
      System.out.println("Input must be double number!");
    }

    if (isInputCorrect) {
      try {
        System.out.println("Input how many years an employer works :");
        countYears = scanner.nextInt();
        if (countYears < 0) {
          System.out.println("Years can not be negative!");
          isInputCorrect = false;
        }
      } catch (InputMismatchException ex) {
        isInputCorrect = false;
        System.out.println("Input must be integer number!");
      }
    }

    if (isInputCorrect) {
      if (countYears >= 25) System.out.printf("Premium is 50%% : %s", salary * 0.5);
      else if (countYears >= 20) System.out.printf("Premium is 45%% : %.2f", salary * 0.45);
      else if (countYears >= 15) System.out.printf("Premium is 35%% : %.2f", salary * 0.35);
      else if (countYears >= 10) System.out.printf("Premium is 25%% : %.2f", salary * 0.25);
      else if (countYears >= 5) System.out.printf("Premium is 15%% : %.2f", salary * 0.25);
      else System.out.printf("Premium is 10%% : %.2f", salary * 0.1);
    }
    scanner.close();
  }
}