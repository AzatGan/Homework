package ru.ganeev.task6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        double i =sc.nextDouble();
        String a = sc.next();
        double j =sc.nextDouble();
        Calculator cal = new Calculator();

        double res = cal.sum(i,j);
        double res1 = cal.sub(i,j);
        double res2 = cal.mult(i,j);
        double res3 = cal.div(i,j);
        double res4 = cal.per(i, j);

        if (a.equals("+")){
            System.out.println(res);
        }
        if(a.equals("-")){
            System.out.println(res1);
        }
        if(a.equals("*")){
            System.out.println(res2);
        }
        if (a.equals("/")){
            System.out.println(res3);
        }
        if(a.equals("%")){
            System.out.println(res4);
        }


    }
    static double sum (double i , double j){
        return i +j;
    }
    static double sub(double i, double j){
        return i - j;
    }
    static double mult (double i, double j){
        return i * j;
    }
    static double div (double i, double j){
        return i / j;
    }
    static double per (double i, double j){
        return i / 100 * j;
    }
}
