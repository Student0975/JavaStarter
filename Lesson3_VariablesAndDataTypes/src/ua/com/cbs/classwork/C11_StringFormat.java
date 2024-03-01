package ua.com.cbs.classwork;

public class C11_StringFormat {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        // Конкатенація рядків
        System.out.println("Это число " + a);

        // Форматування рядків за допомогою методу format класу String
        System.out.println(String.format("Это число %1$s", a));

        // Метод printf() належить класу PrintStream, який відповідає за виведення інформації
        // і повертає рядок, відформатований за заданими умовами
        System.out.printf("Это число %1$s \n", a);
        System.out.printf("Это числа %1$s и %2$s \n", b, c);
        System.out.printf("Это числа наоборот %2$s и %1$s", b, c);
        // Форматування виведення числа Пі
        System.out.printf("\n%1$+022.10f", Math.PI);
    }
}
