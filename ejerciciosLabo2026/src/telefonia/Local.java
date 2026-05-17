package telefonia;
import persona.Empleado;

import java.time.LocalDate;

public class Local extends Llamada{
    private String provOrigen, provDestino;

    public Local(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDate fechaLlamada, int duracion, String provOrigen, String provDestino) {
        super(empleadoOrigen, empleadoDestino, fechaLlamada, duracion);
        this.provOrigen = provOrigen;
        this.provDestino = provDestino;
    }

    public String getProvOrigen() { return provOrigen; }
    public String getProvDestino() { return provDestino; }

    public void setProvOrigen(String provOrigen) { this.provOrigen = provOrigen; }
    public void setProvDestino(String provDestino) { this.provDestino = provDestino; }


    @Override
    public double calcularCosto(){
        return getDuracion() * 2.5;
    }
}