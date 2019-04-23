package ru.ganeev.task3;

import java.util.Scanner;

public class ArithProg {
    public static void main(String[] args) {

        /*for (int i = 0, n = 0; i < 100; i = i + 8) {
            int a = n + i;
            System.out.print(a + " ");
        }
        System.out.println();*/
        /*for (int i = 1, n = 1; i < 1000; i = i*2) {
            int a = n * i;
            System.out.print(a + " ");
        }*/
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a = 1;
        b = 1;
        c = 100;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        for (int i = 0; i < c ; i++) {
            int AP = (i*b) + a;
            System.out.print (AP + " ");

        }
    }
}
