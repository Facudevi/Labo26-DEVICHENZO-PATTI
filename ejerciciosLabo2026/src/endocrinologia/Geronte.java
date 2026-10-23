package endocrinologia;

import java.time.LocalDate;

public class Geronte extends Paciente{
    public Geronte(String nombre, String apellido, LocalDate fecha, String genero, Tipo_Sangre grupoSanguineo) {
        super(nombre, apellido, fecha, genero, grupoSanguineo);
    }
}