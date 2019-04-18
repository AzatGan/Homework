package ru.ganeev.task2;

import java.util.Scanner;

public class PayDays {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        System.out.println("Введите данные:");
        int a = n.nextInt();
        a = (a-a/100*13);
        System.out.println("Сумма на руки: " + a);
    }
}
