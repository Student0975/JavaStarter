package ua.com.cbs.classwork;

public class C03_Methods {

    static String function() {
        String word = "Hello!";
        return word;
    }

    public static void main(String[] args) {

        // У тілі методу Main на 15-му рядку створюємо рядкову локальну змінну з ім'ям string
        // та присвоюємо їй значення методу function, що повертається.

        //String string = function();
        System.out.println(function());
    }
}
