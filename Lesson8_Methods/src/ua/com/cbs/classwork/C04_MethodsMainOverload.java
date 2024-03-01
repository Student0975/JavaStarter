package ua.com.cbs.classwork;

public class C04_MethodsMainOverload {
    public static void main(String[] args) {
        if(args.length > 0)  // якщо через консоль було введено аргументи
            System.out.println(args[0]);  // то вивести у консоль перший елемент із масиву
        else {  // інакше —
            main(); // використовувати звичайний метод під назвою main()
        }
    }

    public static void main() {  // это обычный метод с названием main()
        System.out.println("it's usual main method without String[] args!");
    }
}
