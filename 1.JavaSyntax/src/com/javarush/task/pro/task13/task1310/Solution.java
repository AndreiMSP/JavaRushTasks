package com.javarush.task.pro.task13.task1310;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/* 
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String string : grades.keySet()) {

            System.out.println(string);

        }//System.out.println(grades.keySet());


    }

    public static Double getAverageMark() {
        double summ = 0;
        for (String string : grades.keySet()) {
            Double value = grades.get(string);
            summ = summ + value;
            // System.out.println(value);
        }

        Double average = summ / grades.size();
        return average;

        //return grades.values().stream().mapToDouble(d -> d).average().orElseThrow();
    }
}
