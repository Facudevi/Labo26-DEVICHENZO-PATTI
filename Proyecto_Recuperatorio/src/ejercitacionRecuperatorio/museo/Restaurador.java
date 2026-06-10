package ejercitacionRecuperatorio.museo;
import ejercitacionRecuperatorio.Persona;

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
        Estado_Cuadro viejo = obra.getEstado();
        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - obra.getAnio();
        int mejora;

        if (antiguedad >= 25 && (obra.getEstado().ordinal() < 9)){
            mejora = obra.getEstado().ordinal()+2;
            obra.setEstado(Estado_Cuadro.values()[mejora]);
        }
        else if (antiguedad < 25 && (obra.getEstado().ordinal() < 8)){
            mejora = obra.getEstado().ordinal()+3;
            obra.setEstado(Estado_Cuadro.values()[mejora]);
        }
        else if (obra.getEstado().ordinal() == 10){
            System.out.println("El cuadro esta en perfecto estado");
        }
        else {
            obra.setEstado(Estado_Cuadro.values()[10]);
        }

        return "Restauracion completada por " + super.getNombre() + " " + super.getApellido() + ":\n" +
                "Obra: '" + obra.getTitulo() + "'\n" +
                "Estado anterior: " + viejo.ordinal()+1 + "/10\n" +
                "Estado actual: " + obra.getEstado().ordinal()+1 + "/10\n";
    }
}