package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Сериализация человека
*/
public class Solution {

    public static class Person implements Serializable{
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String firstName=null;
        String lastName=null;
        String country=null;
        Sex sex=Sex.FEMALE;


        FileOutputStream file = new FileOutputStream("C:\\filename.txt");
        ObjectOutputStream ostream = new ObjectOutputStream(file);
        Person person = new Person(firstName,lastName,country,sex);
        ostream.writeObject(person);
        FileInputStream inputStream = new FileInputStream("C:\\filename.txt");
        ObjectInputStream istream = new ObjectInputStream(inputStream);
        Person person1 = (Person)istream.readObject();



    }
}
