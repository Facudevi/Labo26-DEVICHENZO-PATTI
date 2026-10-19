package deporte.futbol;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Plantel extends Persona {
    private HashSet<String> historial;

    public Plantel(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
        this.historial = new HashSet<>();
    }

    public Plantel(String nombre, String apellido) {
        super(nombre, apellido);
        this.historial = new HashSet<>();
    }

    public HashSet<String> getHistorial() { return historial; }

    public void agregarClubAlHistorial(String club){ historial.add(club); }
    public boolean trabajoEnClub(String club) { return historial.contains(club); }
    public abstract void requisitosContratar() throws NoCumpleRequisitosException;
    public abstract void requisitosRenovar() throws NoCumpleRequisitosException;
}