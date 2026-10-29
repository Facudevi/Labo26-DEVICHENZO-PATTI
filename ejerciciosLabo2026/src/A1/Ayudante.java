package A1;

import java.time.LocalDate;

public abstract class Ayudante {
    private String nombre, apellido;
    private LocalDate fechaNacimiento;
    private String aldeaOrigen;
    private Taller taller;

    public Ayudante(String nombre, String apellido, LocalDate fechaNacimiento, String aldeaOrigen, Taller taller) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.aldeaOrigen = aldeaOrigen;
        this.taller = taller;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getAldeaOrigen() {
        return aldeaOrigen;
    }

    public Taller getTaller() {
        return taller;
    }

    public abstract void prepararEstacion();
    public abstract void fabricarRegalo(Regalo regalo) throws ProduccionRegalosException;
    public abstract void envolverRegalo(Regalo regalo) throws ProduccionRegalosException;

    @Override
    public String toString() {
        return nombre + " " + apellido +
                " | Taller: " + taller;
    }
}