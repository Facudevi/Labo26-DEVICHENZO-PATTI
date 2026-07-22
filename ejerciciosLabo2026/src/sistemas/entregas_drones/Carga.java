package sistemas.entregas_drones;

import java.time.LocalDate;

public class Carga extends Drone {
    private double pesoCarga;

    public Carga(String nModelo, LocalDate fechaAdq, int bateria, EstadoDrone estado, int id, double pesoCarga) {
        super(nModelo, fechaAdq, bateria, estado, id);
        this.pesoCarga = pesoCarga;
    }


    @Override
    public boolean ejecutarMision(double latDestino, double longDestino) {
        double distancia = calcularDistancia(latDestino, longDestino);

        if (distancia < 30 && this.getBateria() >= 48){
            this.setBateria(this.getBateria() - 48);
            System.out.println("Misión exitosa");
            return true;
        }
        System.out.println("No hay batería suficiente para ejecutar la misión");
        return false;
    }
}