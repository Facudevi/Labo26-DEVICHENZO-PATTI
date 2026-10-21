package endocrinologia;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;

public class Paciente extends Persona {
    private String genero;
    private Sangre tipoSangre;
    private boolean esPositivo;

    public Paciente(String nombre, String apellido, LocalDate fecha, String genero, Sangre tipoSangre, boolean esPositivo) {
        super(nombre, apellido, fecha);
        this.genero = genero;
        this.tipoSangre = tipoSangre;
        this.esPositivo = esPositivo;
    }


}