package bares_dianas;

import java.util.HashSet;

public class Beneficio_Comida extends Beneficio implements Acumulable{
    public HashSet<String> comidas;

    public Beneficio_Comida(String nombre, String usuarioCreador) {
        super(nombre, usuarioCreador);
        this.comidas = new HashSet<>();
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void agregarComida(String comida) {
        comidas.add(comida);
    }

    @Override
    public double calcularDescuentoExtra() {
        return 45000;
    }
}