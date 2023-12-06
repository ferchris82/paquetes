package org.chrisferdev.app.hogar;

import org.chrisferdev.app.jardin.Perro;
import static org.chrisferdev.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
