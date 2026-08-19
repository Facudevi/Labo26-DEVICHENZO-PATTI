package seres_vivos.humanos;

import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;

public class Cantante extends Persona {
    public Cantante(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
    }
}
