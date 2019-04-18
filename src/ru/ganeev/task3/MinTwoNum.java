package ru.ganeev.task3;

import java.util.Scanner;

public class MinTwoNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа:");
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        if(a < b)
            System.out.println("Минимальное число: " + a);
        else
            System.out.println("Минимальное число: " + b);
    }
}
