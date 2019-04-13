package ru.ganeev.task1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите секунды:");
        float c = n.nextInt();
        System.out.println("Конвертация завершена: " + (c / 3600) + " ч.");
    }
}
