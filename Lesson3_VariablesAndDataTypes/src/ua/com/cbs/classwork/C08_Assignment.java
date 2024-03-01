package ua.com.cbs.classwork;

public class C08_Assignment {
    public static void main(String[] args) {
        // ПРАВИЛО:
        // Усі арифметичні операції над двома значеннями типу (byte, short)
        // як результат, повертають значення типу int.

        // Присвоєння із додаванням для типу byte.
        byte variable1 = 0;

        // variable1 = variable1 + 5;       // ПОМИЛКА: Спроба неявного перетворення значення результату, тип int тип byte.
        // variable1 = (byte)variable1 + 5; // ПОМИЛКА: Перетворення типу byte в тип byte, раніше виконання операції складання.

        variable1 = (byte)(variable1 + 5); // Громіздке рішення.

        variable1 += 5;                    // Елегантне рішення.

        variable1 += 5000;               //Звуження типу.

        // ПРАВИЛО:
        // Для типів int і long, немає перетворення типу результату арифметичних операцій.

        // Операції присвоєння з ...

        // Присвоєння із додаванням.
        int variable2 = 0;
        variable2 = variable2 + 5;
        variable2 += 5;

        // Присвоєння з відніманням.
        int variable3 = 0;
        variable3 = variable3 - 5;
        variable3 -= 5;

        // Присвоєння з множенням.
        long variable4 = 0;
        variable4 = variable4 * 5;
        variable4 *= 5;

        // Присвоєння з діленням.
        long variable5 = 0;
        variable5 = variable5 / 5;
        variable5 /= 5;

        // Присвоєння з поділом залишку від ділення.
        long variable6 = 0;
        variable6 = variable6 % 5;
        variable6 %= 5;

        // ПРАВИЛО:
        // Для типів float та double, не відбувається перетворення типу результату арифметичних операцій.

        // Присвоєння із додаванням.
        float variable7 = 0;
        variable7 = variable7 + 5;
        variable7 += 5;

        // Присвоєння з множенням.
        double variable8 = 0;
        variable8 = variable8 * 5;
        variable8 *= 5;
    }
}
