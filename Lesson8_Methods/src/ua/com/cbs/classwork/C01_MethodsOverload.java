package ua.com.cbs.classwork;

public class C01_MethodsOverload {
    // Перевантажені методи можуть відрізнятися типом та кількістю аргументів.

    static void function() {                 // 1-я перегрузка.
        System.out.println("Hello!");
    }

    static void function(String s) {        // 2-я перегрузка.
        System.out.println(s);
    }

    static void function(int i) {           // 3-я перегрузка.
        System.out.println(i);
    }

    static void function(double d) {        // 4-я перегрузка.
        System.out.println(d);
    }

    static void function(String s, int i) { // 5-я перегрузка.
        System.out.println(s + i);
    }

    static void function(int i, String s) { // 6-я перегрузка.
        System.out.println(i + s);
    }

//  Перевантажені методи не можуть відрізнятися значеннями, що повертаються!
//  static String function(String s) {   // 7-е перевантаження.
//
//        return s;
//    }

    public static void main(String[] args) {
        function();                 // 1-е перевантаження.
        function("A");            // 2-е перевантаження.
        function(1);              // 3-е перевантаження.
        function(3.14);          // 4-е перевантаження.
        function("B ", 2);     // 5-е перевантаження.
        function(3, " C");     // 6-е перевантаження.
    }
}
