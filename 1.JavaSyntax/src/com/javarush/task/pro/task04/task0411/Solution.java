package com.javarush.task.pro.task04.task0411;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        for (int number = 1; number < 15; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }

        }
    }
}