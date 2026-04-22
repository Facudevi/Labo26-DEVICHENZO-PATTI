package persona;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona (String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getDireccion(){
        return direccion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Direccion: " + this.direccion);
    }

    public static void main(String[] args){
        Persona persona1 = new Persona("Camila", 28, "Superi 2001");

        persona1.imprimirDatos();
    }
}