package com.hillel.skoryk.homeworks.lesson5;

import java.util.Objects;

// version with a lot of parameters
enum CarType {
    SEDAN, SUV, SPORTS
}

class Engine {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return engineType;
    }
}

enum Transmission {
    MANUAL, AUTOMATIC
}

class TripComputer {
    @Override
    public String toString() {
        return "Trip Computer";
    }
}

class GPSNavigator {
    @Override
    public String toString() {
        return "GPS Navigator";
    }
}

class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}

// Create a CarBuilder class that implements the Builder interface
class CarBuilder implements BuilderCar {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        if (seats <= 0) {
            throw new IllegalArgumentException("Seats must be a positive number.");
        }
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        Objects.requireNonNull(engine, "Engine cannot be null.");
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        Objects.requireNonNull(transmission, "Transmission cannot be null.");
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        Objects.requireNonNull(tripComputer, "TripComputer cannot be null.");
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        Objects.requireNonNull(gpsNavigator, "GPSNavigator cannot be null.");
        this.gpsNavigator = gpsNavigator;
    }

    public Car build() {
        if (carType == null || seats <= 0 || engine == null || transmission == null || tripComputer == null || gpsNavigator == null) {
            throw new IllegalArgumentException("Incomplete car configuration. Please set all components.");
        }
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

public class CarProductionDemo {
    public static void main(String[] args) {
        try {
            CarBuilder carBuilder = new CarBuilder();
            carBuilder.setCarType(CarType.SEDAN);
            carBuilder.setSeats(5);
            carBuilder.setEngine(new Engine("V6"));
            carBuilder.setTransmission(Transmission.AUTOMATIC);
            carBuilder.setTripComputer(new TripComputer());
            carBuilder.setGPSNavigator(new GPSNavigator());

            Car car = carBuilder.build();

            System.out.println("Car production completed: " + car);

        } catch (IllegalArgumentException e) {
            System.err.println("Car production failed: " + e.getMessage());
        }
    }
}

