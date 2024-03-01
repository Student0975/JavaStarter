package ua.com.cbs.classwork;

public class C09_LocalVariables {
    // Використання локальних областей та локальних змінних.

    public static void main(String[] args) {
        // ПРАВИЛО:
        // У коді можна створювати локальні області та у двох різних локальних областях зберігати однойменні змінні.

        // Локальна область 1
        {
            int a = 1;
            System.out.println(a);
        }

        // System.out.println(a); // - ПОМИЛКА: Змінна оголошена в локальній області і не існує за її межами.

        // Локальна область 2
        {
            int a = 2;
            System.out.println(a);
        }

        int a = 3;
        System.out.println(a);
    }
}
