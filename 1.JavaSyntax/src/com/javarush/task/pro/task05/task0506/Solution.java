package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        array = new int[number];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < number; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(min);
    }

}

