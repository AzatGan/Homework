package ru.ganeev.task9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mother {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            try {
                String h =br.readLine();
                Food.valueOf("APPLE");
                System.out.println("Thanks very tasty!");
            }
            catch (Exception e) {
                // Food.valueOf("CARROT");
                System.out.println("Thanks MOM.");
                e.printStackTrace();
            }
    }
}
