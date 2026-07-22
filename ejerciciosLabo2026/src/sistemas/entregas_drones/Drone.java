package sistemas.entregas_drones;

import java.time.LocalDate;

public abstract class Drone {
    private String nModelo;
    private LocalDate fechaAdq;
    private int bateria;
    private static int contador = 0;
    private EstadoDrone estado;
    private int id;

    private static double latitud = -34.573195;
    private static double longitud = -58.504111;

    public Drone(String nModelo, LocalDate fechaAdq, int bateria, EstadoDrone estado, int id) {
        this.nModelo = nModelo;
        this.fechaAdq = fechaAdq;
        this.bateria = bateria;
        this.estado = estado;
        contador++;
        this.id = contador;
    }

    public String getnModelo() { return nModelo; }
    public LocalDate getFechaAdq() { return fechaAdq; }
    public int getBateria() { return bateria; }
    public static int getContador() { return contador; }
    public EstadoDrone getEstado() { return estado; }
    public int getId() { return id; }
    public static double getLatitud() { return latitud; }
    public static double getLongitud() { return longitud; }

    public void setBateria(int bateria) { this.bateria = bateria; }


    public void recargar(){
        if (this.bateria <= 20) this.bateria = 100;
        else{
            this.bateria += 10;
            if (this.bateria > 100) this.bateria = 100;
        }
    }


    public void rastrear(){
        if (this.estado == EstadoDrone.VUELO || this.estado == EstadoDrone.OPERATIVO){
            System.out.println("Rastreando drone... ID del drone: " + this.id);
        }
        else {
            System.out.println("No se puede rastrear el drone por su estado actual");
        }
    }


    public abstract boolean ejecutarMision(double latDestino, double longDestino);


    public double calcularDistancia(double latDestino, double longDestino) {
        double lat1Rad = Math.toRadians(latitud);
        double lon1Rad = Math.toRadians(longitud);
        double lat2Rad = Math.toRadians(latDestino);
        double lon2Rad = Math.toRadians(longDestino);

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;

        return radioTierraKm * c;
    }
}