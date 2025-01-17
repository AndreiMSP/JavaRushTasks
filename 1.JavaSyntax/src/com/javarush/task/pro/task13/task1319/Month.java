package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] winterMonths = new Month[3];
        winterMonths[0] = DECEMBER;
        winterMonths[1] = JANUARY;
        winterMonths[2] = FEBRUARY;

        return winterMonths;
    }

    public static Month[] getSpringMonths() {
        Month[] values = values();
        Month[] springMonths = Arrays.copyOfRange(values, 2, 5);
        return springMonths;
    }
    public static Month[] getSummerMonths() {
        Month[] values = values();
        Month[] summerMonths = Arrays.copyOfRange(values, 5, 8);
        return summerMonths;
    }
    public static Month[] getAutumnMonths() {
        Month[] values = values();
        Month[] autumnMonth = Arrays.copyOfRange(values, 8, 11);
        return autumnMonth;
    }

    public static void main(String[] args) {
        Month[] winterMonth = getWinterMonths();
        System.out.println(Arrays.toString(winterMonth));
        System.out.println(Arrays.toString(getSpringMonths()));
        System.out.println(Arrays.toString(getSummerMonths()));
        System.out.println(Arrays.toString(getAutumnMonths()));

    }

}
