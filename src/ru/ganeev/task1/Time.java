package ru.ganeev.task1;

public class Time {
    public static int convertToHour(int sec){
        return sec / 3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToHour(7200)+ " часа.");
    }
}
