package ua.com.cbs.classwork;

public class C08_Ternary {
    // Тернарна умовна операція. Обмеження пов'язані з типобезпекою.

    public static void main(String[] args) {
        int a = 1;
        double b = 0.0;
        int max;

        // Вирази [?] і [:] - мають бути одного типу.

        max = (int)((a > b) ? a : b);

        // ... або так

        max = (a > b) ? a : (int)b;

        System.out.println(max);
    }
}
