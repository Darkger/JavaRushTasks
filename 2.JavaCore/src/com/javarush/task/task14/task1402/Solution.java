package com.javarush.task.task14.task1402;

/* 
Bingo-2!
*/

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        int [] b = new int []{0,1,2,3,4,5,6,7,8,9,10} ;
        int [] a = new int []{0,1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<11;i++){
            b[10-i]=a[i];
        }
        for (int i=0;i<a.length;i++)
        System.out.print(b[i]+" ");
    }
}
