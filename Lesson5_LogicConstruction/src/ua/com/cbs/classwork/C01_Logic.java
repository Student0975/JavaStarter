package com.itvdn.javaStarter;

public class C01_Logic {
    // Побітові логічні операції.

    public static void main(String[] args) {
        byte operand1, operand2;
        int result;

        // Кон'юнкція

        // Таблиця істинності операцій Кон'юнкції (І) - & - [AND]

        // Якщо хоч один з операнда має значення 0 - вся конструкція має значення 0. Інакше - 1

        //    0 & 0 = 0         1 & 0 = 0
        //    0 & 1 = 0         1 & 1 = 1

        operand1 = 127;                             // [0111 1111 Bin] = [FF Hex] = [127 Dec]
        operand2 = 1;                               // [0000 0001 Bin] = [01 Hex] = [01 Dec]
        result = operand1 & operand2;               // [0000 0001 Bin] = [01 Hex] = [01 Dec]

        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // Диз'юнкція

        // Таблиця істинності для Диз'юнкції (АБО) - | - [OR]

        // Якщо хоч один з операнда має значення 1 - вся конструкція має значення 1. Інакше - 0

        //    0 | 0 = 0         1 | 0 = 1
        //    0 | 1 = 1         1 | 1 = 1

        operand1 = 2;                       // [0000 0010 Bin] = [02 Hex] = [02 Dec]
        operand2 = 1;                       // [0000 0001 Bin] = [01 Hex] = [01 Dec]
        result = operand1 | operand2;       // [0000 0011 Bin] = [03 Hex] = [03 Dec]

        System.out.println(operand1 + " OR " + operand2 + " = " + result);

        // Виключне АБО

        // Таблиця істинності для Виключаючого АБО - ^ - [XOR]

        // Якщо операнди мають однакове значення – результат операції 0,
        // Якщо операнди різні – 1

        //    0 ^ 0 = 0         1 ^ 0 = 1
        //    1 ^ 1 = 0         0 ^ 1 = 1

        operand1 = 3;                               // [0000 0011 Bin] = [03 Hex] = [03 Dec]
        operand2 = 1;                               // [0000 0001 Bin] = [01 Hex] = [01 Dec]
        result = operand1 ^ operand2;               // [0000 0010 Bin] = [02 Hex] = [02 Dec]

        System.out.println(operand1 + " XOR " + operand2 + " = " + result);

        // Заперечення

        // Таблиця істинності для Заперечення (НІ) - ~ - [NOT]

        // ~ 0  = 1
        // ~ 1  = 0

        operand1 = 1;             // [0000 0001] = [01 Dec]
        result = ~operand1;       // [1111 1110] = [-2 Dec]

        System.out.println("NOT " + operand1 + " = " + result);

        // Зміна знака числа

        // Формула зміни знака числа, з (+N) на (-N) чи навпаки.

        // Для того, щоб змінити знак числа, необхідно:
        // Виконати його заперечення, а результат збільшити на 1.

        //  ~  +N + 1 = -N
        //  ~  -N + 1 = +N

        operand1 = 1;                               // [0000 0001]
        result = ~operand1;                         // [1111 1110]
        result++;                                   // [1111 1111]

        System.out.println("NOT " + operand1 + " + 1 = " + result);
    }
}
