package ua.com.cbs.homework;

/**
 * Використовуючи IntelliJ IDEA, створіть проект із класом main.
 * Створіть дві цілочисельні змінні та виведіть на екран результати всіх арифметичних операцій над цими двома змінними.
 */

public class ArithmeticOperatorsTwoIntNumbers_Task6 {

  public static void main(String[] args) {
    int x = 10;
    int y = 3;

    System.out.println((double) 10/3);

    // +, -, *, /, %
    // Increment and Decrement Operators
    // Math.pow(), Math.sqrt(x)

  /*
  Order of executing of the ArithmeticOperators:
      1) ++ (постфиксный инкремент), -- (постфиксный декремент)
      2) ++ (префиксный инкремент), -- (префиксный декремент)
      3) * (умножение), / (деление), % (остаток от деления)
      4) + (сложение), - (вычитание)
  */

    System.out.printf("Addition                 (+) : %d + %d = %s\n", x,y,(x+y));
    System.out.printf("Substarction             (-) : %d - %d = %s\n", x,y,(x-y));
    System.out.printf("Multiplication           (*) : %d * %d = %s\n", x,y,(x*y));
    System.out.printf("Division                 (/) : %d / %d = %.2f\n", x,y,(double)(x/y)); // fraction is lost
    double div = (double) x / y;
    System.out.printf("Division                 (/) : %d / %d = %.2f\n", x,y,div); // a correct way to get result
    System.out.println("Remainder after division (%) : 10 % 3 = " + (x%y));

    System.out.println("-".repeat(15));

    // Post-increment
    x = 10;
    System.out.println("Post-increment(firstly print after increase +1) : x++ = " + x++);
    System.out.println("After : " + x);

    // Pre-increment
    x = 10;
    System.out.println("Pre-increment(firstly increase +1 after print) : ++x = " + ++x);
    System.out.println("After : " + x);

    // Post-decrement
    x = 10;
    System.out.println("Post-decrement(firstly print after decrease -1) : x-- = " + x--);
    System.out.println("After : " + x);

    // Pre-decrement
    x = 10;
    System.out.println("Pre-decrement(firstly decrease +1 after print) : --x = " + --x);
    System.out.println("After : " + x);

    System.out.println("-".repeat(15));

    System.out.printf("Math.pow(%s,%s) : %3.2f\n", x, y, Math.pow(x,y));
    System.out.printf("Math.sqrt(%s)  : %3.2f\n", x, Math.sqrt(x));
  }
}