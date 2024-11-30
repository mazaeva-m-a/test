package org.example;

public class Test9 {
    //9
    public static boolean visGod(int a) {
        boolean result;
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            result = true;
        } else result = false;
        return result;
    }
}
