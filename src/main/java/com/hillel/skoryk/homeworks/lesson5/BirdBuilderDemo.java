package com.hillel.skoryk.homeworks.lesson5;

class Bird {
    public String name;
    public int weight;

    public Bird(String name, int weight) {
        if (name == null || name.isEmpty() || weight <= 0) {
            throw new IllegalArgumentException("Invalid name or weight");
        }
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Weight: " + weight + " kg";
    }
}

public class BirdBuilderDemo {
    public static void main(String[] args) {
        Bird bird1 = new BirdBuilder()
                .setName("Kurka")
                .setWeight(3)
                .build();

        Bird bird2 = new BirdBuilder()
                .setName("Guska")
                .setWeight(7)
                .build();

        Bird bird3 = new BirdBuilder()
                .setName("Kachka")
                .setWeight(5)
                .build();

        Bird bird4 = new BirdBuilder()
                .setName("Indik")
                .setWeight(10)
                .build();

        System.out.println("List of birds:");
        System.out.println(bird1);
        System.out.println(bird2);
        System.out.println(bird3);
        System.out.println(bird4);
    }
}
