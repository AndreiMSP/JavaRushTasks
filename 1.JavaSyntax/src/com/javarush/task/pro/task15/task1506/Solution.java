package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        Path path = Paths.get(fileName);

        List<String> list = Files.readAllLines(path);
        for (String string : list) {
            String newStr = string.replaceAll("[ .,]", "");
            System.out.println(newStr);
        }
    }
}

