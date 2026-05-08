package persona;

import java.time.LocalDate;

public class Profesor extends Persona{
    private double porcentajeDesc;

    public Profesor(String nombre, String apellido, LocalDate fecha, String direccion, double porcentajeDesc) {
        super(nombre, apellido, fecha, direccion);
        this.porcentajeDesc = porcentajeDesc;
    }

    public double getPorcentajeDesc() {
        return porcentajeDesc;
    }
    public void setPorcentajeDesc(double porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }
}