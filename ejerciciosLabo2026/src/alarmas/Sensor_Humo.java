package alarmas;

import java.time.LocalDate;

public class Sensor_Humo extends SensorIndividual {

    public Sensor_Humo(double umbral, boolean estado, LocalDate anio) {
        super(umbral, estado, anio);
    }

    @Override
    public double getMedida(){ return 50; }

    @Override
    public void dispararAlarma(){
        imprimirAlarma();
    }

    @Override
    public void imprimirAlarma(){
        System.out.println("Se están llamando a los bomberos");
    }
}