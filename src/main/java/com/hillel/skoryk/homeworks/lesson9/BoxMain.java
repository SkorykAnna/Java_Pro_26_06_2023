package com.hillel.skoryk.homeworks.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
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

class Fruit { }

class Apple extends Fruit { }

class Orange extends Fruit { }

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

        System.out.println("Чи рівні за вагою кошики з яблуками? " + (appleBox1.compare(appleBox2)
                ? "Так, рівні" : "Ні, кошик 1 важчий на " + Math.abs(appleBox1.getWeight() -
                appleBox2.getWeight()) + " кг"));

        double weightDifference = Math.abs(appleBox1.getWeight() - orangeBox.getWeight());

        if (appleBox1.compare(orangeBox)) {
            System.out.println("Чи рівні за вагою кошик з яблуками та кошик з апельсинами? Так, рівні");
        } else if (appleBox1.getWeight() > orangeBox.getWeight()) {
            System.out.println("Чи рівні за вагою кошик з яблуками та кошик з апельсинами? " +
                    "Ні, кошик з яблуками важчий на " + weightDifference + " кг");
        } else {
            System.out.println("Чи рівні за вагою кошик з яблуками та кошик з апельсинами? " +
                    "Ні, кошик з апельсинами важчий на " + weightDifference + " кг");
        }


        appleBox1.merge(appleBox2);
        System.out.println("Яблуки з другого кошика додати до першого. Тепер перший кошик з" +
                " яблуками має " + appleBox1.getWeight() + " кг яблук.");
    }
}

