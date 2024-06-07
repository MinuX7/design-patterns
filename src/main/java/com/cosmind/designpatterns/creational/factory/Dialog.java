package com.cosmind.designpatterns.creational.factory;

public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }
}
