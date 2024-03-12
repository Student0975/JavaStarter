package ua.com.cbs.trelloPractice.oop.infoGoods;

import java.time.LocalDate;

public class Item {
   private final String seller;
   private final String name;
   private final int quantity;
   private final double price;
   private final LocalDate dateSell;

  public Item(String seller, String name, int quantity, double price, LocalDate dateSell) {
    this.seller = seller;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.dateSell = dateSell;
  }

  public LocalDate getDateSell() {
    return dateSell;
  }

  @Override
  public String toString() {
    return "Item{" +
        "seller='" + seller + '\'' +
        ", name='" + name + '\'' +
        ", quantity=" + quantity +
        ", price=" + price +
        ", dateSell=" + dateSell +
        '}';
  }
}
