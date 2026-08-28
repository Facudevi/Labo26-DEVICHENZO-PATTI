package mediciones;

import seres_vivos.humanos.personas.Persona_Medida;

import java.time.LocalDate;

public class Sistema_Mediciones {

    public Sistema_Mediciones( ) {}

    public void comprobarFecha(Medicion m, Persona_Medida p){
        if (p.getMedida().containsKey(LocalDate.now())){
            System.out.println("El peso ya fue registrado");
        }
        else{
            p.getMedida().put(LocalDate.now(), m);
        }
    }

}