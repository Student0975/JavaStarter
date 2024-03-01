package ua.com.cbs.classwork;

import java.util.Scanner;

public class C04_GuessColor {
    // Циклічна конструкція - while.

    public static void main(String[] args) {
        System.out.println("Вгадайте задуманий колір із п'яти спроб.");
        System.out.println("Щоб вийти з програми, введіть - exit.");

        final int MAX_ATTEMPT = 5; // Допустима кількість спроб.
        int attempt = 0;           // Лічильник спроб.
        String color = "red";      // Задуманий колір.
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Спроба " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(color)) {
                continue;
            }

            System.out.println("Вітаємо, Ви вгадали з " + attempt + " спроби!");
            break;
        }

        System.out.println("Кінець гри!");
    }
}
