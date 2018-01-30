

package com.javarush.task.task22.task2207;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        List<String> str = new ArrayList<String>();
        String prom = null;
        BufferedReader reader1 = new BufferedReader(new FileReader(file));
        while ((prom = reader1.readLine()) != null) {
            str.add(prom);

        }

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < str.size(); i++) {
            st.append(str);
        }
        st.deleteCharAt(0);
        st.deleteCharAt(st.length() - 1);

        StringBuilder st2 = new StringBuilder(st.toString());
        st2.reverse();
        st2.deleteCharAt(0);
        st2.deleteCharAt(st2.length() - 1);
        // System.out.println("revers "+st2.toString());
        // System.out.println("No revers "+st.toString());
        String[] mass1 = st.toString().split(" ");
        String[] mass2 = st2.toString().split(" ");



        ArrayList<String> str2 = new ArrayList<String>();
        for (int i = 0; i < mass1.length; i++)
            for (int j = 0; j < mass2.length; j++) {
                if (mass1[i].equals(mass2[j])) {
                    str2.add(mass1[i]);
                    break;

                }
            }

        for (int i = 0; i < str2.size(); i++) {
            for (int j = i; j < str2.size() - 1; j++)
                if (str2.get(i).equals(str2.get(j + 1)))
                    str2.remove(j + 1);
        }

        for (int i = 0; i < str2.size(); i++) {
            Pair p = new Pair();
            p.first = str2.get(i);
            StringBuilder s = new StringBuilder(str2.get(i));
            p.second = s.reverse().toString();
            System.out.println(p.first + " " + p.second);
            result.add(p);
        }


    }


    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
