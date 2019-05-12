package ru.ganeev.task7;

public class Cat extends Animal implements Running {
    @Override
    public void getName() {
        System.out.println("Cat");
    }

    @Override
    public void run() {
        System.out.println("Сan run");
    }
}
