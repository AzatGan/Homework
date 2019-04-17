package ru.ganeev.task3;

public class ArithProg {
    public static void main(String[] args) {

        for(int i=0, n =0; i<100;i=i+8) {
            int a = n+i;
            System.out.print(a + " ");
        }
        System.out.println();
        for(int b=1, c=1; b<1000; b =b *2){
            int d = c*b;
            System.out.print(d + " ");
        }
    }
}
