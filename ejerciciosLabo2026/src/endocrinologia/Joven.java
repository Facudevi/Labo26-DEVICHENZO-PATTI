package endocrinologia;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente implements Tratable {
    private static int edadMin=20;
    private static int edadMax=30;
    private HashSet<String> deportes;

    public Joven(String nombre, String apellido, LocalDate fecha, String genero, Tipo_Sangre grupoSanguineo) {
        super(nombre, apellido, fecha, genero, grupoSanguineo);
        this.deportes = new HashSet<>();
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

    public void agregarDeporte(String d){
        deportes.add(d);
    }

    public int cantDeportes(){ return deportes.size(); }

    @Override
    public void comprobarRequisitos() throws TratamientoInvalidoException {
        if ((cantDeportes() % 2 != 0) && (edadMax-calcularEdad() <= 2)){
            throw new TratamientoInvalidoException("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
        }
        else {
            System.out.println("Será un tratamiento costoso, pero lo vamos a lograr");
        }
    }

    @Override
    public int costo() {
        if (getFecha().getYear() % 2 != 0){
            return getFecha().getMonthValue() * 760000;
        }
        else{
            return getFecha().getDayOfMonth() * 145400;
        }
    }

    @Override
    public Tipo_Sangre conocerTipoSangre() {
        return Tipo_Sangre.A_POSITIVO;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Deportes: " + cantDeportes();
    }
}