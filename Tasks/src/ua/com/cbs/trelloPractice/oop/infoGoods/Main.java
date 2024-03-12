package ua.com.cbs.trelloPractice.oop.infoGoods;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Продавец
 * Наименование
 * Количество
 * Цена
 * Дата_продажи
 *
 * Определить количество товаров, которые проданы менее года назад и вывести сведения о них.
 */

public class Main {
  public static void main(String[] args) {
    ArrayList<Item> items = new ArrayList<>();
    items.add(new Item("Bosh", "drill", 8, 25.99, LocalDate.of(2023, 3, 15)));
    items.add(new Item("Ikea", "kitchen table", 6, 50.99, LocalDate.of(2021, 3,12)));
    items.add(new Item("Sony", "transparent TV", 2, 1025.99, LocalDate.of(2020, 2, 5)));
    items.add(new Item("Nintendo switch", "console", 18, 255.99, LocalDate.of(2024, 12,15)));

    int acceptableItem = 0;

    System.out.println("Items were sold less 1 year ago :");
    for (Item item : items) {
      if (item.getDateSell().plusYears(1).compareTo(LocalDate.now()) > 0) {
        System.out.println(item);
        acceptableItem++;
      }
    }
    if (acceptableItem == 0) {
      System.out.println("No one!");
    }
  }
}
