package com.javarush.task.pro.task05.task0505;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    {
        int[] array = new int[10];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();
        int[] array = new int[numberN];
        if (numberN > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }
        if (numberN % 2 == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }

        }


    }
}

