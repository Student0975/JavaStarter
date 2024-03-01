package ua.com.cbs.classwork;

import java.util.Scanner;

public class C04_Authentification {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@ssw0rd";
        // На 10-му рядку створюємо об'єкт класу Scanner для обробки введення з клавіатури
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть login: ");

        // На 17 рядку створюємо рядкову локальну змінну з ім'ям usersLogin
        // і приймаємо до неї введення від користувача

        String usersLogin = sc.next();

        if (login.equals(usersLogin)) {
            System.out.print("Введіть password: ");
            String usersPassword = sc.next();

            if (password.equals(usersPassword)) {
                System.out.println("Доброго дня " + usersLogin + ", Ви увійшли до системи.");
            } else {
                System.out.println("Ви ввели неправильний пароль!");
            }
        } else {
            System.out.println("Немає користувача з таким ім'ям!");
        }
    }
}
