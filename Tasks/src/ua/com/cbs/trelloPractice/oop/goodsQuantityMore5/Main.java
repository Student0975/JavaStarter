package ua.com.cbs.trelloPractice.oop.goodsQuantityMore5;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Наименование
 * Количество
 * Цена
 * Изготовитель
 * Дата_поступления_на_склад
 *
 * Определить количество всех товаров, количество которых больше 5 и вывести сведения об этих товарах.
 */

public class Main {

  public static void main(String[] args) {
    ArrayList<Item> items = new ArrayList<>();
    items.add(new Item( "drill", 8, 25.99, "Bosh", LocalDate.of(2023, 3, 15)));
    items.add(new Item( "kitchen table", 6, 50.99, "Ikea", LocalDate.of(2021, 3,12)));
    items.add(new Item( "transparent TV", 2, 1025.99, "Sony", LocalDate.of(2020, 2, 5)));
    items.add(new Item( "console", 18, 255.99, "Nintendo switch", LocalDate.of(2024, 12,15)));

    int acceptableItem = 0;

    System.out.println("List of items with quantity more than 5 :");
    for (Item item : items) {
      if (item.getQuantity() > 5) {
        System.out.println(item);
        acceptableItem++;
      }
    }
    if (acceptableItem == 0) {
      System.out.println("No one!");
    }
  }
}
