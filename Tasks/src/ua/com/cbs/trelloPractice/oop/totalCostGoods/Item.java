package ua.com.cbs.trelloPractice.oop.totalCostGoods;

import java.time.LocalDate;

/**
 * Наименование
 * Изготовитель
 * Год_выпуска
 * Количество
 * Цена
 *
 * Определить общую стоимость всех товаров, выпущенных в текущем году и вывести сведения об этих товарах.
 */

public class Item {
  private final String name;
  private final String manufacture;
  private final LocalDate release;
  private final int quantity;
  private final double price;

  public Item(String name, String manufacture, LocalDate release, int quantity, double price) {
    this.name = name;
    this.manufacture = manufacture;
    this.release = release;
    this.quantity = quantity;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", manufacture='" + manufacture + '\'' +
        ", release=" + release +
        ", quantity=" + quantity +
        ", price=" + price +
        '}';
  }

  public LocalDate getRelease() {
    return release;
  }

  public double totalCost() {
    return quantity * price;
  }
}
