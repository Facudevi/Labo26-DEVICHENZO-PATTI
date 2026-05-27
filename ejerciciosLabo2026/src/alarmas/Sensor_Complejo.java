package alarmas;

import java.util.ArrayList;

public class Sensor_Complejo extends Sensor{
    private ArrayList<SensorIndividual> sensor_grupo;

    public Sensor_Complejo(double umbral, ArrayList<SensorIndividual> sensor_grupo) {
        super(umbral);
        this.sensor_grupo = sensor_grupo;
    }

    @Override
    public void dispararAlarma(){
        double real = 0, umbral = 0, promUmbral, promReal;
        int cant = 0;

        for (SensorIndividual sen : sensor_grupo){
            umbral += sen.getUmbral();
            real += sen.getReal();
            cant ++;
        }

        promReal = real/cant;
        promUmbral = umbral/cant;

        for (SensorIndividual sen : sensor_grupo) {
            if (sen.isEstado() && promReal > promUmbral){
                sen.imprimirAlarma();
            }
        }
    }

    @Override
    public void imprimirAlarma(){
        System.out.println("Alarma activada para el grupo");
    }
}