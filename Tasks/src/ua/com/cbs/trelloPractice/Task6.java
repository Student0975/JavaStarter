package ua.com.cbs.trelloPractice;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны два целых числа: A, B.
 * Проверить истинность высказывания:
 * «Ровно одно из чисел A и B нечетное».
 */

public class Task6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nWould you like generate 2 integer numbers (Y - yes, N - no)?");
      String choiceOption = choiceFromMenu(scanner);

      if (choiceOption.equals("No")) {
        System.out.println("Good Bye!");
        break;
      } else if (!choiceOption.isEmpty()) {
        int[] fullArray = generateTwoIntegers();
        System.out.printf("Is exactly only one of the two numbers odd : %s",isExactlyOneOfTwoNumberOdd(fullArray));
        if (isExactlyOneOfTwoNumberOdd(fullArray)) {
          String odd = (fullArray[0] % 2 != 0)
              ? "(" + fullArray[0] + ")"
              : "(" + fullArray[1] + ")";
          System.out.println(odd);
        } else {
          System.out.println();
        }
      }
    }
    scanner.close();
  }

  private static boolean isExactlyOneOfTwoNumberOdd(int[] array) {
    return (array[0] % 2 != 0) ^ (array[1] % 2 != 0);
  }

  private static int[] generateTwoIntegers() {
    int[] array = new int[2];
    Random random = new Random();
    array[0] = random.nextInt(100);
    array[1] = random.nextInt(100);
    System.out.println("1st number is " + array[0]);
    System.out.println("2nd number is " + array[1]);
    return array;
  }

  private static String choiceFromMenu(Scanner scanner) {
    String choice;
    System.out.println("Make your choice :");

    switch (scanner.next().trim().toUpperCase()) {
      case "N" -> choice = "No";
      case "Y" -> choice = "Yes";
      default -> {
        System.out.println("Be attentive! Choice must be only 'Y' or 'N'!");
        choice = "";
      }
    }
    return choice;
  }

}
