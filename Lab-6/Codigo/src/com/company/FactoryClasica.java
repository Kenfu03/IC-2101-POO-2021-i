package com.company;

public class FactoryClasica implements GUIFactory {

    @Override
    public Silla createSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa createMesa() {
        return new MesaClasica();
    }
}

