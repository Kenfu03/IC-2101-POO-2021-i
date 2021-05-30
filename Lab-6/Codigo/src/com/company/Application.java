package com.company;

public class Application {

    private Silla silla;
    private Mesa mesa;

    public Application(GUIFactory factory) {
        silla = factory.createSilla();
        mesa = factory.createMesa();
    }

    public void paint() {
        silla.paint();
        mesa.paint();
    }
}
