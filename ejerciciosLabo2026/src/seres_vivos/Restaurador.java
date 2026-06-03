package seres_vivos;
import objetos.Cuadro;
import java.time.LocalDate;

public class Restaurador extends Persona {
    private int dni;
    private int experiencia;

    public Restaurador(String nombre, String apellido, LocalDate fecha, String direccion, int dni, int experiencia) {
        super(nombre, apellido, fecha, direccion);
        this.dni = dni;
        this.experiencia = experiencia;
    }

    public int getDni() { return dni; }
    public int getExperiencia() { return experiencia; }

    public void setDni(int dni) { this.dni = dni; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public String restaurar(Cuadro obra){
        int estadoInicial = obra.getEstado();
        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - obra.getAnio();
        int mejora;

        if (antiguedad >= 25){
            mejora = 2;
        }
        else {
            mejora = 3;
        }

        int estadoNuevo = Math.min(estadoInicial + mejora, 10);
        obra.setEstado(estadoNuevo);

        return "Restauracion completada por " + super.getNombre() + " " + super.getApellido() + ":\n" +
                "Obra: '" + obra.getTitulo() + "'\n" +
                "Estado anterior: " + estadoInicial + "/10\n" +
                "Estado actual: " + estadoNuevo + "/10\n";
    }
}