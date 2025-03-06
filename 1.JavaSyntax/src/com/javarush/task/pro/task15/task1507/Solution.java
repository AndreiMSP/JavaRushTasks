package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        Path path = Paths.get(fileName);

        List<String> list = Files.readAllLines(path);

        for (String string : list) {
            if (string==1) {
                break;
            } else {
                System.out.println(string);
            }
        }
    }
}

