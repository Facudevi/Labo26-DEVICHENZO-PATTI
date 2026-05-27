package alarmas;

import java.time.LocalDate;

public class Sensor_Temperatura extends SensorIndividual {

    public Sensor_Temperatura(double umbral, boolean estado, LocalDate anio) {
        super(umbral, estado, anio);
    }

    @Override
    public double getMedida(){ return 35; }

    @Override
    public void dispararAlarma(){
        imprimirAlarma();
    }

    @Override
    public void imprimirAlarma(){
        System.out.println("¡Cuidado! La temperatura sube");
    }
}