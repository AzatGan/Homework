package ru.ganeev.task1;

import java.util.Scanner;

public class PayDay {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("Введите данные:");
        int a = n.nextInt();
        System.out.println("Сумма на руки: " + (a - a / 100 * 13));
    }
}
