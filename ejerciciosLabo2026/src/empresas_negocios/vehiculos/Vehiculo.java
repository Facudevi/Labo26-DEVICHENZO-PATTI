package empresas_negocios.vehiculos;
import colores.Color;

import java.time.LocalDate;

public class Vehiculo {
    private  String marca;
    private  String modelo;
    private Color color;
    private int cantRuedas;
    private LocalDate fechaFabric;

    public Vehiculo(String marca, String modelo, Color color, int cantRuedas, LocalDate fechaFabric) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.fechaFabric = fechaFabric;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Color getColor() {
        return color;
    }
    public int getCantRuedas() {
        return cantRuedas;
    }
    public LocalDate getFechaFabric() {
        return fechaFabric;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    public void setFechaFabric(LocalDate fechaFabric) {
        this.fechaFabric = fechaFabric;
    }

    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Cantidad de ruedas: " + cantRuedas);
        System.out.println("Fecha de fabricacion: " + fechaFabric);
    }
}