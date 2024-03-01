package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Знайдіть послідовність Фібоначчі для заданого діапазону:
 * користувач вводить стартове число та останнє з необхідного діапазону.
 */

public class FibonacciSequence {

  public static void main(String[] args) {
    int n0 = 0;
    int n1 = 1;
    int n2 = 0;
    StringBuilder sequence = new StringBuilder();

    Scanner sc = new Scanner(System.in);
    System.out.println("Input 1st number of the range, R1:");
    int R1 = sc.nextInt();
    System.out.println("Input 2nd number of the range, R2:");
    int R2 = sc.nextInt();

    for (int i = 0; i <= R2; i++) {
      if (i == 0) {
        if (n0 >= R1 && n0 <= R2) sequence.append(n0);
      } else if (i == 1) {
        if (n1 >= R1 && n1 <= R2) sequence.append(" ").append(n1);
      } else {
        n2 = n0 + n1;
        if (n2 >= R1 && n2 <= R2) sequence.append(" ").append(n2);
        n0 = n1;
        n1 = n2;
      }
    }
    System.out.println("Fibonacci Sequence : " + sequence.toString().trim());
  }
}