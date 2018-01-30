package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Используем RandomAccessFile
*/

public class Solution {

    public static void main(String... args) throws IOException {
        try {
            String fileName = args[0];
            int  number = Integer.parseInt(args[1]);
            String text = args[2];
            RandomAccessFile write = new RandomAccessFile(fileName, "rw");
            write.seek(number);
            int len =0;
            if((write.length()-number)>text.length()) len = text.length();
            if((write.length()-number)<=text.length()) len =  (int)write.length()-number;
            byte[] arr = new byte[len];
            write.read(arr, 0, len);
            String str = convertByteToString(arr);
            write.seek(write.length());
            if (str.equals(text)  ) {
                String tr = "true";
                write.write(tr.getBytes());
            } else {
                String tr = "false";
                write.write(tr.getBytes());
            }

        }
        catch (Exception e){}
    }




   public static String convertByteToString(byte readBytes[])
   {

       return new String(readBytes);
   }
}
