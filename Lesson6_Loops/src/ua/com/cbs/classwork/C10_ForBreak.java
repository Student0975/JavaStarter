package ua.com.cbs.classwork;

public class C10_ForBreak {
    // Циклічна конструкція (цикл із лічильником) - for (з достроковим виходом із циклу - break).

    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);

            if (true) break;

            System.out.println("Цей рядок не виконається.");
        }
    }
}
