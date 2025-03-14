package com.javarush.task.pro.task12.task1209;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary(null);
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);

    }

    public static void paySalary(String name) {
        if (name == null) {
            return;
        }
        for (int i = 0; i < waitingEmployees.size(); i++) {
            if (waitingEmployees.get(i).equals(name)) {
                alreadyGotSalaryEmployees.add(name);
                int index = waitingEmployees.indexOf(name);
                waitingEmployees.set(index, null);
            }

        }

    }
}
