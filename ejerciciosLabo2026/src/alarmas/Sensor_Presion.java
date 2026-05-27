package alarmas;

import java.time.LocalDate;

public class Sensor_Presion extends SensorIndividual {

    public Sensor_Presion(boolean estado, double medida, double umbral, LocalDate anio) {
        super(100, estado, medida, anio);
    }

    @Override
    public void dispararAlarma(){
        imprimirAlarma();
    }

    @Override
    public void imprimirAlarma(){
        System.out.println("Sensor de presión activado");
    }
}