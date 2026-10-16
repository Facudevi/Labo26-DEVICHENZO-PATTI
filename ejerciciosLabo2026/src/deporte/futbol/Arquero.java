package deporte.futbol;
import seres_vivos.humanos.Jugador;

public class Arquero extends Jugador {
    private double porcAtajadas;
    private int golesRecibidos;

    public Arquero(String nombre, String apellido, Posicion posicion, String provinciaOrigen, int nCamiseta, double porcAtajadas, int golesRecibidos) {
        super(nombre, apellido, Posicion.ARQUERO, provinciaOrigen, nCamiseta);
        this.porcAtajadas = porcAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public double getPorcAtajadas() { return porcAtajadas; }
    public int getGolesRecibidos() { return golesRecibidos; }


    @Override
    public boolean requisitos() {
        if (porcAtajadas>60 && golesRecibidos<10) return true;
        return false;
    }
}