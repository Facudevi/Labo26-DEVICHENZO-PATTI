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
    public void requisitosContratar() throws NoCumpleRequisitosException {
        if (!licencia || getAniosExperiencia() < 3) {
            throw new NoCumpleRequisitosException("El entrenador no posee licencia vigente o no alcanza los 3 años mínimos de experiencia");
        }
    }

    @Override
    public void requisitosRenovar() throws NoCumpleRequisitosException {
        if (!licencia) {
            throw new NoCumpleRequisitosException("El entrenador no puede renovar porque su licencia no está vigente");
        }
    }

    @Override
    public String toString() {
        return "Entrenador: " + super.toString() +
                " | Campeonatos: " + cantCampeonatos +
                " | Licencia: " + (licencia ? "Vigente" : "Vencida");
    }
}