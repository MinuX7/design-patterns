package com.cosmind.designpatterns.creational.builder;

public class CarBuilder {
    private String name;
    private String bodyColor;
    private String engine;
    private int wheels;
    private int seats;
    private String gps;
    private boolean hasTrail;
    private int dashboardStorage;

    public CarBuilder (String name, String bodyColor, String engine, int wheels) {
        this.name = name;
        this.bodyColor = bodyColor;
        this.engine = engine;
        this.wheels = wheels;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setGps(String gps) {
        this.gps = gps;
        return this;
    }

    public CarBuilder hasTrail(boolean hasTrail) {
        this.hasTrail = hasTrail;
        return this;
    }

    public CarBuilder dashboardStorage(int dashboardStorage) {
        this.dashboardStorage = dashboardStorage;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.buildBaseCar(name, bodyColor, engine, wheels);
        if (this.seats != 0) {
            car.setSeats(seats);
        }
        if (this.gps != null) {
            car.setGps(this.gps);
        }
        if (this.hasTrail) {
            car.setTrail();
        }
        if (this.dashboardStorage != 0) {
            car.setDashboardStorage(dashboardStorage);
        }
        return car;
    }

}
