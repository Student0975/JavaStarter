package com.itvdn.javaStarter;

public class C06_LogicShift {

    // Логічний Зсув  (shift).

    public static void main(String[] args) {
        byte operand = 0b0000001;              // 0000 0001
        System.out.println("Число до зсуву: " + operand);

        // Логічний зсув числа ліворуч.

        operand = (byte)(operand << 2);   // 0000 0100
        System.out.println("Число після зсуву ліворуч: " + operand);

        // Логічний зсув числа праворуч.

        operand = (byte)(operand >> 1);   // 0000 0010

        System.out.println("Число після зсуву праворуч: " + operand);
    }
}
