package ru.ganeev.task9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mother {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        EducatedPerson child = new EducatedPerson();
        while (true) {
            String h = "";
            try {

                h = br.readLine();
                h = h.toUpperCase();
                Food food = Food.valueOf(h);
                child.eat(food);

            }catch (IllegalArgumentException i ) {
                System.out.println("it's not food [" + h +"]");
            }catch (Exception e){
                System.out.println("Thanks mom.");
            }
        }
    }
}
