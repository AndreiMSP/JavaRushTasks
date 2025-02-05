package com.javarush.task.pro.task14.task1406;

import java.util.Scanner;

/* 
Купи слона
*/

class Solution {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        try {
            buyElephant(null, scanner);
        } catch (Exception ignore) {

        }
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new RuntimeException();

        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }

    }

}
