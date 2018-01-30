package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Byte> list = new ArrayList<Byte>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fstream = new FileInputStream(reader.readLine());
        byte[] buffer = new byte[fstream.available()];
        byte x = (byte)',';
 if (fstream.available()>0)
 {
     int count = fstream.read(buffer);
 }
 for (int i= 0;i<buffer.length;i++)
 {
     list.add(buffer[i]);
 }
   int  count1 =   Collections.frequency(list,x);
        System.out.println(count1);
        fstream.close();
    }
}
