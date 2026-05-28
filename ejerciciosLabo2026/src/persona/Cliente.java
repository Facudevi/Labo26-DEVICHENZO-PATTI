package persona;

import java.time.LocalDate;

public class Cliente extends Persona{
    private String celular;

    public Cliente(String nombre, String apellido, LocalDate fecha, String direccion, String celular) {
        super(nombre, apellido, fecha, direccion);
        this.celular = celular;
    }

    public String getCelular(){ return celular; }
    public void setCelular(String celular){ this.celular = celular; }
}