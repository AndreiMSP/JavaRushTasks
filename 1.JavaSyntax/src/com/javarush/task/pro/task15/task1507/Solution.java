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

        for (int i = 0; i < list.size(); i = i + 2) {

            System.out.println(list.get(i));

        }
    }
}

