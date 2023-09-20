package com.hillel.skoryk.homeworks.lesson5;

public class BirdBuilder {
    private String name;
    private int weight;

    public BirdBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BirdBuilder setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be a positive number");
        }
        this.weight = weight;
        return this;
    }

    public Bird build() {
        if (name == null || name.isEmpty() || weight <= 0) {
            throw new IllegalArgumentException("Invalid name or weight");
        }
        return new Bird(name, weight);
    }
}
