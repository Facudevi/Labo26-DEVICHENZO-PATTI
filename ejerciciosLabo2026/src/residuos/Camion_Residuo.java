package residuos;

import java.util.HashSet;

public class Camion_Residuo {
    private String patente, marca, modelo;
    private double capacidadMax;
    private static int autonomia = 45;
    private HashSet<Tipo_Residuo> tiposAutorizados;

    public Camion_Residuo(String patente, String marca, String modelo, double capacidadMax){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadMax = capacidadMax;
        this.tiposAutorizados = new HashSet<>();
    }

    public String getPatente() { return patente; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getCapacidadMax() { return capacidadMax; }
    public static int getAutonomia() { return autonomia; }
    public HashSet<Tipo_Residuo> getTiposAutorizados() { return tiposAutorizados; }


    public void autorizarResiduo(Tipo_Residuo r){
        tiposAutorizados.add(r);
    }

    public boolean puedeTransportar(Tipo_Residuo r){
        return tiposAutorizados.contains(r);
    }
}