package ua.com.cbs.homework;

/**
 * Створіть масив розмірністю 10 елементів, виведіть на екран усі елементи масиву у зворотному порядку.
 */


public class Arrays {

  public static void main(String[] args) {
    String[] array = new String[] {"word1","word2","word3","word4","word5","word6","word7","word8","word9","word10"};
    for (int i = array.length-1; i >= 0; i--) {
      System.out.println(array[i] + " ");
    }
  }
}
