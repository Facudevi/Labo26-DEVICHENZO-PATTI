package seres_vivos.humanos.personas;
import java.time.LocalDate;

public abstract class Persona {
    private String nombre, apellido;
    private LocalDate fecha;
    private String direccion;
    private String DNI;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, LocalDate fecha, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido, LocalDate fecha){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public Persona(String nombre, String apellido, LocalDate fecha, String direccion, String DNI){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.direccion = direccion;
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellido, String DNI){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public LocalDate getFecha() {return fecha;}
    public String getDireccion() {return direccion;}
    public String getDNI() { return DNI; }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}


    public String imprimirDatos(){
        return "Nombre: " + this.nombre +
                "Apellido: " + this.apellido +
                "Edad: " + this.fecha;
    }


    public int calcularEdad(){
        return LocalDate.now().getYear() - this.getFecha().getYear();
    }


    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}