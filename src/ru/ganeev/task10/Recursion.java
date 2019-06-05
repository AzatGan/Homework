package ru.ganeev.task10;

import java.io.File;
import java.io.IOException;

public class Recursion {
    public static void main(String[] args) throws IOException {
        System.out.println("Создана иерархия директорий и каталогов.");

        new File("direct/direct1/direct2").mkdirs();
        System.out.println("Созданы директории");
        new File("direct/A.txt").createNewFile();
        System.out.println("Создан файл A");
        new File("direct/direct1/B.txt").createNewFile();
        System.out.println("Создан файл B");
        new File("direct/direct1/direct2/C.txt").createNewFile();
        System.out.println("Создан файл C");


        File dir = new File("dir");
        recursionMet(dir);
        System.out.println("Все директории обнаружены");

    }
    private  static void recursionMet(File dir){
        File[] files = dir.listFiles();
        if (files!=null)
        for (File file: files){
            if (!file.isDirectory()){
                file.getAbsolutePath();
                System.out.println("файл <" + file.getAbsolutePath() + "> обнаружен");
            }else {
                recursionMet(file);
            }
        }
        dir.getAbsolutePath();
        System.out.println("директория <" + dir.getAbsolutePath() + "> обнаружена");
    }
}
