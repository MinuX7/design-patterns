package com.cosmind.designpatterns.creational.factory;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Linux style button rendering.");
    }

    @Override
    public void onClick() {
    System.out.println("Bind event to Linux OS event.");
    }
}
