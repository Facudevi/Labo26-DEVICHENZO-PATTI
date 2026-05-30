package sistemas.alarmas;

import java.time.LocalDate;

public class SensorIndividual extends Sensor{
    private boolean estado;
    private LocalDate anio;

    public SensorIndividual(double umbral, boolean estado, LocalDate anio) {
        super(umbral);
        this.estado = estado;
        this.anio = anio;
    }

    public Boolean isEstado() { return estado; }
    public LocalDate getAnio() { return anio; }

    public void setEstado(boolean estado){ this.estado = estado; }
    public void setAnio(LocalDate anio){ this.anio = anio; }

    @Override
    public boolean isConectado(){ return estado; }

    @Override
    public void dispararAlarma(){}

    @Override
    public void imprimirAlarma(){}
}