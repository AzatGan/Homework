package ru.ganeev.task2;

import java.util.Scanner;

public class PetrolCosts {
    public static void main(String[] args) {
        int lPet = 43;
        Scanner x = new Scanner(System.in);
        System.out.println("Введите объём в литрах:");
        int volume = x.nextInt();
        System.out.println("К оплате " + lPet * volume + " руб.");
    }
}
