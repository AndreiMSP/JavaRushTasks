package com.javarush.task.pro.task10.task1020;

public class Computer {
    public  SystemUnit systemUnit;
    protected Computer() {
        this.systemUnit = new SystemUnit();
        //SystemUnit systemUnit = new SystemUnit();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
    }

}
