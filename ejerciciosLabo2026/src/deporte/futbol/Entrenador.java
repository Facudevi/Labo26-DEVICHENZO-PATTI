package deporte.futbol;

import java.time.LocalDate;

public class Entrenador extends Cuerpo_Tecnico{
    private int cantCampeonatos;
    private boolean licencia;

    public Entrenador(String nombre, String apellido, LocalDate fecha, String titulo, int aniosExperiencia, int cantCampeonatos, boolean licencia) {
        super(nombre, apellido, fecha, titulo, aniosExperiencia);
        this.cantCampeonatos = cantCampeonatos;
        this.licencia = licencia;
    }

    public int getCantCampeonatos() { return cantCampeonatos; }
    public boolean isLicencia() { return licencia; }


    @Override
    public boolean requisitos(){
        if (isLicencia() && this.getAniosExperiencia()>=3) return true;
        else throw new NoCumpleRequisitosException("No respeta los requisitos");
    }
}