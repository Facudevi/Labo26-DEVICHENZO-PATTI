package A1;

import java.util.HashSet;

public class Regalo {
    private String nombre;
    private HashSet<String> materialesNecesarios;
    private Tamanio tamanio;

    public Regalo(String nombre, Tamanio tamanio) {
        this.nombre = nombre;
        this.materialesNecesarios = new HashSet<>();
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<String> getMaterialesNecesarios() {
        return materialesNecesarios;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void agregarMaterial(String m){
        materialesNecesarios.add(m);
    }

    @Override
    public String toString() {
        return nombre + " | Tamaño: " + tamanio;
    }
}