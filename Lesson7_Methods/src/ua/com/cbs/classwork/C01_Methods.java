package ua.com.cbs.classwork;

public class C01_Methods {
    // Методи.

    // На 9-му рядку створюємо метод з ім'ям procedure, який нічого не приймає і нічого не повертає.
    // У тілі методу, на 10-му рядку виводимо на екран рядок – Hello!

    static void procedure() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        // У тілі методу Main на 17-му рядку викликаємо метод procedure.

        procedure();
    }
}
