package com.javarush.task.task31.task3109;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName)   {
       try {
           File file = new File(fileName);

           Properties prop = new Properties();
           if ( fileName.endsWith(".xml"))
           {
               prop.loadFromXML(new FileInputStream(file));
           }
           else
           prop.load((new FileReader(file)));

           Object o;

           return prop;
       }
       catch (Exception e)
       {
           return new Properties();
       }
    }
}
