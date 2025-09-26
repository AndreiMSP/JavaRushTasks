package com.javarush.task.pro.task16.task1606;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog();
        dog2.age = 4;
        dog.age = 9;
        int n = dog.runToCat("Cat");
        int cat1 = dog.runToCat("Cat1");

    }
}
