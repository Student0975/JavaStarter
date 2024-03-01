package ua.com.cbs.classwork;

public class C02_WhileBreak {
    // Циклічна конструкція – while. (з достроковим виходом із циклу - break)

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            if (true) break;

            System.out.println("Цей рядок не виконається.");
        }

        System.out.println("Вироблено " + counter + " ітерацій.");
    }
}
