package ru.ganeev.task2;

import java.util.Scanner;

public class GameHotCold {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int randomNum = (int) (Math.random()*10);
        System.out.println("Введите число");
        while (s.hasNextInt()){
            int n = s.nextInt();
            if (n > randomNum)
                System.out.println("Горячо");
            else
                System.out.println("Холодно");
            if (n == randomNum)
                System.out.println("Вы отгадали!");
        }
    }
}