package vehiculos;

import java.time.LocalDate;

public class Camioneta extends Vehiculo_Patentado{
    private double capCarga;
    private double cargaActual;

    public Camioneta(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabric, double velocidad, String patente, double capCarga, double cargaActual) {
        super(marca, modelo, color, cantRuedas, fechaFabric, velocidad, patente);
        this.capCarga = capCarga;
        this.cargaActual = cargaActual;
    }

    public double getCapCarga() {
        return capCarga;
    }
    public double getCargaActual() {
        return cargaActual;
    }

    public void setCapCarga(double capCarga) {
        this.capCarga = capCarga;
    }
    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public double sumarCarga(double carga){
        return cargaActual + carga;
    }

    public boolean agregaCarga(double kg) {
        if (sumarCarga(kg) > capCarga) {
            return false;
        }
        cargaActual = sumarCarga(kg);
        return true;
    }

    public void verCamioneta(){
        System.out.println("--Camioneta--");
        super.mostrarD();
        System.out.println("Capacidad de carga: " + capCarga + " kg");
        System.out.println("Carga actual: " + cargaActual + " kg");
    }
}