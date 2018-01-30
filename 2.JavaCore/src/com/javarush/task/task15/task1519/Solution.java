package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        while (!"exit".equals(input)) {
            printResult(input);
            input = reader.readLine();
        }
    }


    public static void printResult(String s) {
        try {
            if (countSymbols(s, ".") == 1)
                print(Double.parseDouble(s));
            else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128)
                print(Short.parseShort(s));
            else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128)
                print(Integer.parseInt(s));
        } catch (Exception e) {
            print(s);
        }
    }


    public static int countSymbols(String s, String symbol) {
        return s.length() - s.replace(symbol, "").length();
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
