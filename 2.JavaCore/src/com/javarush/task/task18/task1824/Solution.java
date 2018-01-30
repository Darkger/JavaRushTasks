package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename=null;
        try {
            while (true) {
                filename = reader.readLine();
                FileInputStream fstream = new FileInputStream(filename);
                fstream.close();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(filename);

        }
    }
}
