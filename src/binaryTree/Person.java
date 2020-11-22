package binaryTree;

import printer.BinaryTrees;

public class Person implements Comparable<Person>{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ""+age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person e) {
        return age - e.age;
    }

}
