package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public void solve(int n) {
        Random rand = new Random();
        ArrayList<Double> list = new ArrayList<Double>();

        for (int i = 0; i < n; i++) {
            list.add(rand.nextDouble());
        }

        System.out.println("Исходный список:");
        System.out.println(list);

        mergeSort(list);

        System.out.println("Отсортированный список:");
        System.out.println(list);
    }

    public static void mergeSort(ArrayList<Double> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;

            ArrayList<Double> leftHalf = new ArrayList<>(list.subList(0, mid));
            ArrayList<Double> rightHalf = new ArrayList<>(list.subList(mid, list.size()));

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(list, leftHalf, rightHalf);
        }
    }

    private static void merge(ArrayList<Double> list, ArrayList<Double> leftHalf, ArrayList<Double> rightHalf) {
        int i = 0, j = 0, k = 0;

        while (i < leftHalf.size() && j < rightHalf.size()) {
            if (leftHalf.get(i) <= rightHalf.get(j)) {
                list.set(k++, leftHalf.get(i++));
            } else {
                list.set(k++, rightHalf.get(j++));
            }
        }

        while (i < leftHalf.size()) {
            list.set(k++, leftHalf.get(i++));
        }

        while (j < rightHalf.size()) {
            list.set(k++, rightHalf.get(j++));
        }
    }
}
