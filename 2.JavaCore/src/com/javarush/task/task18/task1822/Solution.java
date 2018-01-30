package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader freader = new BufferedReader(new FileReader(reader.readLine()));
        String line = freader.readLine();
        while (line != null) {
            if (args[0].equalsIgnoreCase(line.split(" ")[0]))
                System.out.println(line);
            line = freader.readLine();
        }
        reader.close();
        freader.close();
    }
}
