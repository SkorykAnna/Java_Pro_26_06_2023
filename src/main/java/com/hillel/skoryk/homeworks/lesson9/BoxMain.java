package com.hillel.skoryk.homeworks.lesson9;

public class BoxMain {
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

        double weightDifferenceA = Math.abs(appleBox1.getWeight() - appleBox2.getWeight());
        if (appleBox1.compare(appleBox2)) {
            System.out.println("Чи рівні за вагою кошики з яблуками? Так, рівні");
        } else if (appleBox1.getWeight() > appleBox2.getWeight()) {
            System.out.println("Чи рівні за вагою кошики з яблуками? Ні, перший кошик важчий на " +
                    weightDifferenceA + " кг");
        } else {
            System.out.println("Чи рівні за вагою кошики з яблуками? Ні, другий кошик важчий на " +
                    weightDifferenceA + " кг");
        }

        double weightDifferenceO = Math.abs(appleBox1.getWeight() - orangeBox.getWeight());
        if (appleBox1.compare(orangeBox)) {
            System.out.println("Чи рівні за вагою кошик з яблуками та кошик з апельсинами? Так, рівні");
        } else if (appleBox1.getWeight() > orangeBox.getWeight()) {
            System.out.println("Чи рівні за вагою кошик з яблуками та кошик з апельсинами? " +
                    "Ні, кошик з яблуками важчий на " + weightDifferenceO + " кг");
        } else {
            System.out.println("Чи рівні за вагою кошик з яблуками та кошик з апельсинами? " +
                    "Ні, кошик з апельсинами важчий на " + weightDifferenceO + " кг");
        }

        appleBox1.merge(appleBox2);
        System.out.println("Яблуки з другого кошика додати до першого. Тепер перший кошик з" +
                " яблуками має " + appleBox1.getWeight() + " кг яблук.");
    }
}


