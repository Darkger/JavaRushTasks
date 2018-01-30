package com.javarush.task.task21.task2108;
/*
Клонирование растений
*/
public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        //  Tree tree = new Tree("willow",null);
        Tree clone = null;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(tree);
        System.out.println(clone);
        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }
    public static class Plant  {
        private String name;
        public Plant(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        protected Plant clone() throws CloneNotSupportedException {
            return new Plant(this.getName());
        }
    }
    public static class Tree extends Plant implements Cloneable {
        private String[] branches;
        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }
        public String[] getBranches() {
            return branches;
        }
        @Override
        protected Tree clone() throws CloneNotSupportedException {
            String[] clone_branc = this.getBranches();
            if (clone_branc!=null)
                clone_branc=clone_branc.clone();
            Tree cloneTree = new Tree(this.getName(),clone_branc);
            return cloneTree;
            /* if(this.getBranches()!=null)
                return new Tree(this.getName(), clone_branc);
                 else return new Tree(this.getName(),null);
                 */
        }
    }
}
