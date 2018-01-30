package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
String filename = args[0];
long number = Long.parseLong(args[1]);
String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(filename,"rw");
        raf.seek(number);
        if (raf.length() < Long.parseLong(args[1])) raf.seek(raf.length());
        raf.write(text.getBytes());
        raf.close();

    }
}
