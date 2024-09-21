package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        Task1 task1 = new Task1();
        System.out.println("Задание №1. Введите число элементов в массиве:");
        task1.solve(Integer.parseInt(sc.nextLine()));
        System.out.println();

        Task2 task2 = new Task2();
        System.out.println("Задание №2. Введите число элементов в списке:");
        task2.solve(Integer.parseInt(sc.nextLine()));
        System.out.println();

        Task3 task3 = new Task3();
        System.out.println("Задание №3. Сотрудники старше 30 лет:");
        task3.solve();
        System.out.println();

        Task4 task4 = new Task4();
        System.out.println("Задание №4.");
        task4.solve();
        System.out.println();

        Task5 task5 = new Task5();
        System.out.println("Задание №5.");
        task5.solve();
    }
}