package com.cosmind.designpatterns.creational.factory;

public class LinuxDialog extends Dialog {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
