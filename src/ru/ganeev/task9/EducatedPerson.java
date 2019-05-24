package ru.ganeev.task9;

public class EducatedPerson {
    public static void eat(Food food) throws Exception{
        switch (food){
            case MASH:
            case CARROT:
                throw new Exception();
                default:
                    System.out.println("Thanks very tasty!");
        }
    }
}
