package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        int good = (int) Math.ceil(glass);
        int bad = (int) Math.floor(glass);
        boolean state = scanner.nextBoolean();
        if (state == true) {
            System.out.println(good);
        } else if (state == false) {
            System.out.println(bad);
        }

    }
}