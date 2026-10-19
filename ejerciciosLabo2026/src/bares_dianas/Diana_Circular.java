package bares_dianas;
import comida.Dificultad;

public class Diana_Circular extends Diana{
    public static int radio = 13;

    public Diana_Circular(String nombre, Dificultad dificultad) {
        super(nombre, dificultad);
    }

    public static int getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}