package seres_vivos;
import java.time.LocalDate;

public class Jugador extends Persona {
    private  int nCamiseta;

    public Jugador(String nombre, String apellido, LocalDate fecha, String direccion, int nCamiseta) {
        super(nombre, apellido, fecha, direccion);
        this.nCamiseta = nCamiseta;
    }

    public int getnCamiseta() {return nCamiseta;}
    public void setnCamiseta(int nCamiseta) {this.nCamiseta = nCamiseta;}

}