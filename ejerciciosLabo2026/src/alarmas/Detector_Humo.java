package alarmas;

import java.time.LocalDate;

public class Detector_Humo extends SensorIndividual {

    public Detector_Humo(boolean estado, double medida, LocalDate anio) {
        super(80, estado, medida, anio);
    }

    @Override
    public void dispararAlarma(){
        imprimirAlarma();
    }

    @Override
    public void imprimirAlarma(){
        System.out.println("Se están llamando a los bomberos");
    }
}