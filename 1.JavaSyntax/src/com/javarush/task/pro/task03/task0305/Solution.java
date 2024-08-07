package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int number1 = entrance.nextInt();
        int number2 = entrance.nextInt();
        int number3 = entrance.nextInt();

        if (number1 == number2 && number1 == number3 && number2 == number3) {
            System.out.print(number1 + " " + number2 + " " + number3);
        } else if (number1 == number3)
            System.out.print(number1 + " " + number3);
        else if (number2 == number3)
            System.out.print(number2 + " " + number3);
        else if (number1 == number2)
            System.out.print(number1 + " " + number2);


        //напишите тут ваш код
    }
}
