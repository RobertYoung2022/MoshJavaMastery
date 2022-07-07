package com.bobbyworld;

public class Variables {
    public static void main(String[] args) {
        int age = 30;
        age = 35;  // reassigned the value -- overwrites old value
        int myAge = 30;
        int herAge = myAge;

        System.out.println("Hello World");
        System.out.println("Someone's age is "+ age);
        System.out.println("Her age and mine is the same. Our age is " + herAge);
    }
}
