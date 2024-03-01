package ua.com.cbs.homework;

/**
 * Створіть програму таблиці множення для числа 7, використовуючи цикли. Приклад виведення в консоль:
 * 7 * 1 = 7;
 * 7 * 2 = 14;
 * …;
 * 7 * 10 = 70.
 */

public class MultiplySevenNumber {

  public static void main(String[] args) {
    int number = 7;

    for (int i = 1; i <= 10; i++) {
      System.out.printf("%s * %s = %s\n",number,i,(number*i));
    }
  }
}
