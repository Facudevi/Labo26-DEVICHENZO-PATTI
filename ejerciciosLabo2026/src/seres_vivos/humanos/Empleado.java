package seres_vivos.humanos;
import fecha.Dia;
import seres_vivos.humanos.personas.Persona;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona {
    private int legajo;
    private String telefono;
    private HashSet<Dia> diaAsistencia;
    private HashSet<LocalDateTime> listaAsistencia;
    private static int contador = 1;

    public Empleado(String nombre, String apellido, LocalDate fecha, String telefono) {
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


    public boolean coincideFecha(LocalDateTime fecha) {
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        for (Dia d : diaAsistencia) {
            if (d.getDiaN() == diaSemana.getValue()) {
                return true;
            }
        }
        return false;
    }


    public void agregarRegistro(LocalDateTime fechaHora){
        if (!coincideFecha(fechaHora)) {
            System.out.println("El empleado no tiene asignado trabajar ese día");
        }
        else if (listaAsistencia.contains(fechaHora)) {
            System.out.println("Ya existe un registro de ingreso para esta fecha y hora");
        }
        else {
            listaAsistencia.add(fechaHora);
            System.out.println("Ingreso registrado correctamente");
        }
    }


    public double calcularPorcentaje(int mes, int anio){
        int asistencia = 0, contador = 0;

        for (LocalDateTime fecha : listaAsistencia){
            if (fecha.getMonthValue() == mes && fecha.getYear() == anio){
                asistencia ++;
            }
        }

        LocalDate fechaInicio = LocalDate.of(anio, mes, 1);
        int diasDelMes = fechaInicio.lengthOfMonth();

        for (int i = 1; i <= diasDelMes; i++) {
            LocalDateTime diaActual = LocalDateTime.of(anio, mes, i, 0, 0);
            if (coincideFecha(diaActual)) {
                contador++;
            }
        }

        return ((double)asistencia * 100) / contador;
    }
}