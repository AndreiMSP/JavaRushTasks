package com.javarush.task.pro.task13.task1301;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* 
Оформляем возврат
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "я","буду", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        Set<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static Set<String> arrayToHashSet(String[] strings) {
        Set<String> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            hashSet.add(str);


        }
        return hashSet;
    }
}

