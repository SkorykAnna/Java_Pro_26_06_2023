package com.hillel.skoryk.homeworks.lesson4;

public class Dog extends Animal {
    private static int totalDogs = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        totalDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println(name + " не може пробігти " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            super.swim(distance);
        } else {
            System.out.println(name + " не може пропливти " + distance + " м.");
        }
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гавкає.");
    }

    public static int getTotalDogs() {
        return totalDogs;
    }
}