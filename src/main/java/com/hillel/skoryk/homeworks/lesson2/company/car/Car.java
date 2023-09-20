package com.hillel.skoryk.homeworks.lesson2.company.car;

public class Car {

    public void start() {

        startElectricity();
        startCommand();
        startFuelSystem();
    }


    private void startElectricity() {
        System.out.println("Starting electricity system in the car.");

    }

    private void startCommand() {
        System.out.println("Starting command system in the car.");

    }

    private void startFuelSystem() {
        System.out.println("Starting fuel system in the car.");
    }
}
