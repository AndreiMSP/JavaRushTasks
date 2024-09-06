package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        String[] array = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
            array[i] = strings[i];
        }
        for (int i = 0; i < (strings.length); i++) {
            for (int j = 0; j < (array.length); j++) {

                if ((array[i] != null) && (strings[i].equals(strings[j]) && (i != j))) {
                    array[i] = null;
                }
            }
            System.out.print(array[i] + ", ");
        }
    }
}

