package alarmas;

import java.util.ArrayList;

public class Sensor_Complejo extends Sensor{
    private ArrayList<SensorIndividual> listaSensores;

    public Sensor_Complejo(double umbral) {
        super(umbral);
        this.listaSensores = new ArrayList<>();
    }

    public void agregar(SensorIndividual s) { listaSensores.add(s); }

    @Override
    public double getMedida() {
        double suma = 0;
        int cont = 0;
        for (Sensor s : listaSensores) {
            if (s.isConectado()) {
                suma = suma + s.getMedida();
                cont = cont + 1;
            }
        }
        if (cont == 0) return 0;
        return suma / cont;
    }

    @Override
    public void dispararAlarma(){
        imprimirAlarma();
    }

    @Override
    public void imprimirAlarma() { System.out.println("Alerta: El promedio superó el umbral."); }
}