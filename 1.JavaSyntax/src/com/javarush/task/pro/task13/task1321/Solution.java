package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.equalsIgnoreCase("понедельник")) {
            System.out.print(ru + " - ");
            en = "Monday";
        } else if (ru.equalsIgnoreCase("вторник")) {
            en = "Tuesday";
            System.out.print(ru + " - ");
        } else if (ru.equalsIgnoreCase("среда")) {
            System.out.print(ru + " - ");
            en = "Wednesday";
        } else if (ru.equalsIgnoreCase("четверг")) {
            System.out.print(ru + " - ");
            en = "Thursday";
        } else if (ru.equalsIgnoreCase("пятница")) {
            System.out.print(ru + " - ");
            en = "Friday";
        } else if (ru.equalsIgnoreCase("суббота")) {
            System.out.print(ru + " - ");
            en = "Saturday";
        } else if (ru.equalsIgnoreCase("воскресенье")) {
            System.out.print(ru + " - ");
            en = "Sunday";
        } else {
            System.out.print(ru + " - ");
            en = "Недействительный день недели";
        }
        return en;
    }

}