package com.hillel.skoryk.homeworks.lesson9;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.isEmpty() || item.getClass() == items.get(0).getClass()) {
            items.add(item);
        } else {
            throw new IllegalArgumentException("Cannot mix fruits of different types in the same box.");
        }
    }

    public void addAll(List<T> itemsToAdd) {
        for (T item : itemsToAdd) {
            add(item);
        }
    }

    public float getWeight() {
        if (items.isEmpty()) {
            return 0;
        }
        if (items.get(0) instanceof Apple) {
            return items.size() * 1.0f;
        } else if (items.get(0) instanceof Orange) {
            return items.size() * 1.5f;
        }
        return 0;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void merge(Box<T> otherBox) {
        if (items.isEmpty() || otherBox.items.isEmpty()) {
            return;
        }
        if (items.get(0).getClass() == otherBox.items.get(0).getClass()) {
            items.addAll(otherBox.items);
            otherBox.items.clear();
        } else {
            throw new IllegalArgumentException("Cannot mix fruits of different types in the same box.");
        }
    }
}
