package ejercicios_basicos.ejerciciosArray;
import seres_vivos.Persona;
import seres_vivos.Persona_Normal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ej3ArrayList {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList();

        personas.add(new Persona_Normal("Matias", "Patti", LocalDate.of(2008, 9, 6), "Olazabal 4831"));
        personas.add(new Persona_Normal("Facundo", "De Vichenzo", LocalDate.of(1980, 7, 4), "Mendoza 5166"));
        personas.add(new Persona_Normal("Lucca", "Rossatti", LocalDate.of(1985, 7,4), "Carapachai 1002"));

        for (Persona persona : personas){
            if(persona.calcularEdad() >= 30){
                System.out.println(persona.getNombre() + " - " + persona.calcularEdad() + " - " + persona.getDireccion());
            }
        }
    }
}