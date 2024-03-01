package ua.com.cbs.classwork;

public class C10_Ternary {
    // Тернарна умовна операція.

    public static void main(String[] args) {
        double quantity = 10;    // Кількість одиниць товару.
        double price = 100;      // Ціна за одиницю товару.
        double discount = 0.75;  // Знижка на загальну вартість - 25%.
        double cost;             // Загальна вартість.

        // ЯКЩО: Купили 10 одиниць товару та більше. ТО: надати знижку 25%. Інакше: Знижку не надавати.

        cost = quantity >= 10 ? quantity * price * discount : quantity * price;

        System.out.println("Загальна вартість товару складає: " + cost + " у.е.");
    }
}
