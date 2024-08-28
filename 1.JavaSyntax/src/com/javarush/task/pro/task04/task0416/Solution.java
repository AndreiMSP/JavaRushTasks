package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCanOfSoda = scanner.nextInt();
        int numberPeople = scanner.nextInt();
        System.out.println(numberCanOfSoda * 1.0 / numberPeople);

    }
}