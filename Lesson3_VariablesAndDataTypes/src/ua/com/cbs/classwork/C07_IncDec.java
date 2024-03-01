package ua.com.cbs.classwork;

public class C07_IncDec {
    // Оператори Інкременту та Декременту (Increment and Decrement Operators)

    public static void main(String[] args) {
        System.out.println("----- Постфіксний інкремент"); // Post-increment

        byte number1 = 0;
        System.out.println(number1++); // Спершу виводимо на екран, потім збільшуємо на 1.
        System.out.println(number1);

        System.out.println("----- Префіксний інкремент"); // Pre-increment

        byte number2 = 0;
        System.out.println(++number2); // Спочатку збільшуємо на 1, потім виводимо на екран.

        System.out.println("----- Постфіксний декремент"); // Post-decrement

        byte number3 = 0;
        System.out.println(number3--); // Спочатку виводимо на екран, потім зменшуємо на 1.
        System.out.println(number3);

        System.out.println("----- Префіксний декремент"); // Pre-decrement

        byte number4 = 0;
        System.out.println(--number4); // Спочатку зменшуємо на 1, потім виводимо на екран.
        int i = 0;

        i = i + 1;  i += 1;
        i = i + 5;  i += 5;

        i = i - 10;  i -= 10;
    }
}
