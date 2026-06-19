package seres_vivos;
import empresas_negocios.telefonia.Provincia;

import java.time.LocalDate;

public class Empleado extends Persona{
    private int DNI;
    private String pais;
    private String numTel;
    private Provincia provincia;
    private String codigoPais;
    private String franjaHoraria;

    public Empleado(String nombre, String apellido, LocalDate fecha, String direccion, int DNI, String pais, String numTel, Provincia provincia, String codigoPais, String franjaHoraria) {
        super(nombre, apellido, fecha, direccion);
        this.DNI = DNI;
        this.pais = pais;
        this.numTel = numTel;
        this.provincia = provincia;
        this.codigoPais = codigoPais;
        this.franjaHoraria = franjaHoraria;
    }

    public int getDNI() { return DNI; }
    public String getPais() { return pais; }
    public String getNumTel() { return numTel; }
    public Provincia getProvincia() {
        return provincia;
    }
    public String getCodigoPais() {
        return codigoPais;
    }
    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setDNI(int DNI) { this.DNI = DNI; }
    public void setPais(String pais) { this.pais = pais; }
    public void setNumTel(String numTel) { this.numTel = numTel; }
    public void setProvincia(Provincia provincia) { this.provincia = provincia; }
    public void setCodigoPais(String codigoPais) { this.codigoPais = codigoPais; }
    public void setFranjaHoraria(String franjaHoraria) { this.franjaHoraria = franjaHoraria; }

    public boolean tieneTelefono(String telefono) {
        return this.numTel.equals(telefono);
    }

    public boolean tieneMismoDniQue(int dni) {
        return this.getDNI()==(dni);
    }

    public boolean viveEnElMismoPaisQue(Empleado otroEmpleado) {
        return this.pais.equalsIgnoreCase(otroEmpleado.pais);
    }
}