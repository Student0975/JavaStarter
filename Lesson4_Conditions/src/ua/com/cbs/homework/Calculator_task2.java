package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Використовуючи IntelliJ IDEA, створіть клас Calculator.
 * Напишіть програму «Консольний калькулятор».
 * <p>
 * Створіть дві змінні з іменами operand1 та operand2. Вкажіть змінним деякі довільні значення.
 * Запропонуйте користувачу ввести арифметичний знак.
 * Прийміть значення, введене користувачем та помістіть його у рядкову змінну sign.
 * <p>
 * Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch.
 * Виведіть на екран результат виконання арифметичної операції.
 * У разі використання операції ділення, організуйте перевірку спроби ділення на нуль.
 * І якщо така є, то скасуйте виконання арифметичної операції та повідомте про помилку користувача.
 */

public class Calculator_task2 {

  public static void main(String[] args) {
    int operand1 = 0, operand2 = 0;
    boolean isInputCorrect = true;
    String input = "";

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, input 1st integer number : ");
    input = scanner.nextLine().trim();
    if (input.matches("-?\\d+")) {
      operand1 = Integer.parseInt(input);
    } else {
      isInputCorrect = false;
      System.out.println("Input must be an integer number!");
    }

    if (isInputCorrect) {
      System.out.println("Please, input 2nd integer number : ");
      input = scanner.nextLine().trim();
      if (input.matches("-?\\d+")) {
        operand2 = Integer.parseInt(input);
      } else {
        isInputCorrect = false;
        System.out.println("Input must be an integer number!");
      }
    }

    if (isInputCorrect) {
      System.out.println("Please, choose an arithmetic operator ( +, -, *, /) : ");
      String sign = scanner.nextLine();

      switch (sign.trim()) {
        case "+":
          System.out.printf("Result is : %s %s %s = %s", operand1, sign, operand2, (operand1 + operand2));
          break;
        case "-":
          System.out.printf("Result is : %s %s %s = %s", operand1, sign, operand2, (operand1 - operand2));
          break;
        case "*":
          System.out.printf("Result is : %s %s %s = %s", operand1, sign, operand2, (operand1 * operand2));
          break;
        case "/":
          if (operand2 == 0) {
            System.out.println("Error - Division by 0 is forbidden!");
          } else {
            System.out.printf("Result is : %s %s %s = %s", operand1, sign, operand2, (operand1 / operand2));
          }
          break;
        default:
          System.out.println("You chose no existed operator '" + sign + "'!\n" +
              "Please, be attentive and choose only offered one!");
          break;
      }
    }
    scanner.close();
  }
}
