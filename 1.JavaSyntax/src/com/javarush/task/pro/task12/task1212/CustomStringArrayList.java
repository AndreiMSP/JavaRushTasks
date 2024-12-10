package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.ArrayList;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        this.capacity = capacity + capacity / 2;
        String[] elementsNew = new String[this.capacity];
        for (int i = 0; i < elements.length; i++) {
            elementsNew[i] = elements[i];
        }
        elements = elementsNew;

    }

    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
        ;
    }
}
