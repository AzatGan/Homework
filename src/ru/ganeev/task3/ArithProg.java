package ru.ganeev.task3;

public class ArithProg {
    public static void main(String[] args) {
        for (int i = 0, n = 0; i < 100; i = i + 8) {
            int a = n + i;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 1, n = 1; i < 1000; i = i*2) {
            int a = n * i;
            System.out.print(a + " ");
        }
    }
}
