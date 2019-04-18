package ru.ganeev.task2;

import java.util.Scanner;

public class Times {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите секунды:");
        float c = n.nextInt();
        c = c / 3600;
        System.out.println("Конвертация завершина: " + c + " ч.");
    }
}
