package endocrinologia;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente{
    private static int edadMin=20;
    private static int edadMax=30;
    private HashSet<String> deportes;

    public Joven(String nombre, String apellido, LocalDate fecha, String genero, Sangre tipoSangre, boolean esPositivo, HashSet<String> deportes) {
        super(nombre, apellido, fecha, genero, tipoSangre, esPositivo);
        this.deportes = deportes;
    }

    public static int getEdadMin() {
        return edadMin;
    }

    public static int getEdadMax() {
        return edadMax;
    }

    public HashSet<String> getDeportes() {
        return deportes;
    }


}