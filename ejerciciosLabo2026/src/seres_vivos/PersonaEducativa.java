package seres_vivos;

import java.time.LocalDate;

public abstract class PersonaEducativa extends Persona{
    private double descuento;

    public PersonaEducativa(String nombre, String apellido, LocalDate fecha, String direccion, double descuento) {
        super(nombre, apellido, fecha, direccion);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}