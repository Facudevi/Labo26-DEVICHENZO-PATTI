package seres_vivos.humanos;

import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;

public class Autor extends Persona {
    public Autor(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
    }
}