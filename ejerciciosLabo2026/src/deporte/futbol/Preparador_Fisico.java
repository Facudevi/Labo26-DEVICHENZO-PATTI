package deporte.futbol;

import java.time.LocalDate;

public class Preparador_Fisico extends Cuerpo_Tecnico{
    private String especialidad;
    private boolean matricula;

    public Preparador_Fisico(String nombre, String apellido, LocalDate fecha, String titulo, int aniosExperiencia, String especialidad, boolean matricula) {
        super(nombre, apellido, fecha, titulo, aniosExperiencia);
        this.especialidad = especialidad;
        this.matricula = matricula;
    }

    public String getEspecialidad() { return especialidad; }
    public boolean isMatricula() { return matricula; }


    @Override
    public boolean requisitos(){
        if (isMatricula() && this.getAniosExperiencia()>2) return true;
        else throw new YaTrabajoException("No cumple con los requisitos en el club");
    }
}