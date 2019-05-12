package ru.ganeev.task7;

public class Pigeon extends Animal implements Flyable{
    @Override
    public void getName() {
        System.out.println("Pigeon");
    }

    @Override
    public void fly() {
        System.out.println("Сan fly");
    }
}
