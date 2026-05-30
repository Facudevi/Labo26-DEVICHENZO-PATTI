package sistemas.alarmas;

import java.time.LocalDate;

public class Sensor_Presion extends SensorIndividual {

    public Sensor_Presion(double umbral, boolean estado, LocalDate anio) {
        super(umbral, estado, anio);
    }

    @Override
    public double getMedida(){ return 130; }

    @Override
    public void dispararAlarma(){
        imprimirAlarma();
    }

    @Override
    public void imprimirAlarma(){
        System.out.println("Sensor de presión activado");
    }
}