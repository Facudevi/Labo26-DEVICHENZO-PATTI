package seres_vivos;
import museo.Cuadro;
import museo.Estado_Cuadro;

import java.time.LocalDate;

public class Restaurador extends Persona {
    private int dni;
    private int experiencia;

    public Restaurador(String nombre, String apellido, LocalDate fecha, int dni, int experiencia) {
        super(nombre, apellido, fecha);
        this.dni = dni;
        this.experiencia = experiencia;
    }

    public int getDni() { return dni; }
    public int getExperiencia() { return experiencia; }

    public void setDni(int dni) { this.dni = dni; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public String restaurar(Cuadro obra){
        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - obra.getAnio();

        Estado_Cuadro[] estados = Estado_Cuadro.values();
        int posicionActual = obra.getEstado().ordinal();
        int ultimaPosicion = estados.length - 1;

        if (posicionActual == ultimaPosicion) {
            return "El cuadro '" + obra.getTitulo() + "' ya está en su estado máximo (" + obra.getEstado() + ").";
        }

        int mejora;
        if (antiguedad >= 25) mejora = 2;
        else mejora = 3;

        int nuevaPosicion = posicionActual + mejora;
        if (nuevaPosicion > ultimaPosicion) {
            nuevaPosicion = ultimaPosicion;
        }

        obra.setEstado(estados[nuevaPosicion]);

        return "Restauracion completada por " + super.getNombreCompleto() +
                "\nObra: '" + obra.getTitulo() + "'\n" +
                "Estado anterior: " + estados[posicionActual].getEstado() + "/10 -> Nuevo estado: " + obra.getEstado().getEstado() + "/10";
    }
}