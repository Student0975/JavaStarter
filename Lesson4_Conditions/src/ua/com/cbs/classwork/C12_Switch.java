package ua.com.cbs.classwork;
import java.util.Scanner;

public class C12_Switch {
    public static void main(String[] args) {
        int myDay;
        System.out.println("Введіть номер дня тижня: 1-2-3-4-5-6-7: ");
        Scanner in = new Scanner(System.in);
        myDay = in.nextInt();

        // Конвертуємо значення рядкової змінної myDay на ціле значення
        // і записуємо його в змінну з ім'ям myDay типу int

        switch (myDay) {
            case 1:
                System.out.println("Понеділок.");
                break;
            case 2:
                System.out.println("Вівторок.");
                break;
            case 3:
                System.out.println("Середа.");
                break;
            case 4:
                System.out.println("Четвер.");
                break;
            case 5:
                System.out.println("П'ятниця.");
                break;
            case 6:
                System.out.println("Субота.");
                break;
            case 7:
                System.out.println("Неділя.");
                break;
            default:
                System.out.println("Ви ввели неіснуючий день тижня.");
                break;
        }
    }
}
