package ru.ganeev.task9;

public class EducatedPerson {
    public static void eat(Food food) throws Exception{
        if (food==Food.MASH)throw new Exception("Thanks MOM.");
        System.out.println("Thanks very tasty");
    }
}
