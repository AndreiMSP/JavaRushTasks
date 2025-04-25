package test;

public class Runner {
    private static int count = 0;

    public  void startRun() {
        count++;
        System.out.println("start run");

    }

    public  void stop() {
        count++;
        System.out.println("stop");
    }

    public static int getCount() {
        return count;
    }
}
