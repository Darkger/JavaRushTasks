package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        File file1 = new File (reader.readLine());
        File file2 = new File (reader.readLine());
        BufferedReader freader = new BufferedReader( new FileReader(file1));
        BufferedWriter fwriter = new BufferedWriter( new FileWriter(file2));
        char [] buff = new char [(int) file1.length()];
        freader.read(buff);
        for (int i = 0;i<buff.length;i++)
        {
            if (buff[i]=='.')
            {
                buff[i]='!';
                fwriter.write(buff[i]);
            }
            else
            {
                fwriter.write(buff[i]);
            }
        }
        reader.close();
        freader.close();
        fwriter.close();
    }
}
