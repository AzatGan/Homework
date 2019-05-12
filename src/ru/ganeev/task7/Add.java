package ru.ganeev.task7;

public class Add {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Duck duck = new Duck();
        Cat cat = new Cat();
        Pigeon pigeon = new Pigeon();

        dog.getName();
        dog.run();
        dog.swim();

        duck.getName();
        duck.fly();
        duck.run();
        duck.swim();

        cat.getName();
        cat.run();

        pigeon.getName();
        pigeon.fly();
    }
}
