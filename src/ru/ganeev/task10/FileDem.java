package ru.ganeev.task10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDem {
    public static void main(String[] args) {
        File fileorig = new File("filetest.txt");
        try{
            System.out.println("Создан файл" + " "+ fileorig.createNewFile());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

//        File fileorig1 = new File("/task10/filetest.txt");
//        System.out.println(fileorig1.getAbsolutePath());

        File dir1 = new File("dir1");
        System.out.println("Создана директория " + " " + dir1.mkdir());

       // Files.createFile();
        Path source = Paths.get(fileorig.getAbsolutePath());
        Path destination = Paths.get("dir1/filetest.txt");
        try{
            Files.copy(source, destination);
            System.out.println("Копирование завершено");
        }catch (IOException i){
            System.out.println("Копирование не удалось");
        }


        System.out.println(fileorig.getName() + fileorig.delete());
        recursiveDel(dir1);
        System.out.println("Всё каталоги удалены");

    }
    private static void recursiveDel(File dir){
        File[]files = dir.listFiles();
        for (File file: files){
            if(file.isFile()){
                file.delete();
                System.out.println("Файл <" + file + "> удален ");
            }else {
                recursiveDel(file);
            }
        }
        dir.delete();
        System.out.println("Каталог <" + dir + "> удалён");
    }
}
