package com.company;

import java.util.Random;

public class AparatoConSeñal extends Aparato{

    private float[] señales;
    private float señalAct;

    public AparatoConSeñal(String nombre, String marca, float[] señales) {
        super(nombre, marca);
        this.señales = señales;
    }

    @Override
    public void encender() {
        super.encender();
        Random ran = new Random();
        int aleatorio = ran.nextInt(señales.length);
        this.señalAct = señales[aleatorio];
        System.out.println(super.toString() + " señal actual " + señalAct);
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println(super.toString());
    }
}
