package ua.com.cbs.classwork;

import java.util.Scanner;

public class C14_CoffeeMachine {

    public static void main(String[] args) {
        // Пропонуємо користувачеві вибрати напій.
        System.out.println("Розміри стаканчиків кави: 1 = Маленька, 2 = Середня, 3 = Велика");
        System.out.print("Будь ласка, зробіть свій вибір: ");

        // Приймаємо введення від користувача.
        Scanner in = new Scanner(System.in);
        String coffeeSize = in.next();

        int cost = 0;

        switch (coffeeSize) {
            case "3":
                cost += 50;
            case "2":
                cost += 25;
            case "1":
                cost += 25;
                break;
            default:
                System.out.println("Неправильний вибір. Будь ласка, виберіть 1, 2, або 3.");
                break;
        }

        if (cost != 0) {
            System.out.println("Внесіть " + cost + " копійок.");
            System.out.println("Дякую!");
        } else {
            System.out.print("Будь ласка, повторіть вибір.");
        }
    }
}
