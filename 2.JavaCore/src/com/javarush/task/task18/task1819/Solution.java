package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 =reader.readLine();
        String filename2 =reader.readLine();
        FileInputStream fstream1 = new FileInputStream(filename1);
        byte [] buffer = new byte [fstream1.available()];



            fstream1.read(buffer);

        fstream1.close();


        FileInputStream fstream2 = new FileInputStream(filename2);
        byte [] buffer2 = new byte [fstream2.available()];
        fstream2.read(buffer2);

        fstream2.close();

     byte [] merge =new byte [buffer.length+buffer2.length];
        System.arraycopy(buffer2,0,merge,0,buffer2.length);
        System.arraycopy(buffer,0,merge,buffer2.length,buffer.length);

       // PrintWriter writer = new PrintWriter(filename1);
       // writer.close();
        FileOutputStream  fostream1 = new  FileOutputStream (filename1,false);
            fostream1.write(merge);
        fostream1.close();




    }
}
