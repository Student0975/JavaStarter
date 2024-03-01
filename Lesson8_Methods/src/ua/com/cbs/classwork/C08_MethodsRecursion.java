package ua.com.cbs.classwork;

public class C08_MethodsRecursion {
    // Знаходження найбільшого загального дільника (НДД) двох цілих чисел

    // Перший варіант

    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("Знаходження найбільшого спільного дільника двох цілих чисел");

        int a = 676, b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", НCД = " + calculate(a, b) + ";");
    }

    // Другий варіант вирішення

    static int calculate2(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a;
    }
}
