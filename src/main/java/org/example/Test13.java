package org.example;

public class Test13 {
    //13
    public static void twoMas(int a, int b) {
        int[][] table = new int[a][b];
        for (int i = 0; i < table.length; i++) {
            table[i][table.length - i - 1] = 1;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][i] = 1;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }


    }
}
