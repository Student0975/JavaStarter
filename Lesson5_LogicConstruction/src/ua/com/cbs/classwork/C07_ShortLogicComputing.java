package com.itvdn.javaStarter;

public class C07_ShortLogicComputing {

    //  КОРОТКОЗАМКНЕНЕ ОБЧИСЛЕННЯ - техніка, що працює за наступним принципом:
    // Якщо значення першого операнду в операції AND (&&) помилково, другий операнд не обчислюється,
    // тому що повне вираження у будь-якому випадку буде хибним.

    public static void main(String[] args) {
        final int MIN_VALUE = 1;
        int denominator = 0;
        int item = 2;

        // Умова, яка працює з використанням техніки КОРОТКОЗАМКНУТОГО ОБЧИСЛЕННЯ.
        // Якби це вираз обчислювалося повністю, то операція поділу у другому операнді,
        // генерувала б помилку поділу на 0.

        if ((denominator != 0) && (item / denominator) > MIN_VALUE) {   // Залиште один оператор &
            System.out.println("Ми у блоці IF");
        } else {
            System.out.println("Ми у блоці ELSE");
        }
    }
}
