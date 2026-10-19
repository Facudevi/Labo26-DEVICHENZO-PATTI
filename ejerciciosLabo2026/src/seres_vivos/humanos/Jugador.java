package seres_vivos.humanos;
import deporte.futbol.NoCumpleRequisitosException;
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

    public Jugador(String nombre, String apellido, LocalDate fecha, Posicion posicion, String provinciaOrigen, int nCamiseta) {
        super(nombre, apellido, fecha);
        this.posicion = posicion;
        this.provinciaOrigen = provinciaOrigen;
        this.nCamiseta = nCamiseta;
    }

    public Posicion getPosicion() { return posicion; }
    public String getProvinciaOrigen() { return provinciaOrigen; }
    public int getnCamiseta() { return nCamiseta; }


    @Override
    public void requisitosRenovar() throws NoCumpleRequisitosException{
        if (this.calcularEdad() > 35){
            throw new NoCumpleRequisitosException("Supera la edad para renovación");
        }
    }

    @Override
    public String toString() {
        return "Jugador: " + getNombreCompleto() +
                " | Edad: " + calcularEdad() +
                " | Provincia Origen: " + provinciaOrigen +
                " | Posición: " + posicion +
                " | Camiseta #" + nCamiseta;
    }
}