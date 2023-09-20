package com.hillel.skoryk.homeworks.lesson3;

class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger() {
        bun = "Звичайна булочка";
        meat = "Свинина";
        cheese = "Сир Чеддер";
        greens = "Салат, помідори";
        mayonnaise = "Майонез";
        printBurgerComposition();
    }

    public Burger(boolean isDiet) {
        bun = "Безглютенова булочка";
        meat = "Курка";
        cheese = "Без сиру";
        greens = "Салат, огірки";
        if (isDiet) {
            mayonnaise = "Без майонезу";
        } else {
            mayonnaise = "Майонез";
        }
        printBurgerComposition();
    }

    public Burger(int doubleMeat) {
        bun = "Звичайна булочка";
        meat = "Дві порції свинини";
        cheese = "Дві порції сиру Чеддер";
        greens = "Салат, помідори";
        mayonnaise = "Майонез";
        printBurgerComposition();
    }

    // Виведення складу бургера в консоль
    public void printBurgerComposition() {
        System.out.println("Склад бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + mayonnaise);
        System.out.println();
    }
}

public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Звичайний бургер:");
        Burger regularBurger = new Burger();

        System.out.println("Дієтичний бургер:");
        Burger dietBurger = new Burger(true);

        System.out.println("Бургер з подвійним м'ясом:");
        Burger doubleMeatBurger = new Burger(2);
    }
}
