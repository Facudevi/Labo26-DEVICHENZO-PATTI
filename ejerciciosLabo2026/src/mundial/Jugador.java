package mundial;
import java.time.LocalDate;

public class Jugador{
    private String nombre, apellido;
    private LocalDate fecha;
    private int nCamiseta;
    private boolean esCapitan;

    public Jugador(String nombre, String apellido, LocalDate fecha, int nCamiseta, boolean esCapitan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.nCamiseta = nCamiseta;
        this.esCapitan = esCapitan;
    }

    public boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public int getnCamiseta() {
        return nCamiseta;
    }

    public void setnCamiseta(int nCamiseta) {
        this.nCamiseta = nCamiseta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}
