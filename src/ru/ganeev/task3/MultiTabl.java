package ru.ganeev.task3;

public class MultiTabl {
    public static void main(String[] args) {
        for (int i = 1; i < 11 ; i++) {
            for(int n = 1; n < 11; n++){
                System.out.printf("%3d ", i * n);
            }
            System.out.println();
        }
    }
}
