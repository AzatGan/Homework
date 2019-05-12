package ru.ganeev.task7;

public class Dog extends Animal implements Running, Swimming {
    @Override
    public void getName() {
        System.out.println("Dog");
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
