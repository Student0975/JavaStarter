package ua.com.cbs.trelloPractice.oop.totalCostGoods;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Наименование
 * Изготовитель
 * Год_выпуска
 * Количество
 * Цена
 *
 * Определить общую стоимость всех товаров, выпущенных в текущем году и вывести сведения об этих товарах.
 */

public class Main {

  public static void main(String[] args) {
    ArrayList<Item> items = new ArrayList<>();
    items.add(new Item("drill","Bosh", LocalDate.of(2024, 3, 15),8,25.99));
    items.add(new Item("kitchen table","Ikea", LocalDate.of(2021, 3,12),6,50.99));
    items.add(new Item("transparent TV","Sony", LocalDate.of(2024, 2, 5),2,1025.00));
    items.add(new Item("console","Nintendo switch", LocalDate.of(2023, 12,15),18,255.99));

    double totalCost = 0.0d;

    System.out.println("List of items are released in the current year " + LocalDate.now().getYear());
    for (Item item : items) {
      if (item.getRelease().getYear() == LocalDate.now().getYear()) {
        System.out.println(item);
        totalCost += item.totalCost();
      }
    }
    if (totalCost == 0) {
      System.out.println("No one!");
    } else System.out.printf("Total cost of all goods : %s", totalCost);
  }
}
