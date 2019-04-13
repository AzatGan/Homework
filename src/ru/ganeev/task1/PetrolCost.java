package ru.ganeev.task1;

import java.util.Scanner;

public class PetrolCost {
    public static void main(String[] args) {
        int lPet = 43;
        Scanner x = new Scanner (System.in);
        System.out.println("Введите объём в литрах.");
        int volume = x.nextInt();
        System.out.println("К оплате " + lPet * volume + " руб.");
        System.out.println("Спасибо за покупку! Ждём вас снова!");
    }
}
