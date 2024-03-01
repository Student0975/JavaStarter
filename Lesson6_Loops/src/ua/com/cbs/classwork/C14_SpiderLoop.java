package ua.com.cbs.classwork;

import java.util.Scanner;

public class C14_SpiderLoop {

    // Цикл Павук (Spider). Модифікований цикл Дейкстри із явними умовами виходу.

    // Цикл Дейкстри не містить явної умови продовження чи виходу.
    // Тому було запропоновано ускладнена конструкція циклу Дейкстри, що отримала назву "цикл-павук".

    // У нотації Дейкстри вона виглядає так:

    // do
    //    P1?S1,
    //      …
    //    Pn?Sn
    //  out
    //    Q1?T1,
    //      …
    //    Qn?Tn
    //  else
    //    E
    // od

    // де:
    // do — маркер початку конструкції циклу,
    // od — маркер завершення конструкції циклу,
    // Pi — i-та умова, що охороняє (логічне вираження, яке може мати значення «істинно» або «хибно»),
    // Si — i-а команда, що охороняється.
    // Після маркера out додані гілки завершення, що складаються з умов виходу Qi та команд завершення Ti.
    // Крім того, додано галузь альтернативного завершення else з командою E.

    //   Цикл-'павук' виконується так:
    // Обчислюються умови, що охороняють.
    // Якщо існує справжня умова, що охороняє, виконується відповідна команда, що охороняється.
    // Обчислюються умови виходу.
    // Якщо існує дійсна умова виходу, виконується відповідна команда завершення,
    // Після чого виконання циклу закінчується.
    // Якщо всі умови виходу хибні, починається така ітерація, але у разі, якщо у поточної ітерації
    // було істинним хоча б одне з умов, що охороняють.
    // Якщо в даній ітерації виявилися помилковими і всі умови, що охороняють, і всі умови виходу, виконується
    // команда альтернативного завершення E, після чого виконання циклу переривається.

    public static void main(String[] args) {
        char character = '\0';
        Scanner in = new Scanner(System.in);

        for (; ; ) {
            character = in.next().charAt(0);

            switch (character) {
                case 'l': // 'l' - охоронна умова 1.
                {
                    System.out.println("Go left");
                    continue; // охоронна команда.
                }
                case 'r': // 'r' - охоронна умова 2.
                {
                    System.out.println("Go right");
                    continue; // охоронна команда.
                }
            }

            switch (character) {
                case 'x': // 'x' - умова виходу 1.
                {
                    System.out.println("Exit");
                    break; // команда завершення.
                }
                case 'q': // 'q' - умова виходу 2.
                {
                    System.out.println("Quit");
                    break; // команда завершення.
                }
                default: // Гілка альтернативного завершення.
                {
                    System.out.println("Alternative exit");
                    break;
                }
            }
            break;  // Переривання циклу.
        }
    }
}
