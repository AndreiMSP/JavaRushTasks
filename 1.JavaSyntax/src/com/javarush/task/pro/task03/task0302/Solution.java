package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //System.out.print("Введите ваше имя: ");
        Scanner console = new Scanner (System.in);
        String name = console.nextLine();
        //System.out.print("Ваш возраст: ");
        int age = console.nextInt();
        if (age >= 18 && age <= 28)
            System.out.print(name + militaryCommissar);
        //else ;
        //напишите тут ваш код
    }
}
