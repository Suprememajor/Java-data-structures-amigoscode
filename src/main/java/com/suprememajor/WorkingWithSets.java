package com.suprememajor;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        //For order, use TreeSet
        balls.add(new Ball("Blue", 6));
        balls.add(new Ball("Blue", 6));
        balls.add(new Ball("Yellow", 7));
        balls.add(new Ball("Red", 4));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    record Ball(String color, int size) {

    }
}
