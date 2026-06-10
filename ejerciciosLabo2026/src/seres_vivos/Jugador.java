package seres_vivos;

import java.time.LocalDate;

public class Jugador extends Persona {
    private  int nCamiseta;

    public Jugador(String nombre, String apellido, LocalDate fecha, int nCamiseta) {
        super(nombre, apellido, fecha);
        this.nCamiseta = nCamiseta;
    }

    public int getnCamiseta() {return nCamiseta;}
    public void setnCamiseta(int nCamiseta) {this.nCamiseta = nCamiseta;}
}