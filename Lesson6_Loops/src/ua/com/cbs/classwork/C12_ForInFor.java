package ua.com.cbs.classwork;

public class C12_ForInFor {
    // Цикл for вкладений цикл for. ( Побудова квадрата із зірочок - * )

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            // Виводимо один рядок із 9 зірочок.
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }

            // Перехід на новий рядок.
            System.out.println();
        }
    }
}
