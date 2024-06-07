package com.cosmind.designpatterns.creational.factory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows style button rendering.");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a Windows native OS click event.");
    }
}
