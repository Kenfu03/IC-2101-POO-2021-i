package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Cuenta> cuentas;

    ATM(){
        System.out.println("Ingresaste al Cajero ATM");
    }

    public void crearCuentas(){
        for (int i = 0; i < 9; i++){
            cuentas.add(new Cuenta(i,100.000));
        }

    }
    public void iniciarATM() {
        boolean flag = true;
        crearCuentas();
        while(flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su id: ");
            String str = scanner.nextLine();
            int num1 = Integer.parseInt(str);
            flag = false;
            if (num1 >= 0 && num1 <= 9) {
                System.out.println("Menu Principal");
                System.out.println("1.Ver el balance actual \n 2.Retirar Dinero \n 3.Depositar Dinero \n 4-0.Salir");
                Scanner scanner2 = new Scanner(System.in);
                String str2 = scanner2.nextLine();
                int num2 = Integer.parseInt(str2);
                funcionCajero(num1, num2);

            }
        }
    }
    public void funcionCajero(int id, int opcion){
            if (opcion == 1){
                System.out.println(cuentas.get(id).getBalance());
                iniciarATM();
            }
            else if (opcion == 2) {
                System.out.println("Ingrese la cantidad a retirar: ");
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                double cantidad = Double.parseDouble(str);
                cuentas.get(id).retirarDinero(cantidad);
                System.out.println("Se retiro: " + str);
                iniciarATM();
            }
            else if (opcion == 3){
                System.out.println("Ingrese la cantidad a Depositar: ");
                Scanner scanner2 = new Scanner(System.in);
                String str2 = scanner2.nextLine();
                double cantidad2 = Double.parseDouble(str2);
                cuentas.get(id).retirarDinero(cantidad2);
                System.out.println("Se deposito: " + str2);
                iniciarATM();
            }
            else{
                System.out.println("Gracias por usar nuestros servicios");
            }
    }


}
