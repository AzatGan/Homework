package ru.ganeev.task7.Human;

public interface Swimming {
    default void swimBreaststroke (){
        System.out.println("I can swim breaststroke");
    }
    default void swimСrawl(){
        System.out.println("I can swim crawl");
    }
}
