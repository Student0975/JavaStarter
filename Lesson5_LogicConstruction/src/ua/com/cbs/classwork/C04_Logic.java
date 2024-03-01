package com.itvdn.javaStarter;

public class C04_Logic {
    // Логічні операції.

    public static void main(String[] args) {
        boolean operand1 = false, operand2 = false, result = false;

        // Кон'юнкція

        // Таблиця істинності для Кон'юнкції (И) - && - [AND]

        // Якщо хоч один із виразів операції операції кон'юнкції має значення false -
        // весь вираз має значення false, інакше – true

        // false && false = false                  true && false = false
        // false && true = false                   true && true = true

        operand1 = true;                           // true
        operand2 = false;                          // false
        result = operand1 && operand2;             // false

        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // Диз'юнкція

        // Таблиця істинності для диз'юнкції (АБО) - || - [OR]

        // Якщо хоч один із виразів операції операції Диз'юнкції має значення true -
        // весь вираз має значення true, інакше – false

        // false || false = false                  true || false = true
        // false || true = true                    true || true = true

        operand1 = true;                           // true
        operand2 = false;                          // false
        result = operand1 || operand2;             // true

        System.out.println(operand1 + " OR " + operand2 + " = " + result);

        // Виключне АБО

        // Таблиця істинності для Виключного АБО - ^ - [XOR]

        // Якщо обидва висловлювання операції виключає або мають однакове значення -
        // весь вираз має значення false, якщо різні – true

        // false ^ false = false                   true ^ false = true
        // false ^ true = true                     true ^ true = false

        operand1 = true;                           // true
        operand2 = false;                          // false
        result = operand1 ^ operand2;              // true

        System.out.println(operand1 + " XOR " + operand2 + " = " + result);

        // Заперечення

        // Таблиця істинності для заперечення (НІ) - ! - [NOT]

        // !false  = true
        // !true  = false

        operand1 = true;
        result = !operand1;

        System.out.println("NOT " + operand1 + " = " + result);
    }
}
