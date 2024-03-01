package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Відомо, що в парних числах молодший біт має значення 0.
 * Використовуючи IntelliJ IDEA, створіть клас Parity.
 * Напишіть програму, яка виконуватиме перевірку чисел на парність.
 * Запропонуйте два варіанти розв'язку поставленого завдання.
 */

public class Parity {

  public static void main(String[] args) {
    boolean isInputCorrect = true;
    int inputNumber = 0;

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Input an integer number :");
      inputNumber = scanner.nextInt();
    } catch (InputMismatchException ex) {
      isInputCorrect = false;
      System.out.println("Input must be integer number!");
    }

    if (isInputCorrect) {
      // 1 Використання маски
      // через побітове І з 0000 0001
      // якщо число парне, то результатом стане 0000 0000 (0 DEC)
      // якщо число непарне, то результатом стане 0000 0001 (1 DEC)
      if ((inputNumber & 1) == 0) System.out.println("Number is even");
      else System.out.println("Number is odd");

      // 2 Використання 2-х зсувів вліво та вправо
      // >> 1 - нульвий біт втрачається
      // << 1 - у нульовий біт записується 0
      // порівнюємо отримане число з початковим
      // якщо числа рівні, то початкове число було парним
      int numberShift = inputNumber >> 1;
      if ((numberShift << 1) == inputNumber) System.out.println("Number is even");
      else System.out.println("Number is odd");

      // 3 Використання 7 зсувів вліво
      // << 7 - нульовий біт пересувається у 7 позицію, інші біти заміняються нулями
      // якщо отримане число буде дорівнювати 0, то задане число парне
      if ((byte) (inputNumber << 7) == 0)
        System.out.println("Number is even");
      else
        System.out.println("Number is odd");
    }
    scanner.close();
  }
}