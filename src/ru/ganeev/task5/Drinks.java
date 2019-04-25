package ru.ganeev.task5;

import java.util.Arrays;

public class Drinks {
     String[] name;
     int[] prise;

    @Override
    public String toString() {
        return "Drinks{" +
                "name=" + Arrays.toString(name) +
                ", prise=" + Arrays.toString(prise) +
                '}';
    }

    public Drinks(String[] name, int[] prise) {
        this.name = name;
        this.prise = prise;


    }
}
