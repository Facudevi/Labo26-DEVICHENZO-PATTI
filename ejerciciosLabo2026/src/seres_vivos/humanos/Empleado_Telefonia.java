package seres_vivos.humanos;
import empresas_negocios.telefonia.Provincia;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;

public class Empleado_Telefonia extends Persona {
    private String pais;
    private String numTel;
    private Provincia provincia;
    private String codigoPais;
    private String franjaHoraria;

    public Empleado_Telefonia(String nombre, String apellido, LocalDate fecha, String direccion, int DNI, String pais, String numTel, Provincia provincia, String codigoPais, String franjaHoraria) {
        super(nombre, apellido, fecha, direccion, String.valueOf(DNI));
        this.pais = pais;
        this.numTel = numTel;
        this.provincia = provincia;
        this.codigoPais = codigoPais;
        this.franjaHoraria = franjaHoraria;
    }

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

    public void setPais(String pais) { this.pais = pais; }
    public void setNumTel(String numTel) { this.numTel = numTel; }
    public void setProvincia(Provincia provincia) { this.provincia = provincia; }
    public void setCodigoPais(String codigoPais) { this.codigoPais = codigoPais; }
    public void setFranjaHoraria(String franjaHoraria) { this.franjaHoraria = franjaHoraria; }

    public boolean tieneTelefono(String telefono) {
        return this.numTel.equals(telefono);
    }

    public boolean tieneMismoDniQue(String dni) {
        return this.getDNI().equals(dni);
    }

    public boolean viveEnElMismoPaisQue(Empleado_Telefonia otroEmpleado) {
        return this.pais.equalsIgnoreCase(otroEmpleado.pais);
    }
}