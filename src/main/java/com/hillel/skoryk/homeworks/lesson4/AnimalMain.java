package com.hillel.skoryk.homeworks.lesson4;

public class AnimalMain {
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

        System.out.println("Всього тварин: " + Animal.getTotalAnimals());
        System.out.println("Всього собак: " + Dog.getTotalDogs());
        System.out.println("Всього котів: " + Cat.getTotalCats());

        dog1.makeSound();
        cat1.makeSound();
    }
}
