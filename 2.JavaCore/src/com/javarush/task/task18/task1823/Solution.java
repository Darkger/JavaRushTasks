package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename=reader.readLine();

        while (!filename.equals("exit"))
        {
            ReadThread thred = new ReadThread(filename);
             filename=reader.readLine();
             thred.start();
        }
        reader.close();
    }

    public static class ReadThread  extends Thread  {
        String  fileName;
        public ReadThread(String fileName) {
            this.fileName=fileName;

        }
        public void run ()
        {
            try {
                FileInputStream fstream =new  FileInputStream(this.fileName);
                ArrayList<Integer> list = new ArrayList<Integer>();
                int summ=0;
                int element=0;
                while (fstream.available()>0)
                {
                    list.add(fstream.read());
                }
                for (int i=0;i<list.size();i++) {
                    if (summ< Collections.frequency(list, list.get(i))) {
                       summ= Collections.frequency(list, list.get(i));
                        element=list.get(i);
                    }

                }
                resultMap.put(fileName,element);
                fstream.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
