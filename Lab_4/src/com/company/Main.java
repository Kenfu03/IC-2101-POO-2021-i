package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    /*AparatoTermoRegulable atc = new AparatoTermoRegulable("Aire acondicinado", "LG", 10, 35);
        atc.encender();
        atc.apagar();

        float[] canales = new float[] {7F, 102F, 150F, 450F};
        AparatoConSeñal acs = new AparatoConSeñal("Televisor", " Samsung", canales);
        acs.encender();
        acs.apagar();

        String[] modalidades = {"delicado", "intermedio", "fuerte"};
        AparatoConModalidades acm = new AparatoConModalidades("Lavadora", "Whirpool", modalidades);
        acm.encender();
        acm.apagar();*/

        JSONParser paser = new JSONParser();
        Controlador controlador = paser.cargarAparatos();
        controlador.get(0).encender();
        System.out.println(controlador);

    }
}
