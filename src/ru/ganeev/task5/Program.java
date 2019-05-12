package ru.ganeev.task5;

import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        VendingMachine VM = new VendingMachine(new Drink[]{new Drink("Cola", 50, 10),
                new Drink("Tea", 15, 10),
                new Drink("Water", 5, 10)});

        Scanner sc = new Scanner(System.in);
        System.out.println("Внесите деньги и выберите напиток.");

        while (true) {
            VM.showmenu();
            int drinkId = 0; //считаешь со сканера
            drinkId = sc.nextInt();
            do {
                int money = sc.nextInt() ; //считаешь со сканера
                VM.inputMoney(money);
            }
            while (!VM.tryToBuy(drinkId));
        }
    }

}
