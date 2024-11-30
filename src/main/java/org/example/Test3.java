package org.example;

public class Test3 {
    //3
    public static void printColor() {
        boolean value;
        int c = 99;
        if (c <= 0) {
            System.out.println("Красный");
        } else if (c >= 1 && c <= 100) {
            System.out.println("Желтый");
        } else if (c >= 101) {
            System.out.println("Зеленый");
        }
    }
}
