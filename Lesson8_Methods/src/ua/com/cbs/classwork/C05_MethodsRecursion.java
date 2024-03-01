package ua.com.cbs.classwork;

public class C05_MethodsRecursion {
    // Рекурсія (проста рекурсія).

    // У тілі методу recursion на 15-му рядку рекурсивно викликається метод recursion.
    // Проста рекурсія – виклик методом самого себе (самовізів). Під час кожного виклику будується нова копія методу.

    static void recursion(int counter) {
        counter--;

        System.out.println("Перша половина методу: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("Друга половина методу: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}
