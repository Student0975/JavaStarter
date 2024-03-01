package ua.com.cbs.classwork;

public class C08_Factorial {
    // Циклічна конструкція – do-while.

    // Факторіал числа n (позначається n!, Вимовляється - ен факторіал) - це добуток всіх натуральних чисел,
    //    // від 1 до n включно:
    //     n! = 1 * 2 * 3 * ... * n
    //     0! = 1

    // Вкомбінаториці факторіал натурального числа n інтерпретується як кількість перестановок множини з n елементів.
    //    // Наприклад, для множини {A,B,C,D} з 4-х елементів існує: 4! = 1 * 2 * 3 * 4 = 24 перестановки:

    //     ABCD  BACD  CABD  DABC
    //     ABDC  BADC  CADB  DACB
    //     ACBD  BCAD  CBAD  DBAC
    //     ACDB  BCDA  CBDA  DBCA
    //     ADBC  BDAC  CDAB  DCAB
    //     ADCB  BDCA  CDBA  DCBA

    public static void main(String[] args) {
        int counter = 4;
        int factorial = 1;

        System.out.print("Факторіал числа: " + counter + "! = ");

        do {
            // Спершу множення, потім декремент.
            factorial *= counter--;

            // Цей рядок еквівалентний:

            // factorial = factorial * counter;
            // counter = counter - 1;
        } while (counter > 0);

        System.out.print(factorial);
    }
}
