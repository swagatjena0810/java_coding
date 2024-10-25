package MethodReference;

interface Vehicle {
    default void start() {
        System.out.println("Starting the vehicle");
    }
}

class Car implements Vehicle {
    // This class doesn't provide an implementation for the start() method,
    // so it inherits the default implementation from the interface.
}

class Bike implements Vehicle {
    // This class overrides the start() method to provide a custom implementation.
    @Override
    public void start() {
        System.out.println("Starting the bike");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Starting the vehicle

        Bike bike = new Bike();
        bike.start(); // Output: Starting the bike
    }
}