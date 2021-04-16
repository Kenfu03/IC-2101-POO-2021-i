package com.company;

import java.util.Date;

public class Cuenta {
    //Atributos
    private int id;
    private double balance;
    private double tasaDeInteresAnual;
    private Date fechaDeCreacion;

    //Contructor
    Cuenta(){
    }

    Cuenta(int id, double balance){
        this.id = id;
        this.balance = balance;

    }
    Cuenta(int id, double balance, double tasaDeInteresAnual){
        this.id = id;
        this.balance = balance;
        this.tasaDeInteresAnual = tasaDeInteresAnual;
    }

    //Metodos
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getTasaDeInteresAnual() {
        return tasaDeInteresAnual;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTasaDeInteresAnual(double tasaDeInteresAnual) {
        this.tasaDeInteresAnual = tasaDeInteresAnual;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public double obtenerTasaDeInteresMensual(){
        return this.tasaDeInteresAnual/12;
    }

    public double calcularInteresMensual(){
        return this.balance * obtenerTasaDeInteresMensual();
    }

    public void retirarDinero(double cantidad){
        this.balance -= cantidad;
    }

    public void depositarDinero(double cantidad){
        this.balance += cantidad;
    }


}
