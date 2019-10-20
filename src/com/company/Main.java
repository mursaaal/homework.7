package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog ();
        printInfo(dog);
        // write your code here   System.out.println("Age="+ getAge()+ "Speed="+ getSpeed()+"Name="+ getName());

    }

    public static void printInfo(Animal obj) {
        obj.method1(12, 23, obj.getName());
        obj.method2(34, 54, obj.getName());
        obj.getAge();
        obj.getName();
        obj.getSpeed();
    }
}


