package prestar;

import colores.Color;

public abstract class Prenda {
    private Color color;
    private Material material;
    private String marca;
    private boolean estado;

    public Prenda(Color color, Material material, String marca, boolean estado) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public Color getColor() { return color; }
    public Material getMaterial() { return material; }
    public String getMarca() { return marca; }
    public boolean isEstado() { return estado;}


    @Override
    public String toString() {
        return "Color: " + color +
                "\n| Material: " + material +
                "\n| Marca: " + marca +
                "\n| Buen estado?: " + estado;
    }
}