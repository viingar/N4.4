package org.example;

public class Main {
    public static void main(String[] args)
    {
        new StudentWithClock(new Student()).learn();
        new StudentGetTime(new Student()).learn();
    }
}