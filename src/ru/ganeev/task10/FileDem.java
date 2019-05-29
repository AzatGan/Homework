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
            System.out.println(fileorig.createNewFile());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        File fileorig1 = new File("..\\task10\\filetest/txt");
        System.out.println(fileorig1.getAbsolutePath());

        File dir1 = new File("..\\Homework\\dir1");
        System.out.println(dir1.mkdir());

       // Files.createFile();
        Path source = Paths.get("C:\\Users\\AZAT\\IdeaProjects\\Homework\\..\\task10\\filetest\\txt");
        Path destination = Paths.get("C:\\Users\\AZAT\\IdeaProjects\\Homework\\dir1");
        try{
            Files.copy(source, destination);
            System.out.println("file copied");
        }catch (IOException i){
            System.out.println(i.getMessage());
        }


        System.out.println(fileorig.getName() + fileorig.delete());
    }
}
