package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int s1 = entrance.nextInt();
        int s2 = entrance.nextInt();
        int s3 = entrance.nextInt();
        if (s1 < s2 +s3 & s2 < s1 + s3 & s3 < s1 + s2)
            System.out.println (TRIANGLE_EXISTS);
        else if (s1 >= s2 +s3 | s2 >= s1 + s3 | s3 >= s1 + s2)
            System.out.println (TRIANGLE_NOT_EXISTS);
        //напишите тут ваш код
    }
}
