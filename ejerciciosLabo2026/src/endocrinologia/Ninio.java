package endocrinologia;

import java.time.LocalDate;

public class Ninio extends Paciente implements Tratable {
    private Tolerancia tolerancia;

    public Ninio(String nombre, String apellido, LocalDate fecha, String genero, Tipo_Sangre grupoSanguineo, Tolerancia tolerancia) {
        super(nombre, apellido, fecha, genero, grupoSanguineo);
        this.tolerancia = tolerancia;
    }

    public Tolerancia getTolerancia() {
        return tolerancia;
    }

    @Override
    public void comprobarRequisitos() throws TratamientoInvalidoException {
        if(calcularEdad()<3){
            throw new TratamientoInvalidoException("Aún es chico para probar el tratamiento");
        }
        else {
            System.out.println("Tu tratamiento tardará esta cantidad de días: " + tolerancia.getNumTol()*2);
        }
    }

    @Override
    public int costo() {
        return tolerancia.getNumTol()*450000;
    }

    @Override
    public Tipo_Sangre conocerTipoSangre() {
        return Tipo_Sangre.AB_POSITIVO;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tolerancia: " + tolerancia.getNumTol();
    }
}