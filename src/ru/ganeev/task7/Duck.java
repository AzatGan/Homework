package ru.ganeev.task7;

public class Duck extends Animal implements Flyable, Running, Swimming {
    @Override
    public void getName() {
        System.out.println("Duck");
    }

    @Override
    public void fly() {
        System.out.println("Сan fly");
    }

    @Override
    public void run() {
        System.out.println("Сan run");
    }

    @Override
    public void swim() {
        System.out.println("Сan swim");
    }
}
