package comida.recetas;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private double precio;
    private Dificultad dificultad;
    private ArrayList<String> listaPasos;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Plato(String nombre, Dificultad dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.listaPasos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public Dificultad getDificultad() { return dificultad; }
    public ArrayList<String> getListaPasos() { return listaPasos; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setDificultad(Dificultad dificultad) { this.dificultad = dificultad; }
    public void setListaPasos(ArrayList<String> listaPasos) { this.listaPasos = listaPasos; }


    public abstract void mostrarDetalle();
}