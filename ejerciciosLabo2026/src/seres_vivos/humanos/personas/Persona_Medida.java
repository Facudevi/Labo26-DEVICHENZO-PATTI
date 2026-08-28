package seres_vivos.humanos.personas;
import mediciones.Medicion;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona_Medida extends Persona{
    private HashMap<LocalDate, Medicion> medida;

    public Persona_Medida(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
        this.medida = new HashMap<>();
    }

    public HashMap<LocalDate, Medicion> getMedida() { return medida; }


    public void fechaParticular(LocalDate fecha){
        for (Medicion m : medida.values()){
            if(this.medida.containsKey(fecha)){
                System.out.println("Peso: "           );
            }
        }
    }
}