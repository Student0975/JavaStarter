package ua.com.cbs.classwork;

import java.util.Scanner;

public class C09_Methods {
    // Параметр, що передається за значенням, знищується при поверненні значення методом

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("Значення int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введіть число:");
        Scanner in = new Scanner(System.in);

        // Принимаем ввод от пользователя и преобразуем его в целочисленное значение

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Значення result = " + result);
        result = 10;
        // Як аргумент передається не сама змінна - result, а її копія.
        result = addTwo(result);
        System.out.println(addTwo(result));
        System.out.println(result);
    }
}
