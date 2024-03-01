package ua.com.cbs.classwork;

import java.util.Scanner;

public class C10_Methods {
    // Параметр, що передається за значенням, знищується при поверненні значення методом
    // Щоб отримати змінений результат, використовуємо ключове слово return

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("Значення int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введіть число:");
        Scanner in = new Scanner(System.in);

        // Приймаємо введення від користувача і перетворюємо його на ціле значення

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Значення result = " + result);

        // Надамо змінній result значення, повернене методом addTwo()
        result = addTwo(result);
        System.out.println("Значення result = " + result);
    }
}
