package com.hillel.skoryk.homeworks.lesson4;

public abstract class Animal {
    protected String name;
    private static int totalAnimals = 0;

    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    public void run(int distance) {
        System.out.println(name + " пробіг " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплив " + distance + " м.");
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public abstract void makeSound();
}
