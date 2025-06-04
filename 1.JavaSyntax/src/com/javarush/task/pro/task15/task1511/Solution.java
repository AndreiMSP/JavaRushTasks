package com.javarush.task.pro.task15.task1511;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* 
Пишем символы в файл
*/

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
//            Files.write(Path.of(scanner.nextLine()), chars);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()));
            bufferedWriter.write(chars);
bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


