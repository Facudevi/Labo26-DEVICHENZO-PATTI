package sistemas.bebidas;
import seres_vivos.humanos.personas.Persona_Bebida;

import java.util.ArrayList;

public class Sistema_Bebida {
    private ArrayList<Persona_Bebida> listaPersonas;

    public Sistema_Bebida() {
        this.listaPersonas = new ArrayList<>();
    }

    public ArrayList<Persona_Bebida> getListaPersonas() { return listaPersonas; }


    public void agregarPersona(Persona_Bebida p){
        if(listaPersonas.contains(p)) System.out.println("Ya se encuentra en la lista");
        else {
            listaPersonas.add(p);
            System.out.println("Se agregó correctamente");
        }
    }


    public Persona_Bebida mejorCoeficiente() {
        Persona_Bebida max = listaPersonas.get(0);
        for (Persona_Bebida pb : listaPersonas){
            max = pb.maxCoef(max);
        }
        return max;
    }


    public Persona_Bebida peorCoeficiente() {
        Persona_Bebida min = listaPersonas.get(0);
        for (Persona_Bebida pb : listaPersonas){
            min = pb.minCoef(min);
        }
        return min;
    }
}