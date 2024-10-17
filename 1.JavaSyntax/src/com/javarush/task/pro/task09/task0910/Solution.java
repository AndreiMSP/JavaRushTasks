package com.javarush.task.pro.task09.task0910;

/* 
Кодировка Unicode
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));

    }

    public static void init(char[] symbols) {
        //напишите тут ваш код
        String string = '©' + "" + 'J' + 'a' + 'v' + 'a' + 'R' + 'u' + 's' + 'h';
        System.arraycopy(string.toCharArray(), 0, symbols, 0, symbols.length);
    }
}
