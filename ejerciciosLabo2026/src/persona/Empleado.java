package persona;
import java.time.LocalDate;

public class Empleado extends Persona{
    private int DNI;
    private String pais, numTel;

    public Empleado(String nombre, String apellido, LocalDate fecha, String direccion, int DNI, String pais, String numTel) {
        super(nombre, apellido, fecha, direccion);
        this.DNI = DNI;
        this.pais = pais;
        this.numTel = numTel;
    }

    public int getDNI() { return DNI; }
    public String getPais() { return pais; }
    public String getNumTel() { return numTel; }

    public void setDNI(int DNI) { this.DNI = DNI; }
    public void setPais(String pais) { this.pais = pais; }
    public void setNumTel(String numTel) { this.numTel = numTel; }
}