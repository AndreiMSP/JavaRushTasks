package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] months = Month.values();
        if (month.ordinal() == 11) {
            return Month.JANUARY;
        } else {
            int num = month.ordinal() + 1;
//            Month[] values = Month.values();
//            Month value = values[num];
            //System.out.println(values.length);
            //System.out.println(Month.values()[num]);
            return Month.values()[num];
        }


    }

}
