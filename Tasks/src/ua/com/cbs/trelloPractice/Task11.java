package ua.com.cbs.trelloPractice;

import java.util.Random;
import java.util.Scanner;

/**
 * Даны положительные числа A и B (A > B).
 * На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
 * Не используя операции умножения и деления, найти длину незанятой части отрезка A.
 */

public class Task11 {

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
        System.out.printf("Free space of the line segment (B - (A*n)) : %s\n", freeSpace(fullArray));
      }
    }
    scanner.close();
  }

  private static int freeSpace(int[] fullArray) {
    int A = fullArray[0];
    int remainder = fullArray[1];
    while((remainder-A)>0) {
      remainder -= A;
    }
    return remainder;
  }

  private static int[] generateTwoIntegers() {
    int[] array = new int[2];
    Random random = new Random();
    array[0] = random.nextInt(20);
    array[1] = random.nextInt(100 - 21) + 21;
    System.out.println("A number is " + array[0]);
    System.out.println("B number is " + array[1]);
    return array;
  }

  private static String choiceFromMenu(Scanner scanner) {
    String choice;
    System.out.println("Make your choice :");

    switch (scanner.next().trim().toUpperCase()) {
      case "N" -> choice = "No";
      case "Y" -> choice = "Yes";
      default -> {
        System.out.print("Be attentive! Choice must be only 'Y' or 'N'!\n");
        choice = "";
      }
    }
    return choice;
  }
}