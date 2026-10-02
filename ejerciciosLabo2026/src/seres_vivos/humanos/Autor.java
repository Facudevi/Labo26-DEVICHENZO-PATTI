package seres_vivos.humanos;

import biblioteca_virtual.Libro_Electronico;
import libreria.Libro;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona {
    private HashSet<Libro_Electronico> bibliografia;

    public Autor(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
    }

    public Autor(String nombre, String apellido, LocalDate fecha, String DNI) {
        super(nombre, apellido, fecha, DNI);
        this.bibliografia = new HashSet<>();
    }

    public HashSet<Libro_Electronico> getBibliografia() { return bibliografia; }


    public void agregarLibroBibliografia(Libro_Electronico l){ bibliografia.add(l); }
}