package bares_dianas;
import comida.Dificultad;

import java.util.HashMap;

public abstract class Diana {
    public String nombre;
    public Dificultad dificultad;
    public HashMap<Integer, Color_Diana> puntajeFranja;

    public Diana(String nombre, Dificultad dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.puntajeFranja = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public HashMap<Integer, Color_Diana> getPuntajeFranja() {
        return puntajeFranja;
    }


    public abstract double calcularArea();

    public void agregarFranja(int puntaje, Color_Diana color) {
        if (!puntajeFranja.containsKey(puntaje)) {
            puntajeFranja.put(puntaje, color);
        }
        else {
            System.out.println("El puntaje ya existe en la diana");
        }
    }

    public int getCantidadPuntajesDistintos() {
        return puntajeFranja.size();
    }

    public boolean tieneMasPuntajes(Diana d){
        return this.getCantidadPuntajesDistintos() > d.getCantidadPuntajesDistintos();
    }
}