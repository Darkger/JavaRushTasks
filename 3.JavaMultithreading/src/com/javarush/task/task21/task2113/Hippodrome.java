package com.javarush.task.task21.task2113;

import javafx.geometry.HPos;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private  List<Horse> horses;
 public static Hippodrome game ;
    public List<Horse> getHorses() {
        return horses;
    }
    public Horse getWinner() {
        int prom=0;
        int ii =0;
        for ( int i = 0 ;i < horses.size();i++)
        {
            if ( horses.get(i).distance>prom) {
                prom = (int) horses.get(i).distance;
                ii=i;
            }

        }
        return horses.get(ii);
    }
    public void printWinner(){
        int prom=0;
        int ii =0;
        for ( int i = 0 ;i < horses.size();i++) {
            if (horses.get(i).distance > prom) {
                prom = (int) horses.get(i).distance;
                ii = i;
            }
        }
        System.out.println("Winner is "+horses.get(ii).name+"!");

    }
    public void run() throws InterruptedException {
        for ( int i=0;i<100;i++)
        {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void  move(){
         for ( int i = 0 ;i < horses.size();i++)
         {
             horses.get(i).move();
         }

    } public void print(){
        for ( int i = 0 ;i < horses.size();i++)
        {
            horses.get(i).print();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
    public Hippodrome (List <Horse> horses)
    {
        this.horses=horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
ArrayList<Horse>  horse = new ArrayList<Horse> ();
horse.add(new Horse("suka",3,0));
        horse.add(new Horse("suka2",3,0));
        horse.add(new Horse("suka3",3,0));
     game = new Hippodrome(horse);
game.run();
game.getWinner();
game.printWinner();
    }
}
