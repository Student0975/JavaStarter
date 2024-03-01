package com.itvdn.javaStarter;

public class C03_Cyper {
    // Побітові логічні операції. (^)

    // Наприклад:
    // Використовуючи операцію XOR, ми можемо зашифрувати повідомлення.
    // У такому вигляді шифрування використовується один ключ, як шифрування, так розшифровки.
    // Криптостійкість такого ключа можна збільшити, якщо збільшити його довжину.

    public static void main(String[] args) {
        short secretKey = 0b0101;   // Секретний ключ (довжина - 16 bit).
        char character = 'A';      // Вихідний символ для шифрування.

        System.out.println("Вихідний символ: " + character + ", його код у кодовій таблиці: " + (byte)character);

        // Зашифровуємо символ. character = 0100 0001 (65)
        character = (char)(character ^ secretKey); // 0100 0001 ^  0000 0101
        System.out.println("Зашифрованний символ: " + character + ", його код у кодовій таблиці: " + (byte) character);

        // Розшифровуємо символ. character  = 0100 0100 (68)
        character = (char)(character ^ secretKey); // 0100 0100 ^ 0000 0101
        System.out.println("Розшифрований символ: " + character + ", його код у кодовій таблиці: " + (byte) character);
    }
}
