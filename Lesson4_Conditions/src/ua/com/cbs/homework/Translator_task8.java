package ua.com.cbs.homework;

import java.util.Scanner;

/**
 * Напишіть програму «Україно-англійський перекладач».
 * Програма знає 10 слів про погоду.
 * Потрібно, щоб користувач вводив слово українською, а програма давала йому переклад цього слова англійською.
 * Якщо користувач ввів слово, для якого немає перекладу, слід вивести повідомлення, що такого слова немає.
 */

public class Translator_task8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть слово про погоду на українській мові");
    String weatherWord = scanner.next();
    switch (weatherWord.toLowerCase()) {
      case "сонячно": {
        System.out.println("sunny");
        break;
      }
      case "хмарно": {
        System.out.println("cloudy");
        break;
      }
      case "дощово": {
        System.out.println("rainy");
        break;
      }
      case "вітряно": {
        System.out.println("windy");
        break;
      }
      case "туманно": {
        System.out.println("foggy");
        break;
      }
      case "холодно": {
        System.out.println("cold");
        break;
      }
      case "тепло": {
        System.out.println("warm");
        break;
      }
      case "спекотно": {
        System.out.println("hot");
        break;
      }
      case "морозно": {
        System.out.println("frosty");
        break;
      }
      case "прохолодно": {
        System.out.println("chilly");
        break;
      }
      default: {
        System.out.println("У даному українсько-англійському перекладачі такого слова немає");
        break;
      }
    }
    scanner.close();
  }
}
