package com.javarush.task.task21.task2107;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements  Cloneable{
    public Solution clone () throws CloneNotSupportedException {
      Solution solution = new Solution();
       for (HashMap.Entry<String,User> pair:users.entrySet() )
       {
           solution.users.put(pair.getKey(),pair.getValue());

       }
        return solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        Solution solution = (Solution) o;

        return users != null ? users.equals(solution.users) : solution.users == null;
    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;

        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements  Cloneable{
        int age;
        String name;
    public  User clone ()
    {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
