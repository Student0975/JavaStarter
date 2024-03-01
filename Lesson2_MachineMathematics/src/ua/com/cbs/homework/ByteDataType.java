package ua.com.cbs.homework;

/**
 * Створіть проект. Створіть змінну типу byte, надайте їй значення 99999, виведіть значення цієї змінної в консоль.
 * За виникнення помилки, використовуючи коментарі, напишіть, у чому помилка та привласніть це значення до
 * відповідного типу даних.
 */

public class ByteDataType {

  public static void main(String[] args) {
    // byte number = 99999; // the number is out of range of the byte data type [-128 ... 127]
    int number = 99999; 
    System.out.println(number);
  }
}
