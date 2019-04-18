package ru.ganeev.task3;

import java.util.Scanner;

public class NumDetec {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNextInt()){
            int n = x.nextInt();
            boolean pos = n > 0;
            boolean neg = (n % 2 == 0);

            if(pos)
                System.out.print("Положительное ");
            else
                System.out.print("Отрицтельное ");
            if(neg)
                System.out.println("четное число.");
            else
                System.out.println("нечетное число.");
        }
    }
}
