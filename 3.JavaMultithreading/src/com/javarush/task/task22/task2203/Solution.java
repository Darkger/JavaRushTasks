package com.javarush.task.task22.task2203;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
      String [] str =  string.split("\t");

        Pattern p = Pattern.compile("\t");
        Matcher m = p.matcher(string); int i=0;
       while ( m.find())
           i++;
      if (i>=2) {


          return str[1] ;
      }
      else
         throw  new  TooShortStringException ()  ;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
