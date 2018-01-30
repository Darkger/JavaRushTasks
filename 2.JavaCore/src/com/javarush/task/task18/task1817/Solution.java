package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
String a = args[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        FileInputStream fstream = new FileInputStream(a);
int kolvsimvolov =fstream.available();
int probel = ' ';
int summ=0;
while (fstream.available()>0)
{
   if (fstream.read()==probel)
       summ++;
}
double reuslt=(summ/((double)kolvsimvolov))*100;
        System.out.println(String.format("%.2f",reuslt));
fstream.close();
    }
}
