package com.javarush.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

/* 
Пишем байты в файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String str = args[0];
        byte[] bytes = str.getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             /*BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))*/) {
//            bufferedWriter.write(bytes);
            Files.write(Path.of(scanner.nextLine()), bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

