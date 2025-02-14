package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        System.out.println(stackTrace.length);
        for (int i = 0; i < stackTrace.length; i++) {
            StackTraceElement element = stackTrace[i];
            String methodName = element.getMethodName();
            int lineNumber = element.getLineNumber();
            String className = element.getClassName();
            String fileName = element.getFileName();
            System.out.printf(OUTPUT_FORMAT, methodName, lineNumber, className, fileName);
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
