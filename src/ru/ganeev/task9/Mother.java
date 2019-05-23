package ru.ganeev.task9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mother {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Mother mother = new Mother();
            try {
                String h =br.readLine();
                Food food = Food.valueOf(h);
            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("Thanks MOM.");
            }

    }
}
