package endocrinologia;

import java.time.LocalDate;

public class Ninio extends Paciente{
    private Tolerancia tolerancia;
    private int anios;

    public Ninio(String nombre, String apellido, LocalDate fecha, String genero, Sangre tipoSangre, boolean esPositivo, Tolerancia tolerancia, int anios) {
        super(nombre, apellido, fecha, genero, tipoSangre, esPositivo);
        this.tolerancia = tolerancia;
        this.anios = anios;
    }

    public Tolerancia getTolerancia() {
        return tolerancia;
    }

    public int getAnios() {
        return anios;
    }
}