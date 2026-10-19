package bares_dianas;
import comida.Dificultad;

public class Diana_Rectangular extends Diana{
    public double altura, base;

    public Diana_Rectangular(String nombre, Dificultad dificultad, double altura, double base) {
        super(nombre, dificultad);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}