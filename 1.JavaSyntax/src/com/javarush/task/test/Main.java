package com.javarush.task.test;

public class Main {
    public static void main(String[] args) {
        Car orangeCar = new Car();
        orangeCar.km = 100;

        Car blueCar = new Car();
        blueCar.km = 85;
        Car blueCar1 = new Car();
        Car blueCar2 = new Car();
        Car blueCar3 = new Car();

        System.out.println("Orange car - " + orangeCar.km);
        System.out.println("Blue car - " + blueCar.km);
        System.out.println("Blue car - " + blueCar1.km);
        System.out.println("Blue car - " + blueCar2.km);
        System.out.println("Blue car - " + blueCar3.km);

    }
}
class Car {
     int km;
}