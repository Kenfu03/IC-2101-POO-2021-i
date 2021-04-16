package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    ATM(){
        System.out.println("Ingresaste al Cajero ATM");
    }

    public void iniciarATM() throws IOException {
        for (int i = 0; i < 9; i++){
            cuentas.add(new Cuenta(i,100.000));
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        while(true) {
            System.out.println("Ingrese su ID: ");
            int num1 = Integer.parseInt(reader.readLine());

            if (num1 >= 0 && num1 <= 9) {
                inCajero(num1);
            }
        }
    }
    public void inCajero(int ID) throws IOException {
        System.out.println("Menu Principal");
        System.out.println("1.Ver el balance actual \n 2.Retirar Dinero \n 3.Depositar Dinero \n 4-0.Salir");
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        while(true) {
            System.out.println("Ingrese lo que desea realizar: ");
            int num1 = Integer.parseInt(reader.readLine());

            funcionCajero(ID, num1);

        }
    }
    public void funcionCajero(int id, int opcion) throws IOException {
            if (opcion == 1){
                System.out.println(cuentas.get(id).getBalance());
                iniciarATM();
            }
            else if (opcion == 2) {
                System.out.println("Ingrese la cantidad a Retirar: ");
                Scanner scanner2 = new Scanner(System.in);
                String str2 = scanner2.nextLine();
                double cantidad2 = Double.parseDouble(str2);
                cuentas.get(id).retirarDinero(cantidad2);
                System.out.println("Se deposito: " + str2);
                iniciarATM();
            }
            else if (opcion == 3){
                System.out.println("Ingrese la cantidad a Depositar: ");
                Scanner scanner2 = new Scanner(System.in);
                String str2 = scanner2.nextLine();
                double cantidad2 = Double.parseDouble(str2);
                cuentas.get(id).depositarDinero(cantidad2);
                System.out.println("Se deposito: " + str2);
                iniciarATM();
            }
            else{
                System.out.println("Gracias por usar nuestros servicios");
            }
    }


}
