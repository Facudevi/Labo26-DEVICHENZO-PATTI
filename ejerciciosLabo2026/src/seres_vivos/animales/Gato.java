package seres_vivos.animales;

import seres_vivos.Duenio;

public class Gato extends Mascota {
    public Gato(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }


    @Override
    public String saludo() {
        return generarSaludoAlegria("miau");
    }


    @Override
    public String getTipo() { return "Gato"; }


    @Override
    public void alimentar() { setAlegria(getAlegria() + 1); }


    @Override
    public void saludar(Duenio nombreD) {
        super.saludar(nombreD);
        if (getAlegria() > 1) {
            setAlegria(getAlegria() - 1);
        }
    }
}