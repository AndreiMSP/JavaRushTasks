package com.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Почувствуй себя деканом
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        ArrayList<String> strings = new ArrayList<>(students);
        for (int i = 0, stringsSize = strings.size(); i < stringsSize; i++) {
            String student = strings.get(i);
            if (student.equals(excludedStudent)) {

                students.remove(student);

            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}