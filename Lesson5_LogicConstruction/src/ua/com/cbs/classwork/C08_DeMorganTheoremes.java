package com.itvdn.javaStarter;

public class C08_DeMorganTheoremes {

     // Перетворення логічних змінних відповідно до теорем де Моргана.

     // Для застосування теорем Де Моргана до логічного оператора AND або OR та пари операндів,
     // потрібно інвертувати обидва операнди, замінити (AND на OR) або (OR на AND) і
     // інвертувати весь вираз повністю.

     //  Початковий вираз                           Еквівалентний вираз
     //     !A & !B                       =                  !(A | B)
     //     !A & B                        =                  !(A | !B)
     //     A & !B                        =                  !(!A | B)
     //     A & B                         =                  !(!A | !B)
     //     !A | !B                       =                  !(A & B)
     //     !A | B                        =                  !(A & !B)
     //     A | !B                        =                  !(!A & B)
     //     A | B                         =                  !(!A & !B)

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Умови застосування теореми Де Моргана.
        if (!a || !b)
            System.out.println("!A || !B = " + (!a || !b));
        else
            System.out.println("!A || !B = " + (!a || !b));

        // Умови після застосування теореми Де Моргана.
        if (!(a && b))
            System.out.println("!(A && B) = " + !(a && b));
        else
            System.out.println("!(A && B) = " + !(a && b));
    }
}
