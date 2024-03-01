package ua.com.cbs.homework;

public class Rectangle {

  public static void main(String[] args) {
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";

    int a = 3;
    int b = 30;

    System.out.printf("\nRectangle like an Ukrainian flag!!! (%sx%s):%n", a*2, b);
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print(BLUE + "*");
      }
      System.out.print("\n");
    }
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print(YELLOW + "*");
      }
      System.out.print("\n");
    }
  }
}
