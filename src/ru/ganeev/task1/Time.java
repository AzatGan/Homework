package ru.ganeev.task1;

public class Time {
    public static int convertSecTHour (int sec){
        return sec/3600;
    }
    public static String rec(int n){
        if(n==1){
            return "1";
        }
        return rec(n-1)+" "+n;
    }
    public static void main(String[] args) {

        System.out.println(convertSecTHour(3600) + " час.");
        System.out.println(rec(10));

    }
}
