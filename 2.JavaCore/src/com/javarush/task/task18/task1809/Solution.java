package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        FileInputStream fstream = new FileInputStream(reader.readLine());
        FileOutputStream fstream2 = new  FileOutputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (fstream.available()>0)
        {
            list.add(fstream.read());
        }
        for (int i= list.size()-1;i>=0 ;i--)
        {
            fstream2.write(list.get(i));
        }
        fstream.close();
        fstream2.close();


    }
}
