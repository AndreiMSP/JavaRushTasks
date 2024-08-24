package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int temp = 0;
            int number = scanner.nextInt();
            if (number < min) {
                temp = min;
                min = number;
                secondMin = temp;
            } else if ((number > min) && (number < secondMin)) {
                secondMin = number;
            } else if (min > secondMin) {
                temp = min;
                secondMin = min;
                min = temp;
            }
        }
        System.out.println(secondMin);
    }
}

