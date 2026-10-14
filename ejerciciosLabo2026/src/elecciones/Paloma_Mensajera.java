package elecciones;

import colores.Color;
import seres_vivos.animales.Ave;

public class Paloma_Mensajera extends Ave implements Mensajero {
    private boolean vuela;

    public Paloma_Mensajera(String nombre, Color color, String especie, boolean vuela) {
        super(nombre, color, especie);
        this.vuela = vuela;
    }

    public boolean isVuela() { return vuela; }


    @Override
    public String enviarMensaje() {
        if (isVuela()) {
          return mensaje();
        }
        return "No aprendió a volar";
    }

    @Override
    public String mensaje() {
        return "Lanzando un papelito que dice: Vote por el partido para un mejor futuro.";
    }
}