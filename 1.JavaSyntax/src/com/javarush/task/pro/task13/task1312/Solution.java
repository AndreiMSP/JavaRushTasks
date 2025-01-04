package com.javarush.task.pro.task13.task1312;

import java.util.HashMap;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        HashMap<Integer,String> prog = new HashMap<>();
        //ArrayList<String> programmingLanguages = new ArrayList<>();
        prog.put(0,"Java");
        prog.put(1,"Kotlin");
        prog.put(2,"Go");
        prog.put(3,"Javascript");
        prog.put(4,"Typescript");
        prog.put(5,"Python");
        prog.put(6,"PHP");
        prog.put(7,"C++");
        return prog;
    }

}
