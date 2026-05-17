package telefonia;
import persona.Empleado;

import java.time.LocalDate;

public class Internacional extends Llamada {
    private String codPaisDestino, franjaHoraria;

    public Internacional(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDate fechaLlamada, int duracion, String codPaisDestino, String franjaHoraria) {
        super(empleadoOrigen, empleadoDestino, fechaLlamada, duracion);
        this.codPaisDestino = codPaisDestino;
        this.franjaHoraria = franjaHoraria;
    }

    public String getCodPaisDestino() { return codPaisDestino; }
    public String getFranjaHoraria() { return franjaHoraria; }

    public void setCodPaisDestino(String codPaisDestino) { this.codPaisDestino = codPaisDestino; }
    public void setFranjaHoraria(String franjaHoraria) { this.franjaHoraria = franjaHoraria; }


    @Override
    public double calcularCosto() {
        return getDuracion() * 8.75;
    }
}