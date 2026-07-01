package comida.platos;

import comida.Dificultad;
import comida.Plato;

public class Plato_Principal extends Plato {
    private int tiempoCoccion;
    private int comensales;

    public Plato_Principal(String nombre, Dificultad dificultad, Tipo tipo, int tiempoCoccion, int comensales) {
        super(nombre, dificultad, tipo);
        this.tiempoCoccion = tiempoCoccion;
        this.comensales = comensales;
    }

    public Plato_Principal(String nombre, double precio, int tiempoCoccion, int comensales) {
        super(nombre, precio);
        this.tiempoCoccion = tiempoCoccion;
        this.comensales = comensales;
    }

    @Override
    public String toString(){
        return "Esta receta tarda en cocinarse +" + tiempoCoccion +
                " y los pasos son: " + getListaPasos();
    }
}