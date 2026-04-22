package alumnado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Materia {
    private String nombre;
    private ArrayList <String> contenidos;
    private ArrayList <Alumno> inscriptos;

    public Materia(String nombre, ArrayList<String> contenidos, ArrayList<Alumno> inscriptos){
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
    public ArrayList<Alumno> getInscriptos() {
        return inscriptos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContenidos(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }
    public void setInscriptos(ArrayList<Alumno> inscriptos) {
        this.inscriptos = inscriptos;
    }

    public float edadMateria(){
        float prom;
        int cont = 0;
        int suma = 0;
        for (Alumno edadAlumno : inscriptos){
            suma += (LocalDate.now().getYear() - edadAlumno.getFecha().getYear());
            cont ++;
        }
        prom = suma / cont;
        return prom;
    }

    public void InscribirAlumno(Alumno alumno) {
        if (!inscriptos.contains(alumno)) {
            inscriptos.add(alumno);
            alumno.AgregarMateria(this);
        }
    }

    public void AgregarContenido(String contenido) {
        this.contenidos.add(contenido);
    }

    public void listarAlumnos() {
        System.out.println("Alumnos en " + nombre + ":");
        for (Alumno a : inscriptos) {
            System.out.println("- " + a.getNombre() + " " + a.getApellido());
        }
    }
}