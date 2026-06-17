package comida.recetas.platos;

import comida.recetas.Dificultad;
import comida.recetas.Plato;

public class Plato_Principal extends Plato {
    private int tiempoCoccion;
    private int comensales;

    public Plato_Principal(String nombre, Dificultad dificultad, int tiempoCoccion, int comensales) {
        super(nombre, dificultad);
        this.tiempoCoccion = tiempoCoccion;
        this.comensales = comensales;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Esta receta tarda en cocinarse +" + tiempoCoccion +
                           " y los pasos son: " + getListaPasos());
    }
}