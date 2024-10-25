package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index = path.indexOf("jdk");
        String string = path.substring(0, index);
        int indexEnd = path.indexOf("/bin");
        String string1 = path.substring(indexEnd);
        return string + jdk + string1;

        // return path.replaceAll("jdk.*?",jdk + "/");
    }
}
