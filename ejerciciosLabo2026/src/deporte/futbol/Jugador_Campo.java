package deporte.futbol;
import seres_vivos.humanos.Jugador;

public class Jugador_Campo extends Jugador {
    private int porcGoles;
    private int asistencias;

    public Jugador_Campo(String nombre, String apellido, Posicion posicion, String provinciaOrigen, int nCamiseta, int porcGoles, int asistencias) {
        super(nombre, apellido, posicion, provinciaOrigen, nCamiseta);
        this.porcGoles = porcGoles;
        this.asistencias = asistencias;
    }

    public int getPorcGoles() { return porcGoles; }
    public int getAsistencias() { return asistencias; }


    @Override
    public boolean requisitos() {
        if (porcGoles>30 && asistencias>10) return true;
        return false;
    }
}