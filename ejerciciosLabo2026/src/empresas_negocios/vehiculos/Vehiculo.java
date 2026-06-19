package empresas_negocios.vehiculos;
import colores.Color;
import empresas_negocios.vehiculos.empresa.Marca;

import java.time.LocalDate;

public abstract class Vehiculo {
    private Marca marca;
    private  String modelo;
    private Color color;
    private int cantRuedas;
    private LocalDate fechaFabric;

    public Vehiculo(Marca marca, String modelo, Color color, int cantRuedas, LocalDate fechaFabric) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.fechaFabric = fechaFabric;
    }

    public Marca getMarca() {
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

    public void setMarca(Marca marca) {
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