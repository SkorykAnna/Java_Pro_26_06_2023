package com.hillel.skoryk.homeworks.lesson4;

public class Cat extends Animal {
    private static int totalCats = 0;
    private final int maxRunDistance = 200;

    public Cat(String name) {
        super(name);
        totalCats++;
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
    public void makeSound() {
        System.out.println(name + " муркотить.");
    }

    public static int getTotalCats() {
        return totalCats;
    }
}
