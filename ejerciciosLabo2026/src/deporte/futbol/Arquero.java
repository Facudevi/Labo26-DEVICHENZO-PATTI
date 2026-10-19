package deporte.futbol;
import seres_vivos.humanos.Jugador;

import java.time.LocalDate;

public class Arquero extends Jugador {
    private double porcAtajadas;
    private int golesRecibidos;

    public Arquero(String nombre, String apellido, LocalDate fecha, Posicion posicion, String provinciaOrigen, int nCamiseta, double porcAtajadas, int golesRecibidos) {
        super(nombre, apellido, fecha, Posicion.ARQUERO, provinciaOrigen, nCamiseta);
        this.porcAtajadas = porcAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public double getPorcAtajadas() { return porcAtajadas; }
    public int getGolesRecibidos() { return golesRecibidos; }


    @Override
    public void requisitosContratar() throws NoCumpleRequisitosException {
        if (porcAtajadas <= 60.0 || golesRecibidos >= 10) {
            throw new NoCumpleRequisitosException("El arquero no cumple con las métricas necesarias");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Atajadas: " + porcAtajadas +
                "% | Goles recibidos: " + golesRecibidos;
    }
}