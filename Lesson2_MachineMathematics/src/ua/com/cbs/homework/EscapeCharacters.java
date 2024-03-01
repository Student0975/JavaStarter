package ua.com.cbs.homework;

/**
 * Використовуючи IntelliJ IDEA, створіть проект. Створіть три рядкові змінні та задайте їм значення:
 * "\nмій рядок 1"
 * "\tмій рядок 2"
 * "\aмій рядок 3"
 * Виведіть значення кожної змінної на екран. Які відмінності ви побачили? Зробіть висновки.
 */

public class EscapeCharacters {

  public static void main(String[] args) {
    String str1 = "\tмій рядок 1"; // Insert a tab in the text at this point
    String str2 = "\nмій рядок 2"; // Insert a newline in the text at this point
    //String str3 = "\aмій рядок 3"; // Illegal escape character

    System.out.print(str1);
    System.out.print(str2);
    //System.out.print(str3);
  }
}
