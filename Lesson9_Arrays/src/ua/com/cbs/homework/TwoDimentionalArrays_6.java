package ua.com.cbs.homework;

import java.util.Random;

/**
 * Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
 * У третій масив внесіть результат додавання перших двох.
 */

public class TwoDimentionalArrays_6 {

    public static void main(String[] args) {
      int[][] array1 = new int[3][3];
      int[][] array2 = new int[3][3];
      int[][] array3 = new int[3][3];
      System.out.println("1st array :");
      fillArray(array1);
      System.out.println("2nd array ");
      fillArray(array2);
      System.out.println("3rd array (array1 + array3) :");
      array3 = addArrays(array1, array2);
      showArray(array3);
    }

    static void fillArray(int[][] array) {
      Random random = new Random();
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
          array[i][j] = random.nextInt(10);
          System.out.print(array[i][j] + " ");
        }
        System.out.println();
      }
    }

    static int[][] addArrays(int[][] array1, int[][] array2) {
      int[][] result = new int[array1.length][array1.length];
      for (int n = 0; n < result.length; n++) {
        for (int m = 0; m < result[n].length; m++) {
          result[n][m] = array1[n][m] + array2[n][m];
        }
      }
      return result;
    }

    static void showArray(int[][] array1) {
      for (int n = 0; n < array1.length; n++) {
        for (int m = 0; m < array1[n].length; m++) {
          System.out.print(array1[n][m] + " ");
        }
        System.out.println();
      }
    }
}
