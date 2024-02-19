package com.accenture.excercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class fourthTask {
    public static void main(String[] args) throws IOException{
        String path1 = "C:/Users/tim.a.maier/Documents/asdf_asdf.txt";
        String path2 = "C:/Users/tim.a.maier/Documents/as_asdf.txt";
        readFile(path1);
        readFile(path2);
    }

    public static void readFile(String path) {
        File file = new File(path);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
