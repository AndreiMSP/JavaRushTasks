package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = scanner.nextInt();
        int i = 0;
        if ((number <= 0) || (number >= 5)) {
            System.out.println(line);
        } else
            do {
                System.out.println(line);
                i++;

            }
            while (i != number);
    }
}