package com.javarush.task.task18.task1804;




import java.io.Reader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fname = reader.readLine();
        FileInputStream fstream = new FileInputStream(fname);
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int prom =0;
 while (fstream.available()<0)
 {
     int key = fstream.read();
     if (hashMap.containsKey(key))
     {
         int value = hashMap.get(key);
         value++;
         hashMap.replace(key,value);
     }
     else
     {
         hashMap.put(key,1);
     }
     prom = hashMap.get(key);
 }

 for (HashMap.Entry<Integer,Integer> pair : hashMap.entrySet())
 {
     if (pair.getValue()<=prom)
     {
         prom=pair.getValue();

     }
 }
        for (HashMap.Entry<Integer,Integer> pair1 : hashMap.entrySet())
        {
            if (pair1.getValue()==prom)
            {
                System.out.print(pair1.getKey()+" ");
            }
        }
        fstream.close();
    }
}