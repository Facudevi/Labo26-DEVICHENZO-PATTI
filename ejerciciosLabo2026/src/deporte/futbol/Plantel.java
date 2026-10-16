package deporte.futbol;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Plantel extends Persona {
    private HashSet<String> clubes;

    public Plantel(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
        this.clubes = new HashSet<>();
    }

    public Plantel(String nombre, String apellido) {
        super(nombre, apellido);
        this.clubes = new HashSet<>();
    }

    public HashSet<String> getClubes() { return clubes; }


    public abstract boolean requisitos() throws NoCumpleRequisitosException;
}