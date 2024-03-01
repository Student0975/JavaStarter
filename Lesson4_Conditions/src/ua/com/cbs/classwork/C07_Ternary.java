package ua.com.cbs.classwork;
import java.util.Scanner;

public class C07_Ternary {
    // Тернарна умовна операція.

    public static void main(String[] args) {
        String string = "Hello ";

        System.out.println("Введіть свій логін:");
        Scanner in = new Scanner(System.in);
        // На 14 рядку створюємо змінну з іменем login типу String і приймаємо до неї введення від користувача

        String login = in.next();

        // На 18 рядку змінної string присвоюємо значення тернарного оператора, що повертається.

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);
    }
}
