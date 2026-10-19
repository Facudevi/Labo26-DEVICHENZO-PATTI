package bares_dianas;
import comida.Dificultad;

public class Diana_Cuadrada extends Diana{
    public double lado;

    public Diana_Cuadrada(String nombre, Dificultad dificultad, double lado) {
        super(nombre, dificultad);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}