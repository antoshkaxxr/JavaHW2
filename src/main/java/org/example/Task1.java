package org.example;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public void solve(int n) {
        Random rand = new Random();
        int[] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt();
            if (Math.abs(arr[i]) > max) {
                max = arr[i];
            }
        }

        System.out.println("Массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальное по модулю значение: " + max);
    }
}
