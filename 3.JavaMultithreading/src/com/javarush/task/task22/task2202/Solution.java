package com.javarush.task.task22.task2202;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        if (string == null || string.isEmpty()) throw new TooShortStringException();
        String []     ar=string.split(" ");
        if ( ar.length>=5 ) {
            String fin = ar[1] + " " + ar[2] + " " + ar[3] + " " + ar[4];
            // System.out.println(fin);
            return fin;
        }
        else
        throw new TooShortStringException();
    }

    public static class TooShortStringException extends   RuntimeException

    {

    }
}
