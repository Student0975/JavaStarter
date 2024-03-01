package ua.com.cbs.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Використовуючи теорему де Моргана, перетворіть вихідний вираз A | B на еквівалентний вираз.
 */

public class DeMorganComparison {

  public static void main(String[] args) {
    boolean isInputCorrect = true;
    boolean a = false, b = false;

    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Input TRUE or FALSE, (a)");
      a = scanner.nextBoolean();
    } catch (InputMismatchException ex) {
      isInputCorrect = false;
      System.out.println("Be attentive only TRUE or FALSE!");
    }

    if (isInputCorrect) {
      try {
        System.out.println("Input TRUE or FALSE, (b)");
        b = scanner.nextBoolean();
      } catch (InputMismatchException ex) {
        isInputCorrect = false;
        System.out.println("Be attentive only TRUE or FALSE!");
      }
    }

    if (isInputCorrect) {
      if (a | b)
        System.out.println("A | B = " + (a | b));
      else
        System.out.println("A | B = " + (a | b));

      // Умови після застосування теореми Де Моргана.
      if (!(!a & !b))
        System.out.println("!(!A & !B) = " + !(!a & !b));
      else
        System.out.println("!(!A & !B) = " + !(!a & !b));
    }

    scanner.close();
  }
}
