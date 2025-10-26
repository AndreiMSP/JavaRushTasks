package com.javarush.task.pro.task15.task1516;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();

        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2.isBlank()) {
                return;
            }
            Path path = Path.of(line2);
            if (Files.isRegularFile(path)) {
                System.out.println(line2 + THIS_IS_FILE);
            } else if (Files.isDirectory(path)) {
                System.out.println(line2 + THIS_IS_DIR);
            } else {
                return;
            }
        }
    }
}

