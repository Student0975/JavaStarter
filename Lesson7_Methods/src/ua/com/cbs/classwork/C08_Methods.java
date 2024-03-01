package ua.com.cbs.classwork;

public class C08_Methods {
    // Приклад: Використання сторожового оператора для захисту номінального варіанта.

    static String function(String name) {
        // Виконуємо перевірку. При виявленні помилок завершуємо роботу.

        if (name == "fool") {  // Сторожовий оператор.
            return "Ви використовували неприпустиме слово.";
        }

        // Код номінального варіанта.

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {
        String sentence = function("fool");

        System.out.println(sentence);
    }
}
