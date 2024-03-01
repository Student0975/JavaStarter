package ua.com.cbs.classwork;

import java.util.Scanner;

public class C13_Switch {
    // Оператор багатозначного вибору – switch-case (перемикач). Провалювання.

    public static void main(String[] args) {
        System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day) {
            // Для порожніх операторів case дозволено "провалювання" від одного оператора до іншого.
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("Цей день тижня – Робочий.");
                break;
            case "6":
            case "7":
                System.out.println("Цей день тижня – Вихідний.");
                break;

            default:
                System.out.println("Ви ввели неіснуючий день тижня.");
                break;
        }
    }
}
