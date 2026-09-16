package entregas_drones;

import java.time.LocalDate;

public abstract class Drone {
    private String nModelo;
    private LocalDate fechaAdq;
    private Bateria bateria;
    private static int contador  = 0;
    private EstadoDrone estado;
    private int id;

    private static double latitud = -34.573195;
    private static double longitud = -58.504111;

    public Drone(String nModelo, LocalDate fechaAdq, Bateria bateria, EstadoDrone estado, int id) {
        this.nModelo = nModelo;
        this.fechaAdq = fechaAdq;
        this.bateria = bateria;
        this.estado = estado;
        this.id = contador;
        contador++;
    }

    public String getnModelo() { return nModelo; }
    public LocalDate getFechaAdq() { return fechaAdq; }
    public Bateria getBateria() { return bateria; }
    public static int getContador() { return contador; }
    public EstadoDrone getEstado() { return estado; }
    public int getId() { return id; }
    public static double getLatitud() { return latitud; }
    public static double getLongitud() { return longitud; }

    public void setBateria(Bateria bateria) { this.bateria = bateria; }


    public void recargar(){
        Bateria[] valoresBateria = Bateria.values();
        if(bateria.getValor()>=20 && bateria.getValor()<100){
            bateria = valoresBateria[(bateria.ordinal()+1)                    ];
        }
        else{
            bateria = Bateria.CIEN;
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
}