package com.hillel.skoryk.homeworks.lesson4;

class Animals {
    protected String name;
    private static int totalAnimals = 0;

    public Animals(String name) {
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
}

class Dog extends Animals {
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

    public static int getTotalDogs() {
        return totalDogs;
    }
}

class Cat extends Animals {
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

    public static int getTotalCats() {
        return totalCats;
    }
}

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ділан");
        Dog dog2 = new Dog("Марсік");
        Cat cat1 = new Cat("Пушинка");
        Cat cat2 = new Cat("Муся");

        dog1.run(300);
        dog2.run(400);
        cat1.run(100);
        cat2.run(300);

        dog1.swim(5);
        dog2.swim(15);
        cat1.swim(2);
        cat2.swim(5);

        System.out.println("Всього тварин: " + Animals.getTotalAnimals());
        System.out.println("Всього собак: " + Dog.getTotalDogs());
        System.out.println("Всього котів: " + Cat.getTotalCats());
    }
}

