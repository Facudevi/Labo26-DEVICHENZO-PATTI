package bares_dianas;

import java.util.HashSet;

public class Beneficio_Trago extends Beneficio{
    public HashSet<String> tragos;

    public Beneficio_Trago(String nombre, String usuarioCreador) {
        super(nombre, usuarioCreador);
        this.tragos = new HashSet<>();
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void agregarTrago(String trago) {
        tragos.add(trago);
    }

    @Override
    public boolean esTrago() {
        return true;
    }
}