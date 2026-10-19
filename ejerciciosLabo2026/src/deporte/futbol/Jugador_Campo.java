package deporte.futbol;
import seres_vivos.humanos.Jugador;

import java.time.LocalDate;

public class Jugador_Campo extends Jugador {
    private double porcGoles;
    private int asistencias;

    public Jugador_Campo(String nombre, String apellido, LocalDate fecha, Posicion posicion, String provinciaOrigen, int nCamiseta, double porcGoles, int asistencias) {
        super(nombre, apellido, fecha, posicion, provinciaOrigen, nCamiseta);
        this.porcGoles = porcGoles;
        this.asistencias = asistencias;
    }

    public double getPorcGoles() { return porcGoles; }
    public int getAsistencias() { return asistencias; }


    @Override
    public void requisitosContratar() throws NoCumpleRequisitosException {
        if (porcGoles <= 30.0 || asistencias <= 10) {
            throw new NoCumpleRequisitosException("El " + getPosicion().name().toLowerCase() + "no cumple con las métricas necesarias");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Goles convertidos: " + porcGoles +
                "% | Asistencias: " + asistencias;
    }
}