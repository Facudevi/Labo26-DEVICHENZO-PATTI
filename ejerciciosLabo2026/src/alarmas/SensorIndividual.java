package alarmas;

import java.time.LocalDate;

public class SensorIndividual extends Sensor{
    private boolean estado;
    private double real;
    private LocalDate anio;

    public SensorIndividual(double umbral, boolean estado, double real, LocalDate anio) {
        super(umbral);
        this.estado = estado;
        this.real = real;
        this.anio = anio;
    }

    public Boolean isEstado() { return estado; }
    public double getReal() { return real; }
    public LocalDate getAnio() { return anio; }

    public void setEstado(boolean estado){ this.estado = estado; }
    public void setReal(double real){ this.real = real; }
    public void setAnio(LocalDate anio){ this.anio = anio; }

    @Override
    public void dispararAlarma(){}

    @Override
    public void imprimirAlarma(){}

}