package com.cosmind.designpatterns.creational.builder;

import java.net.StandardSocketOptions;

public class Car {

    private String name;
    private String skeletonColor;
    private String engine;
    private int wheels;
    private int seats;
    private String gps;

    private boolean hasTrail;
    private int dashboardStorage;

    public void buildBaseCar(String name, String skeletonColor, String engine, int wheels) {
    System.out.println("Building " + name + " car. Painted skeleton in " + skeletonColor + " color, with " + engine + " engine and " + wheels + " wheels.");
        this.name = name;
        this.skeletonColor = skeletonColor;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        System.out.println("Installing " + seats + " seats.");
        this.seats = seats;
    }

    void setGps(String gps) {
        System.out.println("Installing GPS from " + gps + ".");
        this.gps = gps;
    }

    void setTrail() {
        System.out.println("Attaching trail.");
        this.hasTrail = true;
    }

    void setDashboardStorage(int dashboardStorage) {
        System.out.println("Installing " + dashboardStorage + " storages in dashboard.");
        this.dashboardStorage = dashboardStorage;
    }

}
