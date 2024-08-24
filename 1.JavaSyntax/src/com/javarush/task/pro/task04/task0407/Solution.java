package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int number = 0;
        int summ = 0;
        while (number < 100) {
            number++;
            if ((number % 3) == 0) {
                continue;
            }
            summ = summ + number;
        }
        System.out.println(summ);
    }

}
