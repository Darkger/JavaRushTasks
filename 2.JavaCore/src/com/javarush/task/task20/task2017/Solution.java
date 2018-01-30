package com.javarush.task.task20.task2017;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream)  {Object prom;
        try {
            prom = objectStream.readObject();
            if (prom instanceof A)
                return (A)prom;
            else return null;

        } catch (Exception e) {
            return null;
        }

    }

    public class A implements Serializable{
    }

    public class B extends A {
        public B() {
            System.out.
                    println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
