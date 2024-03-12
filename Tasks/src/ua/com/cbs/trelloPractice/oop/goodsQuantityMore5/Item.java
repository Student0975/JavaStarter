package ua.com.cbs.trelloPractice.oop.goodsQuantityMore5;

import java.time.LocalDate;

public class Item {

  private final String name;
  private final int quantity;
  private final double price;
  private final String manufacture;
  private final LocalDate dateToWarehouse;

  public Item(String name, int quantity, double price, String manufacture, LocalDate dateToWarehouse) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.manufacture = manufacture;
    this.dateToWarehouse = dateToWarehouse;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", quantity=" + quantity +
        ", price=" + price +
        ", manufacture='" + manufacture + '\'' +
        ", dateToWarehouse='" + dateToWarehouse + '\'' +
        '}';
  }
}
