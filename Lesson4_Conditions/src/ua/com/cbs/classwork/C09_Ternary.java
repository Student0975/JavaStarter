package ua.com.cbs.classwork;

public class C09_Ternary {
    // Тернарна умовна операція. Вкладені тернарні оператори.

    public static void main(String[] args) {
        // Визначення квадрату, у якому лежить задана точка.
        // Для спрощення прикладу умовимося, що точка не лежатиме в центрі координат і на координатних осях,
        // це означає, що x і y - не можуть дорівнювати 0.

        int x = 10, y = -5;
        String quadrat0, quadrat1,quadrat2;


        // Не рекомендується вкладати тернарні оператори, оскільки це погіршує читання коду.

        //                condition      true block    false block     condition    true block    false block
        //                    -------- ? ------------ : -------------    -------- ? ------------- : --------------
        quadrat0 = (x > 0) ? ((y > 0) ? "I квадрат" : "IV квадрат") : ((y > 0) ? "II квадрат" : "III квадрат");
        //          ------- ? ---------------------------------------- : -------------------------------------------
        //         condition               true block                                   false block

        // ... або так

        quadrat1 = x > 0 ? (y > 0 ? "I квадрат" : "IV квадрат") : (y > 0 ? "II квадрат" : "III квадрат");

        // ... або взагалі, ось так

        quadrat2 = x > 0 ? y > 0 ? "I квадрат" : "IV квадрат" : y > 0 ? "II квадрат" : "III квадрат";

        System.out.println(quadrat0);
        System.out.println(quadrat1);
        System.out.println(quadrat2);
    }
}
