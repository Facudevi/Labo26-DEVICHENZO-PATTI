package seres_vivos.humanos;
import deporte.futbol.Plantel;
import deporte.futbol.Posicion;

import java.time.LocalDate;

public abstract class Jugador extends Plantel {
    private Posicion posicion;
    private String provinciaOrigen;
    private int nCamiseta;

    public Jugador(String nombre, String apellido, LocalDate fecha, int nCamiseta) {
        super(nombre, apellido, fecha);
        this.nCamiseta = nCamiseta;
    }

    public Jugador(String nombre, String apellido, Posicion posicion, String provinciaOrigen, int nCamiseta) {
        super(nombre, apellido);
        this.posicion = posicion;
        this.provinciaOrigen = provinciaOrigen;
        this.nCamiseta = nCamiseta;
    }

    public Posicion getPosicion() { return posicion; }
    public String getProvinciaOrigen() { return provinciaOrigen; }
    public int getnCamiseta() { return nCamiseta; }
}