package Alumnado;
import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
    private String nombre, apellido;
    private LocalDate fecha;
    private ArrayList<Float> listaNotas;

    public Alumno() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public ArrayList<Float> getListaNotas() {
        return listaNotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setListaNotas(ArrayList<Float> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void AgregarNota(float nota){
        this.listaNotas.add(nota);
    }

    public float MenorNota(){
        float notaMenor= 10;                       // = this.listaNotas.get(0);
        for (float menor : this.listaNotas){
            if (menor > notaMenor){
                notaMenor = menor;
            }
        }
        return notaMenor;
    }

    public float MayorNota(){
        float notaMayor = 0;
        for (float mayor : this.listaNotas){
            if (mayor > notaMayor){
                notaMayor = mayor;
            }
        }
        return notaMayor;
    }
}