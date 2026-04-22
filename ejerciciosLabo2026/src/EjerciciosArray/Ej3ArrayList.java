package EjerciciosArray;

import persona.Persona;

import java.util.ArrayList;

public class Ej3ArrayList {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList();

        personas.add(new Persona("Matias", 67, "Olazabal 4831"));
        personas.add(new Persona("Facundo", 32, "Mendoza 5166"));
        personas.add(new Persona("Lucca", 11, "Carapachai 1002"));

        for (Persona persona : personas){
            if(persona.getEdad() >= 30){
                System.out.println(persona.getNombre() + " - " + persona.getEdad() + " - " + persona.getDireccion());
            }
        }
    }
}