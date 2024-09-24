package test;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void method(String string) {
        System.out.println(string.length());
    }
    public static void start() {
        method("Hello World");

    }
}
