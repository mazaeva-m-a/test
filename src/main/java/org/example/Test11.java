package org.example;

import java.util.Arrays;

public class Test11 {
    //11
    public static void stoSto() {
        int[] arr = new int[100];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
