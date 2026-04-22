package museo;

import java.time.LocalDate;

public class Restaurador1 {
    private String nombre;
    private String apellido;
    private long dni;
    private LocalDate fechaN;
    private int experiencia;

    public Restaurador1(String nombre, String apellido, long dni, LocalDate fechaN, int experiencia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaN = fechaN;
        this.experiencia = experiencia;
    }

    public String restaurar(Cuadro1 obra){
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

        return "Restauracion completada por " + nombre + " " + apellido + ":\n" +
                "Obra: '" + obra.getTitulo() + "'\n" +
                "Estado anterior: " + estadoInicial + "/10\n" +
                "Estado actual: " + estadoNuevo + "/10\n";
    }
}