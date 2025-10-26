package com.javarush.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Две реализации одного интерфейса
*/

public class Solution extends Car{
    public static ArrayList<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Object object) {
        list.add(object);
    }

    public static void runList() {
        //напишите тут ваш код
        for (Object object : list) {

        }
    }
}