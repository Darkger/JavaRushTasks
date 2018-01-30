package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);

        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static  Hen getHen(String country) {
          if ( country .equals("Belarus"))
          {
              BelarusianHen blr = new BelarusianHen();
              Hen hen = blr;
              return hen;
          }
          else if (country .equals("Russia"))
          {
              RussianHen blr = new RussianHen();
              Hen hen = blr;
              return hen;
          }
          else  if ( country .equals("Ukraine"))
          {
              UkrainianHen blr = new UkrainianHen();
              Hen hen = blr;
              return hen;
          }
          else
          {
              MoldovanHen blr = new MoldovanHen();
              Hen hen = blr;
              return hen;
          }
        }
    }




}
