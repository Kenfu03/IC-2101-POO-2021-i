package com.company;

public class FactoryModerna implements GUIFactory {

    @Override
    public Silla createSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa createMesa() {
        return new MesaModerna();
    }
}

