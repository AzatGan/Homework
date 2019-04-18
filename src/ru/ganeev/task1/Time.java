package ru.ganeev.task1;

public class Time {
    public static int convertSecTHour (int sec){
        return sec/3600;
    }
    public static void main(String[] args) {
        System.out.println(convertSecTHour(3600) + " час.");
    }
}
