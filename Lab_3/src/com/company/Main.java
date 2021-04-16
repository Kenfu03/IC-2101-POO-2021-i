package com.company;

public class Main {

    public static void main(String[] args) {

	Cuenta cuenta1 = new Cuenta(1122, 500.000, 4.5);
	cuenta1.depositarDinero(150.000);
	cuenta1.retirarDinero(200.000);

        System.out.println(cuenta1.getBalance());
        System.out.println(cuenta1.calcularInteresMensual());
        System.out.println(cuenta1.getFechaDeCreacion());

	Cuenta cuenta2 = new Cuenta(666, 123.000, 5.6);

        System.out.println(cuenta2.getBalance());
        System.out.println(cuenta2.calcularInteresMensual());
        System.out.println(cuenta2.getFechaDeCreacion());

    ATM cajero = new ATM();
    cajero.iniciarATM();


    }
}
