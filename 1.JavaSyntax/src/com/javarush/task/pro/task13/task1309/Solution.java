package com.javarush.task.pro.task13.task1309;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {

    grades.put("Иванов", 5.0);
    grades.put("Петров",4.0);
    grades.put("Козлов",3.9);
    grades.put("Шмелев",4.7);
    grades.put("Попов",4.4);
    }
}
