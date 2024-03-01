package ua.com.cbs.classwork;

public class C02_MethodsNamedArgs {
    // Іменовані аргументи методів

    static int difference(int height, int width) {
        return height - width;
    }

    public static void main(String[] args) {
        // Можна викликати метод так:
        int difference;
        difference = difference(6, 5);

        // difference = difference(5, 6);

        System.out.println("Різниця дорівнює: " + difference);
    }
}

