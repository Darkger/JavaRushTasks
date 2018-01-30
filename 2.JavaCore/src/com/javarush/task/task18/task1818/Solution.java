package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader  = new BufferedReader( new InputStreamReader(System.in));
        String namefile1=reader.readLine();
        String namefile2=reader.readLine();
        String namefile3=reader.readLine();

        FileInputStream fstream2 = new FileInputStream(namefile2);
        FileInputStream fstream3 = new FileInputStream(namefile3);
        FileOutputStream fostream1 = new  FileOutputStream(namefile1);


        while (fstream2.available()>0)
        {
         fostream1.write(fstream2.read());
        }
        while (fstream3.available()>0)
        {
            fostream1.write(fstream3.read());
        }

        fstream2.close();
        fstream3.close();
        fostream1.close();

    }
}
