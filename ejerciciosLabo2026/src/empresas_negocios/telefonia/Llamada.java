package empresas_negocios.telefonia;
import seres_vivos.humanos.Empleado_Telefonia;

import java.time.LocalDateTime;

public abstract class Llamada {
    private Empleado_Telefonia empleadoOrigen;
    private Empleado_Telefonia empleadoDestino;
    private LocalDateTime fechaLlamada;
    private int duracion;

    public Llamada(Empleado_Telefonia empleadoOrigen, Empleado_Telefonia empleadoDestino, int duracion) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.duracion = duracion;
        this.fechaLlamada = LocalDateTime.now();
    }

    public Empleado_Telefonia getEmpleadoOrigen() { return empleadoOrigen; }
    public Empleado_Telefonia getEmpleadoDestino() { return empleadoDestino; }
    public LocalDateTime getFechaLlamada() { return fechaLlamada; }
    public int getDuracion() { return duracion; }

    public void setEmpleadoOrigen(Empleado_Telefonia empleadoOrigen) { this.empleadoOrigen = empleadoOrigen; }
    public void setEmpleadoDestino(Empleado_Telefonia empleadoDestino) { this.empleadoDestino = empleadoDestino; }
    public void setFechaLlamada(LocalDateTime fechaLlamada) { this.fechaLlamada = fechaLlamada; }
    public void setDuracion(int duracion) { this.duracion = duracion; }


    public double calcularCosto(){ return 0; }

    public boolean esInternacional() {
        return false;
    }

    public boolean fueRealizadaPor(Empleado_Telefonia empleado) {
        return empleadoOrigen.tieneMismoDniQue(empleado.getDNI());
    }

    public String obtenerDetalle() {
        return " Origen: " + empleadoOrigen.getNombreCompleto()
                + " | Destino: " + empleadoDestino.getNombreCompleto()
                + " | Fecha: " + fechaLlamada
                + " | Duracion: " + duracion + " minutos"
                + " | Costo: $" + calcularCosto();
    }

    public int obtenerMinutosAlExteriorDe(Empleado_Telefonia empleado) {
        return 0;
    }
}