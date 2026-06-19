package comida.platos;

import comida.Dificultad;
import comida.Plato;

public class Plato_Principal extends Plato {
    private int tiempoCoccion;
    private int comensales;

    public Plato_Principal(String nombre, Dificultad dificultad, int tiempoCoccion, int comensales) {
        super(nombre, dificultad);
        this.tiempoCoccion = tiempoCoccion;
        this.comensales = comensales;
    }

    @Override
    public String toString(){
        return "Esta receta tarda en cocinarse +" + tiempoCoccion +
                " y los pasos son: " + getListaPasos();
    }
}