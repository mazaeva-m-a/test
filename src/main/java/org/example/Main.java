package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    //1

        public static void printThreeWords () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        //2
        public static void checkSumSign () {
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

        //3
        public static void printColor () {
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

        //4
        public static void compareNumbers () {
            int a = 80;
            int b = 125;
            if (a >= b) {
                System.out.println("a>=b");
            } else System.out.println("a<b");
        }

        //5
        public static void summaPod ( int a, int b){
            boolean arr;
            int c = a + b;
            if (c >= 10 && c <= 20) {
                arr = true;
            } else arr = false;
            System.out.println(arr);
        }

        //6
        public static void minusPlus ( int a){
            boolean arr;
            if (a >= 0) {
                System.out.println("Положительное");
            } else System.out.println("Отрицательное");
        }

        //7
        public static void plusMinus ( int a){
            boolean arr;
            if (a >= 0) {
                arr = false;
            } else arr = true;
            System.out.println(arr);
        }

        //8
        public static void strokaTsch (String a,int b){
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        }

        //9
        public static void visGod ( int a){
            boolean arr;
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                System.out.println("true");
            } else System.out.println("false");

        }

        //10
        public static void nulOne () {
            int[] arr = new int[]{1, 0, 0, 0, 1, 1, 1, 0, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0)
                    arr[i]++;
                else
                    arr[i]--;

            }
            System.out.println(Arrays.toString(arr));
        }

        //11
        public static void stoSto () {
            int[] arr = new int[100];
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < 100; i++) {
                arr[i] = i + 1;
            }
            System.out.println(Arrays.toString(arr));
        }

        //12
        public static void masSix () {
            int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6)
                    arr[i] = arr[i] * 2;
            }
            for (int i = 0; i < arr.length; i++) ;
            System.out.println(Arrays.toString(arr));
        }

        //13
        public static void twoMas ( int a, int b){
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































