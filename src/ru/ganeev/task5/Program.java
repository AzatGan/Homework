package ru.ganeev.task5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program{
    private static final Logger logger = Logger.getLogger(Program.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Начало работы");

        VendingMachine VM = new VendingMachine(new Drink[]{new Drink("Cola", 50, 10),
                new Drink("Tea", 15, 10),
                new Drink("Water", 5, 10)});

        Scanner sc = new Scanner(System.in);
        System.out.println("Внесите деньги и выберите напиток.");


       while (true){
           int drinkId = 1;
           do{
               logger.log(Level.INFO,"Вывод меню");
               VM.showmenu();
               System.out.println("Выберите напиток.");

               logger.log(Level.INFO,"Выбор напитков");
               logger.log(Level.INFO,"Понимает только три цифры 0, 1, 2!");

               try {
                   drinkId = sc.nextInt();
               }catch (InputMismatchException exception){
                   System.out.println("Необходимо ввести число!");
                   drinkId = 1;
               }
           }while (!VM.selectedSDrink2(drinkId));


           do{
               System.out.println("Внесите средства.");
               int money = sc.nextInt();
               VM.inputMoney(money);
           }
           while (!VM.tryToBuy());
           logger.log(Level.SEVERE, "При вводе букв происходит выход из программы");
       }
    }

}
