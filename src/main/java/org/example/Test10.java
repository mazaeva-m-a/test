package org.example;

import java.util.Arrays;

public class Test10 {
    //10
    public static void nulOne() {
        int[] arr = new int[]{1, 0, 0, 0, 1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i]++;
            else arr[i]--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
