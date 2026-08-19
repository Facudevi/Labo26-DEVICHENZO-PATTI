package seres_vivos.humanos;

import seres_vivos.humanos.personas.PersonaEducativa;

import java.time.LocalDate;

public class Profesor extends PersonaEducativa {

    public Profesor(String nombre, String apellido, LocalDate fecha, String direccion, double descuento) {
        super(nombre, apellido, fecha, direccion, descuento);
    }
}