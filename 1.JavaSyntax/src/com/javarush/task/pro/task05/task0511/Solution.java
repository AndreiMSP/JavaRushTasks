package com.javarush.task.pro.task05.task0511;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        multiArray = new int[number][];
        //System.out.println(Arrays.deepToString(multiArray));
        for (int i = 0; i < number; i++) {
            int rowNumber = scanner.nextInt();
            multiArray[i] = new int[rowNumber];
        }
        System.out.println(Arrays.deepToString(multiArray));

    }
}
