package ua.com.cbs.classwork;

public class C02_IfElse {
    public static void main(String[] args) {
        int a = 1, b = 2;

        if (a < b) { // Якщо умова задовольняє істинність, виконуємо тіло блоку if.
            System.out.println("a < b");               // Гілка 1
        } else {       // Інакше виконуємо тіло блоку else.
            System.out.println("a не менше b");       // Гілка 2
        }
    }
}
