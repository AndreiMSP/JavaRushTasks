package test;

import com.javarush.task.pro.task10.task1011.Car;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\Programming\\JavaRushTasks\\1.JavaSyntax\\src\\test\\file.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> list = new ArrayList<>();
        while (bufferedReader.ready()) {
            String string = bufferedReader.readLine();
            if (!string.isEmpty()) {


                list.add(string);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
