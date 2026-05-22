package telefonia;
import persona.Empleado;

import java.time.LocalDateTime;

public class Llamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private LocalDateTime fechaLlamada;
    private int duracion;

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, int duracion) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.duracion = duracion;
        this.fechaLlamada = LocalDateTime.now();
    }

    public Empleado getEmpleadoOrigen() { return empleadoOrigen; }
    public Empleado getEmpleadoDestino() { return empleadoDestino; }
    public LocalDateTime getFechaLlamada() { return fechaLlamada; }
    public int getDuracion() { return duracion; }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) { this.empleadoOrigen = empleadoOrigen; }
    public void setEmpleadoDestino(Empleado empleadoDestino) { this.empleadoDestino = empleadoDestino; }
    public void setFechaLlamada(LocalDateTime fechaLlamada) { this.fechaLlamada = fechaLlamada; }
    public void setDuracion(int duracion) { this.duracion = duracion; }


    public double calcularCosto(){ return 0; }

    public boolean esInternacional() {
        return false;
    }

    public boolean fueRealizadaPor(Empleado empleado) {
        return empleadoOrigen.tieneMismoDniQue(empleado.getDNI());
    }

    public String obtenerDetalle() {
        return " | Origen: " + empleadoOrigen.getNombreCompleto()
                + " | Destino: " + empleadoDestino.getNombreCompleto()
                + " | Fecha: " + fechaLlamada
                + " | Duracion: " + duracion + " minutos"
                + " | Costo: $" + calcularCosto();
    }

    public int obtenerMinutosAlExteriorDe(Empleado empleado) {
        return 0;
    }
}