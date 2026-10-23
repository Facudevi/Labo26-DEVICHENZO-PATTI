package endocrinologia;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;

public abstract class Paciente extends Persona {
    private String genero;
    private Tipo_Sangre grupoSanguineo;

    public Paciente(String nombre, String apellido, LocalDate fecha, String genero, Tipo_Sangre grupoSanguineo) {
        super(nombre, apellido, fecha);
        this.genero = genero;
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getGenero() {
        return genero;
    }

    public Tipo_Sangre getGrupoSanguineo() {
        return grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() +
                " | Edad: " + calcularEdad() +
                " | Genero: " + genero.toLowerCase() +
                " | Tipo de Sangre: " + grupoSanguineo;
    }
}