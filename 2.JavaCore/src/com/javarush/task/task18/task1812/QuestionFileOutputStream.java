package com.javarush.task.task18.task1812;

import java.io.*;
import java.nio.Buffer;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    public AmigoOutputStream amigo;
   public   void flush() throws IOException{
       amigo.flush();
   }

    public   void write(int b) throws IOException{
       amigo.write(b);
    }

    public  void write(byte[] b) throws IOException{
       amigo.write(b);
    }

    public  void write(byte[] b, int off, int len) throws IOException{
       amigo.write(b,off,len);
    }
public QuestionFileOutputStream (AmigoOutputStream amigo)
{
    this.amigo=amigo;
}
    public   void close() throws IOException{
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String reash = reader.readLine();
        if (reash.equals("Д"))
        {
            amigo.close();
            reader.close();
        }

    }

}

