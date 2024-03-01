package ua.com.cbs.classwork;

public class C06_DoWhileBreak {
    // Циклічна конструкція – do-while. (з достроковим виходом із циклу - break)

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            if (true) break;
            System.out.println("Цей рядок не виконається.");
        }
        while (counter < 3) ;

        System.out.println("Вироблено " + counter + " ітерацій.");
    }
}
