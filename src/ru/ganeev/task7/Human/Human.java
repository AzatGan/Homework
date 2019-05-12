package ru.ganeev.task7.Human;

public abstract class Human implements Running, Swimming {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        Runner runner = new Runner();

        swimmer.swimBreaststroke();
        runner.runFaster();
    }
}
