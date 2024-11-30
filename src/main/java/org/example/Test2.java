package org.example;

public class Test2 {
    public static void checkSumSign() {
        int a, b, c;
        a = 10;
        b = -15;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
}
