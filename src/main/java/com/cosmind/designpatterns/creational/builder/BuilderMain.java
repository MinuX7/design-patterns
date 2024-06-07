package com.cosmind.designpatterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder("Dacia", "Blue", "Diesel", 4);
        carBuilder.setSeats(4);
        Car car1 = carBuilder.build();
        System.out.println("**********");
        CarBuilder carBuilder2 = new CarBuilder("Tesla", "Red", "Electric", 4);
        Car car2 = carBuilder2.setSeats(5)
                .setGps("TomTom")
                .hasTrail(true)
                .dashboardStorage(2)
                .build();

    }
}
