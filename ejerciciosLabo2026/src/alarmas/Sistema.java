package alarmas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Sensor> listaSensores;

    public Sistema() {
        this.listaSensores = new ArrayList<>();
    }

    public boolean conectado(SensorIndividual sensorIndividual){
        if (sensorIndividual.isEstado()){
            return true;
        }
        return false;
    }

    public boolean seDispara(double m, double u){ return m > u; }

    public void recorreAlarma(){
        for (Sensor s : listaSensores){
            if (conectado(s)){
                if (seDispara(s.getReal(), s.getUmbral())){
                    s.dispararAlarma();
                }
            }
        }
    }

}
