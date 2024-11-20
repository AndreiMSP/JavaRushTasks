package com.javarush.task.pro.task11.task1128;

/* 
Текстовые цифры
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        if (digit == '0') {
            result = "ноль";
        } else if (digit == '1') {
            result = "один";
        } else if (digit == '2') {
            result = "два";
        } else if (digit == '3') {
            result = "три";
        } else if (digit == '4') {
            result = "четыре";
        } else if (digit == '5') {
            result = "пять";
        } else if (digit == '6') {
            result = "шесть";
        } else if (digit == '7') {
            result = "семь";
        } else if (digit == '8') {
            result = "восемь";
        } else if (digit == '9') {
            result = "девять";
        }
        return result;
    }
}
