package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        int i=1;
        String stroka  ="loser";
        String stroka1 ="user";
        String stroka2 ="proger";
        String stroka3 ="coder";
        String vvod;
        while ( i>0) {
            vvod =reader.readLine();

                if  (stroka.equals(vvod)  ) {
                    doWork(new Person.Loser());
                }
         else   if  (stroka1.equals(vvod)  ) {
                    doWork(new Person.User());
                }
         else   if  (stroka2.equals(vvod)  ) {
                    doWork(new Person.Proger());
                }
         else   if  (stroka3.equals(vvod)  ) {
                    doWork(new Person.Coder());
                }
          else
              break;
        }
    }

    public static void doWork(Person person) {
      if (person instanceof Person.User) {
  ((Person.User) person).live();
      }
     else   if (person instanceof Person.Loser) {
          person = new Person.Loser();
          ((Person.Loser) person).doNothing();
      }
       else if (person instanceof Person.Coder) {
          person = new Person.Coder();
          ((Person.Coder) person).coding();
      }
      else  if (person instanceof Person.Proger) {
          person = new Person.Proger();
          ((Person.Proger) person).enjoy();
      }
    }
}
