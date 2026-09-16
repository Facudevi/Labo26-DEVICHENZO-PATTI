package entregas_drones;

import java.time.LocalDate;

public class Vigilancia extends Drone {
    private double cantMemoriaSd;
    private static int espacioFoto = 12;

    public Vigilancia(String nModelo, LocalDate fechaAdq, Bateria bateria, EstadoDrone estado, int id, double cantMemoriaSd) {
        super(nModelo, fechaAdq, bateria, estado, id);
        this.cantMemoriaSd = cantMemoriaSd;
    }


    @Override
    public boolean ejecutarMision(double latDestino, double longDestino) {
        double distancia = Distancia.calcularDistancia(Drone.getLatitud(), Drone.getLongitud(), latDestino, longDestino);
        int cantidadFotos = (int) (distancia / 2);
        double memoriaNecesaria = cantidadFotos * espacioFoto;

        if (this.cantMemoriaSd >= memoriaNecesaria){
            System.out.println("Misión exitosa");
            return true;
        }
        System.out.println("No hay suficiente memoria SD para ejecutar la misión");
        return false;
    }
}