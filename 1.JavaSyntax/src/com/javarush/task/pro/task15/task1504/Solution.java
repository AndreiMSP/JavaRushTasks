package com.javarush.task.pro.task15.task1504;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        try (InputStream inputStream = Files.newInputStream(Path.of(fileName1));
             OutputStream outputStream = Files.newOutputStream(Path.of(fileName2))) {
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (int i = 0; i < bytes.length; i = i + 2) {
                if (i < bytes.length - 1) {
                    byte temp = bytes[i];
                    bytes[i] = bytes[i + 1];
                    bytes[i + 1] = temp;
                }

                }
                System.out.println(Arrays.toString(bytes));

                outputStream.write(bytes);


            }

        }
    }

