package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner name = new Scanner(System.in);
        int number1 = name.nextInt();
        int number2 = name.nextInt();
        int number3 = name.nextInt();
        int summ = (number1+number2+number3) / 3;

        System.out.println(summ);

    }
}
