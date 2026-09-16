package entregas_drones;

import java.time.LocalDate;

public class Carga extends Drone {
    private double pesoCarga;

    public Carga(String nModelo, LocalDate fechaAdq, Bateria bateria, EstadoDrone estado, int id, double pesoCarga) {
        super(nModelo, fechaAdq, bateria, estado, id);
        this.pesoCarga = pesoCarga;
    }


    @Override
    public boolean ejecutarMision(double latDestino, double longDestino) {
        double distancia = Distancia.calcularDistancia(Drone.getLatitud(), Drone.getLongitud(), latDestino, longDestino);

        if (distancia <=30 && getBateria().getValor()>50){
            System.out.println("Misión exitosa");
            return true;
        }
        System.out.println("No hay batería suficiente para ejecutar la misión");
        return false;
    }
}