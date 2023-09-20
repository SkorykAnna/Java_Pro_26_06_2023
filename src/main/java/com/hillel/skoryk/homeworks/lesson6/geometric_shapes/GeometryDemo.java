package com.hillel.skoryk.homeworks.lesson6.geometric_shapes;
import java.util.Scanner;

interface GeometricShape {
    double getArea();
}

class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements GeometricShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

public class GeometryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть радіус кола: ");
        double circleRadius = scanner.nextDouble();

        System.out.print("Введіть довжину основи трикутника: ");
        double triangleBase = scanner.nextDouble();

        System.out.print("Введіть висоту трикутника: ");
        double triangleHeight = scanner.nextDouble();

        System.out.print("Введіть довжину сторони квадрата: ");
        double squareSide = scanner.nextDouble();

        GeometricShape[] shapes = new GeometricShape[3];
        shapes[0] = new Circle(circleRadius);
        shapes[1] = new Triangle(triangleBase, triangleHeight);
        shapes[2] = new Square(squareSide);

        double totalArea = 0.0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }
}

