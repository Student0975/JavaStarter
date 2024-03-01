package ua.com.cbs.classwork;

public class C01_While {
    // Циклічна конструкція - while.

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);
        }

        System.out.println("Вироблено " + counter + " ітерацій.");
    }
}
