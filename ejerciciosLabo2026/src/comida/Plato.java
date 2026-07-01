package comida;

import comida.platos.Tipo;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private double precio;
    private Dificultad dificultad;
    private Tipo tipo;
    private ArrayList<String> listaPasos;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Plato(String nombre, Dificultad dificultad, Tipo tipo) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.tipo = tipo;
        this.listaPasos = new ArrayList<>();
    }



    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public Dificultad getDificultad() { return dificultad; }
    public Tipo getTipo() { return tipo; }
    public ArrayList<String> getListaPasos() { return listaPasos; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setDificultad(Dificultad dificultad) { this.dificultad = dificultad; }
    public void setTipo(Tipo tipo) { this.tipo = tipo; }
    public void setListaPasos(ArrayList<String> listaPasos) { this.listaPasos = listaPasos; }


    public String toString(){
        return "";
    }


    public int cantidadPasos(){
        return listaPasos.size();
    }


    public Plato masCantidadDePasos(Plato plato){
        if (this.cantidadPasos() > plato.cantidadPasos()){
            return this;
        }
        return plato;
    }
}