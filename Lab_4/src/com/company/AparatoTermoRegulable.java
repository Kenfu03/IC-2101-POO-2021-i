package com.company;

public class AparatoTermoRegulable extends Aparato{

    private int temperaturaMin;
    private int temperaturaMax;
    private int temperaturaAct;

    public AparatoTermoRegulable(String nombre, String marca, int temperaturaMin, int temperaturaMax) {
        super(nombre, marca);
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
    }

    @Override
    public void encender() {
        super.encender();
        this.temperaturaAct = (temperaturaMin + temperaturaMax)/2;
        System.out.println(super.toString() + "con temperatura de " + temperaturaAct + " grados");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println(super.toString());
    }
}
