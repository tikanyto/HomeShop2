package com.cathy.garage;

public class Bike extends Vehicle {
    public Bike() {
    }

    public Bike(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight) {
        super(modelName, description, manufacturer, year, color, speed, dimensions, weight);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
