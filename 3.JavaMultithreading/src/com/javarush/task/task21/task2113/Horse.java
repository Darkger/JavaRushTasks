package com.javarush.task.task21.task2113;

public class Horse {
      String  name   ;

    public String getName() {
        return name;
    }
 public void move ()
 {
distance+=speed*Math.random();
 }
 public void print ()
 {
     String str = "";
     for (int i = 0 ; i <(int) distance; i++)
     {
         str +=".";
     }
     System.out.println(str+=name);
 }
    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    double speed,distance;
   public Horse (String name, double speed, double distance)
   {
       this.name= name;
       this.speed= speed;
       this.distance= distance;
   }
}
