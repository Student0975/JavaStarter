package ua.com.cbs.classwork;

public class C04_Methods {

    // На 9-му рядку створюємо метод з ім'ям function, який приймає один рядковий аргумент і повертає рядкове значення.
    // У тілі методу, рядковій локальній змінній sentence, присвоюємо конкатенацію рядків та аргументу,
    // використовуючи ключове слово return, повертаємо значення змінної sentence.

    static String function(String name) {
        String sentence = "Hello " + name + "!";
        return sentence;
    }

    public static void main(String[] args) {

        // У тілі методу Main на 19-му рядку створюємо рядкову локальну змінну з ім'ям sentence,
        // присвоюємо їй значення методу function, якому повертається рядок - World.

        String sentence = function("World");
        System.out.println(sentence);
    }
}
