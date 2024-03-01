package ua.com.cbs.classwork;

public class C06_MethodsRecursion {
    // Рекурсія (складна рекурсія).
    // Складна рекурсія – виклик методом себе, через інший метод.

    static void recursion(int counter) {
        counter--;

        System.out.println("Перша половина методу recursion: " + counter);

        if (counter != 0)
            method(counter);

        System.out.println("Друга половина методу recursion: " + counter);
    }

    static void method(int counter) {
        System.out.println("Перша половина методу method: " + counter);

        recursion(counter);

        System.out.println("Друга половина методу method: " + counter);
    }

    public static void main(String[] args) {
        method(3);
    }
}

