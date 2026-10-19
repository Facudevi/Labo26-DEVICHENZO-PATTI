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
    public void requisitosContratar() throws NoCumpleRequisitosException{
        if (!matricula || getAniosExperiencia() < 2) {
            throw new NoCumpleRequisitosException("El preparador físico no posee matrícula habilitante o no alcanza los 2 años de experiencia");
        }
    }

    @Override
    public void requisitosRenovar() throws NoCumpleRequisitosException{
        if (!matricula) {
            throw new NoCumpleRequisitosException("El preparador físico no puede renovar porque su matrícula no se encuentra habilitada");
        }
    }

    @Override
    public String toString() {
        return "Preparador Físico: " + super.toString() +
                " | Especialidad: " + especialidad +
                " | Matrícula: " + (matricula ? "Habilitada" : "Inhabilitada");
    }
}