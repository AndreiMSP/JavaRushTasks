package com.javarush.task.pro.task15.task1519;


import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : paths) {
                //System.out.println(path);
               // System.out.println(targetDirectory.resolve(path.getFileName()));
                if (Files.isRegularFile(path)) {
                    Files.copy(path, targetDirectory.resolve(path.getFileName()));
                }
            }


        }
    }
}

