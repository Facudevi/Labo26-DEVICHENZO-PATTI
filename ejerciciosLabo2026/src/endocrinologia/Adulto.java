package endocrinologia;

import java.time.LocalDate;

public class Adulto extends Paciente{
    public Adulto(String nombre, String apellido, LocalDate fecha, String genero, Tipo_Sangre grupoSanguineo) {
        super(nombre, apellido, fecha, genero, grupoSanguineo);
    }
}