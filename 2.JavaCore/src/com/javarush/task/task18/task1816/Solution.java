package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
 String a =args[0];
        FileInputStream fstream = new FileInputStream(a);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (fstream.available()>0)
        {
         list.add(fstream.read());
        }
        int summ=0;
        int [] angl = new int []{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       for (int i=0 ; i<angl.length;i++)
       {
       summ=Collections.frequency(list,angl[i])+summ;
       }
        System.out.println(summ);
       fstream.close();
    }
}
