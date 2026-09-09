package familia;

import java.util.HashSet;

public class Plato_Familia {
    private String nombre;
    private HashSet<String> ingredientes;
    private int cantCalorias;

    public Plato_Familia(String nombre, HashSet<String> ingredientes, int cantCalorias) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cantCalorias = cantCalorias;
    }

    public String getNombre() { return nombre; }
    public HashSet<String> getIngredientes() { return ingredientes; }
    public int getCantCalorias() { return cantCalorias; }
}