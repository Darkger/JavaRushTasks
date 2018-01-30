package com.javarush.task.task16.task1622;

/* 
Последовательные выполнения нитей
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        int kolvsimvolov =11;
        int probel = ' ';
        int summ=7;

        double reuslt=(summ/((double)kolvsimvolov))*100;
        System.out.println(String.format("%.2f",reuslt));

    }
}