package ua.com.cbs.classwork;

public class C05_DoWhile {
    // Циклічна конструкція - do-while.

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);
        } while (counter > 3);

        System.out.println("Вироблено " + counter + " ітерацій.");
    }
}
