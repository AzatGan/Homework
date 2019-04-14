package ru.ganeev.task2;

import java.util.Scanner;

public class GameHotCold {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int n = s.nextInt();
        do{
            //for (;;);
            if (n>=25&&n<=49)
            System.out.println("Горячо");
            n = s.nextInt();
            if (n<=24&&n>0)
                System.out.println("Холодно");
            n = s.nextInt();
        }while (n!=50);
        System.out.println("Вы выйграли");
    }
}