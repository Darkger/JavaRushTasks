package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();
private Solution (int node, List <Solution> edgest)
{
    this.edges=edgest;
    this.node=node;
}
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Solution> edges = new LinkedList<>();
        int node=9;
   Solution sol = new Solution(node,edges);
        FileOutputStream fstream = new  FileOutputStream("C:\\10.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fstream);
        oos.writeObject(sol);
        FileInputStream istream = new FileInputStream("C:\\10.txt");
        ObjectInputStream ois = new ObjectInputStream( istream);
        Solution sol1 = (Solution)ois.readObject();




    }
}
