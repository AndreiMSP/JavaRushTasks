package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner entr = new Scanner(System.in);
        double x1 = entr.nextDouble();
        double x2 = entr.nextDouble();
        if (Math.abs(x2 - x1) < 0.000001)

        //напишите тут ваш код
        System.out.println("числа равны");
        else
        //напишите тут ваш код
        System.out.println("числа не равны");
    }
}
