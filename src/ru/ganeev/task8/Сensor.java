package ru.ganeev.task8;

public class Сensor {
    public static void main(String[] args) {
        String s = "Вот ты бяка какая!";
        String s2 = s.replaceAll("бяка", "вырезано цензурой");
        System.out.println(s2);
    }
}
