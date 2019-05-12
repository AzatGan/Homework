package ru.ganeev.task7.Human;

public interface Running {
    default   void run(){
        System.out.println("I can run");
    }
    default   void runFaster (){
        System.out.println("I can run faster");
    }
}
