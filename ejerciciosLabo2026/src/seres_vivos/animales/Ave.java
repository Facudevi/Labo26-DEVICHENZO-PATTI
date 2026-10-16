package seres_vivos.animales;

import colores.Color;

public abstract class Ave {
    private String nombre;
    private Color color;
    private String especie;

    public Ave(String nombre, Color color, String especie) {
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
    }

    public String getNombre() { return nombre; }
    public Color getColor() { return color; }
    public String getEspecie() { return especie; }
}