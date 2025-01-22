package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.toLowerCase().equals("понедельник")) {
            System.out.print(ru + " - ");
            en = "Monday";
        } else if (ru.toLowerCase().equals("вторник")) {
            en = "Tuesday";
            System.out.print(ru + " - ");
        } else if (ru.toLowerCase().equals("среда")) {
            System.out.print(ru + " - ");
            en = "Wednesday";
        } else if (ru.toLowerCase().equals("четверг")) {
            System.out.print(ru + " - ");
            en = "Thursday";
        } else if (ru.toLowerCase().equals("пятница")) {
            System.out.print(ru + " - ");
            en = "Friday";
        } else if (ru.toLowerCase().equals("суббота")) {
            System.out.print(ru + " - ");
            en = "Saturday";
        } else if (ru.toLowerCase().equals("воскресенье")) {
            System.out.print(ru + " - ");
            en = "Sunday";
        } else {
            System.out.print(ru + " - ");
            en = "Недействительный день недели";
        }
        return en;
    }

}