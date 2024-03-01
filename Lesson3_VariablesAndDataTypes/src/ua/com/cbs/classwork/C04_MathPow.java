package ua.com.cbs.classwork;

import static java.lang.Math.pow;

public class C04_MathPow {

    /* Math.pow() - піднесення числа до ступіня
     * Перший аргумент - число, яке підносимо до ступеня,
     * Другий - показник ступеня, до якого піднесемо число.
     */

    public static void main(String[] args) {
        double x = 2, y = 8;

        double result = pow(x, y);

        System.out.println(result);
    }
}
