package com.hillel.skoryk.homeworks.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxMain {
    public static <T> List<T> toList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("Is appleBox1 equal in weight to appleBox2? " + appleBox1.compare(appleBox2));
        System.out.println("Is appleBox1 equal in weight to orangeBox? " + appleBox1.compare(orangeBox));

        appleBox1.merge(appleBox2);
        System.out.println("Merged appleBox2 into appleBox1. Now appleBox1 has " + appleBox1.getWeight()
                + " kg of apples");
    }
}

