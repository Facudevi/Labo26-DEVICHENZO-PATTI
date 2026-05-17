package telefonia;
import persona.Empleado;

import java.time.LocalDate;

public class Llamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private LocalDate fechaLlamada;
    private int duracion;

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDate fechaLlamada, int duracion) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracion = duracion;
    }

    public Empleado getEmpleadoOrigen() { return empleadoOrigen; }
    public Empleado getEmpleadoDestino() { return empleadoDestino; }
    public LocalDate getFechaLlamada() { return fechaLlamada; }
    public int getDuracion() { return duracion; }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) { this.empleadoOrigen = empleadoOrigen; }
    public void setEmpleadoDestino(Empleado empleadoDestino) { this.empleadoDestino = empleadoDestino; }
    public void setFechaLlamada(LocalDate fechaLlamada) { this.fechaLlamada = fechaLlamada; }
    public void setDuracion(int duracion) { this.duracion = duracion; }


    public double calcularCosto(){ return 0; }
}