package com.javarush.task.pro.task06.task0605;

/*
Правильный порядок
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);

        int sum = sum(10, 15);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void method(String string, int number) {

    }

    public static void method(int number, String string) {

    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
