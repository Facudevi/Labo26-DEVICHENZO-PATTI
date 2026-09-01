package mediciones;
import seres_vivos.humanos.personas.Persona_Medida;

import java.time.LocalDate;
import java.util.HashSet;

public class Sistema_Mediciones {
    private HashSet<Persona_Medida> listaPersonas;

    public Sistema_Mediciones() {
        this.listaPersonas = new HashSet<>();
    }


    public void agregarPersona(Persona_Medida p){
        if (listaPersonas.contains(p)) {
            System.out.println("La persona ya existe");
        }
        else {
            listaPersonas.add(p);
            System.out.println("Persona registrada correctamente");
        }
    }


    public void existePersona(Persona_Medida p){
        if (!listaPersonas.contains(p)){
            System.out.println("La persona no se encuentra en el sistema");
        }
    }


    public void registrarMedicion(Persona_Medida p, LocalDate fecha, double peso, int altura){
        existePersona(p);
        if (p.comprobarFecha(fecha)){
            System.out.println("El peso ya se registró antes");
        }
        else {
            p.agregarMedicion(fecha, peso, altura);
            System.out.println("Se agregó correctamente el peso ");
        }
    }
}