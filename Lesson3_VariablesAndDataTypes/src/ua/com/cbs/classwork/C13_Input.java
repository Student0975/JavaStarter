package ua.com.cbs.classwork;

import java.util.Scanner;

public class C13_Input {
    // Об'єкт класу Scanner дозволяє обробляти введення даних з консолі

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть ціле число: ");
        int a = input.nextInt();       // зчитуємо ціле число

        System.out.println("Введіть дрібне число: ");
        float b = input.nextFloat();   // зчитуємо дробове число


        System.out.println("Введіть рядок із пробілами: ");
        String c = input.next();       // зчитуємо рядок до першого пропуску

        input = new Scanner(System.in);

        System.out.println("Введіть рядок: ");
        String d = input.nextLine();   // зчитуємо цілий рядок

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
