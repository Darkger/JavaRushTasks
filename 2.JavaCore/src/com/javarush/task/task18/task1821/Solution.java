package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        String a = args[0];
        FileInputStream fstream = new FileInputStream(a);

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (fstream.available()>0)
       {
            list.add(fstream.read());


       }
        Collections.sort(list);
        int prom=list.get(0);
        System.out.println((char)prom+" "+ Collections.frequency(list,prom));
        for (int i =1; i<list.size();i++)
        {
            if (prom ==list.get(i))
            {
                prom=list.get(i);
            }
            else {
                prom = list.get(i);

                System.out.println((char)prom + " " + Collections.frequency(list, prom));
            }
        }
      fstream.close();
    }
}
