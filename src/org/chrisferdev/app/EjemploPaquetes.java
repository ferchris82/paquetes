package org.chrisferdev.app;

import org.chrisferdev.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.nombre = "Andrés";
        System.out.println(p.nombre);

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";
    }
}
