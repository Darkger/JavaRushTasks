package com.javarush.task.task18.task1803;



        import java.io.Reader;
        import java.io.FileInputStream;
        import java.io.InputStreamReader;
        import java.io.BufferedReader;
        import java.text.SimpleDateFormat;
        import java.util.ArrayList;
        import java.util.Date;
        import java.util.HashMap;
        import java.util.Scanner;

/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String stroka = "Иванов Иван Иванович 31 12 1950";
        ArrayList<String> list = new ArrayList<String>();
        String birthDate;
        for (String spl : stroka.split(" ", 6)) {
            list.add(spl);
        }
        SimpleDateFormat dat = new SimpleDateFormat("dd MM yyyy");
        birthDate = list.get(3) + " " + list.get(4) + " " + list.get(5);
        Date data =dat.parse(birthDate);
String datw = dat.format(data);
        Person pers = new Person(list.get(1), list.get(2), list.get(0), data);
        pers.toString();
        list.clear();

    }
}