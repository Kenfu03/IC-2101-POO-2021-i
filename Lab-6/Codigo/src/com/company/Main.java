package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Application configureApplication() throws IOException {
        Application app;
        GUIFactory factory;
        System.out.println("Ingrese si le gustaria comprar una silla Moderna (1) o clasica (0)");
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        while (true) {
            System.out.println("Ingrese el numero correspondiente: ");
            int num1 = Integer.parseInt(reader.readLine());

            if (num1 == 1) {
                factory = new FactoryModerna();
                app = new Application(factory);
            } else {
                factory = new FactoryClasica();
                app = new Application(factory);
            }
            return app;
        }
    }

    public static void main(String[] args) throws IOException {
        Application app = configureApplication();
        app.paint();
    }

}
