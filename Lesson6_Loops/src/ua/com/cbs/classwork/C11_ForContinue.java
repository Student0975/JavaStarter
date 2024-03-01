package ua.com.cbs.classwork;

public class C11_ForContinue {
    // Циклічна конструкція (цикл із лічильником) – for (з пропуском ітерації – continue).

    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);

            if (true) continue;

            System.out.println("Цей рядок не виконається.");
        }
    }
}
