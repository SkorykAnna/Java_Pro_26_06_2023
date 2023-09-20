package com.hillel.skoryk.homeworks.lesson5;

class Bird {
    public String name;
    public int weight;

    public Bird(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Weight: " + weight + " kg";
    }
}


public class BirdBuilder {
    private String name;
    private int weight;

    public BirdBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BirdBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public Bird build() {
        return new Bird(name, weight);
    }
}


