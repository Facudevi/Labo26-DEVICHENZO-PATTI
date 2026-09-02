package seres_vivos.humanos;
import fecha.Dia;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona {
    private int legajo;
    private String telefono;
    private HashSet<Dia> diaAsistencia;
    private HashSet<LocalDateTime> listaAsistencia;
    private static int contador = 1;

    public Empleado(String nombre, String apellido, LocalDate fecha, int legajo, String telefono) {
        super(nombre, apellido, fecha);
        this.legajo = contador;
        this.telefono = telefono;
        this.diaAsistencia = new HashSet<>();
        this.listaAsistencia = new HashSet<>();
        contador ++;
    }

    public int getLegajo() { return legajo; }
    public String getTelefono() { return telefono; }
    public HashSet<Dia> getDiaAsistencia() { return diaAsistencia; }
    public HashSet<LocalDateTime> getListaAsistencia() { return listaAsistencia; }


    public void agregarDia(Dia dia){
        if (diaAsistencia.contains(dia)) System.out.println("Ya se encuentra este dia");
        else {
            diaAsistencia.add(dia);
            System.out.println("Se agregó correctamente");
        }
    }



}