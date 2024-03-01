package ua.com.cbs.classwork;

public class C02_Methods {
    // Методи (Функції).

    // На 9-му рядку створюємо метод з ім'ям function, який нічого не приймає і повертає рядкове значення.
    // У тілі методу, використовуючи ключове слово return, повертаємо рядок – Hello!

    static String function() {
        return "Hello!";
    }

    public static void main(String[] args) {

        // У тілі методу Main на 18-му рядку створюємо рядкову локальну змінну з ім'ям string
        // та присвоюємо їй значення методу function, що повертається.

        String string = function();
        System.out.println(string);
    }
}
