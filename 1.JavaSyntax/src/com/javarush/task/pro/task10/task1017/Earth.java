package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        SouthAmerica southAmerica = new SouthAmerica(100);
        NorthAmerica northAmerica = new NorthAmerica(120);
        Eurasia eurasia = new Eurasia(300);
        Australia australia = new Australia(55);
        Antarctica antarctica = new Antarctica(99);
        Africa africa = new Africa(115);
    }
}
