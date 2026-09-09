package entregas_drones;

import java.time.LocalDate;

public class Vigilancia extends Drone {
    private double cantMemoriaSd;

    public Vigilancia(String nModelo, LocalDate fechaAdq, int bateria, EstadoDrone estado, int id, double cantMemoriaSd) {
        super(nModelo, fechaAdq, bateria, estado, id);
        this.cantMemoriaSd = cantMemoriaSd;
    }


    @Override
    public boolean ejecutarMision(double latDestino, double longDestino) {
        double distancia = calcularDistancia(latDestino, longDestino);
        int cantidadFotos = (int) (distancia / 2);
        double memoriaNecesaria = cantidadFotos * 12.0;

        if (this.cantMemoriaSd >= memoriaNecesaria){
            System.out.println("Misión exitosa");
            return true;
        }
        System.out.println("No hay suficiente memoria SD para ejecutar la misión");
        return false;
    }
}