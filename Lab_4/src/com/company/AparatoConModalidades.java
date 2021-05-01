package com.company;

public class AparatoConModalidades extends Aparato{

    private String[] modalidades;
    private String modalidadAcutal;

    public AparatoConModalidades(String nombre, String marca, String[] modalidades) {
        super(nombre, marca);
        this.modalidades = modalidades;
    }

    @Override
    public void encender() {
        super.encender();
        this.modalidadAcutal = modalidades[0];
        System.out.println(super.toString() + " modalidades " + modalidadAcutal);
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.printf(super.toString());
    }
}
