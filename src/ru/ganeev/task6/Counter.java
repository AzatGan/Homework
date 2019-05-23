package ru.ganeev.task6;

public class Counter {
    public static int objCounter = 0;
    public Counter(){
        objCounter++;
    }


    public static void main(String[] args) {
        Counter one = new Counter();
        Counter two = new Counter();
        System.out.println("Созданных объектов:" + Counter.objCounter);

    }

}
