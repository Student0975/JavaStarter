package ua.com.cbs.classwork;

public class C03_IfElseShort {
    public static void main(String[] args) {
        int a = 1, b = 2;

        // Якщо тіло блоку if або else складається з одного виразу, то операторні дужки можна опустити

        if (a < b)
            System.out.println("a менше b");      // Гілка 1
        else
            System.out.println("a не менше b");   // Гілка 2
    }
}