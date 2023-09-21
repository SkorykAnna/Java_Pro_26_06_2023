package com.hillel.skoryk.homeworks.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    void add(T fruit) {
        fruits.add(fruit);
    }

    void addAll(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    void merge(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }

        if (fruits.isEmpty()) {
            fruits.addAll(anotherBox.fruits);
            anotherBox.fruits.clear();
        } else if (fruits.get(0).getClass() == anotherBox.fruits.get(0).getClass()) {
            fruits.addAll(anotherBox.fruits);
            anotherBox.fruits.clear();
        } else {
            throw new IllegalArgumentException("Неможливо об'єднати коробки з різними фруктами.");
        }
    }
}
