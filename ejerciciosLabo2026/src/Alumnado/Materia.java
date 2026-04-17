package Alumnado;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private ArrayList <String> contenidos;
    private int inscriptos;


    public Materia(String nombre){
        this.nombre = nombre;
        this.contenidos = contenidos;
        this.inscriptos = inscriptos;
    }

    public String getNombre() {
        return nombre;
    }
    public ArrayList<String> getContenidos() {
        return contenidos;
    }
    public int getInscriptos() {
        return inscriptos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContenidos(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }
    public void setInscriptos(int inscriptos) {
        this.inscriptos = inscriptos;
    }
}
