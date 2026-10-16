package deporte.futbol;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Cuerpo_Tecnico extends Plantel {
    private String titulo;
    private int aniosExperiencia;

    public Cuerpo_Tecnico(String nombre, String apellido, LocalDate fecha, String titulo, int aniosExperiencia) {
        super(nombre, apellido, fecha);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulo() { return titulo; }
    public int getAniosExperiencia() { return aniosExperiencia; }
}