package vehiculos;

import java.time.LocalDate;

public class Vehiculo_Patentado extends Vehiculo{
    private double velocidad;
    private String patente;

    public Vehiculo_Patentado(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabric, double velocidad, String patente) {
        super(marca, modelo, color, cantRuedas, fechaFabric);
        this.velocidad = velocidad;
        this.patente = patente;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public String getPatente() {
        return patente;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public  void  acelerar (double incremento){
        this.velocidad += incremento;
    }

    public void  frenar(){
        this.velocidad = 0;
    }

    public void mostrarD(){
        super.mostrarDatos();
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Patente: " + patente);;
    }
}