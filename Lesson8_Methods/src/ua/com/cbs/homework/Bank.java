package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, погасив клієнт кредит чи ні.
 * Припустимо, щомісячна сума платежу має становити 100 грн.
 * Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
 * Тобто може двома платежами по 300 і 400 грн закрити весь борг.
 * <p>
 * Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку.
 * Метод виводить на екран інформацію про стан кредиту
 * (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
 */

public class Bank {
  static int loan = 0;
  static int loanDuration = 0;
  static int month = 0;
  static int monthlyPayment = 0;
  static int debt = 0;

  static int payment = 0;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    boolean exit = true;

    while (exit) {
      printMainMenu();
      int choiceNumber = choiceFromMenu(sc);

      switch (choiceNumber) {
        case 0 -> {
          System.out.println("Good Bye!");
          exit = false;
        }
        case 1 -> {
          inputLoanDetails(sc);
        }
        case 2 -> {
          if (isLoanExisted("payment")) payment(sc);
          else System.out.println("No loan exist!");
        }
        case 3 -> {
          if (isLoanExisted("info")) loanInfo();
          else System.out.println("No loan exist!");
        }
        default -> System.out.println("Be attentive!\nChoice must be only among 1 / 2 / 3 / 0");
      }
    }
  }

  private static boolean isLoanExisted(String item) {
    if (item.equals("payment") && debt > 0) return true;
    else return item.equals("info") && debt != 0;
  }

  private static void payment(Scanner sc) {
    do {
      System.out.println("Input payment value :");
      try {
        payment = sc.nextInt();

        if (payment < monthlyPayment)
          System.out.println("Payment less than min amount : " + monthlyPayment + ".\nTry again!");
        else
          debt(payment);
        currentUpdate();
      } catch (InputMismatchException ex) {
        sc.next();
      }
    } while (conditionInputVerify(payment));
  }

  private static void currentUpdate() {
    if (debt < 0) System.out.println("There is an overpayment on the loan : " + debt);
    else if (debt == 0) confirmLoanClosed();
    else System.out.println("Current debt is : " + debt);
  }

  private static void confirmLoanClosed() {
    if (month == loanDuration-1) System.out.println("The loan is fully repaid in " + (loanDuration - month) + " payment");
    else System.out.println("The loan is fully repaid in " + (loanDuration - month) + " payments");
  }

  private static void debt(int payment) {
    debt -= payment;
    if (debt < 0) month = 0;
    else month--;
  }

  private static void loanInfo() {
    System.out.println();
    currentUpdate();
    System.out.println("\nLoan info");
    System.out.println("-".repeat(15));
    System.out.println("Debt of the payment       : " + debt + " UAH");
    System.out.println("Min monthly payment       : " + monthlyPayment + " UAH");
    System.out.println("Monthly payments leftover : " + month);
    System.out.println("-".repeat(15));
  }

  private static void inputLoanDetails(Scanner sc) {
    loan = 0;
    month = 0;
    monthlyPayment = 0;
    debt = 0;
    do {
      System.out.println("Input loan value :");
      try {
        loan = sc.nextInt();
      } catch (InputMismatchException ex) {
        sc.next();
      }
    } while (conditionInputVerify(loan));

    do {
      System.out.println("Input loan duration (number of months) :");
      try {
        loanDuration = sc.nextInt();
      } catch (InputMismatchException ex) {
        sc.next();
      }
    } while (conditionInputVerify(loanDuration));
    monthlyPayment = loan / loanDuration;
    month = loanDuration;
    debt = loan;
  }

  private static void printMainMenu() {
    System.out.println("\nMenu :");
    System.out.println("-----");
    System.out.println("1. Input loan details");
    System.out.println("2. Make a payment");
    System.out.println("3. Loan info");

    System.out.println("0. Exit");
    System.out.println("-----");
    System.out.println("Make your choice : ");
  }

  private static int choiceFromMenu(Scanner scanner) {
    int choice = -1;

    try {
      choice = scanner.nextInt();
    } catch (InputMismatchException ex) {
      scanner.next();
    }
    return choice;
  }

  private static boolean conditionInputVerify(int n) {
    if (n <= 0) {
      System.out.println("""
          Input must be > 0 an integer!
          Try to input again!
          """);
      return true;
    }
    return false;
  }
}
