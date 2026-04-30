package colegio;
import persona.Alumno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList <String> contenidos;
    private ArrayList <Alumno> inscriptos;

    public Materia(String nombre, ArrayList<String> contenidos, ArrayList<Alumno> inscriptos){
        this.nombre = nombre;
        this.contenidos = contenidos;
        this.inscriptos = inscriptos;
    }

    public String getNombre() {return nombre;}
    public ArrayList<String> getContenidos() {return contenidos;}
    public ArrayList<Alumno> getInscriptos() {return inscriptos;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setContenidos(ArrayList<String> contenidos) {this.contenidos = contenidos;}
    public void setInscriptos(ArrayList<Alumno> inscriptos) {this.inscriptos = inscriptos;}

    public float edadMateria(){
        int cont = 0;
        int suma = 0;
        for (Alumno edadAlumno : inscriptos){
            suma += (LocalDate.now().getYear() - edadAlumno.getFecha().getYear());
            cont ++;
        }

        return (suma / cont);
    }

    public void InscribirAlumno(Alumno alumno) {
        if (!inscriptos.contains(alumno)) {
            inscriptos.add(alumno);
            alumno.AgregarMateria(this);
        }
        else {
            System.out.println("El alumno ya esta inscripto en la materia.");
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

    public static void main(String[] args) {
        ArrayList<Float> listaNotas1 = new ArrayList<>();
        ArrayList<Float> listaNotas2 = new ArrayList<>();
        ArrayList<Float> listaNotas3 = new ArrayList<>();
        listaNotas1.add(2.5f);
        listaNotas1.add(5f);
        listaNotas1.add(8.5f);
        listaNotas2.add(6f);
        listaNotas2.add(5f);
        listaNotas2.add(7.5f);


        ArrayList<String> contenidos1 = new ArrayList<>();
        ArrayList<String> contenidos2 = new ArrayList<>();
        ArrayList<String> contenidos3 = new ArrayList<>();

        ArrayList<Materia>  listaMaterias1 = new ArrayList<>();
        ArrayList<Materia>  listaMaterias2 = new ArrayList<>();
        ArrayList<Materia>  listaMaterias3 = new ArrayList<>();

        ArrayList<Alumno> inscriptos1 = new ArrayList<>();
        ArrayList<Alumno> inscriptos2 = new ArrayList<>();
        ArrayList<Alumno> inscriptos3 = new ArrayList<>();


        Alumno alumno1 = new Alumno("Juan", "Pérez", LocalDate.of(2005, 5, 15), "Estado 604", listaNotas1, listaMaterias1);
        Alumno alumno2 = new Alumno("María", "García", LocalDate.of(2003, 10, 20), "Carabobo 1874", listaNotas2, listaMaterias2);

        Materia materia1 = new Materia("Programación Orientada a Objetos", contenidos1, inscriptos1);
        Materia materia2 = new Materia("Base de Datos", contenidos2, inscriptos2);

        materia1.AgregarContenido("Archivos");
        materia1.AgregarContenido("Colecciones y Listas");
        materia2.AgregarContenido("Modelado Entidad-Relación");

        materia1.InscribirAlumno(alumno1);
        materia1.InscribirAlumno(alumno2);
        materia2.InscribirAlumno(alumno1);


        alumno1.AgregarNota(8.5f);
        alumno1.AgregarNota(9);
        alumno1.AgregarNota(3.5f);


        System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido());
        System.out.println("Mayor nota: " + alumno1.MayorNota());
        System.out.println("Menor nota: " + alumno1.MenorNota());
        System.out.println("Promedio general: " + alumno1.PromedioNota());

        System.out.println("Materia: " + materia1.getNombre());
        System.out.println("Promedio de edad en la materia: " + materia1.edadMateria());
        materia1.listarAlumnos();


        Alumno alumnoNuevo = new Alumno("Carlos", "Sánchez", LocalDate.of(2000, 1, 1), "Duhalde 3244", listaNotas3, listaMaterias3);
        System.out.println("Mayor nota (esperado null): " + alumnoNuevo.MayorNota());
        System.out.println("Promedio (esperado 0.0): " + alumnoNuevo.PromedioNota());

        System.out.println("\n--- Materias de " + alumno1.getNombre() + " ---");
        for (Materia m : alumno1.getListaMaterias()) {
            System.out.println("- " + m.getNombre());
        }
    }
}