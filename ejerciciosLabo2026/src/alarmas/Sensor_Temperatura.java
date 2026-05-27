package alarmas;

import java.time.LocalDate;

public class Sensor_Temperatura extends SensorIndividual {

    public Sensor_Temperatura(boolean estado, double medida, double umbral, LocalDate anio) {
        super(25, estado, medida, anio);
    }

    @Override
    public void dispararAlarma(){
        imprimirAlarma();
    }

    @Override
    public void imprimirAlarma(){
        System.out.println("¡Cuidado! La temperatura sube");
    }
}