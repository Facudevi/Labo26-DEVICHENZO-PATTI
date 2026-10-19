package bares_dianas;

import java.util.HashSet;

public class Beneficio_Gaseosa extends Beneficio implements Acumulable{
    public HashSet<String> gaseosas;

    public Beneficio_Gaseosa(String nombre, String usuarioCreador) {
        super(nombre, usuarioCreador);
        this.gaseosas = new HashSet<>();
    }

    public HashSet<String> getGaseosas() {
        return gaseosas;
    }

    public void agregarGaseosa(String gaseosa) {
        gaseosas.add(gaseosa);
    }

    @Override
    public double calcularDescuentoExtra() {
        return 1000;
    }
}