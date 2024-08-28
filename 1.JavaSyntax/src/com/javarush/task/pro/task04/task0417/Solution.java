package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedWindMS = scanner.nextInt();
        int speedWindKMh = (int) Math.round(speedWindMS * 3.6);
        System.out.println(speedWindKMh);

    }
}