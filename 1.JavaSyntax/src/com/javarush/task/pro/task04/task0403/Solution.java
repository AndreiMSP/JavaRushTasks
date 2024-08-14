package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int x = 0;
        boolean ent = false;

        while (!ent) {
            if (vvod.hasNextInt()) {
                int tt = vvod.nextInt();
                x = x + tt;
            } else if (vvod.hasNextLine()) {
                String tt1 = vvod.nextLine();
                if (tt1.equals("ENTER")) {
                    ent = true;}

                }
            }
        System.out.println(x);

            //напишите тут ваш код

        }

    }
