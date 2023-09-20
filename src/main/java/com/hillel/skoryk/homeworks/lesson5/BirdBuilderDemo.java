package com.hillel.skoryk.homeworks.lesson5;

// based on c# version, I built same here : D

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
