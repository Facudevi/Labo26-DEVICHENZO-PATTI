package alarmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Sensor> listaSensores;

    public Sistema() {
        this.listaSensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor s) { listaSensores.add(s); }
    public boolean seDispara(double m, double u){ return m > u; }

    public void recorrerAlarma(){
        for (Sensor s : listaSensores){
            if (s.isConectado()){
                if (seDispara(s.getMedida(), s.getUmbral())){
                    s.dispararAlarma();
                }
            }
        }
    }

    public int obtenerLongitud(){ return listaSensores.size(); }

    public boolean comprobarSensor (int numSensor){
        if(numSensor < obtenerLongitud() && numSensor > 0) return true;
        return false;
    }

}