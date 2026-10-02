package seres_vivos.humanos;
import biblioteca_virtual.Libro_Electronico;
import biblioteca_virtual.Tipo_Membresia;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario_Libro extends Persona {
    private String mail;
    private Tipo_Membresia membresia;
    private ArrayList<Libro_Electronico> listaPrestamo;

    public Usuario_Libro(String nombre, String apellido, LocalDate fecha, String DNI, String mail, Tipo_Membresia membresia) {
        super(nombre, apellido, fecha, DNI);
        this.mail = mail;
        this.membresia = membresia;
        this.listaPrestamo = new ArrayList<>();
    }

    public String getMail() { return mail; }
    public Tipo_Membresia getMembresia() { return membresia; }
    public ArrayList<Libro_Electronico> getListaPrestamo() { return listaPrestamo; }


    public int cantPrestamos(){ return listaPrestamo.size(); }

}