package com.javarush.task.task18.task1813;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream original;
    public AmigoOutputStream(FileOutputStream original) throws FileNotFoundException {
        super(fileName);
        this.original=original;


    }
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b,off,len);
    }
    public void write (int tor) throws IOException {
        original.write(tor);
    }
    public void write (byte [] buffer) throws IOException {
        original.write(buffer);
    }
    public void flush() throws IOException {
        original.flush();
    }
  public void  close() throws IOException {
     original.flush();
     String s = "JavaRush © All rights reserved.";
     original.write(s.getBytes());
     original.close();
  }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
