package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileReader  fl1 = new FileReader(file1);
        FileWriter  fl2 = new FileWriter(file2);
        String x = "";
        int x1;
        do {
            x1 = fl1.read();
            if (x1 == ' ' || x1 == -1) {
                fl2.write( (Math.round(Double.parseDouble(x)) + " "));
                x = "";
            }
            else {
                x += (char) x1;
            }
        }
        while (x1 != -1);
        fl1.close();
        fl2.close();
    }
}
