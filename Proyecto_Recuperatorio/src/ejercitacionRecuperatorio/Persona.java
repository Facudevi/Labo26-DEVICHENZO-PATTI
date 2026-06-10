package ejercitacionRecuperatorio;
import java.time.LocalDate;

public class Persona {
    private String nombre, apellido;
    private LocalDate fecha;
    private String direccion;

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

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public LocalDate getFecha() {return fecha;}
    public String getDireccion() {return direccion;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

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

    public static void main(String[] args){
        Persona persona1 = new Persona("Camila", "Estevez", LocalDate.of(1999, 2, 27), "Superi 2001");
        persona1.imprimirDatos();
    }
}