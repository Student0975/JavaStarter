package ua.com.cbs.homework;

/**
 * Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
 * У третій масив внесіть результат додавання перших двох.
 */

public class TwoDimentionalArrays_5 {

  public static void main(String[] args) {
    int sizeI = 3;
    int sizeJ = 3;
    int[][] array1 = new int[sizeI][sizeJ];

    for (int i = 0; i < sizeI; i++) {
      for (int j = 0; j < sizeJ; j++) {
        array1[i][j] = i * j + 1;
      }
    }

    int[][] array2 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int[][] array3 = new int[sizeI][sizeJ];

    for (int i = 0; i < sizeI; i++) {
      for (int j = 0; j < sizeJ; j++) {
        array3[i][j] = array1[i][j] + array2[i][j];
      }
    }

    System.out.println("Array1 : ");
    printArray(array1);
    System.out.println("Array2 : ");
    printArray(array2);
    System.out.println("Array3 (Array1 + Array2) : ");
    printArray(array3);
  }

  private static void printArray(int[][] array) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" " + array[i][j]);
      }
      System.out.print("\n");
    }
  }
}
