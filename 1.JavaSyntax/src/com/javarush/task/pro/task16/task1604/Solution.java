package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1985, Calendar.FEBRUARY, 3);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        
    }

    static String getDayOfWeek(Calendar calendar) {
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        if (day == 1) {
            return "Воскресенье";
        } else if (day == 2) {
            return "Понедельник";
        } else if (day == 3) {
            return "Вторник";
        } else if (day == 4) {
            return "Среда";
        } else if (day == 5) {
            return "Четверг";
        } else if (day == 6) {
            return "Пятница";
        } else if (day == 7) {
            return "Суббота";
        } else return null;


    }
}
